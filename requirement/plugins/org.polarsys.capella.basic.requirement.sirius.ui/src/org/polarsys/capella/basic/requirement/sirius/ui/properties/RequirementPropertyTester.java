/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.basic.requirement.sirius.ui.properties;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.capella.basic.requirement.util.IRequirementConstants;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.ui.actions.ModelAdaptation;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;

/**
 *
 */
public class RequirementPropertyTester extends PropertyTester implements IRequirementConstants {

  /**
   * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[],
   *      java.lang.Object)
   */
  public boolean test(Object object_p, String propertyName_p, Object[] params_p, Object testedValue_p) {
    boolean result = false;
    if (propertyName_p.equals("actionMode") || propertyName_p.equals("graphicalActionMode")) { //$NON-NLS-1$ //$NON-NLS-2$
      // getting the capella element
      ModelElement element = ModelAdaptation.adaptToCapella(object_p);
      if ((element != null) && (element instanceof CapellaElement)) {
        String actionName = (String) testedValue_p;
        if ("requirementManagerWizard".equals(actionName)) { //$NON-NLS-1$
          ResourceSet rSet = element.eResource().getResourceSet();
          boolean isActive = ViewpointManager.getInstance(rSet).isActive(VIEWPOINT_ID);
          return isActive && isRequirementManagerWizard(element);
        }
      }
    }
    return result;
  }

  private boolean isRequirementManagerWizard(ModelElement element) {
    return true;
  }
}
