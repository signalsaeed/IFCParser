package org.bimserver.database.actions;

import java.util.Date;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.database.store.log.AccessMethod;
import org.bimserver.database.store.log.LogFactory;
import org.bimserver.database.store.log.ProjectDeleted;
import org.bimserver.shared.UserException;

public class DeleteProjectDatabaseAction extends BimDatabaseAction<Boolean> {

	private final long poid;
	private final long actingUoid;

	public DeleteProjectDatabaseAction(BimDatabaseSession bimDatabaseSession, AccessMethod accessMethod, long poid, long actingUoid) {
		super(bimDatabaseSession, accessMethod);
		this.poid = poid;
		this.actingUoid = actingUoid;
	}

	@Override
	public Boolean execute() throws UserException, BimDatabaseException, BimDeadlockException {
		User actingUser = getUserByUoid(actingUoid);
		final Project project = getProjectByPoid(poid);
		if (actingUser.getUserType() == UserType.ADMIN || actingUser.getHasRightsOn().contains(project)) {
			delete(project);
			ProjectDeleted projectDeleted = LogFactory.eINSTANCE.createProjectDeleted();
			projectDeleted.setAccessMethod(getAccessMethod());
			projectDeleted.setDate(new Date());
			projectDeleted.setExecutor(actingUser);
			projectDeleted.setProject(project);
			getDatabaseSession().store(project);
			return true;
		} else {
			throw new UserException("No rights to delete this project");
		}
	}
	
	private void delete(Project project) {
		project.setState(ObjectState.DELETED);
		for (Project subProject : project.getSubProjects()) {
			delete(subProject);
		}
	}
}