/*******************************************************************************
 * Copyright (c) 2023 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.basic.requirement.transition.extension;

import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.capella.basic.requirement.RequirementPackage;
import org.polarsys.capella.core.transition.system.domain.CapellaTransitionDomainHelper;

public class RequirementsDomainHelper extends CapellaTransitionDomainHelper {
  @Override
  protected Set<EPackage> getEPackages() {
    Set<EPackage> ePackages = super.getEPackages();
    ePackages.add(RequirementPackage.eINSTANCE);
    return ePackages;
  }

  /**
   * @see org.polarsys.capella.core.transition.system.domain.CapellaTransitionDomainHelper#isDomainFor(Object)
   */
  @Override
  public boolean isDomainFor(Object object) {
    return true;
  }
}