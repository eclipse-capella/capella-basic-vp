package org.polarsys.capella.basic.requirement.helpers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.RequirementFactory;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.basic.requirement.RequirementsTrace;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Structure;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * @generated
 */ 
public class RequirementModelHelper {

  private static String REQUIREMENTSPKG_DEFAULT_NAME = "Requirements";

  /**
   * Retrieve the Requirement pkg from the given architecture
   */
  public static Structure getRequirementsPkg(BlockArchitecture architecture, boolean create) {
    Set<RequirementsPkg> requirementPkgs = getRequirementsPkgs(architecture);
    if (requirementPkgs.isEmpty() && create) {
      if (create) {
        // to externalize when constants in skeleton will be into helpers.
        RequirementsPkg pkg = RequirementFactory.eINSTANCE.createRequirementsPkg(); // $NON-NLS-1$
        pkg.setName(REQUIREMENTSPKG_DEFAULT_NAME);
        architecture.getOwnedExtensions().add(pkg);
      } else {
        return null;
      }
    }
    if (requirementPkgs.iterator().hasNext())
      return requirementPkgs.iterator().next();

    return null;
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

  /**
   * @generated not
   * 
   *            Retrieve the applied requirements from the given capella element
   */
  public static List<Requirement> getAppliedRequirements(CapellaElement element) {
    List<Requirement> currentElements = new ArrayList<Requirement>();

    for (AbstractTrace trace : element.getOutgoingTraces()) {
      if (trace instanceof RequirementsTrace) {
        EObject target = trace.getTargetElement();
        if (target instanceof Requirement) {
          currentElements.add((Requirement) target);
        }
      }
    }
    return currentElements;
  }
  
  /**
   * @generated not
   * 
   *            Retrieve the related capella elements from the given requirement
   */
  public static List<CapellaElement> getRelatedCapellaElements(Requirement element) {
    List<CapellaElement> currentElements = new ArrayList<CapellaElement>();

    for (AbstractTrace trace : element.getIncomingTraces()) {
      if (trace instanceof RequirementsTrace) {
        EObject source = trace.getSourceElement();
        if (source instanceof CapellaElement) {
          currentElements.add((CapellaElement) source);
        }
      }
    }
    return currentElements;
  }
}



