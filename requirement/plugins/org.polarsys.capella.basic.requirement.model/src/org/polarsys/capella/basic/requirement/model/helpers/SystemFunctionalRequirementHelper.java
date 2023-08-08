package org.polarsys.capella.basic.requirement.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.basic.requirement.SystemFunctionalInterfaceRequirement;
import org.polarsys.capella.basic.requirement.SystemFunctionalRequirement;

/**
 * @generated
 */
public class SystemFunctionalRequirementHelper {

	private static final SystemFunctionalRequirementHelper instance = new SystemFunctionalRequirementHelper();

	/**
	 * @generated
	 */
	public static SystemFunctionalRequirementHelper getInstance() {
		return instance;
	}

	/**
	 * @generated NOT
	 */
	public Object doSwitch(SystemFunctionalRequirement object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.basic.requirement.model.helpers.RequirementHelper.getInstance().doSwitch(object,
				feature);

	}

}