package org.polarsys.capella.basic.requirement.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.basic.requirement.SystemFunctionalInterfaceRequirement;
import org.polarsys.capella.basic.requirement.SystemUserRequirement;

/**
 * @generated
 */
public class SystemUserRequirementHelper {

	private static final SystemUserRequirementHelper instance = new SystemUserRequirementHelper();

	/**
	 * @generated
	 */
	public static SystemUserRequirementHelper getInstance() {
		return instance;
	}

	/**
	 * @generated NOT
	 */
	public Object doSwitch(SystemUserRequirement object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.basic.requirement.model.helpers.RequirementHelper.getInstance().doSwitch(object,
				feature);

	}
}