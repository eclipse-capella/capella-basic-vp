package org.polarsys.capella.basic.requirement.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.basic.requirement.SystemNonFunctionalRequirement;

/**
 * @generated
 */ 
public class SystemNonFunctionalRequirementHelper {

private static final SystemNonFunctionalRequirementHelper instance = new SystemNonFunctionalRequirementHelper();

/**
 * @generated
 */ 
public static SystemNonFunctionalRequirementHelper getInstance() {
	return instance;
}

/**
 * @generated
 */ 
public Object doSwitch(SystemNonFunctionalRequirement object, EStructuralFeature feature) {
	// handle derivated feature
	
	
	
		
		// delegate to parent helper
    return RequirementHelper.getInstance().doSwitch(object, feature);
		
	
}



}