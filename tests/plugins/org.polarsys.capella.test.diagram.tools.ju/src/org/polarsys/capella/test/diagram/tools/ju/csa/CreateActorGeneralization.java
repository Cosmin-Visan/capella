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
package org.polarsys.capella.test.diagram.tools.ju.csa;

import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.capella.core.model.preferences.IInheritancePreferences;
import org.polarsys.capella.test.diagram.common.ju.context.CSADiagram;
import org.polarsys.capella.test.diagram.tools.ju.model.EmptyProject;
import org.polarsys.capella.test.framework.context.SessionContext;

public class CreateActorGeneralization extends EmptyProject {

  @Override
  public void test() throws Exception {
    Session session = getSession(getRequiredTestModel());
    SessionContext context = new SessionContext(session);
    context.setPreference(IInheritancePreferences.PREFS_ALLOW_COMPONENT_NON_ACTOR_INHERITANCE, true);
    CSADiagram csa = CSADiagram.createDiagram(context, SA__SYSTEM);
    String actor1 = csa.createActor();
    String actor2 = csa.createActor();
    csa.createActorGeneralization(actor1, actor2);
  }

}
