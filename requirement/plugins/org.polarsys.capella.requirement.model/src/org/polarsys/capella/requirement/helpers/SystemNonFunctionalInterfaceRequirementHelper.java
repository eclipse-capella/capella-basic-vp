package org.polarsys.capella.requirement.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.requirement.SystemNonFunctionalInterfaceRequirement;

/**
 * @generated
 */ 
public class SystemNonFunctionalInterfaceRequirementHelper {

private static final SystemNonFunctionalInterfaceRequirementHelper instance = new SystemNonFunctionalInterfaceRequirementHelper();

/**
 * @generated
 */ 
public static SystemNonFunctionalInterfaceRequirementHelper getInstance() {
	return instance;
}

/**
 * @generated
 */ 
public Object doSwitch(SystemNonFunctionalInterfaceRequirement object, EStructuralFeature feature) {
	// handle derivated feature
	
	
	
		
		// delegate to parent helper
    return RequirementHelper.getInstance().doSwitch(object, feature);
		
	
}



}