package org.polarsys.capella.basic.requirement.migration.contribution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.tools.internal.uri.ViewpointProtocolParser;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.ViewpointFactory;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.capella.basic.requirement.RequirementFactory;
import org.polarsys.capella.basic.requirement.RequirementPackage;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.common.ef.ExecutionManager;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.migration.context.MigrationContext;
import org.polarsys.capella.core.data.migration.contribution.AbstractMigrationContribution;

public class RequirementMigrationContribution extends AbstractMigrationContribution {

  private URI viewpointUri = URI.createURI("viewpoint:/org.polarsys.capella.basic.requirement.sirius.analysis/Requirement");

  Set<RequirementsPkg> requirementPkgsToMigrate = null;
  public RequirementMigrationContribution() {
    requirementPkgsToMigrate = new HashSet<RequirementsPkg>();
  }

  @Override
  public String getNSPrefix(String prefix, MigrationContext context) {
    if (prefix.equals("xmlns:org.polarsys.capella.core.data.requirement")) {
      return RequirementPackage.eNS_PREFIX;
    }
    return super.getNSPrefix(prefix, context);
  }

  @Override
  public EStructuralFeature getFeature(EObject object, String prefix, String name, boolean isElement) {
    if (name.equals("ownedRequirementPkgs")) {
      if(object instanceof BlockArchitecture) {
        return ModellingcorePackage.Literals.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS;
      }
       return RequirementPackage.Literals.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS;
      
    }
    return super.getFeature(object, prefix, name, isElement);
  }

  @Override
  public String getFeatureName(String prefix, String name, boolean isElement, EObject peekObject, String value,
      Resource resource, MigrationContext context) {
    if (name.equals("ownedRequirementPkgs")) {
      if(peekObject instanceof BlockArchitecture) {
        return ModellingcorePackage.Literals.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS.getName();
      }
      return RequirementPackage.Literals.REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS.getName();
    }
    return super.getFeatureName(prefix, name, isElement, peekObject, value, resource, context);
  }

  @Override
  public boolean ignoreUnknownFeature(String prefix, String name, boolean isElement, EObject peekObject, String value,
      XMLResource resource, MigrationContext context) {
    if ("ownedRequirementPkgs".equals(name)) {
      return false;
    }
    return super.ignoreUnknownFeature(prefix, name, isElement, peekObject, value, resource, context);
  }

  @Override
  public EFactory getEFactory(String prefix, Resource resource, MigrationContext context) {
    if (prefix.equals("xmlns:org.polarsys.capella.core.data.requirement")) {
      return RequirementFactory.eINSTANCE;
    } else if (prefix.equals(RequirementPackage.eNS_PREFIX)) {
      return RequirementFactory.eINSTANCE;
    }
    return super.getEFactory(prefix, resource, context);
  }

  @Override
  public IStatus preMigrationExecute(IResource fileToMigrate, MigrationContext context, boolean checkVersion) {
    requirementPkgsToMigrate.clear();
    return super.preMigrationExecute(fileToMigrate, context, checkVersion);
  }

  @Override
  public void unaryMigrationExecute(EObject currentElement, MigrationContext context) {
    super.unaryMigrationExecute(currentElement, context);
    if (currentElement instanceof RequirementsPkg) {
      EObject container = currentElement.eContainer();
      if (container instanceof BlockArchitecture
          && ((BlockArchitecture) container).getOwnedMigratedElements().contains(currentElement))
        requirementPkgsToMigrate.add((RequirementsPkg) currentElement);
    }
  }

  @Override
  public void unaryEndMigrationExecute(ExecutionManager executionManager, Resource resource, MigrationContext context) {
    super.unaryEndMigrationExecute(executionManager, resource, context);

    for (RequirementsPkg pkg : requirementPkgsToMigrate) {
      BlockArchitecture eContainer = (BlockArchitecture) pkg.eContainer();
      eContainer.getOwnedExtensions().add(pkg);
    }
    resource.getContents().stream().filter(DAnalysis.class::isInstance).map(DAnalysis.class::cast)
        .forEach(this::moveInvalidRepresentations);
  }

  protected void moveInvalidRepresentations(DAnalysis analysis) {
    Collection<DRepresentationDescriptor> invalidRepresentations = new ArrayList<>();
    for (DView view : new ArrayList<>(analysis.getOwnedViews())) {
      for (DRepresentationDescriptor descriptor : view.getOwnedRepresentationDescriptors()) {
        Viewpoint vp = ViewpointRegistry.getInstance().getViewpoint(descriptor.getDescription());
        if (vp != null && !view.getViewpoint().equals(vp)) {
          if (isRequirementViewpoint(vp)) {
            invalidRepresentations.add(descriptor);
          }
        }
      }
    }

    if (invalidRepresentations.size() > 0) {
      Viewpoint requirementVp = ViewpointRegistry.getInstance().getViewpoint(viewpointUri);
      DView correctDView = getViewFromViewpoint(analysis, requirementVp);
      for (DRepresentationDescriptor descriptor : invalidRepresentations) {
        correctDView.getOwnedRepresentationDescriptors().add(descriptor);
      }
    }
  }
  
