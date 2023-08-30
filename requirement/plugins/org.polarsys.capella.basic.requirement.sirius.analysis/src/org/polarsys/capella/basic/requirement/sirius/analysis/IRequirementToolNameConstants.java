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

import org.polarsys.capella.core.sirius.analysis.constants.IToolNameConstants;

/**
 * Centralizes constants about tools.
 */

@SuppressWarnings("nls")
public interface IRequirementToolNameConstants extends IToolNameConstants {
  String TABLE_TOOL_REQ_REQ_PKG = "Requirement Pkg";
  String TABLE_TOOL_REQ_SUR = "System User Requirement";
  String TABLE_TOOL_REQ_SFR = "System Functional Requirement";
  String TABLE_TOOL_REQ_SFIR = "System Functional Interface Requirement";
  String TABLE_TOOL_REQ_SNFR = "System Non Functional Requirement";
  String TABLE_TOOL_REQ_SNFIR = "System Non Functional Interface Requirement";

}