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

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.basic.requirement.util.IRequirementConstants;
import org.polarsys.capella.common.ef.ExecutionManager;
import org.polarsys.capella.common.ef.ExecutionManagerRegistry;
import org.polarsys.capella.common.ef.command.AbstractReadWriteCommand;
import org.polarsys.capella.core.model.handler.command.CapellaResourceHelper;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.activity.IActivityExtender;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.EvaluationException;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class EnableViewpoint implements IActivityExtender {

  @Override
  public IStatus init(IContext context) {
    return Status.OK_STATUS;
  }

  @Override
  public IStatus dispose(IContext context) {
    return Status.OK_STATUS;
  }

  @Override
  public IStatus preActivity(IContext context, String activityIdentifier, ActivityParameters activityParams) {
    return Status.OK_STATUS;
  }

  @Override
  public IStatus postActivity(IContext context, String activityIdentifier, ActivityParameters activityParams) {
    if (isSubsystemTransition(context)) {
      Resource capellaResource = (Resource) context.get(ITransitionConstants.TRANSITION_TARGET_RESOURCE);

      if (containsRequirements(capellaResource)) {
        URI airdResource = capellaResource.getURI().trimFileExtension().appendFileExtension(CapellaResourceHelper.AIRD_FILE_EXTENSION);
        URI afmResource = capellaResource.getURI().trimFileExtension().appendFileExtension(CapellaResourceHelper.AFM_FILE_EXTENSION);
        IPath path = new Path(airdResource.toPlatformString(true));
        IFile airdFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

        if (airdFile.exists()) {
          Session session = SessionManager.INSTANCE.getExistingSession(airdResource);
          if (session != null) {
            referenceAird(session);
          } else {
            referenceAfm(afmResource);
          }
        } else {
          referenceAfm(afmResource);
        }
      }
    }
    return Status.OK_STATUS;
  }

  private boolean containsRequirements(Resource capellaResource) {
    if (capellaResource == null) {
      return false;
    }
    TreeIterator<Object> obj = EcoreUtil.getAllContents(capellaResource.getContents());
    while (obj.hasNext()) {
      Object next = obj.next();
      if (next instanceof RequirementsPkg) {
        return true;
      }
    }
    return false;
  }

  protected boolean isSubsystemTransition(IContext context) {
    return Objects.toString(context.get(ITransitionConstants.TRANSPOSER_MAPPING)).contains("subsystem");
  }
  
  protected void referenceAird(Session session) {
    ViewpointManager manager = ViewpointManager.getInstance(session.getTransactionalEditingDomain().getResourceSet());
    try {
      if (!manager.isReferenced(IRequirementConstants.VIEWPOINT_ID)) {
        manager.activate(IRequirementConstants.VIEWPOINT_ID);
        session.save(new NullProgressMonitor());
      }
    } catch (ViewpointActivationException | EvaluationException e) {
      e.printStackTrace();
    }
  }

  protected void referenceAfm(URI afm) {
    ExecutionManager em = ExecutionManagerRegistry.getInstance().addNewManager();
    em.execute(new AbstractReadWriteCommand() {

      @Override
      public void run() {
        Resource res = em.getEditingDomain().getResourceSet().getResource(afm, true);
        ViewpointManager manager = ViewpointManager.getInstance(em.getEditingDomain().getResourceSet());
        try {
          if (!manager.isReferenced(IRequirementConstants.VIEWPOINT_ID)) {
            manager.activate(IRequirementConstants.VIEWPOINT_ID);
            res.save(new HashMap<>());
            em.getEditingDomain().dispose();
          }
        } catch (ViewpointActivationException | EvaluationException | IOException e) {
          e.printStackTrace();
        }
      }
    });
  }

}
