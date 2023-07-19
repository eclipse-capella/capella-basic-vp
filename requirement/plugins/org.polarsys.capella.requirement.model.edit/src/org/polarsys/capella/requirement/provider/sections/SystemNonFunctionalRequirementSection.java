package org.polarsys.capella.requirement.provider.sections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.core.properties.sections.NamedElementSection;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import org.polarsys.capella.requirement.SystemNonFunctionalRequirement;

/**
 * This is the item provider adapter for a {@link SystemNonFunctionalRequirementSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemNonFunctionalRequirementSection extends NamedElementSection {
	/**
	 * @generated
	 */
	@Override
	public boolean select(Object toTest) {
		EObject obj = CapellaAdapterHelper.resolveSemanticObject(toTest);
		
		return obj != null && obj.eClass().equals(org.polarsys.capella.requirement.RequirementPackage.eINSTANCE.getSystemNonFunctionalRequirement());
	}
}

