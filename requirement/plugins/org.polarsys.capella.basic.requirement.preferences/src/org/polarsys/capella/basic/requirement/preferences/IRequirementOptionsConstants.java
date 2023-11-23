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

package org.polarsys.capella.basic.requirement.preferences;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.transition.common.constants.IOptionsConstants;

/**
 */
public class IRequirementOptionsConstants extends IOptionsConstants {

  public static final String REQUIREMENTS_ELEMENTS = "requirementsExport";
  public static final Collection<EObject> REQUIREMENTS_ELEMENTS_DEFAULT_VALUE = Collections.emptyList();

  public static final String SYSTEM2SUBSYSTEM_PREFERENCES = "capella.core.transition.system2subsystem";
}
