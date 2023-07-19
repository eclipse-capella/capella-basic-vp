

package org.polarsys.capella.requirement.impl;

import java.util.Collection;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.common.model.helpers.IHelper;
import org.polarsys.capella.core.data.capellacommon.GenericTrace;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.Trace;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;
import org.polarsys.capella.requirement.Requirement;
import org.polarsys.capella.requirement.RequirementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#isIsObsolete <em>Is Obsolete</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getVerificationMethod <em>Verification Method</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getVerificationPhase <em>Verification Phase</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getImplementationVersion <em>Implementation Version</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementImpl#getRelatedCapellaElements <em>Related Capella Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends NamedElementImpl implements Requirement {

	/**
	 * The default value of the '{@link #isIsObsolete() <em>Is Obsolete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsObsolete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OBSOLETE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_INFORMATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFICATION_METHOD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVerificationPhase() <em>Verification Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFICATION_PHASE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImplementationVersion() <em>Implementation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENT;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	@Override
	public EList<Trace> getOwnedTraces() {

		return (EList<Trace>)eDynamicGet(RequirementPackage.REQUIREMENT__OWNED_TRACES, CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES, true, true);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<GenericTrace> getContainedGenericTraces() {


		// TODO: implement this method to return the 'Contained Generic Traces' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	@Override
	public EList<NamingRule> getNamingRules() {

		return (EList<NamingRule>)eDynamicGet(RequirementPackage.REQUIREMENT__NAMING_RULES, CapellacorePackage.Literals.NAMESPACE__NAMING_RULES, true, true);
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isIsObsolete() {

		return (Boolean)eDynamicGet(RequirementPackage.REQUIREMENT__IS_OBSOLETE, RequirementPackage.Literals.REQUIREMENT__IS_OBSOLETE, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setIsObsolete(boolean newIsObsolete) {


		eDynamicSet(RequirementPackage.REQUIREMENT__IS_OBSOLETE, RequirementPackage.Literals.REQUIREMENT__IS_OBSOLETE, newIsObsolete);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getRequirementId() {

		return (String)eDynamicGet(RequirementPackage.REQUIREMENT__REQUIREMENT_ID, RequirementPackage.Literals.REQUIREMENT__REQUIREMENT_ID, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setRequirementId(String newRequirementId) {


		eDynamicSet(RequirementPackage.REQUIREMENT__REQUIREMENT_ID, RequirementPackage.Literals.REQUIREMENT__REQUIREMENT_ID, newRequirementId);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getAdditionalInformation() {

		return (String)eDynamicGet(RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION, RequirementPackage.Literals.REQUIREMENT__ADDITIONAL_INFORMATION, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setAdditionalInformation(String newAdditionalInformation) {


		eDynamicSet(RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION, RequirementPackage.Literals.REQUIREMENT__ADDITIONAL_INFORMATION, newAdditionalInformation);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getVerificationMethod() {

		return (String)eDynamicGet(RequirementPackage.REQUIREMENT__VERIFICATION_METHOD, RequirementPackage.Literals.REQUIREMENT__VERIFICATION_METHOD, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setVerificationMethod(String newVerificationMethod) {


		eDynamicSet(RequirementPackage.REQUIREMENT__VERIFICATION_METHOD, RequirementPackage.Literals.REQUIREMENT__VERIFICATION_METHOD, newVerificationMethod);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getVerificationPhase() {

		return (String)eDynamicGet(RequirementPackage.REQUIREMENT__VERIFICATION_PHASE, RequirementPackage.Literals.REQUIREMENT__VERIFICATION_PHASE, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setVerificationPhase(String newVerificationPhase) {


		eDynamicSet(RequirementPackage.REQUIREMENT__VERIFICATION_PHASE, RequirementPackage.Literals.REQUIREMENT__VERIFICATION_PHASE, newVerificationPhase);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getImplementationVersion() {

		return (String)eDynamicGet(RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION, RequirementPackage.Literals.REQUIREMENT__IMPLEMENTATION_VERSION, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setImplementationVersion(String newImplementationVersion) {


		eDynamicSet(RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION, RequirementPackage.Literals.REQUIREMENT__IMPLEMENTATION_VERSION, newImplementationVersion);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getFeature() {

		return (String)eDynamicGet(RequirementPackage.REQUIREMENT__FEATURE, RequirementPackage.Literals.REQUIREMENT__FEATURE, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setFeature(String newFeature) {


		eDynamicSet(RequirementPackage.REQUIREMENT__FEATURE, RequirementPackage.Literals.REQUIREMENT__FEATURE, newFeature);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<CapellaElement> getRelatedCapellaElements() {


		// TODO: implement this method to return the 'Related Capella Elements' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				return getOwnedTraces();
			case RequirementPackage.REQUIREMENT__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				return getNamingRules();
			case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
				return isIsObsolete();
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				return getRequirementId();
			case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
			case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
				return getVerificationMethod();
			case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
				return getVerificationPhase();
			case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
				return getImplementationVersion();
			case RequirementPackage.REQUIREMENT__FEATURE:
				return getFeature();
			case RequirementPackage.REQUIREMENT__RELATED_CAPELLA_ELEMENTS:
				return getRelatedCapellaElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
				setIsObsolete((Boolean)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				setRequirementId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
				setAdditionalInformation((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
				setVerificationMethod((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
				setVerificationPhase((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
				setImplementationVersion((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__FEATURE:
				setFeature((String)newValue);
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
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				getNamingRules().clear();
				return;
			case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
				setIsObsolete(IS_OBSOLETE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				setRequirementId(REQUIREMENT_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
				setAdditionalInformation(ADDITIONAL_INFORMATION_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
				setVerificationMethod(VERIFICATION_METHOD_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
				setVerificationPhase(VERIFICATION_PHASE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
				setImplementationVersion(IMPLEMENTATION_VERSION_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__FEATURE:
				setFeature(FEATURE_EDEFAULT);
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
			case RequirementPackage.REQUIREMENT__OWNED_TRACES:
				return !getOwnedTraces().isEmpty();
			case RequirementPackage.REQUIREMENT__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case RequirementPackage.REQUIREMENT__NAMING_RULES:
				return !getNamingRules().isEmpty();
			case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
				return isIsObsolete() != IS_OBSOLETE_EDEFAULT;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				return REQUIREMENT_ID_EDEFAULT == null ? getRequirementId() != null : !REQUIREMENT_ID_EDEFAULT.equals(getRequirementId());
			case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
				return ADDITIONAL_INFORMATION_EDEFAULT == null ? getAdditionalInformation() != null : !ADDITIONAL_INFORMATION_EDEFAULT.equals(getAdditionalInformation());
			case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
				return VERIFICATION_METHOD_EDEFAULT == null ? getVerificationMethod() != null : !VERIFICATION_METHOD_EDEFAULT.equals(getVerificationMethod());
			case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
				return VERIFICATION_PHASE_EDEFAULT == null ? getVerificationPhase() != null : !VERIFICATION_PHASE_EDEFAULT.equals(getVerificationPhase());
			case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
				return IMPLEMENTATION_VERSION_EDEFAULT == null ? getImplementationVersion() != null : !IMPLEMENTATION_VERSION_EDEFAULT.equals(getImplementationVersion());
			case RequirementPackage.REQUIREMENT__FEATURE:
				return FEATURE_EDEFAULT == null ? getFeature() != null : !FEATURE_EDEFAULT.equals(getFeature());
			case RequirementPackage.REQUIREMENT__RELATED_CAPELLA_ELEMENTS:
				return !getRelatedCapellaElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}


} //RequirementImpl