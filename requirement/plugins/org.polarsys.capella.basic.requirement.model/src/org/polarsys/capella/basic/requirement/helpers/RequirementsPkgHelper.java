package org.polarsys.capella.basic.requirement.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.basic.requirement.RequirementsPkg;

/**
 * @generated
 */ 
public class RequirementsPkgHelper {

  private static final RequirementsPkgHelper instance = new RequirementsPkgHelper();

  /**
   * @generated
   */
  public static RequirementsPkgHelper getInstance() {
    return instance;
  }

  /**
   * @generated
   */
  public Object doSwitch(RequirementsPkg object, EStructuralFeature feature) {
    // delegate to parent helper
    return org.polarsys.capella.core.data.helpers.capellacore.delegates.StructureHelper.getInstance().doSwitch(object,
        feature);
  }



}