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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.IHelper;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCapacity;
import org.polarsys.capella.vp.perfo.perfo.TimeConsumption;
import org.polarsys.capella.vp.perfo.perfo.TimeCapacity;
import org.polarsys.capella.vp.perfo.perfo.PerformanceConsumption;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCriteria;
import org.polarsys.capella.vp.perfo.perfo.UnityElement;

/**
 * @generated 
 */
public class PerfoPackageHelper implements IHelper {

  /**
   * @generated
   */
  public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
    Object ret = null;

    if (ret == null && object instanceof PerformanceCriteria) {
      ret = PerformanceCriteriaHelper.getInstance().doSwitch((PerformanceCriteria) object, feature);
    }
    if (ret == null && object instanceof PerformanceConsumption) {
      ret = PerformanceConsumptionHelper.getInstance().doSwitch((PerformanceConsumption) object, feature);
    }
    if (ret == null && object instanceof PerformanceCapacity) {
      ret = PerformanceCapacityHelper.getInstance().doSwitch((PerformanceCapacity) object, feature);
    }
    if (ret == null && object instanceof TimeConsumption) {
      ret = TimeConsumptionHelper.getInstance().doSwitch((TimeConsumption) object, feature);
    }
    if (ret == null && object instanceof TimeCapacity) {
      ret = TimeCapacityHelper.getInstance().doSwitch((TimeCapacity) object, feature);
    }
    if (ret == null && object instanceof UnityElement) {
      ret = UnityElementHelper.getInstance().doSwitch((UnityElement) object, feature);
    }
    return ret;
  }

}
