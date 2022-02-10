
package org.polarsys.capella.vp.mass.mass.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.vp.mass.mass.MassPackage;
import org.polarsys.capella.vp.mass.mass.PartMass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Mass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.mass.mass.impl.PartMassImpl#getCurrentMass <em>Current Mass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartMassImpl extends MassImpl implements PartMass {

	/**
	 * The default value of the '{@link #getCurrentMass() <em>Current Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMass()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_MASS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartMassImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MassPackage.Literals.PART_MASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getCurrentMass() {

		return (Integer) eDynamicGet(MassPackage.PART_MASS__CURRENT_MASS, MassPackage.Literals.PART_MASS__CURRENT_MASS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCurrentMass(int newCurrentMass) {

		eDynamicSet(MassPackage.PART_MASS__CURRENT_MASS, MassPackage.Literals.PART_MASS__CURRENT_MASS, newCurrentMass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MassPackage.PART_MASS__CURRENT_MASS:
			return getCurrentMass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MassPackage.PART_MASS__CURRENT_MASS:
			setCurrentMass((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MassPackage.PART_MASS__CURRENT_MASS:
			setCurrentMass(CURRENT_MASS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MassPackage.PART_MASS__CURRENT_MASS:
			return getCurrentMass() != CURRENT_MASS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PartMassImpl