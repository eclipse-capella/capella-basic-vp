package org.polarsys.capella.requirement.helpers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Structure;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.requirement.Requirement;
import org.polarsys.capella.requirement.RequirementFactory;
import org.polarsys.capella.requirement.RequirementPackage;
import org.polarsys.capella.requirement.RequirementsPkg;
import org.polarsys.capella.requirement.RequirementsTrace;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * @generated
 */ 
public class RequirementHelper {

  private static final RequirementHelper instance = new RequirementHelper();
  private static String REQUIREMENTSPKG_DEFAULT_NAME = "Requirements";

  /**
   * @generated
   */
  public static RequirementHelper getInstance() {
    return instance;
  }

  /**
   * @generated
   */
  public Object doSwitch(Requirement element, EStructuralFeature feature) {
    Object ret = null;

    if (feature.equals(RequirementPackage.Literals.REQUIREMENT__RELATED_CAPELLA_ELEMENTS)) {
      ret = getRelatedCapellaElements(element);
    }

    // no helper found... searching in super classes...
    if (null == ret) {
      // delegate to parent helper
      return org.polarsys.capella.requirement.helpers.RequirementHelper.getInstance().doSwitch(element, feature);
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

  /**
   * Retrieve the Requirement pkg from the given architecture
   */
  public static Structure getRequirementsPkg(BlockArchitecture architecture, boolean create) {
    Set<RequirementsPkg> requirementPkgs = getRequirementsPkgs(architecture);
    if (requirementPkgs.isEmpty() && create) {
      if (create) {
        // to externalize when constants in skeleton will be into helpers.
        RequirementsPkg pkg = RequirementFactory.eINSTANCE.createRequirementsPkg(REQUIREMENTSPKG_DEFAULT_NAME); // $NON-NLS-1$
        architecture.getOwnedExtensions().add(pkg);
      } else {
        return null;
      }
    }
    return requirementPkgs.iterator().next();
  }

  /**
   * Retrieve the Requirement pkg from the given architecture
   */
  public static Structure getRequirementsPkg(BlockArchitecture architecture) {
    return getRequirementsPkg(architecture, true);
  }

  /**
   * Retrieve the Requirement pkg from the given architecture
   */
  public static Set<RequirementsPkg> getRequirementsPkgs(BlockArchitecture architecture) {
    Set<RequirementsPkg> requirementPkgs = new LinkedHashSet<RequirementsPkg>();
    for (ElementExtension extension : architecture.getOwnedExtensions()) {
      if (extension instanceof RequirementsPkg) {
        requirementPkgs.add((RequirementsPkg) extension);
      }
    }
    return requirementPkgs;
  }

}



