/**
 * <copyright>
 *
 * </copyright>
 */

package org.polarsys.capella.basic.requirement.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

	import org.polarsys.capella.basic.requirement.RequirementsPkg;
	import org.polarsys.capella.basic.requirement.RequirementsTrace;
	import org.polarsys.capella.basic.requirement.Requirement;
	import org.polarsys.capella.basic.requirement.SystemFunctionalInterfaceRequirement;
	import org.polarsys.capella.basic.requirement.SystemFunctionalRequirement;
	import org.polarsys.capella.basic.requirement.SystemNonFunctionalInterfaceRequirement;
	import org.polarsys.capella.basic.requirement.SystemNonFunctionalRequirement;
	import org.polarsys.capella.basic.requirement.SystemUserRequirement;
/**
 * @generated 
 */
public class RequirementPackageHelper implements  IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
		Object ret = null;
		

if (ret == null && object instanceof RequirementsPkg) {
	ret = RequirementsPkgHelper.getInstance().doSwitch((RequirementsPkg)object, feature);
}
if (ret == null && object instanceof RequirementsTrace) {
	ret = RequirementsTraceHelper.getInstance().doSwitch((RequirementsTrace)object, feature);
}
if (ret == null && object instanceof Requirement) {
	ret = RequirementHelper.getInstance().doSwitch((Requirement)object, feature);
}
if (ret == null && object instanceof SystemFunctionalInterfaceRequirement) {
	ret = SystemFunctionalInterfaceRequirementHelper.getInstance().doSwitch((SystemFunctionalInterfaceRequirement)object, feature);
}
if (ret == null && object instanceof SystemFunctionalRequirement) {
	ret = SystemFunctionalRequirementHelper.getInstance().doSwitch((SystemFunctionalRequirement)object, feature);
}
if (ret == null && object instanceof SystemNonFunctionalInterfaceRequirement) {
	ret = SystemNonFunctionalInterfaceRequirementHelper.getInstance().doSwitch((SystemNonFunctionalInterfaceRequirement)object, feature);
}
if (ret == null && object instanceof SystemNonFunctionalRequirement) {
	ret = SystemNonFunctionalRequirementHelper.getInstance().doSwitch((SystemNonFunctionalRequirement)object, feature);
}
if (ret == null && object instanceof SystemUserRequirement) {
	ret = SystemUserRequirementHelper.getInstance().doSwitch((SystemUserRequirement)object, feature);
}
			return ret;
	}

}
