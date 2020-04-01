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
package org.polarsys.capella.test.diagram.common.ju.step.tools.titleblocks;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.description.DAnnotation;
import org.polarsys.capella.core.sirius.analysis.DiagramServices;
import org.polarsys.capella.test.diagram.common.ju.context.DiagramContext;
import org.polarsys.capella.test.diagram.common.ju.step.tools.CreateAbstractDNodeTool;

public class CreateElementTitleBlockTool extends CreateAbstractDNodeTool<DDiagramElementContainer> {

  public CreateElementTitleBlockTool(DiagramContext context, String toolName, String containerView) {
    super(context, toolName, containerView);
  }

  protected Collection<DDiagramElement> getDiagramElements(DSemanticDecorator element) {
    return DiagramServices.getDiagramServices().getFlatOwnedDiagramElements(element);
  }

  @Override
  protected void preRunTest() {
    super.preRunTest();
  }

  @Override
  protected void postRunTest() {
    newElements = getDiagramElements(getContainerView());
    
    assertTrue(newElements.size() == 1);
    
    DDiagramElement element = newElements.iterator().next();
    assertTrue (element.getTarget() instanceof DAnnotation); 
    
    DAnnotation annotation = (DAnnotation) element.getTarget();
    
    // todo: to replace with constant after merge with existing code
    assertTrue(annotation.getSource().equals("ElementTitleBlock"));
    
    // todo: checks line, cols
  }
}