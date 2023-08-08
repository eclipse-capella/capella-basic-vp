package org.polarsys.capella.basic.requirement.model.helpers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Structure;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.helpers.capellacore.delegates.NamespaceHelper;
import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.RequirementFactory;
import org.polarsys.capella.basic.requirement.RequirementPackage;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.basic.requirement.RequirementsTrace;
import org.polarsys.kitalpha.emde.model.ElementExtension;

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
			ret = getRelatedCapellaElements(object);
		}

		// no helper found... searching in super classes...
		if (null == ret) {
			// delegate to parent helper
			ret = NamespaceHelper.getInstance().doSwitch(object, feature);
		}

		return ret;

	}

	protected List<CapellaElement> getRelatedCapellaElements(Requirement element) {
		List<CapellaElement> ret = new ArrayList<>();
		for (AbstractTrace trace : element.getIncomingTraces()) {
			if (trace instanceof RequirementsTrace) {
				TraceableElement elt = ((RequirementsTrace) trace).getSourceElement();
				if (elt instanceof CapellaElement) {
					ret.add((CapellaElement) elt);
				}
			}
		}
		return ret;
	}

}
