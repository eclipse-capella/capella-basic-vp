package org.polarsys.capella.basic.requirement.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.RequirementPackage;
import org.polarsys.capella.basic.requirement.helpers.RequirementModelHelper;
import org.polarsys.capella.core.data.helpers.capellacore.delegates.NamespaceHelper;

/**
 * @generated
 */
public class RequirementHelper {

	private static final RequirementHelper instance = new RequirementHelper();

	/**
	 * @generated
	 */
	public static RequirementHelper getInstance() {
		return instance;
	}

	/**
	 * @generated NOT
	 */
	public Object doSwitch(Requirement object, EStructuralFeature feature) {
		// handle derivated feature
		Object ret = null;

		if (feature.equals(RequirementPackage.Literals.REQUIREMENT__RELATED_CAPELLA_ELEMENTS)) {
      ret = RequirementModelHelper.getRelatedCapellaElements(object);
		}

		// no helper found... searching in super classes...
		if (null == ret) {
			// delegate to parent helper
			ret = NamespaceHelper.getInstance().doSwitch(object, feature);
		}

		return ret;

	}

}
