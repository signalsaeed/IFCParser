package org.bimserver.database.actions;

import java.util.Date;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.database.store.log.AccessMethod;
import org.bimserver.database.store.log.LogFactory;
import org.bimserver.database.store.log.UserAddedToProject;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;

public class AddUserToProjectDatabaseAction extends BimDatabaseAction<Boolean> {

	private final long uoid;
	private final long poid;
	private final long actingUoid;

	public AddUserToProjectDatabaseAction(BimDatabaseSession bimDatabaseSession, AccessMethod accessMethod, long actingUoid, long uoid, long poid) {
		super(bimDatabaseSession, accessMethod);
		this.actingUoid = actingUoid;
		this.uoid = uoid;
		this.poid = poid;
	}

	@Override
	public Boolean execute() throws UserException, BimDatabaseException, BimDeadlockException {
		final Project project = getProjectByPoid(poid);
		User actingUser = getUserByUoid(actingUoid);
		if (RightsManager.hasRightsOnProject(actingUser, project) || actingUser.getUserType() == UserType.ADMIN) {
			User user = getUserByUoid(uoid);
			project.getHasAuthorizedUsers().add(user);
			UserAddedToProject userAddedToProject = LogFactory.eINSTANCE.createUserAddedToProject();
			userAddedToProject.setExecutor(actingUser);
			userAddedToProject.setDate(new Date());
			userAddedToProject.setAccessMethod(getAccessMethod());
			userAddedToProject.setUser(user);
			userAddedToProject.setProject(project);
			getDatabaseSession().store(user);
			getDatabaseSession().store(project);
			getDatabaseSession().store(userAddedToProject);
			return true;
		} else {
			throw new UserException("User has no rights to grant permission on '" + project.getName() + "'");
		}
	}
}