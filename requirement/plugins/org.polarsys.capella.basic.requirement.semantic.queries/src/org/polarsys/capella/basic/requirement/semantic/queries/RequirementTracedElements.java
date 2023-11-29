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

package org.polarsys.capella.basic.requirement.semantic.queries;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.helpers.RequirementModelHelper;
import org.polarsys.capella.common.helpers.query.IQuery;
import org.polarsys.capella.core.data.capellacore.CapellaElement;

/**
 * Return all the elements associated to current requirement
 */
public class RequirementTracedElements implements IQuery {

  /**
   * Default Constructor 
   */
  public RequirementTracedElements() {
    // do nothing
  }

  /**
   * @see org.polarsys.capella.common.helpers.query.IQuery#compute(java.lang.Object)
   */
  public List<Object> compute(Object object) {
    List<Object> result = new ArrayList<Object>();
    if (object instanceof Requirement) {
      // Type the element
      Requirement req = (Requirement) object;
      for (CapellaElement element : RequirementModelHelper.getRelatedCapellaElements(req)) {
        result.add(element);
      }
    }
    return result;
  }
}
