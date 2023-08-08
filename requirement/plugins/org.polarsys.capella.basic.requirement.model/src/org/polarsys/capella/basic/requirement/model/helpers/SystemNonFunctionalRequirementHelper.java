package org.polarsys.capella.basic.requirement.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.basic.requirement.SystemFunctionalInterfaceRequirement;
import org.polarsys.capella.basic.requirement.SystemNonFunctionalRequirement;

/**
 * @generated
 */
public class SystemNonFunctionalRequirementHelper {

	private static final SystemNonFunctionalRequirementHelper instance = new SystemNonFunctionalRequirementHelper();

	/**
	 * @generated
	 */
	public static SystemNonFunctionalRequirementHelper getInstance() {
		return instance;
	}

	/**
	 * @generated NOT
	 */
	public Object doSwitch(SystemNonFunctionalRequirement object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.basic.requirement.model.helpers.RequirementHelper.getInstance().doSwitch(object,
				feature);

	}
}