package org.polarsys.capella.requirement.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.requirement.SystemFunctionalInterfaceRequirement;

/**
 * @generated
 */ 
public class SystemFunctionalInterfaceRequirementHelper {

private static final SystemFunctionalInterfaceRequirementHelper instance = new SystemFunctionalInterfaceRequirementHelper();

/**
 * @generated
 */ 
public static SystemFunctionalInterfaceRequirementHelper getInstance() {
	return instance;
}

/**
 * @generated
 */ 
public Object doSwitch(SystemFunctionalInterfaceRequirement object, EStructuralFeature feature) {
	// handle derivated feature
	
	
	
		
		// delegate to parent helper
    return RequirementHelper.getInstance().doSwitch(object, feature);
		
	
}



}