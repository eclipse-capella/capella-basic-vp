/*******************************************************************************
 * Copyright (c) 2006, 2020 Thales Global Services
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.perfo.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCapacity;

/**
 * @generated
 */
public class PerformanceCapacityHelper {

  private static final PerformanceCapacityHelper instance = new PerformanceCapacityHelper();

  /**
   * @generated
   */
  public static PerformanceCapacityHelper getInstance() {
    return instance;
  }

  /**
   * @generated
   */
  public Object doSwitch(PerformanceCapacity object, EStructuralFeature feature) {
    // handle derivated feature

    // delegate to parent helper
    return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
        .doSwitch(object, feature);

  }

}