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
package org.polarsys.capella.basic.requirement.sirius.analysis;

import org.polarsys.capella.core.sirius.analysis.IDiagramNameConstants;

/**
 * 
 */
public interface IRequirementDiagramNameConstants extends IDiagramNameConstants {
  
  String REQUIREMENTS_DIAGRAM_NAME = "Requirements";

  /**
   * Operational Analysis diagrams
   */
  String OPERATIONAL_ACTIVITIES_REQUIREMENTS_DIAGRAM_NAME = "Operational Activities - Requirements"; //$NON-NLS-1$
  String REQUIREMENTS_OPERATIONAL_ACTIVITIES__DIAGRAM_NAME = "Requirements - Operational Activities"; //$NON-NLS-1$

  /**
   * System Analysis diagrams
   */
  String SYSTEM_FUNCTIONS_REQUIREMENTS_DIAGRAM_NAME = "System Functions - Requirements"; //$NON-NLS-1$
  String REQUIREMENTS_SYSTEM_FUNCTIONS_DIAGRAM_NAME = "Requirements - System Functions"; //$NON-NLS-1$
  /**
   * Logical Architecture diagrams
   */
  String LOGICAL_ARCHITECTURE_REQUIREMENT_REFINEMENTS_DIAGRAM_NAME = "Logical Architecture Requirement Refinements"; //$NON-NLS-1$
  String LOGICAL_COMPONENTS_REQUIREMENTS_DIAGRAM_NAME = "Logical Components - Requirements"; //$NON-NLS-1$
  String LOGICAL_FUNCTIONS_REQUIREMENTS_DIAGRAM_NAME = "Logical Functions - Requirements"; //$NON-NLS-1$
  String REQUIREMENTS_LOGICAL_FUNCTIONS_DIAGRAM_NAME = "Requirements - Logical Functions"; //$NON-NLS-1$

  /**
   * Physical Architecture diagrams
   */
  String PHYSICAL_COMPONENTS_REQUIREMENTS_DIAGRAM_NAME = "Physical Components - Requirements"; //$NON-NLS-1$
  String PHYSICAL_FUNCTIONS_REQUIREMENTS_DIAGRAM_NAME = "Physical Functions - Requirements"; //$NON-NLS-1$
  String REQUIREMENTS_PHYSICAL_FUNCTIONS_DIAGRAM_NAME = "Requirements - Physical Functions"; //$NON-NLS-1$

  /**
   * EPBS Architecture diagrams
   */
  String CONFIGURATION_ITEMS_REQUIREMENTS_DIAGRAM_NAME = "Configuration Items - Requirements"; //$NON-NLS-1$
  String EPBS_REQUIREMENT_REFINEMENTS_DIAGRAM_NAME = "EPBS Requirement Refinements"; //$NON-NLS-1$
}
