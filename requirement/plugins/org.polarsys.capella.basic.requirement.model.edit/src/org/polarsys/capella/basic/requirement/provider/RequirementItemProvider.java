
package org.polarsys.capella.basic.requirement.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.RequirementFactory;
import org.polarsys.capella.basic.requirement.RequirementPackage;

import org.polarsys.capella.core.data.capellacommon.CapellacommonFactory;

import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellacore.provider.NamedElementItemProvider;

import org.polarsys.capella.core.data.interaction.InteractionFactory;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link org.polarsys.capella.basic.requirement.Requirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementItemProvider extends NamedElementItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addContainedGenericTracesPropertyDescriptor(object);
			addIsObsoletePropertyDescriptor(object);
			addRequirementIdPropertyDescriptor(object);
			addAdditionalInformationPropertyDescriptor(object);
			addVerificationMethodPropertyDescriptor(object);
			addVerificationPhasePropertyDescriptor(object);
			addImplementationVersionPropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addRelatedCapellaElementsPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Contained Generic Traces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedGenericTracesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Namespace_containedGenericTraces_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Namespace_containedGenericTraces_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Namespace_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.NAMESPACE__CONTAINED_GENERIC_TRACES, false, false, false, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Is Obsolete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsObsoletePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_isObsolete_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_isObsolete_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Requirement_type"), //$NON-NLS-1$
				RequirementPackage.Literals.REQUIREMENT__IS_OBSOLETE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Requirement Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirementIdPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_requirementId_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_requirementId_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Requirement_type"), //$NON-NLS-1$
				RequirementPackage.Literals.REQUIREMENT__REQUIREMENT_ID, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Additional Information feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalInformationPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_additionalInformation_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_additionalInformation_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Requirement_type"), //$NON-NLS-1$
				RequirementPackage.Literals.REQUIREMENT__ADDITIONAL_INFORMATION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Verification Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerificationMethodPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_verificationMethod_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_verificationMethod_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Requirement_type"), //$NON-NLS-1$
				RequirementPackage.Literals.REQUIREMENT__VERIFICATION_METHOD, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Verification Phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerificationPhasePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_verificationPhase_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_verificationPhase_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Requirement_type"), //$NON-NLS-1$
				RequirementPackage.Literals.REQUIREMENT__VERIFICATION_PHASE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Implementation Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationVersionPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_implementationVersion_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_implementationVersion_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Requirement_type"), //$NON-NLS-1$
				RequirementPackage.Literals.REQUIREMENT__IMPLEMENTATION_VERSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_feature_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_feature_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Requirement_type"), //$NON-NLS-1$
				RequirementPackage.Literals.REQUIREMENT__FEATURE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Related Capella Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedCapellaElementsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_relatedCapellaElements_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_relatedCapellaElements_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Requirement_type"), //$NON-NLS-1$
				RequirementPackage.Literals.REQUIREMENT__RELATED_CAPELLA_ELEMENTS, false, false, false, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES);
			childrenFeatures.add(CapellacorePackage.Literals.NAMESPACE__NAMING_RULES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Requirement) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_Requirement_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Requirement.class)) {
		case RequirementPackage.REQUIREMENT__IS_OBSOLETE:
		case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
		case RequirementPackage.REQUIREMENT__ADDITIONAL_INFORMATION:
		case RequirementPackage.REQUIREMENT__VERIFICATION_METHOD:
		case RequirementPackage.REQUIREMENT__VERIFICATION_PHASE:
		case RequirementPackage.REQUIREMENT__IMPLEMENTATION_VERSION:
		case RequirementPackage.REQUIREMENT__FEATURE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case RequirementPackage.REQUIREMENT__OWNED_TRACES:
		case RequirementPackage.REQUIREMENT__NAMING_RULES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					RequirementFactory.eINSTANCE.createRequirementsPkg());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES,
					RequirementFactory.eINSTANCE.createRequirementsTrace());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES,
					CapellacommonFactory.eINSTANCE.createGenericTrace());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES,
					CapellacommonFactory.eINSTANCE.createTransfoLink());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES,
					CapellacommonFactory.eINSTANCE.createJustificationLink());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES,
					InteractionFactory.eINSTANCE.createMergeLink());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.NAMESPACE__OWNED_TRACES,
					InteractionFactory.eINSTANCE.createRefinementLink());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.NAMESPACE__NAMING_RULES,
					CapellacoreFactory.eINSTANCE.createNamingRule());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

	}

}