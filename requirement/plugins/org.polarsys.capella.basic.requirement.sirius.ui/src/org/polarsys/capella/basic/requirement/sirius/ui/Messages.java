/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.basic.requirement.sirius.ui;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 */
public class Messages {
  private static final String BUNDLE_NAME = "org.polarsys.capella.basic.requirement.sirius.ui.messages"; //$NON-NLS-1$

  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

  public static String RequirementManagerWizardAction_Command_Label;
  public static String RequirementManagerWizardAction_Message;
  public static String RequirementManagerWizardAction_Title;

  private Messages() {
    //
  }

  public static String getString(String key) {
    try {
      return RESOURCE_BUNDLE.getString(key);
    } catch (MissingResourceException e) {
      return '!' + key + '!';
    }
  }
}
