package org.polarsys.capella.requirement.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.requirement.SystemUserRequirement;

/**
 * @generated
 */ 
public class SystemUserRequirementHelper {

private static final SystemUserRequirementHelper instance = new SystemUserRequirementHelper();

/**
 * @generated
 */ 
public static SystemUserRequirementHelper getInstance() {
	return instance;
}

/**
 * @generated
 */ 
public Object doSwitch(SystemUserRequirement object, EStructuralFeature feature) {
	// handle derivated feature
	
	
	
		
		// delegate to parent helper
    return RequirementHelper.getInstance().doSwitch(object, feature);
		
	
}



}