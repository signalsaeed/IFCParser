/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcTelecomAddress;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Telecom Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTelecomAddressImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTelecomAddressImpl#getFacsimileNumbers <em>Facsimile Numbers</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTelecomAddressImpl#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTelecomAddressImpl#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcTelecomAddressImpl#getWWWHomePageURL <em>WWW Home Page URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTelecomAddressImpl extends IfcAddressImpl implements IfcTelecomAddress {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTelecomAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcTelecomAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTelephoneNumbers() {
		return (EList<String>)eGet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_TelephoneNumbers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTelephoneNumbers() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_TelephoneNumbers());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTelephoneNumbers() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_TelephoneNumbers());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getFacsimileNumbers() {
		return (EList<String>)eGet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_FacsimileNumbers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFacsimileNumbers() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_FacsimileNumbers());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFacsimileNumbers() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_FacsimileNumbers());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPagerNumber() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_PagerNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagerNumber(String newPagerNumber) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_PagerNumber(), newPagerNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPagerNumber() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_PagerNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPagerNumber() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_PagerNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getElectronicMailAddresses() {
		return (EList<String>)eGet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_ElectronicMailAddresses(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElectronicMailAddresses() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_ElectronicMailAddresses());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElectronicMailAddresses() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_ElectronicMailAddresses());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWWWHomePageURL() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWWWHomePageURL(String newWWWHomePageURL) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL(), newWWWHomePageURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWWWHomePageURL() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWWWHomePageURL() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTelecomAddress_WWWHomePageURL());
	}

} //IfcTelecomAddressImpl