  protected boolean isRequirementViewpoint(Viewpoint vp) {
    return ViewpointProtocolParser.match(EcoreUtil.getURI(vp), viewpointUri.toString());
  }
  
  protected DView getViewFromViewpoint(DAnalysis analysis, Viewpoint requirementVp) {
    Optional<DView> view = analysis.getOwnedViews().stream()
        .filter(v -> isRequirementViewpoint(v.getViewpoint())).findFirst();
    if (view.isEmpty()) {
      DView newView = ViewpointFactory.eINSTANCE.createDView();
      newView.setViewpoint(requirementVp);
      analysis.getOwnedViews().add(newView);
      analysis.getSelectedViews().add(newView);
      return newView;
    }
    return view.get();
  }

  @Override
  public String getQName(EObject peekObject, String typeQName, EStructuralFeature feature, Resource resource,
      XMLHelper helper, MigrationContext context) {
    if (typeQName.startsWith("org.polarsys.capella.core.data.requirement:")) {
      return typeQName.replace("org.polarsys.capella.core.data.requirement", RequirementPackage.eNS_PREFIX);
    }
    return super.getQName(peekObject, typeQName, feature, resource, helper, context);
  }

  @Override
  public String getHandleProxy(InternalEObject proxy, String uriLiteral, Resource resource, XMLHelper helper,
      MigrationContext context) {
    HashMap<String, String> keys = new HashMap<>();
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/EPBS.odesign#//@ownedViewpoints[name='EPBS%20architecture']/@ownedRepresentations[name='Configuration%20Items%20-%20Requirements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Configuration%20Items%20-%20Requirements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/EPBS.odesign#//@ownedViewpoints[name='EPBS%20architecture']/@ownedRepresentations[name='EPBS%20Requirement%20Refinements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='EPBS%20Requirement%20Refinements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/common.odesign#//@ownedViewpoints[name='Common']/@ownedRepresentations[name='Requirements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Requirements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/context.odesign#//@ownedViewpoints[name='System%20Analysis']/@ownedRepresentations[name='Requirements%20-%20System%20Functions']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Requirements%20-%20System%20Functions']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/context.odesign#//@ownedViewpoints[name='System%20Analysis']/@ownedRepresentations[name='System%20Functions%20-%20Requirements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='System%20Functions%20-%20Requirements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/logical.odesign#//@ownedViewpoints[name='Logical%20Architecture']/@ownedRepresentations[name='Logical%20Architecture%20Requirement%20Refinements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Logical%20Architecture%20Requirement%20Refinements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/logical.odesign#//@ownedViewpoints[name='Logical%20Architecture']/@ownedRepresentations[name='Logical%20Components%20-%20Requirements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Logical%20Components%20-%20Requirements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/logical.odesign#//@ownedViewpoints[name='Logical%20Architecture']/@ownedRepresentations[name='Logical%20Functions%20-%20Requirements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Logical%20Functions%20-%20Requirements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/oa.odesign#//@ownedViewpoints[name='Operational%20Analysis']/@ownedRepresentations[name='Operational%20Activities%20-%20Requirements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Operational%20Activities%20-%20Requirements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/oa.odesign#//@ownedViewpoints[name='Operational%20Analysis']/@ownedRepresentations[name='Requirements%20-%20Operational%20Activities']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Requirements%20-%20Operational%20Activities']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/physical.odesign#//@ownedViewpoints[name='Physical%20Architecture']/@ownedRepresentations[name='Physical%20Components%20-%20Requirements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Physical%20Components%20-%20Requirements']");
    keys.put(
        "platform:/plugin/org.polarsys.capella.core.sirius.analysis/description/physical.odesign#//@ownedViewpoints[name='Physical%20Architecture']/@ownedRepresentations[name='Physical%20Functions%20-%20Requirements']",
        "platform:/plugin/org.polarsys.capella.basic.requirement.sirius.analysis/description/Requirement.odesign#//@ownedViewpoints[name='Requirement']/@ownedRepresentations[name='Physical%20Functions%20-%20Requirements']");

    boolean isReplaced = false;
    for (String key : keys.keySet()) {
      if (uriLiteral.equals(key) || uriLiteral.startsWith(key)) {
        uriLiteral = uriLiteral.replace(key, keys.get(key));
        isReplaced = true;
      }
    }
    if (isReplaced) {
      proxy.eSetProxyURI(URI.createURI(uriLiteral));
    }
    return uriLiteral;
  }

  @Override
  public String getNSURI(String prefix, String nsUri, MigrationContext context) {
    if (nsUri.startsWith("http://www.polarsys.org/capella/core/requirement/")) {
      return RequirementPackage.eNS_URI;
    }
    return super.getNSURI(prefix, nsUri, context);
  }


}
