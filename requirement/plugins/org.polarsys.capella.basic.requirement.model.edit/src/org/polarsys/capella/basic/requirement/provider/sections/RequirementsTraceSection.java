package org.polarsys.capella.basic.requirement.provider.sections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.core.properties.sections.NamedElementSection;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import org.polarsys.capella.basic.requirement.RequirementsTrace;

/**
 * This is the item provider adapter for a {@link RequirementsTraceSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsTraceSection extends NamedElementSection {
	/**
	 * @generated
	 */
	@Override
	public boolean select(Object toTest) {
		EObject obj = CapellaAdapterHelper.resolveSemanticObject(toTest);

		return obj != null && obj.eClass()
				.equals(org.polarsys.capella.basic.requirement.RequirementPackage.eINSTANCE.getRequirementsTrace());
	}
}
