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
// Generated on 20.08.2015 at 11:04:03 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.mass.ui.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.capella.core.ui.properties.controllers.*;
import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticField;
import org.polarsys.capella.core.ui.properties.fields.TextValueGroup;
import org.polarsys.capella.core.ui.properties.sections.AbstractSection;
import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.MassPackage;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.capella.core.ui.properties.fields.*;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Mass_PartMass_mass_PartMass_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Mass_PartMass_mass_PartMass_Section extends AbstractSection {

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
	private Group mass_PartMass_AttributeGroup;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject: current object
	* @generated NOT
	*/
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest instanceof Mass)
			return true;
		else {
			EObject children = getMassObject(eObject);
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

		if (newEObject != null && !(newEObject instanceof Mass)) {
			final Object firstElement = ((StructuredSelection) selection).getFirstElement();
			newEObject = getMassObject(firstElement);
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
	private EObject getMassObject(Object element) {
		EObject parent = null;
		if (element instanceof Part) {
			parent = (EObject) element;
		} else {
			parent = getPartParent(element);
		}

		if (parent == null || (parent != null && parent.eContents() == null) || !isViewpointActive(parent))
			return null;

		EObject result = null;

		for (EObject iEObject : parent.eContents()) {
			if (iEObject instanceof Mass) {
				result = (result == null ? (Mass) iEObject : null);
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
	private static EObject getPartParent(Object element) {
		EObject result = null;
		try {
			Object adapter = ((IAdaptable) element).getAdapter(EObject.class);
			if (adapter instanceof EObject) {
				result = (EObject) Platform.getAdapterManager().getAdapter(adapter, ModelElement.class);
			}

			// Manage the PAB target
			if (result instanceof PhysicalComponent && result.eContainer() instanceof PhysicalArchitecture) {
				PhysicalComponent physicalComponent = (PhysicalComponent) result;
				EList<AbstractTypedElement> abstractTypedElements = physicalComponent.getAbstractTypedElements();
				for (AbstractTypedElement abstractTypedElement : abstractTypedElements) {
					if (abstractTypedElement instanceof Part) {
						result = abstractTypedElement;
						break;
					}
				}
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
		return ViewpointManager.getInstance(modelElement).isActive("org.polarsys.capella.vp.mass");
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

		mass_PartMass_AttributeGroup = getWidgetFactory().createGroup(rootParentComposite, "Part Mass Attributes");
		mass_PartMass_AttributeGroup.setLayout(new GridLayout(1, false));

		GridData gdmass_PartMass_AttributeGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdmass_PartMass_AttributeGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		mass_PartMass_AttributeGroup.setLayoutData(gdmass_PartMass_AttributeGroup);

		ValueField = new TextValueGroup(mass_PartMass_AttributeGroup, "Value :", getWidgetFactory(), true);

		MaxValueField = new TextValueGroup(mass_PartMass_AttributeGroup, "Max Value :", getWidgetFactory(), true);

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		ValueField.loadData(object, MassPackage.eINSTANCE.getMass_Value());

		MaxValueField.loadData(object, MassPackage.eINSTANCE.getMass_MaxValue());

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
