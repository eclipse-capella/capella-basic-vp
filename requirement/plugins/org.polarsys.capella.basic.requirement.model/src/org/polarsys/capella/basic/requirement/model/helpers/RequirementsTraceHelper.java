package org.polarsys.capella.basic.requirement.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;
import org.polarsys.capella.basic.requirement.RequirementPackage;
import org.polarsys.capella.basic.requirement.RequirementsTrace;

/**
 * @generated
 */
public class RequirementsTraceHelper {

	private static final RequirementsTraceHelper instance = new RequirementsTraceHelper();

	/**
	 * @generated
	 */
	public static RequirementsTraceHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(RequirementsTrace object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.TraceHelper.getInstance().doSwitch(object,
				feature);

	}

	protected TraceableElement getSource(RequirementsTrace element) {
		return element.getSourceElement();
	}

	protected TraceableElement getTarget(RequirementsTrace element) {
		return element.getTargetElement();
	}

}