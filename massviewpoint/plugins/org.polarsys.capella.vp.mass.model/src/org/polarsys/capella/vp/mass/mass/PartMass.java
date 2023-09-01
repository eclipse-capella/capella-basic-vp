/******************************************************************************
* Copyright (c) 2006, 2020 Thales Global Services 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0 
 * 
 * Contributors: 
 *    Thales - initial API and implementation
*****************************************************************************/
package org.polarsys.capella.vp.mass.mass;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Mass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.mass.mass.PartMass#getCurrentMass <em>Current Mass</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.mass.mass.MassPackage#getPartMass()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/cs/7.0.0#//Part'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Part'"
 * @generated
 */

public interface PartMass extends Mass, ElementExtension {

  /**
   * Returns the value of the '<em><b>Current Mass</b></em>' attribute.
  
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Mass</em>' attribute.
   * @see #setCurrentMass(int)
   * @see org.polarsys.capella.vp.mass.mass.MassPackage#getPartMass_CurrentMass()
   * @model transient="true"
   * @generated
   */

  int getCurrentMass();

  /**
   * Sets the value of the '{@link org.polarsys.capella.vp.mass.mass.PartMass#getCurrentMass <em>Current Mass</em>}' attribute.
  
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Mass</em>' attribute.
   * @see #getCurrentMass()
   * @generated
   */

  void setCurrentMass(int value);

} // PartMass
