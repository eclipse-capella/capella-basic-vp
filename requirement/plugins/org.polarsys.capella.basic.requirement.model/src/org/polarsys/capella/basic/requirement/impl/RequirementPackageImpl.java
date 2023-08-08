
package org.polarsys.capella.basic.requirement.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.activity.ActivityPackage;

import org.polarsys.capella.common.data.behavior.BehaviorPackage;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.cs.CsPackage;

import org.polarsys.capella.core.data.ctx.CtxPackage;

import org.polarsys.capella.core.data.epbs.EpbsPackage;

import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.interaction.InteractionPackage;

import org.polarsys.capella.core.data.la.LaPackage;

import org.polarsys.capella.core.data.oa.OaPackage;

import org.polarsys.capella.core.data.pa.PaPackage;

import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.RequirementFactory;
import org.polarsys.capella.basic.requirement.RequirementPackage;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.basic.requirement.RequirementsTrace;
import org.polarsys.capella.basic.requirement.SystemFunctionalInterfaceRequirement;
import org.polarsys.capella.basic.requirement.SystemFunctionalRequirement;
import org.polarsys.capella.basic.requirement.SystemNonFunctionalInterfaceRequirement;
import org.polarsys.capella.basic.requirement.SystemNonFunctionalRequirement;
import org.polarsys.capella.basic.requirement.SystemUserRequirement;

