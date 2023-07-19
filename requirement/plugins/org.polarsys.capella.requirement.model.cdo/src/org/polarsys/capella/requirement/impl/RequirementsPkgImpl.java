

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
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.Trace;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;
import org.polarsys.capella.requirement.Requirement;
import org.polarsys.capella.requirement.RequirementPackage;
import org.polarsys.capella.requirement.RequirementsPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementsPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementsPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementsPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementsPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementsPkgImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementsPkgImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementsPkgImpl#getOwnedRequirements <em>Owned Requirements</em>}</li>
 *   <li>{@link org.polarsys.capella.requirement.impl.RequirementsPkgImpl#getOwnedRequirementPkgs <em>Owned Requirement Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsPkgImpl extends NamedElementImpl implements RequirementsPkg {

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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsPkgImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENTS_PKG;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	@Override
	public EList<Trace> getOwnedTraces() {

		return (EList<Trace>)eDynamicGet(RequirementPackage.REQUIREMENTS_PKG__OWNED_TRACES, CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES, true, true);
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

		return (EList<NamingRule>)eDynamicGet(RequirementPackage.REQUIREMENTS_PKG__NAMING_RULES, CapellacorePackage.Literals.NAMESPACE__NAMING_RULES, true, true);
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	@Override
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {

		return (EList<PropertyValuePkg>)eDynamicGet(RequirementPackage.REQUIREMENTS_PKG__OWNED_PROPERTY_VALUE_PKGS, CapellacorePackage.Literals.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getAdditionalInformation() {

		return (String)eDynamicGet(RequirementPackage.REQUIREMENTS_PKG__ADDITIONAL_INFORMATION, RequirementPackage.Literals.REQUIREMENTS_PKG__ADDITIONAL_INFORMATION, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setAdditionalInformation(String newAdditionalInformation) {


		eDynamicSet(RequirementPackage.REQUIREMENTS_PKG__ADDITIONAL_INFORMATION, RequirementPackage.Literals.REQUIREMENTS_PKG__ADDITIONAL_INFORMATION, newAdditionalInformation);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getLevel() {

		return (String)eDynamicGet(RequirementPackage.REQUIREMENTS_PKG__LEVEL, RequirementPackage.Literals.REQUIREMENTS_PKG__LEVEL, true, true);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setLevel(String newLevel) {


		eDynamicSet(RequirementPackage.REQUIREMENTS_PKG__LEVEL, RequirementPackage.Literals.REQUIREMENTS_PKG__LEVEL, newLevel);

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	@Override
	public EList<Requirement> getOwnedRequirements() {

		return (EList<Requirement>)eDynamicGet(RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENTS, RequirementPackage.Literals.REQUIREMENTS_PKG__OWNED_REQUIREMENTS, true, true);
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	@Override
	public EList<RequirementsPkg> getOwnedRequirementPkgs() {

		return (EList<RequirementsPkg>)eDynamicGet(RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS, RequirementPackage.Literals.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS, true, true);
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case RequirementPackage.REQUIREMENTS_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENTS:
				return ((InternalEList<?>)getOwnedRequirements()).basicRemove(otherEnd, msgs);
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS:
				return ((InternalEList<?>)getOwnedRequirementPkgs()).basicRemove(otherEnd, msgs);
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
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case RequirementPackage.REQUIREMENTS_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case RequirementPackage.REQUIREMENTS_PKG__NAMING_RULES:
				return getNamingRules();
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case RequirementPackage.REQUIREMENTS_PKG__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
			case RequirementPackage.REQUIREMENTS_PKG__LEVEL:
				return getLevel();
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENTS:
				return getOwnedRequirements();
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS:
				return getOwnedRequirementPkgs();
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
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case RequirementPackage.REQUIREMENTS_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case RequirementPackage.REQUIREMENTS_PKG__ADDITIONAL_INFORMATION:
				setAdditionalInformation((String)newValue);
				return;
			case RequirementPackage.REQUIREMENTS_PKG__LEVEL:
				setLevel((String)newValue);
				return;
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENTS:
				getOwnedRequirements().clear();
				getOwnedRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS:
				getOwnedRequirementPkgs().clear();
				getOwnedRequirementPkgs().addAll((Collection<? extends RequirementsPkg>)newValue);
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
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case RequirementPackage.REQUIREMENTS_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case RequirementPackage.REQUIREMENTS_PKG__ADDITIONAL_INFORMATION:
				setAdditionalInformation(ADDITIONAL_INFORMATION_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENTS_PKG__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENTS:
				getOwnedRequirements().clear();
				return;
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS:
				getOwnedRequirementPkgs().clear();
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
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_TRACES:
				return !getOwnedTraces().isEmpty();
			case RequirementPackage.REQUIREMENTS_PKG__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case RequirementPackage.REQUIREMENTS_PKG__NAMING_RULES:
				return !getNamingRules().isEmpty();
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return !getOwnedPropertyValuePkgs().isEmpty();
			case RequirementPackage.REQUIREMENTS_PKG__ADDITIONAL_INFORMATION:
				return ADDITIONAL_INFORMATION_EDEFAULT == null ? getAdditionalInformation() != null : !ADDITIONAL_INFORMATION_EDEFAULT.equals(getAdditionalInformation());
			case RequirementPackage.REQUIREMENTS_PKG__LEVEL:
				return LEVEL_EDEFAULT == null ? getLevel() != null : !LEVEL_EDEFAULT.equals(getLevel());
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENTS:
				return !getOwnedRequirements().isEmpty();
			case RequirementPackage.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS:
				return !getOwnedRequirementPkgs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsPkgImpl