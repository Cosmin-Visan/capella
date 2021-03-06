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
package org.polarsys.capella.test.diagram.filters.ju.lcbd;

import org.polarsys.capella.test.diagram.filters.ju.DiagramObjectFilterTestCase;

public abstract class FiltersForLCBD extends DiagramObjectFilterTestCase {

  protected final String PROPERTY_VALUES_ID = "7d725b80-73fe-4fcf-b151-3d9b6a58380d";
  protected final String ROOT_CONTAINER_ID = "2a67d691-dfac-4878-8727-4e3fdadeaa4b";

  @Override
  protected String getTestProjectName() {
    return "StandardDiagramFiltersModel";
  }

  @Override
  protected String getDiagramName() {
    return "[LCBD] LC 4";
  }

}
