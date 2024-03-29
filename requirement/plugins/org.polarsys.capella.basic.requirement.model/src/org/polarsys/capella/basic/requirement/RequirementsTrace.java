
package org.polarsys.capella.basic.requirement;

import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.Trace;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.basic.requirement.RequirementsTrace#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.capella.basic.requirement.RequirementsTrace#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirementsTrace()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='RequirementTrace'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Dependency' stereotype='eng.RequirementTrace'"
 *        annotation="http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a specialized kind of Trace to indicate the relationship between two Requirements\r\n[source: Capella study]' usage\040guideline='used to keep track of links between Requirements, typically which requirement answers to which other requirement' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Dependency' explanation='none' constraints='none'"
 *        annotation="http://www.polarsys.org/capella/semantic"
 * @generated
 */

public interface RequirementsTrace extends Trace {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirementsTrace_Source()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/derived viatra.variant='alias' viatra.expression='sourceElement'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	TraceableElement getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see org.polarsys.capella.basic.requirement.RequirementPackage#getRequirementsTrace_Target()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/derived viatra.variant='alias' viatra.expression='targetElement'"
	 *        annotation="http://www.polarsys.org/capella/semantic"
	 * @generated
	 */

	TraceableElement getTarget();

} // RequirementsTrace
