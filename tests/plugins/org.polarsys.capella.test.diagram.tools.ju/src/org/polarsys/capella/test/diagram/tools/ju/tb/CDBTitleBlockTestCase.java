/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.tools.ju.tb;

import org.polarsys.capella.test.diagram.common.ju.context.CDBDiagram;
import org.polarsys.capella.test.diagram.common.ju.context.CommonDiagram;

public abstract class CDBTitleBlockTestCase extends AbstractTitleBlockTestCase {
  protected String classId;
  protected String diagramName;
  
  public CDBTitleBlockTestCase() {
    initData();
  }
  
  @Override
  public void testTitleBlocks() {
    diagram.createDiagramTitleBlock();
    diagram.createElementTitleBlock(classId);
  }

  @Override
  protected CommonDiagram initDiagram() {
    return (CDBDiagram) CDBDiagram.openDiagram(context, diagramName);
  }
  
  public abstract void initData();
}
