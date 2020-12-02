/*******************************************************************************
 * Copyright (c) 2006, 2020 Thales Global Services
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.vp.mass.mass.Mass;
import org.polarsys.capella.vp.mass.mass.PartMass;
import org.polarsys.capella.vp.mass.mass.impl.MassFactoryImpl;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;




public class MassCreationToolHelper {
	
	public boolean createMass(EObject eObject, int cls){
		return createMassObject(eObject, cls);
	}
	
	private boolean createMassObject(EObject eObject, int cls){
		
		EObject correctPart = eObject;
		
		if (eObject instanceof PhysicalComponentPkg){
			PhysicalComponentPkg pkg = (PhysicalComponentPkg)eObject;
			correctPart = pkg.getOwnedParts().get(0);
			
		}
		else if (eObject instanceof AbstractType) {
			correctPart = ((AbstractType)eObject).getAbstractTypedElements().get(0);
		}

		if (correctPart instanceof Part){
			Part part = (Part) correctPart;
			if (part.getAbstractType() instanceof Component && ((Component)part.getAbstractType()).isActor())
				return false;
		}
		
		for (EObject iEO : correctPart.eContents()) {		
			if (iEO instanceof PartMass ){
				return false;
			}
		}
		
		Mass newMassObject = null;
		
		switch (cls) {
		case 1:
			newMassObject = MassFactoryImpl.eINSTANCE.createPartMass();
			break;
		}

		if (newMassObject == null) {
			return false;
		}
		
		newMassObject.setMaxValue(0);
		newMassObject.setMinValue(0);
		newMassObject.setValue(0);
		((CapellaElement)newMassObject).setId(EcoreUtil.generateUUID());
		
		
		((ExtensibleElement)correctPart).getOwnedExtensions().add((ElementExtension)newMassObject);
		return true;
	}

}
