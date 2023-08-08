package org.polarsys.capella.basic.requirement.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.basic.requirement.SystemFunctionalInterfaceRequirement;
import org.polarsys.capella.basic.requirement.SystemNonFunctionalInterfaceRequirement;

/**
 * @generated
 */
public class SystemNonFunctionalInterfaceRequirementHelper {

	private static final SystemNonFunctionalInterfaceRequirementHelper instance = new SystemNonFunctionalInterfaceRequirementHelper();

	/**
	 * @generated
	 */
	public static SystemNonFunctionalInterfaceRequirementHelper getInstance() {
		return instance;
	}

	/**
	 * @generated NOT
	 */
	public Object doSwitch(SystemNonFunctionalInterfaceRequirement object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.basic.requirement.model.helpers.RequirementHelper.getInstance().doSwitch(object,
				feature);

	}
}