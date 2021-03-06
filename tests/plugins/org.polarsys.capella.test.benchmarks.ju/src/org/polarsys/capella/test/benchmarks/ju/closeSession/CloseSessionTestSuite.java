/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.benchmarks.ju.closeSession;

import java.util.List;

import org.polarsys.capella.test.benchmarks.ju.suites.BenchmarkTestSuite;
import org.polarsys.capella.test.diagram.common.ju.context.DiagramContext;
import org.polarsys.capella.test.framework.api.BasicTestArtefact;

import junit.framework.Test;

public class CloseSessionTestSuite extends BenchmarkTestSuite {

  /**
   * Returns the suite. This is required to unary launch this test.
   */
  public static Test suite() {
    return new CloseSessionTestSuite();
  }

  @Override
  protected BasicTestArtefact initMainTestCase(List<DiagramContext> contexts) {
    return new CloseSessionTestCase();
  }
  
  @Override
  protected BasicTestArtefact initSetUpTestCase(List<DiagramContext> contexts, BasicTestArtefact mainTestCase) {
    return new CloseSessionSetUpTestCase(mainTestCase);
  }
}
