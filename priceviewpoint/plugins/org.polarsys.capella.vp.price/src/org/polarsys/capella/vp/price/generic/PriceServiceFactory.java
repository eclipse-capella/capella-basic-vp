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
package org.polarsys.capella.vp.price.generic;

import java.util.HashMap;
import java.util.Map;

import org.polarsys.capella.vp.price.price.Price;


public class PriceServiceFactory {

	public static PriceServiceFactory INSTANCE = new PriceServiceFactory();
	
	Map<Class<?>, IPriceService> pServiceList = new HashMap<Class<?>, IPriceService>();

	public void registerPriceService(Class<?> cls, IPriceService iPriceService){
		pServiceList.put(cls, iPriceService);
	}

	public void unregisterPriceService(Class<?> cls){
		pServiceList.remove(cls);
	}

	public IPriceService getServiceFor(Class<?> cls){
		
		IPriceService iPriceService = pServiceList.get(cls);
		
		if (iPriceService == null){
			// Try to verify super classes
			if (cls.isInterface()){
				iPriceService = pServiceList.get(cls.getSuperclass());
			}else{
				for (Class<?> i : cls.getInterfaces()) {
					for (Class<?> j : i.getInterfaces()) {
						if (j.equals(Price.class)){
							iPriceService = pServiceList.get(j);
							break;
						}
					}
				}
			}
		}
		
		return iPriceService;
	}

}
