/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.store.impl;

import java.util.Collection;

import org.bimserver.database.store.ClashDetectionSettings;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.Revision;
import org.bimserver.database.store.StorePackage;
import org.bimserver.emf.IdEObjectImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clash Detection Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.database.store.impl.ClashDetectionSettingsImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.ClashDetectionSettingsImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.ClashDetectionSettingsImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.ClashDetectionSettingsImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.ClashDetectionSettingsImpl#getIgnoredClasses <em>Ignored Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClashDetectionSettingsImpl extends IdEObjectImpl implements ClashDetectionSettings {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClashDetectionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.CLASH_DETECTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return (Boolean) eGet(StorePackage.Literals.CLASH_DETECTION_SETTINGS__ENABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		eSet(StorePackage.Literals.CLASH_DETECTION_SETTINGS__ENABLED, newEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMargin() {
		return (Float) eGet(StorePackage.Literals.CLASH_DETECTION_SETTINGS__MARGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(float newMargin) {
		eSet(StorePackage.Literals.CLASH_DETECTION_SETTINGS__MARGIN, newMargin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Project> getProjects() {
		return (EList<Project>) eGet(StorePackage.Literals.CLASH_DETECTION_SETTINGS__PROJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Revision> getRevisions() {
		return (EList<Revision>) eGet(StorePackage.Literals.CLASH_DETECTION_SETTINGS__REVISIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getIgnoredClasses() {
		return (EList<String>) eGet(StorePackage.Literals.CLASH_DETECTION_SETTINGS__IGNORED_CLASSES, true);
	}

} //ClashDetectionSettingsImpl