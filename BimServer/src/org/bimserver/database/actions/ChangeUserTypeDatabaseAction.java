package org.bimserver.database.actions;

import java.util.Date;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.database.store.log.AccessMethod;
import org.bimserver.database.store.log.LogFactory;
import org.bimserver.database.store.log.UserChanged;
import org.bimserver.interfaces.objects.SUserType;
import org.bimserver.shared.UserException;

public class ChangeUserTypeDatabaseAction extends BimDatabaseAction<Void> {

	private final long actingUoid;
	private final long uoid;
	private final SUserType userType;

	public ChangeUserTypeDatabaseAction(BimDatabaseSession bimDatabaseSession, AccessMethod accessMethod, long actingUoid, long uoid, SUserType userType) {
		super(bimDatabaseSession, accessMethod);
		this.actingUoid = actingUoid;
		this.uoid = uoid;
		this.userType = userType;
	}

	@Override
	public Void execute() throws UserException, BimDeadlockException, BimDatabaseException {
		User actingUser = getUserByUoid(actingUoid);
		if (actingUser.getUserType() != UserType.ADMIN) {
			throw new UserException("Only admin users can change other user's types");
		}
		User user = getUserByUoid(uoid);
		user.setUserType(UserType.get(userType.getOrdinal()));
		UserChanged userChanged = LogFactory.eINSTANCE.createUserChanged();
		userChanged.setAccessMethod(getAccessMethod());
		userChanged.setDate(new Date());
		userChanged.setExecutor(actingUser);
		userChanged.setUser(user);
		getDatabaseSession().store(userChanged);
		getDatabaseSession().store(user);
		return null;
	}
}