
package org.polarsys.capella.basic.requirement;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Namespace;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.basic.requirement.Requirement#isIsObsolete <em>Is Obsolete</em>}</li>
 *   <li>{@link org.polarsys.capella.basic.requirement.Requirement#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.polarsys.capella.basic.requirement.Requirement#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.polarsys.capella.basic.requirement.Requirement#getVerificationMethod <em>Verification Method</em>}</li>
 *   <li>{@link org.polarsys.capella.basic.requirement.Requirement#getVerificationPhase <em>Verification Phase</em>}</li>
 *   <li>{@link org.polarsys.capella.basic.requirement.Requirement#getImplementationVersion <em>Implementation Version</em>}</li>
 *   <li>{@link org.polarsys.capella.basic.requirement.Requirement#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.polarsys.capella.basic.requirement.Requirement#getRelatedCapellaElements <em>Related Capella Elements</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Requirement'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Class' stereotype='eng.Requirement'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a capability or condition that must (or should) be satisfied\r\n[source: SysML glossary for SysML v1.0]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='SysML::Requirements::Requirement' constraints='none'"
 * @generated
 */

public interface Requirement extends Namespace {

	/**
	 * Returns the value of the '<em><b>Is Obsolete</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Obsolete</em>' attribute.
	 * @see #setIsObsolete(boolean)
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement_IsObsolete()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='field used to flag obsolete requirement (that for some reason we want to keep in the model though)\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	boolean isIsObsolete();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.basic.requirement.Requirement#isIsObsolete <em>Is Obsolete</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Obsolete</em>' attribute.
	 * @see #isIsObsolete()
	 * @generated
	 */

	void setIsObsolete(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirement Id</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Id</em>' attribute.
	 * @see #setRequirementId(String)
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement_RequirementId()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='requirementId' featureOwner='eng.Requirement' fromStereotype='true'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a unique identifier for this requirement\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='SysML::Requirements::Requirement::id' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	String getRequirementId();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.basic.requirement.Requirement#getRequirementId <em>Requirement Id</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Id</em>' attribute.
	 * @see #getRequirementId()
	 * @generated
	 */

	void setRequirementId(String value);

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information</em>' attribute.
	 * @see #setAdditionalInformation(String)
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement_AdditionalInformation()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='additionalInformation' featureOwner='eng.Requirement' fromStereotype='true'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a free field to capture any additional information required to complement this requirement statement\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	String getAdditionalInformation();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.basic.requirement.Requirement#getAdditionalInformation <em>Additional Information</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' attribute.
	 * @see #getAdditionalInformation()
	 * @generated
	 */

	void setAdditionalInformation(String value);

	/**
	 * Returns the value of the '<em><b>Verification Method</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Method</em>' attribute.
	 * @see #setVerificationMethod(String)
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement_VerificationMethod()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='verificationMethod' featureOwner='eng.Requirement' fromStereotype='true'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='this field receives the description of the method that will be used to verify that this requirement is fulfilled.\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	String getVerificationMethod();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.basic.requirement.Requirement#getVerificationMethod <em>Verification Method</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Method</em>' attribute.
	 * @see #getVerificationMethod()
	 * @generated
	 */

	void setVerificationMethod(String value);

	/**
	 * Returns the value of the '<em><b>Verification Phase</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Phase</em>' attribute.
	 * @see #setVerificationPhase(String)
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement_VerificationPhase()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='verificationPhase' featureOwner='eng.Requirement' fromStereotype='true'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a field receiving the description of the design phase in which this requirement can/will be verified\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	String getVerificationPhase();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.basic.requirement.Requirement#getVerificationPhase <em>Verification Phase</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Phase</em>' attribute.
	 * @see #getVerificationPhase()
	 * @generated
	 */

	void setVerificationPhase(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Version</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Version</em>' attribute.
	 * @see #setImplementationVersion(String)
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement_ImplementationVersion()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='implementationVersion' featureOwner='eng.Requirement' fromStereotype='true'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a unique identifier to keep track of the version of this requirement\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	String getImplementationVersion();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.basic.requirement.Requirement#getImplementationVersion <em>Implementation Version</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Version</em>' attribute.
	 * @see #getImplementationVersion()
	 * @generated
	 */

	void setImplementationVersion(String value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement_Feature()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='feature' featureOwner='eng.Requirement' fromStereotype='true'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the system feature that this requirement corresponds to\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	String getFeature();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.basic.requirement.Requirement#getFeature <em>Feature</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */

	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Related Capella Elements</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.capellacore.CapellaElement}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Capella Elements</em>' reference list.
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirement_RelatedCapellaElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/derived viatra.variant='patternbody' viatra.expression='Requirement.incomingTraces(self, rt);\r\n\tRequirementsTrace.sourceElement(rt, target);'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */

	EList<CapellaElement> getRelatedCapellaElements();

} // Requirement
