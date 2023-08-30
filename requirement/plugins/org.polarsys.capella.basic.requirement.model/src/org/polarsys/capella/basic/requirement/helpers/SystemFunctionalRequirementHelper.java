package org.polarsys.capella.basic.requirement.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.basic.requirement.SystemFunctionalRequirement;

/**
 * @generated
 */ 
public class SystemFunctionalRequirementHelper {

private static final SystemFunctionalRequirementHelper instance = new SystemFunctionalRequirementHelper();

/**
 * @generated
 */ 
public static SystemFunctionalRequirementHelper getInstance() {
	return instance;
}

/**
 * @generated
 */ 
public Object doSwitch(SystemFunctionalRequirement object, EStructuralFeature feature) {
	// handle derivated feature
	
	
	
		
		// delegate to parent helper
    return RequirementHelper.getInstance().doSwitch(object, feature);
		
	
}



}