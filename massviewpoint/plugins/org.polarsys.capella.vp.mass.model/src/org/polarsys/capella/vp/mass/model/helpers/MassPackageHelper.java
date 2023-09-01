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

package org.polarsys.capella.vp.mass.model.helpers;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.IHelper;
import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.PartMass;

/**
 * @generated 
 */
public class MassPackageHelper implements IHelper {

  /**
   * @generated
   */
  public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
    Object ret = null;

    if (ret == null && object instanceof Mass) {
      ret = MassHelper.getInstance().doSwitch((Mass) object, feature);
    }
    if (ret == null && object instanceof PartMass) {
      ret = PartMassHelper.getInstance().doSwitch((PartMass) object, feature);
    }
    return ret;
  }

}
