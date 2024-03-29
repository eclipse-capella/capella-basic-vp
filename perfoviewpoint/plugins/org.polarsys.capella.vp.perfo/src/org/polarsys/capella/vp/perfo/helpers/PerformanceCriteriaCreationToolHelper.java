/*******************************************************************************
 * Copyright (c) 2021, 2022 Obeo
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Obeo - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.perfo.helpers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.vp.perfo.perfo.PerfoFactory;
import org.polarsys.capella.vp.perfo.perfo.TimeCapacity;
import org.polarsys.capella.vp.perfo.perfo.TimeConsumption;
import org.polarsys.kitalpha.emde.model.ElementExtension;

public class PerformanceCriteriaCreationToolHelper {

	public boolean createTimeCapacity(EObject eobject) {
		
		if (!(eobject instanceof FunctionalChain)) return false;
		
		List<ElementExtension> extensions = ((FunctionalChain) eobject).getOwnedExtensions();
		for (ElementExtension extension : extensions) {
			if (extension instanceof TimeCapacity) return false;
		}
		
		TimeCapacity timeCapacity = PerfoFactory.eINSTANCE.createTimeCapacity();
		timeCapacity.setCurrentExecutionTime(0);
		timeCapacity.setMaxValue(0);
		timeCapacity.setMinValue(0);
		timeCapacity.setValue(0);
		((CapellaElement) timeCapacity).setId(EcoreUtil.generateUUID());
		
		extensions.add(timeCapacity);
		
		return true;
	}
	
	public boolean createTimeConsumption(EObject eobject) {

		if (eobject instanceof AbstractFunction) {
			List<ElementExtension> extensions = ((AbstractFunction) eobject).getOwnedExtensions();
			return addTimeConsumption(extensions);
			
		} else if (eobject instanceof FunctionalExchange) {
			List<ElementExtension> extensions = ((FunctionalExchange) eobject).getOwnedExtensions();
			return addTimeConsumption(extensions);
			
		} else {
			return false;
		}
	}
	
	private boolean addTimeConsumption(List<ElementExtension> extensions) {
		for (ElementExtension extension : extensions) {
			if (extension instanceof TimeConsumption)
				return false;
		}
		
		TimeConsumption timeConsumption = PerfoFactory.eINSTANCE.createTimeConsumption();
		timeConsumption.setMaxValue(0);
		timeConsumption.setMinValue(0);
		timeConsumption.setValue(0);
		((CapellaElement) timeConsumption).setId(EcoreUtil.generateUUID());

		extensions.add(timeConsumption);

		return true;
	}
}
