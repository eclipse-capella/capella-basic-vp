/******************************************************************************
* Copyright (c) 2006, 2020 Thales Global Services 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0 
 * 
 * Contributors: 
 *    Thales - initial API and implementation
*****************************************************************************/
package org.polarsys.capella.vp.perfo.ui.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.capella.core.ui.properties.controllers.*;
import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticField;
import org.polarsys.capella.core.ui.properties.fields.TextValueGroup;
import org.polarsys.capella.core.ui.properties.sections.AbstractSection;
import org.polarsys.capella.vp.perfo.perfo.PerfoPackage;
import org.polarsys.capella.vp.perfo.perfo.PerformanceCriteria;
import org.polarsys.capella.vp.perfo.perfo.TimeConsumption;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.capella.core.ui.properties.fields.*;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Perfoma_timeConsumption_perfo_timeConsumption_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Perfoma_timeConsumption_perfo_timeConsumption_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private TextValueGroup ValueTimeConsumptionField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
		* @generated
		*/
	private Group perfo_timeConsumption_AttributeGroup;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject: current object
	* @generated NOT
	*/
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest instanceof TimeConsumption)
			return true;
		else {
			EObject children = getTimeConsumptionObject(eObjectToTest);
			if (children != null)
				return true;
		}

		return false;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param part
	* @param selection
	* @generated NOT
	*/
	public void setInput(IWorkbenchPart part, ISelection selection) {
		EObject newEObject = super.setInputSelection(part, selection);

		if (newEObject != null && !(newEObject instanceof TimeConsumption))
			newEObject = getTimeConsumptionObject(newEObject);

		if (newEObject != null) {
			loadData((CapellaElement) newEObject);
		} else {
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param parent: An EObject. It is considered as the Parent of an EMDE extension (a Viewpoint element)
	 * @return 
	 */
	private EObject getTimeConsumptionObject(EObject parent) {
		if (!isViewpointActive(parent))
			return null;

		if (parent == null || (parent != null && parent.eContents() == null))
			return null;

		EObject result = null;
		for (EObject iEObject : parent.eContents()) {
			if (iEObject instanceof TimeConsumption) {
				result = (result == null ? (TimeConsumption) iEObject : null);
				// This case is true when there is more then one extension of the same type. 
				if (result == null)
					break;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return True is the AF viewpoint is active. False else. 
	 */
	private boolean isViewpointActive(EObject modelElement) {
		return ViewpointManager.getInstance(modelElement).isActive("org.polarsys.capella.vp.perfo");
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param parent:
	* @param aTabbedPropertySheetPage:
	* @generated
	*/
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		perfo_timeConsumption_AttributeGroup = getWidgetFactory().createGroup(rootParentComposite,
				"Time Consumption Attributes");
		perfo_timeConsumption_AttributeGroup.setLayout(new GridLayout(1, false));

		GridData gdperfo_timeConsumption_AttributeGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdperfo_timeConsumption_AttributeGroup.horizontalSpan = ((GridLayout) rootParentComposite
				.getLayout()).numColumns;
		perfo_timeConsumption_AttributeGroup.setLayoutData(gdperfo_timeConsumption_AttributeGroup);

		ValueTimeConsumptionField = new TextValueGroup(perfo_timeConsumption_AttributeGroup, "Execution Time :",
				getWidgetFactory(), true);

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		ValueTimeConsumptionField.loadData(object, PerfoPackage.eINSTANCE.getPerformanceCriteria_Value());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(ValueTimeConsumptionField);

		return abstractSemanticFields;
	}
}
