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
package org.polarsys.capella.basic.requirement.trace.extension;

import org.polarsys.capella.basic.requirement.RequirementFactory;
import org.polarsys.capella.basic.requirement.RequirementsTrace;
import org.polarsys.capella.core.data.capellacore.Trace;
import org.polarsys.capella.core.platform.eclipse.capella.ui.trace.extension.ITraceExtension;

public class RequirementTraceExtension implements ITraceExtension {

  @Override
  public boolean canDelete(Trace element) {
    return isRequirementsTrace(element);
  }

  @Override
  public boolean canRemoveSource(Trace element) {
    return isRequirementsTrace(element);
  }

  @Override
  public boolean canRemoveTarget(Trace element) {
    return isRequirementsTrace(element);
  }

  public boolean isRequirementsTrace(Object element) {
    return element instanceof RequirementsTrace;
  }

  @Override
  public boolean isAssignableFrom(Class<?> clazz) {
    return RequirementsTrace.class.isAssignableFrom(clazz);
  }

  @Override
  public String getTraceName() {
    return Messages.requirementTraceType;
  }

  @Override
  public Trace getNewTraceInstance() {
    return RequirementFactory.eINSTANCE.createRequirementsTrace();
  }

  @Override
  public boolean isManualTrace() {
    return true;
  }

  @Override
  public boolean canAddRemoveItemsToTrace(Object element) {
    return isRequirementsTrace(element);
  }

  @Override
  public boolean canEdit(Object element) {
    return isRequirementsTrace(element);
  }

  @Override
  public String getViewpointID() {
    return "org.polarsys.capella.basic.requirement";
  }

}
