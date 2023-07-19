package org.polarsys.capella.requirement.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;
import org.polarsys.capella.requirement.RequirementPackage;
import org.polarsys.capella.requirement.RequirementsTrace;

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
  public Object doSwitch(RequirementsTrace element, EStructuralFeature feature) {
    Object ret = null;

    if (feature.equals(RequirementPackage.Literals.REQUIREMENTS_TRACE__SOURCE)) {
      ret = getSource(element);
    } else if (feature.equals(RequirementPackage.Literals.REQUIREMENTS_TRACE__TARGET)) {
      ret = getTarget(element);
    }

    // no helper found... searching in super classes...
    if (null == ret) {
   // delegate to parent helper
      return org.polarsys.capella.core.data.helpers.capellacore.delegates.TraceHelper.getInstance().doSwitch(element,feature);
    }

    return ret;
  }

  protected TraceableElement getSource(RequirementsTrace element) {
    return element.getSourceElement();
  }

  protected TraceableElement getTarget(RequirementsTrace element) {
    return element.getTargetElement();
  }

}