package org.polarsys.capella.basic.requirement.docgen.helper;

/*******************************************************************************
 * Copyright (c) 2006, 2023 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.basic.requirement.helpers.RequirementModelHelper;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.docgen.util.CapellaLabelProviderHelper;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.StringUtil;

public class CapellaRequirementHelper {

	public static Collection<String> getTracingModelElements(Requirement requirement, String projectName, String outputFolder) {
		Collection<String> elementsToDisplay = new ArrayList<String>();
    for (CapellaElement element : RequirementModelHelper.getRelatedCapellaElements(requirement)) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(CapellaServices.getImageLinkFromElement(element, projectName, outputFolder));
				buffer.append(" ");
				buffer.append(CapellaServices.getHyperlinkFromElement(element));
				elementsToDisplay.add(buffer.toString());
		}

		return elementsToDisplay;
	}

  public static String getRequirementPathHyperLinkWithIcon(String projectName, String outputFolder, EObject element) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<EObject> iterator = getFullRequirementPath(element).iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(CapellaLabelProviderHelper.getText(iterator.next()));
      if (iterator.hasNext()) {
        stringBuilder.append(" > ");
      }
    }
    StringBuilder hyperLinkStringBuilder = new StringBuilder();
    hyperLinkStringBuilder.append(CapellaServices.getImageLinkFromElement(element, projectName, outputFolder));
    hyperLinkStringBuilder.append(" "); //$NON-NLS-1$
    hyperLinkStringBuilder.append(CapellaServices.getHyperlinkFromElement(element, stringBuilder.toString()));
    return hyperLinkStringBuilder.toString();
  }

  public static String getRequirementPath(EObject element) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<EObject> iterator = getFullRequirementPath(element).iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(CapellaLabelProviderHelper.getText(iterator.next()));
      if (iterator.hasNext()) {
        stringBuilder.append(" > ");
      }
    }
    return stringBuilder.toString();
  }

  private static List<EObject> getFullRequirementPath(EObject element) {
    List<EObject> eObjects = new ArrayList<>();
    EObject parent = element.eContainer();
    if (parent instanceof RequirementsPkg) {
      eObjects.addAll(getFullRequirementPath(parent));
    }
    eObjects.add(element);
    return eObjects;
  }

  /**
   * 
   * @param element
   * @param projectName
   * @param outputFolder
   * @return
   */
  public static Collection<String> getRequirementsToLine(CapellaElement element, String projectName,
      String outputFolder) {
    Collection<String> ret = new ArrayList<String>();
    for (Requirement requirement : RequirementModelHelper.getAppliedRequirements(element)) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<tr>");

        buffer.append("<td>");
        buffer.append(CapellaServices.getImageLinkFromElement(requirement, projectName, outputFolder));
        buffer.append(" ");
        buffer.append(CapellaServices.HYPERLINK_OPEN);
        buffer.append(CapellaServices.getPathFromElement(requirement));
        buffer.append(CapellaServices.HYPERLINK_COMPLETE);
        buffer.append(requirement.getRequirementId());
        buffer.append(CapellaServices.HYPERLINK_CLOSE);
        buffer.append("</td>");

        buffer.append("<td>");
        buffer.append(requirement.getName());
        buffer.append("</td>");

        buffer.append("<td>");
        buffer.append(
            StringUtil.transformAREFString(requirement, requirement.getDescription(), projectName, outputFolder));
        buffer.append("</td>");

        buffer.append("</tr>");

        ret.add(buffer.toString());
    }
    return ret;
  }

}
