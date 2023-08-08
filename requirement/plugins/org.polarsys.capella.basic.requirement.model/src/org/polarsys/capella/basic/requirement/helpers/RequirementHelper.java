package org.polarsys.capella.basic.requirement.helpers;

import java.util.LinkedHashSet;
import java.util.Set;

import org.polarsys.capella.basic.requirement.RequirementFactory;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.core.data.capellacore.Structure;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * @generated
 */ 
public class RequirementHelper {

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



