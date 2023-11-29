/*******************************************************************************
 * Copyright (c) 2019, 2023 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/

package org.polarsys.capella.basic.requirement.docgen;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.DefaultMutableTreeNode;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.RequirementsPkg;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.docgen.util.CapellaServices;
import org.polarsys.capella.docgen.util.SortedTreeNode;

/**
 * A class providing methods to build trees of elements and to display them as html lists
 * 
 * @author Arnaud Dieumegard
 */
public class RequirementTreeServices {
	
	public static final String REQUIREMENT_TREE_ID = "requirementTreeView";
	
	/**
	 * A comparator for <code>Requirement</code> VS <code>RequirementsPkg</code> elements
	 */
	private static final Comparator<DefaultMutableTreeNode> requirementsComparator = new Comparator<DefaultMutableTreeNode>() {
		public int compare(DefaultMutableTreeNode arg0, DefaultMutableTreeNode arg1) {
			Object obj0 = arg0.getUserObject();
			Object obj1 = arg1.getUserObject();
			if (obj0 instanceof RequirementsPkg && obj1 instanceof Requirement) {
				return 1;
			} else if (obj0 instanceof Requirement && obj1 instanceof RequirementsPkg) {
				return -1;
			}
			if (obj0 instanceof NamedElement && obj1 instanceof NamedElement) {
				return ((NamedElement)obj0).getName().compareTo(((NamedElement)obj1).getName());	
			}
			return 0;
		};
	};
	/**
	 * Retrieve an HTML list representation for the <code>appliedReq</code> requirements including their complete <code>RequirementPkg</code> hierarchy
	 * @param appliedReq
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
  public static String getRequirementsTree(List<Requirement> appliedReq, String projectName, String outputFolder) {
		StringBuilder sb = new StringBuilder();
		
		DefaultMutableTreeNode tree = buildRequirementsTree(appliedReq);
		
		sb.append("<ul id=\"").append(REQUIREMENT_TREE_ID).append("\" class=\"treeview\">");
		sb.append(printRequirementsTree(tree, projectName, outputFolder));
		sb.append(CapellaServices.UL_CLOSE);
		
		return sb.toString();
	}
	
	/**
	 * Builds a tree of <code>Requirement</code> objects as leafs and <code>RequirementPkg</code> objects as nodes
	 * @param appliedReq
	 * @return
	 */
  private static DefaultMutableTreeNode buildRequirementsTree(List<Requirement> appliedReq) {
		SortedTreeNode tree = new SortedTreeNode(requirementsComparator);
		
		// build the list of already visited requirement packages
		Map<RequirementsPkg, SortedTreeNode> reqPkgToTreeNodeMap = new HashMap<RequirementsPkg, SortedTreeNode>();
		for (Requirement req : appliedReq){
			SortedTreeNode currentNode = new SortedTreeNode(req, requirementsComparator);
			EObject parent = req.eContainer();
			boolean hasFoundParent = false;
			while (parent instanceof RequirementsPkg) {
				SortedTreeNode pkgNode = reqPkgToTreeNodeMap.get(parent);
				// Build parent node if not yet created
				if (pkgNode == null) {
					pkgNode = new SortedTreeNode(parent, requirementsComparator);
					reqPkgToTreeNodeMap.put((RequirementsPkg) parent, pkgNode);
				} else {
					hasFoundParent = true;
				}
				// Add element
				pkgNode.add(currentNode);
				
				// Go one level up
				currentNode = pkgNode;
				parent = parent.eContainer();
				if (hasFoundParent) {
					break;
				}
			}
			if (!hasFoundParent) {
				tree.add(currentNode);
			}
		}
		return tree;
	}

	/**
	 * Prints tree elements as a bullet list. Does not print the root element.
	 * 
	 * @param tree A tree of EObjects
	 * @param projectName
	 * @param outputFolder
	 * @return
	 */
	private static String printRequirementsTree(DefaultMutableTreeNode tree, String projectName, String outputFolder) {
		StringBuilder sb = new StringBuilder();
		
		Enumeration<?> childs = tree.children();
		// Loop over root elements
		if (childs instanceof Enumeration) {
			while (childs.hasMoreElements()) {
				Object element = childs.nextElement(); 
				if (element instanceof DefaultMutableTreeNode) {
					DefaultMutableTreeNode node = (DefaultMutableTreeNode) element;
					if (node.getUserObject() instanceof EObject) {
						EObject obj = (EObject) node.getUserObject();
						sb.append(CapellaServices.LI_OPEN);
						sb.append(CapellaServices.buildHyperlinkWithIcon(projectName, outputFolder, obj));
						if (obj instanceof RequirementsPkg) {
							sb.append(CapellaServices.UL_OPEN_SIMPLE);
							sb.append(printRequirementsTree(node, projectName, outputFolder));
							sb.append(CapellaServices.UL_CLOSE);
						}
						sb.append(CapellaServices.LI_CLOSE);
					}
				}
			}
		}
		
		return sb.toString();
	}
}
