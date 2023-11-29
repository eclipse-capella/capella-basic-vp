package org.polarsys.capella.basic.requirement.docgen.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper;

public class RequirementDiagramHelper implements IDiagramHelper {

  public RequirementDiagramHelper() {
  }
  @Override
  public boolean select(EObject eObject) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String getElementId(EObject eObject) {
    if (eObject instanceof Requirement) {
      return ((Requirement) eObject).getId();
    }
    return null;
  }

  @Override
  public String diagramDocumentationPostTraitement(EObject eObject, String documentation, String projectName,
      String outputFolder) {
    return "";
  }

  @Override
  public EObject getSemanticElement(DDiagramElement element) {
    return element.getTarget();
  }

  @Override
  public boolean isContainer(DDiagramElement element) {
    return false;
  }

}
