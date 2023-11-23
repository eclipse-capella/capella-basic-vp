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

import java.util.AbstractMap.SimpleEntry;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.diffmerge.generic.api.scopes.ITreeDataScope;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.basic.requirement.RequirementPackage;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.basic.requirement.helpers.RequirementHelper;
import org.polarsys.capella.basic.requirement.util.IRequirementConstants;
import org.polarsys.capella.core.data.capellacore.Structure;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.transition.common.handlers.extension.ITransitionExtension;
import org.polarsys.capella.core.transition.common.handlers.scope.IScopeFilter;
import org.polarsys.capella.core.transition.common.handlers.scope.IScopeRetriever;

import com.google.common.collect.SetMultimap;

public class RequirementTransitionExtension implements ITransitionExtension, IRequirementConstants {

  Collection<IScopeFilter> filters;
  Collection<IScopeRetriever> retrievers;

  public RequirementTransitionExtension() {

  }

  @Override
  public String getViewpointID() {
    return VIEWPOINT_ID;
  }

  @Override
  public Collection<? extends IScopeFilter> getScopeFilters() {
    if (filters == null) {
      filters = new HashSet<IScopeFilter>();
      filters.add(new RequirementsScopeFilter());
    }
    return filters;
  }

  @Override
  public Collection<? extends IScopeRetriever> getScopeRetrievers() {
    if (retrievers == null) {
      retrievers = new HashSet<IScopeRetriever>();
      retrievers.add(new RequirementsScopeRetriever());
    }
    return retrievers;
  }

  @Override
  public Set<Entry<EObject, EObject>> initializeBlockArchitecture(BlockArchitecture source,
      BlockArchitecture target, boolean createTarget) {
    Set<Entry<EObject, EObject>> mappings = new HashSet<Entry<EObject, EObject>>();
    EObject sourceChild = RequirementHelper.getRequirementsPkg(source, false);
    if (sourceChild != null) {
      mappings.add(new SimpleEntry<EObject, EObject>(sourceChild,
          RequirementHelper.getRequirementsPkg(target, createTarget)));
    }
    return mappings;
  }

  @Override
  public void addAdditionnalTraceabilityMappings(SetMultimap<EObject, EObject> map, PhysicalArchitecture sourcePA,
      BlockArchitecture targetBlockArchitecture) {
    Structure sourceRequirementsPkg = RequirementHelper.getRequirementsPkg(sourcePA, false);
    Structure targetRequirementsPkg = RequirementHelper.getRequirementsPkg(targetBlockArchitecture, false);
    if ((sourceRequirementsPkg != null) && (targetRequirementsPkg != null)) {
      map.put(sourceRequirementsPkg, targetRequirementsPkg);
    }
    
  }

  @Override
  public String getAdditionalMatchKey(EObject element_p, ITreeDataScope<EObject> scope_p) {
    if (element_p instanceof RequirementsPkg) {
      EObject eContainer = element_p.eContainer();
      EClass eContainerClass = null;
      if (eContainer instanceof OperationalAnalysis) {
        eContainerClass = OaPackage.Literals.OPERATIONAL_ANALYSIS;
      } else if (eContainer instanceof SystemAnalysis) {
        eContainerClass = CtxPackage.Literals.SYSTEM_ANALYSIS;
      } else if (eContainer instanceof LogicalArchitecture) {
        eContainerClass = LaPackage.Literals.LOGICAL_ARCHITECTURE;
      } else if (eContainer instanceof PhysicalArchitecture) {
        eContainerClass = PaPackage.Literals.PHYSICAL_ARCHITECTURE;
      } else if (eContainer instanceof EPBSArchitecture) {
        eContainerClass = EpbsPackage.Literals.EPBS_ARCHITECTURE;
      }

      if (eContainerClass != null) {
        return EcoreUtil.getURI(eContainerClass) + ";" + EcoreUtil.getURI(RequirementPackage.Literals.REQUIREMENTS_PKG);

      }
    }
    return null;
  }

}
