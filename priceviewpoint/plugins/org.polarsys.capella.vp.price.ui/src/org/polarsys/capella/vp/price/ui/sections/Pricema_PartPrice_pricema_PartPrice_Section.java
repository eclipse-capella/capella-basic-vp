/*******************************************************************************
 * Copyright (c) 2006, 2016 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.price.ui.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticField;
import org.polarsys.capella.core.ui.properties.fields.TextValueGroup;
import org.polarsys.capella.core.ui.properties.sections.AbstractSection;
import org.polarsys.capella.vp.price.price.Price;
import org.polarsys.capella.vp.price.price.PricePackage;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Pricema_PartPrice_pricema_PartPrice_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Pricema_PartPrice_pricema_PartPrice_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private TextValueGroup ValueField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private TextValueGroup MaxValueField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private Group pricema_PartPrice_AttributeGroup;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject: current object
	* @generated NOT
	*/
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest instanceof Price)
			return true;
		else 
		{
			EObject children = getPriceObject(eObject);
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
		
		if (newEObject != null && !(newEObject instanceof Price))
		{
			final Object firstElement = ((StructuredSelection)selection).getFirstElement();
			newEObject = getPriceObject(firstElement);
		}
		
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
	private EObject getPriceObject(Object element) {
		EObject parent = null;
		if (element instanceof Part)
			parent = (EObject) element;
		else
			parent = getPartParent(element);
		
		if (parent == null)
			return null;
		
		if (!isViewpointActive(parent))
			return null;

		if (parent == null || (parent != null && parent.eContents() == null))
			return null;

		EObject result = null;
		
		for (EObject iEObject : parent.eContents()) 
		{
			if (iEObject instanceof Price) 
			{
				result = (result == null ? (Price) iEObject : null);
				// This case is true when there is more then one extension of the same type. 
				if (result == null)
					break;
			}
		}
		return result;
	}
	
	/**
	 * Getting the {@link Part} element from the selection.
	 * @param element the current selection
	 * @return the selected {@link Part} 
	 */
	private static EObject getPartParent(Object element){
		EObject result = null;
		try {
			Object adapter = ((IAdaptable) element).getAdapter(EObject.class);
			if (adapter instanceof EObject) 
			{
				result = (EObject) Platform.getAdapterManager().getAdapter(adapter, ModelElement.class);
			}
		} catch (Exception e) {
			// Do nothing to return null and ignore the selection 
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return True is the AF viewpoint is active. False else. 
	 */
	private boolean isViewpointActive(EObject modelElement) {
		return ViewpointManager.getInstance(modelElement).isActive("org.polarsys.capella.vp.price");
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

		pricema_PartPrice_AttributeGroup = getWidgetFactory().createGroup(_rootParentComposite,
				"Part Price Attributes");
		pricema_PartPrice_AttributeGroup.setLayout(new GridLayout(1, false));
		GridData gdpricema_PartPrice_AttributeGroup = new GridData(GridData.FILL_HORIZONTAL);
		gdpricema_PartPrice_AttributeGroup.horizontalSpan = ((GridLayout) _rootParentComposite.getLayout()).numColumns;
		pricema_PartPrice_AttributeGroup.setLayoutData(gdpricema_PartPrice_AttributeGroup);

		ValueField = new TextValueGroup(pricema_PartPrice_AttributeGroup, "Value :", getWidgetFactory(), true);

		MaxValueField = new TextValueGroup(pricema_PartPrice_AttributeGroup, "Max Value :", getWidgetFactory(), true);

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param capellaElement_p
	* @generated
	*/
	public void loadData(CapellaElement capellaElement_p) {
		super.loadData(capellaElement_p);

		ValueField.loadData(capellaElement_p, PricePackage.eINSTANCE.getPrice_Value());

		MaxValueField.loadData(capellaElement_p, PricePackage.eINSTANCE.getPrice_MaxValue());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(ValueField);

		abstractSemanticFields.add(MaxValueField);

		return abstractSemanticFields;
	}
}