import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementPackageImpl extends EPackageImpl implements RequirementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFunctionalInterfaceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFunctionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemNonFunctionalInterfaceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemNonFunctionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUserRequirementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementPackageImpl() {
		super(eNS_URI, RequirementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RequirementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementPackage init() {
		if (isInited)
			return (RequirementPackage) EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRequirementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RequirementPackageImpl theRequirementPackage = registeredRequirementPackage instanceof RequirementPackageImpl
				? (RequirementPackageImpl) registeredRequirementPackage
				: new RequirementPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ActivityPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRequirementPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementPackage.eNS_URI, theRequirementPackage);
		return theRequirementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementsPkg() {
		return requirementsPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementsPkg_AdditionalInformation() {
		return (EAttribute) requirementsPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementsPkg_Level() {
		return (EAttribute) requirementsPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsPkg_OwnedRequirements() {
		return (EReference) requirementsPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsPkg_OwnedRequirementPkgs() {
		return (EReference) requirementsPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementsTrace() {
		return requirementsTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsTrace_Source() {
		return (EReference) requirementsTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsTrace_Target() {
		return (EReference) requirementsTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_IsObsolete() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_RequirementId() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_AdditionalInformation() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_VerificationMethod() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_VerificationPhase() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_ImplementationVersion() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Feature() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_RelatedCapellaElements() {
		return (EReference) requirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemFunctionalInterfaceRequirement() {
		return systemFunctionalInterfaceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemFunctionalRequirement() {
		return systemFunctionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemNonFunctionalInterfaceRequirement() {
		return systemNonFunctionalInterfaceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemNonFunctionalRequirement() {
		return systemNonFunctionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemUserRequirement() {
		return systemUserRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementFactory getRequirementFactory() {
		return (RequirementFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		requirementsPkgEClass = createEClass(REQUIREMENTS_PKG);
		createEAttribute(requirementsPkgEClass, REQUIREMENTS_PKG__ADDITIONAL_INFORMATION);
		createEAttribute(requirementsPkgEClass, REQUIREMENTS_PKG__LEVEL);
		createEReference(requirementsPkgEClass, REQUIREMENTS_PKG__OWNED_REQUIREMENTS);
		createEReference(requirementsPkgEClass, REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS);

		requirementsTraceEClass = createEClass(REQUIREMENTS_TRACE);
		createEReference(requirementsTraceEClass, REQUIREMENTS_TRACE__SOURCE);
		createEReference(requirementsTraceEClass, REQUIREMENTS_TRACE__TARGET);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__IS_OBSOLETE);
		createEAttribute(requirementEClass, REQUIREMENT__REQUIREMENT_ID);
		createEAttribute(requirementEClass, REQUIREMENT__ADDITIONAL_INFORMATION);
		createEAttribute(requirementEClass, REQUIREMENT__VERIFICATION_METHOD);
		createEAttribute(requirementEClass, REQUIREMENT__VERIFICATION_PHASE);
		createEAttribute(requirementEClass, REQUIREMENT__IMPLEMENTATION_VERSION);
		createEAttribute(requirementEClass, REQUIREMENT__FEATURE);
		createEReference(requirementEClass, REQUIREMENT__RELATED_CAPELLA_ELEMENTS);

		systemFunctionalInterfaceRequirementEClass = createEClass(SYSTEM_FUNCTIONAL_INTERFACE_REQUIREMENT);

		systemFunctionalRequirementEClass = createEClass(SYSTEM_FUNCTIONAL_REQUIREMENT);

		systemNonFunctionalInterfaceRequirementEClass = createEClass(SYSTEM_NON_FUNCTIONAL_INTERFACE_REQUIREMENT);

		systemNonFunctionalRequirementEClass = createEClass(SYSTEM_NON_FUNCTIONAL_REQUIREMENT);

		systemUserRequirementEClass = createEClass(SYSTEM_USER_REQUIREMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ModellingcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementsPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		requirementsPkgEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		requirementsTraceEClass.getESuperTypes().add(theCapellacorePackage.getTrace());
		requirementEClass.getESuperTypes().add(theCapellacorePackage.getNamespace());
		systemFunctionalInterfaceRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemFunctionalRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemNonFunctionalInterfaceRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemNonFunctionalRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemUserRequirementEClass.getESuperTypes().add(this.getRequirement());

		// Initialize classes and features; add operations and parameters
		initEClass(requirementsPkgEClass, RequirementsPkg.class, "RequirementsPkg", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementsPkg_AdditionalInformation(), ecorePackage.getEString(), "additionalInformation", //$NON-NLS-1$
				null, 0, 1, RequirementsPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementsPkg_Level(), ecorePackage.getEString(), "level", null, 0, 1, //$NON-NLS-1$
				RequirementsPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsPkg_OwnedRequirements(), this.getRequirement(), null, "ownedRequirements", null, //$NON-NLS-1$
				0, -1, RequirementsPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsPkg_OwnedRequirementPkgs(), this.getRequirementsPkg(), null,
				"ownedRequirementPkgs", null, 0, -1, RequirementsPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsTraceEClass, RequirementsTrace.class, "RequirementsTrace", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsTrace_Source(), theModellingcorePackage.getTraceableElement(), null, "source", //$NON-NLS-1$
				null, 1, 1, RequirementsTrace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsTrace_Target(), theModellingcorePackage.getTraceableElement(), null, "target", //$NON-NLS-1$
				null, 1, 1, RequirementsTrace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_IsObsolete(), ecorePackage.getEBoolean(), "isObsolete", null, 0, 1, //$NON-NLS-1$
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_RequirementId(), ecorePackage.getEString(), "requirementId", null, 0, 1, //$NON-NLS-1$
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_AdditionalInformation(), ecorePackage.getEString(), "additionalInformation", null, //$NON-NLS-1$
				0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_VerificationMethod(), ecorePackage.getEString(), "verificationMethod", null, 0, 1, //$NON-NLS-1$
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_VerificationPhase(), ecorePackage.getEString(), "verificationPhase", null, 0, 1, //$NON-NLS-1$
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ImplementationVersion(), ecorePackage.getEString(), "implementationVersion", null, //$NON-NLS-1$
				0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, Requirement.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_RelatedCapellaElements(), theCapellacorePackage.getCapellaElement(), null,
				"relatedCapellaElements", null, 0, -1, Requirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemFunctionalInterfaceRequirementEClass, SystemFunctionalInterfaceRequirement.class,
				"SystemFunctionalInterfaceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(systemFunctionalRequirementEClass, SystemFunctionalRequirement.class, "SystemFunctionalRequirement", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemNonFunctionalInterfaceRequirementEClass, SystemNonFunctionalInterfaceRequirement.class,
				"SystemNonFunctionalInterfaceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(systemNonFunctionalRequirementEClass, SystemNonFunctionalRequirement.class,
				"SystemNonFunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(systemUserRequirementEClass, SystemUserRequirement.class, "SystemUserRequirement", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/extension
		createExtensionAnnotations();
		// http://www.polarsys.org/kitalpha/dsl/2007/dslfactory
		createDslfactoryAnnotations();
		// http://www.polarsys.org/kitalpha/ecore/documentation
		createDocumentationAnnotations();
		// http://www.polarsys.org/capella/2007/BusinessInformation
		createBusinessInformationAnnotations();
		// http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping
		createMappingAnnotations();
		// http://www.polarsys.org/capella/semantic
		createSemanticAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
		// http://www.polarsys.org/capella/2007/UML2Mapping
		createUML2MappingAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment
		createSegmentAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore
		createIgnoreAnnotations();
		// http://www.polarsys.org/capella/derived
		createDerivedAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/extension</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtensionAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/extension"; //$NON-NLS-1$
		addAnnotation(this, source, new String[] { "extensibleProviderFactory", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"childCreationExtenders", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"trackResourceModification", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"useUUIDs", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"useIDAttributes", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/dsl/2007/dslfactory</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDslfactoryAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/dsl/2007/dslfactory"; //$NON-NLS-1$
		addAnnotation(this, source, new String[] { "extensibleProviderFactory", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"childCreationExtenders", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"useUUIDs", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"useIDAttributes", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/ecore/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentationAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/ecore/documentation"; //$NON-NLS-1$
		addAnnotation(this, source,
				new String[] { "description", //$NON-NLS-1$
						"Requirement aims at defining the requirements expression language.\r\n[source: Capella study]", //$NON-NLS-1$
						"usage guideline", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"used in levels", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"usage examples", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "This package depends on the model CapellaCore.ecore", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(requirementsPkgEClass, source, new String[] { "description", //$NON-NLS-1$
				"a container for Requirement elements, and sub packages containing Requirements\r\n[source: Capella study]", //$NON-NLS-1$
				"usage guideline", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"used in levels", "operational,system,logical,physical,epbs", //$NON-NLS-1$ //$NON-NLS-2$
				"usage examples", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirementsPkg_AdditionalInformation(), source,
				new String[] { "description", //$NON-NLS-1$
						"free information field to characterize this requirement package\r\n[source: Capella study]", //$NON-NLS-1$
						"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirementsPkg_Level(), source,
				new String[] { "description", //$NON-NLS-1$
						"the design level to which this requirement package applies\r\n[source: Capella study]", //$NON-NLS-1$
						"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirementsPkg_OwnedRequirements(), source,
				new String[] { "description", //$NON-NLS-1$
						"the Requirements contained in this requirement package\r\n[source: Capella study]", //$NON-NLS-1$
						"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirementsPkg_OwnedRequirementPkgs(), source, new String[] { "description", //$NON-NLS-1$
				"the sub-(Requirement) packages contained in this requirement package\r\n[source: Capella study]", //$NON-NLS-1$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(requirementsTraceEClass, source, new String[] { "description", //$NON-NLS-1$
				"a specialized kind of Trace to indicate the relationship between two Requirements\r\n[source: Capella study]", //$NON-NLS-1$
				"usage guideline", //$NON-NLS-1$
				"used to keep track of links between Requirements, typically which requirement answers to which other requirement", //$NON-NLS-1$
				"used in levels", "operational,system,logical,physical,epbs", //$NON-NLS-1$ //$NON-NLS-2$
				"usage examples", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(requirementEClass, source, new String[] { "description", //$NON-NLS-1$
				"a capability or condition that must (or should) be satisfied\r\n[source: SysML glossary for SysML v1.0]", //$NON-NLS-1$
				"usage guideline", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"used in levels", "operational,system,logical,physical,epbs", //$NON-NLS-1$ //$NON-NLS-2$
				"usage examples", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_IsObsolete(), source, new String[] { "description", //$NON-NLS-1$
				"field used to flag obsolete requirement (that for some reason we want to keep in the model though)\r\n[source: Capella study]", //$NON-NLS-1$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_RequirementId(), source,
				new String[] { "description", "a unique identifier for this requirement\r\n[source: Capella study]", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirement_AdditionalInformation(), source, new String[] { "description", //$NON-NLS-1$
				"a free field to capture any additional information required to complement this requirement statement\r\n[source: Capella study]", //$NON-NLS-1$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_VerificationMethod(), source, new String[] { "description", //$NON-NLS-1$
				"this field receives the description of the method that will be used to verify that this requirement is fulfilled.\r\n[source: Capella study]", //$NON-NLS-1$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_VerificationPhase(), source, new String[] { "description", //$NON-NLS-1$
				"a field receiving the description of the design phase in which this requirement can/will be verified\r\n[source: Capella study]", //$NON-NLS-1$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_ImplementationVersion(), source, new String[] { "description", //$NON-NLS-1$
				"a unique identifier to keep track of the version of this requirement\r\n[source: Capella study]", //$NON-NLS-1$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_Feature(), source,
				new String[] { "description", //$NON-NLS-1$
						"the system feature that this requirement corresponds to\r\n[source: Capella study]", //$NON-NLS-1$
						"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"type", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemFunctionalInterfaceRequirementEClass, source,
				new String[] { "description", "A requirement related to an interface functional property", //$NON-NLS-1$ //$NON-NLS-2$
						"usage guideline", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"used in levels", "operational,system, logical", //$NON-NLS-1$ //$NON-NLS-2$
						"usage examples", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemFunctionalRequirementEClass, source,
				new String[] { "description", "A requirement related a system functional property", //$NON-NLS-1$ //$NON-NLS-2$
						"usage guideline", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"used in levels", "operational,system,logical", //$NON-NLS-1$ //$NON-NLS-2$
						"usage examples", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemNonFunctionalInterfaceRequirementEClass, source, new String[] { "description", //$NON-NLS-1$
				"Any non functional constraint to be satisfied at interfaces level.\r\n(e.g. resources usage, environmental constraints, criticity, performance...) ", //$NON-NLS-1$
				"usage guideline", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"used in levels", "operational,system,logical,physical", //$NON-NLS-1$ //$NON-NLS-2$
				"usage examples", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemNonFunctionalRequirementEClass, source, new String[] { "description", //$NON-NLS-1$
				"Non functional requirements are any non functional constraints to be satisfied.\r\n(e.g. resources usage, environmental constraints, criticity, performance...) ", //$NON-NLS-1$
				"usage guideline", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"used in levels", "operational,system,logical,physical", //$NON-NLS-1$ //$NON-NLS-2$
				"usage examples", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemUserRequirementEClass, source,
				new String[] { "description", "A User requirement that has to be fulfilled by the System", //$NON-NLS-1$ //$NON-NLS-2$
						"usage guideline", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"used in levels", "operational,system", //$NON-NLS-1$ //$NON-NLS-2$
						"usage examples", "n/a", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"comment/notes", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"reference documentation", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/BusinessInformation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createBusinessInformationAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/BusinessInformation"; //$NON-NLS-1$
		addAnnotation(requirementsPkgEClass, source, new String[] { "Label", "RequirementPkg" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirementsPkg_OwnedRequirements(), source, new String[] { "Label", "ownedRequirements" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirementsPkg_OwnedRequirementPkgs(), source, new String[] { "Label", "subRequirementPkgs" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(requirementsTraceEClass, source, new String[] { "Label", "RequirementTrace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(requirementEClass, source, new String[] { "Label", "Requirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemFunctionalInterfaceRequirementEClass, source,
				new String[] { "Label", "SystemFunctionalInterfaceRequirement" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemFunctionalRequirementEClass, source, new String[] { "Label", "SystemFunctionalRequirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemNonFunctionalInterfaceRequirementEClass, source,
				new String[] { "Label", "SystemNonFunctionalInterfaceRequirement" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemNonFunctionalRequirementEClass, source,
				new String[] { "Label", "SystemNonFunctionalRequirement" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemUserRequirementEClass, source, new String[] { "Label", "SystemUserRequirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMappingAnnotations() {
		String source = "http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping"; //$NON-NLS-1$
		addAnnotation(requirementsPkgEClass, source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"base metaclass in UML/SysML profile ", "uml::Package", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirementsPkg_AdditionalInformation(), source,
				new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
						"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirementsPkg_Level(), source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirementsPkg_OwnedRequirements(), source, new String[] { "UML/SysML semantic equivalences", //$NON-NLS-1$
				"uml::Package::packagedElement", //$NON-NLS-1$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", //$NON-NLS-1$
				"uml::Package::packagedElement elements on which Requirement stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed" //$NON-NLS-1$
		});
		addAnnotation(getRequirementsPkg_OwnedRequirementPkgs(), source, new String[] {
				"UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", //$NON-NLS-1$
				"uml::Package::nestedPackage elements on which RequirementPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed" //$NON-NLS-1$
		});
		addAnnotation(requirementsTraceEClass, source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"base metaclass in UML/SysML profile ", "uml::Dependency", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(requirementEClass, source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"base metaclass in UML/SysML profile ", "", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "SysML::Requirements::Requirement", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_IsObsolete(), source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_RequirementId(), source,
				new String[] { "UML/SysML semantic equivalences", "SysML::Requirements::Requirement::id", //$NON-NLS-1$ //$NON-NLS-2$
						"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirement_AdditionalInformation(), source,
				new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
						"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirement_VerificationMethod(), source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_VerificationPhase(), source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_ImplementationVersion(), source,
				new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
						"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirement_Feature(), source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_RelatedCapellaElements(), source,
				new String[] { "UML/SysML semantic equivalences", "keyword::none", //$NON-NLS-1$ //$NON-NLS-2$
						"explanation", "Derived and transient", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemFunctionalInterfaceRequirementEClass, source,
				new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
						"base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement", //$NON-NLS-1$ //$NON-NLS-2$
						"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemFunctionalRequirementEClass, source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemNonFunctionalInterfaceRequirementEClass, source,
				new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
						"base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement", //$NON-NLS-1$ //$NON-NLS-2$
						"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemNonFunctionalRequirementEClass, source,
				new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
						"base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement", //$NON-NLS-1$ //$NON-NLS-2$
						"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
						"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(systemUserRequirementEClass, source, new String[] { "UML/SysML semantic equivalences", "", //$NON-NLS-1$ //$NON-NLS-2$
				"base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement", //$NON-NLS-1$ //$NON-NLS-2$
				"explanation", "none", //$NON-NLS-1$ //$NON-NLS-2$
				"constraints", "none" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/semantic</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSemanticAnnotations() {
		String source = "http://www.polarsys.org/capella/semantic"; //$NON-NLS-1$
		addAnnotation(requirementsPkgEClass, source, new String[] {});
		addAnnotation(getRequirementsPkg_AdditionalInformation(), source, new String[] {});
		addAnnotation(getRequirementsPkg_Level(), source, new String[] {});
		addAnnotation(getRequirementsPkg_OwnedRequirements(), source, new String[] {});
		addAnnotation(getRequirementsPkg_OwnedRequirementPkgs(), source, new String[] {});
		addAnnotation(requirementsTraceEClass, source, new String[] {});
		addAnnotation(getRequirementsTrace_Source(), source, new String[] {});
		addAnnotation(getRequirementsTrace_Target(), source, new String[] {});
		addAnnotation(getRequirement_IsObsolete(), source, new String[] {});
		addAnnotation(getRequirement_RequirementId(), source, new String[] {});
		addAnnotation(getRequirement_AdditionalInformation(), source, new String[] {});
		addAnnotation(getRequirement_VerificationMethod(), source, new String[] {});
		addAnnotation(getRequirement_VerificationPhase(), source, new String[] {});
		addAnnotation(getRequirement_ImplementationVersion(), source, new String[] {});
		addAnnotation(getRequirement_Feature(), source, new String[] {});
		addAnnotation(getRequirement_RelatedCapellaElements(), source, new String[] {});
		addAnnotation(systemFunctionalInterfaceRequirementEClass, source, new String[] {});
		addAnnotation(systemFunctionalRequirementEClass, source, new String[] {});
		addAnnotation(systemNonFunctionalInterfaceRequirementEClass, source, new String[] {});
		addAnnotation(systemNonFunctionalRequirementEClass, source, new String[] {});
		addAnnotation(systemUserRequirementEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$
		addAnnotation(requirementsPkgEClass, source,
				new String[] { "ExtendedElement", "http://www.polarsys.org/capella/core/cs/7.0.0#//BlockArchitecture" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$
		addAnnotation(requirementsPkgEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//BlockArchitecture" //$NON-NLS-1$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/UML2Mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUML2MappingAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/UML2Mapping"; //$NON-NLS-1$
		addAnnotation(getRequirementsPkg_AdditionalInformation(), source,
				new String[] { "featureName", "additionalInformation", //$NON-NLS-1$ //$NON-NLS-2$
						"featureOwner", "eng.RequirementPkg", //$NON-NLS-1$ //$NON-NLS-2$
						"fromStereotype", "true" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirementsPkg_Level(), source, new String[] { "featureName", "level", //$NON-NLS-1$ //$NON-NLS-2$
				"featureOwner", "eng.RequirementPkg", //$NON-NLS-1$ //$NON-NLS-2$
				"fromStereotype", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirementsPkg_OwnedRequirements(), source, new String[] { "featureName", "packagedElement", //$NON-NLS-1$ //$NON-NLS-2$
				"featureOwner", "Package" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirementsPkg_OwnedRequirementPkgs(), source,
				new String[] { "featureName", "packagedElement", //$NON-NLS-1$ //$NON-NLS-2$
						"featureOwner", "Package" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(requirementsTraceEClass, source, new String[] { "metaclass", "Dependency", //$NON-NLS-1$ //$NON-NLS-2$
				"stereotype", "eng.RequirementTrace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(requirementEClass, source, new String[] { "metaclass", "Class", //$NON-NLS-1$ //$NON-NLS-2$
				"stereotype", "eng.Requirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_RequirementId(), source, new String[] { "featureName", "requirementId", //$NON-NLS-1$ //$NON-NLS-2$
				"featureOwner", "eng.Requirement", //$NON-NLS-1$ //$NON-NLS-2$
				"fromStereotype", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_AdditionalInformation(), source,
				new String[] { "featureName", "additionalInformation", //$NON-NLS-1$ //$NON-NLS-2$
						"featureOwner", "eng.Requirement", //$NON-NLS-1$ //$NON-NLS-2$
						"fromStereotype", "true" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirement_VerificationMethod(), source, new String[] { "featureName", "verificationMethod", //$NON-NLS-1$ //$NON-NLS-2$
				"featureOwner", "eng.Requirement", //$NON-NLS-1$ //$NON-NLS-2$
				"fromStereotype", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_VerificationPhase(), source, new String[] { "featureName", "verificationPhase", //$NON-NLS-1$ //$NON-NLS-2$
				"featureOwner", "eng.Requirement", //$NON-NLS-1$ //$NON-NLS-2$
				"fromStereotype", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_ImplementationVersion(), source,
				new String[] { "featureName", "implementationVersion", //$NON-NLS-1$ //$NON-NLS-2$
						"featureOwner", "eng.Requirement", //$NON-NLS-1$ //$NON-NLS-2$
						"fromStereotype", "true" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getRequirement_Feature(), source, new String[] { "featureName", "feature", //$NON-NLS-1$ //$NON-NLS-2$
				"featureOwner", "eng.Requirement", //$NON-NLS-1$ //$NON-NLS-2$
				"fromStereotype", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemFunctionalInterfaceRequirementEClass, source, new String[] { "metaclass", "Class", //$NON-NLS-1$ //$NON-NLS-2$
				"stereotype", "eng.sys.SystemFunctionalInterfaceRequirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemFunctionalRequirementEClass, source, new String[] { "metaclass", "Class", //$NON-NLS-1$ //$NON-NLS-2$
				"stereotype", "eng.sys.SystemFunctionalRequirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemNonFunctionalInterfaceRequirementEClass, source, new String[] { "metaclass", "Class", //$NON-NLS-1$ //$NON-NLS-2$
				"stereotype", "eng.sys.SystemNonFunctionalInterfaceRequirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemNonFunctionalRequirementEClass, source, new String[] { "metaclass", "Class", //$NON-NLS-1$ //$NON-NLS-2$
				"stereotype", "eng.sys.SystemNonFunctionalRequirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(systemUserRequirementEClass, source, new String[] { "metaclass", "Class", //$NON-NLS-1$ //$NON-NLS-2$
				"stereotype", "eng.sys.SystemUserRequirement" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSegmentAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment"; //$NON-NLS-1$
		addAnnotation(getRequirementsPkg_OwnedRequirements(), source, new String[] {});
		addAnnotation(getRequirementsPkg_OwnedRequirementPkgs(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIgnoreAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore"; //$NON-NLS-1$
		addAnnotation(requirementsTraceEClass, source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/derived</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivedAnnotations() {
		String source = "http://www.polarsys.org/capella/derived"; //$NON-NLS-1$
		addAnnotation(getRequirementsTrace_Source(), source, new String[] { "viatra.variant", "alias", //$NON-NLS-1$ //$NON-NLS-2$
				"viatra.expression", "sourceElement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirementsTrace_Target(), source, new String[] { "viatra.variant", "alias", //$NON-NLS-1$ //$NON-NLS-2$
				"viatra.expression", "targetElement" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRequirement_RelatedCapellaElements(), source, new String[] { "viatra.variant", "patternbody", //$NON-NLS-1$ //$NON-NLS-2$
				"viatra.expression", //$NON-NLS-1$
				"Requirement.incomingTraces(self, rt);\r\n\tRequirementsTrace.sourceElement(rt, target);" //$NON-NLS-1$
		});
	}

} //RequirementPackageImpl
