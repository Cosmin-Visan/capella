/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.transition.ju.testsuites;

import java.util.List;

import junit.framework.Test;

import org.polarsys.capella.test.framework.api.AutoLoadTestSuite;

public class TransitionAutoLoadTestSuite extends AutoLoadTestSuite {

  /**
   * Returns the suite. This is required to unary launch this test.
   */
  public static Test suite() {
    return new TransitionAutoLoadTestSuite();
  }

  @Override
  protected String getTestCasesRootPackage() {
    return "org.polarsys.capella.test.transition.ju.testcases"; //$NON-NLS-1$
  }

  @Override
  public List<String> getRequiredTestModels() {
    return null;
  }

}