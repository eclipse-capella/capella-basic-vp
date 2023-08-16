/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.basic.requirement.tests.ju;

import java.util.Arrays;
import java.util.List;

import org.polarsys.capella.test.business.queries.ju.BQTestCase;

/**
 * @generated
 */
public class CapellaElement_OutgoingRequirement extends BQTestCase {

  /**
   * @generated
   */
  public String getProjectForTest() {
    return "CrossTable-OA"; //$NON-NLS-1$
  }
  
  /**
   * @generated
   */
  public String getLibProjectForTest() {
    return ""; //$NON-NLS-1$
  }

  @Override
  public List<String> getRequiredTestModels() {
    return Arrays.asList(new String[] { getProjectForTest() });
  }

  /**
   * @generated
   */
  @Override
  public String getBQFullQualifiedName() {
    return "org.polarsys.capella.basic.requirement.business.queries.CapellaElement_OutgoingRequirement"; //$NON-NLS-1$
  }

}
