
package org.polarsys.capella.basic.requirement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.basic.requirement.RequirementPackage
 * @generated
 */
public interface RequirementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementFactory eINSTANCE = org.polarsys.capella.basic.requirement.impl.RequirementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirements Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Pkg</em>'.
	 * @generated
	 */
	RequirementsPkg createRequirementsPkg();

	/**
	 * Returns a new object of class '<em>Requirements Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Trace</em>'.
	 * @generated
	 */
	RequirementsTrace createRequirementsTrace();

	/**
	 * Returns a new object of class '<em>System Functional Interface Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Functional Interface Requirement</em>'.
	 * @generated
	 */
	SystemFunctionalInterfaceRequirement createSystemFunctionalInterfaceRequirement();

	/**
	 * Returns a new object of class '<em>System Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Functional Requirement</em>'.
	 * @generated
	 */
	SystemFunctionalRequirement createSystemFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>System Non Functional Interface Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Non Functional Interface Requirement</em>'.
	 * @generated
	 */
	SystemNonFunctionalInterfaceRequirement createSystemNonFunctionalInterfaceRequirement();

	/**
	 * Returns a new object of class '<em>System Non Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Non Functional Requirement</em>'.
	 * @generated
	 */
	SystemNonFunctionalRequirement createSystemNonFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>System User Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System User Requirement</em>'.
	 * @generated
	 */
	SystemUserRequirement createSystemUserRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementPackage getRequirementPackage();

	//begin-capella-code
	//end-capella-code
} //RequirementFactory
