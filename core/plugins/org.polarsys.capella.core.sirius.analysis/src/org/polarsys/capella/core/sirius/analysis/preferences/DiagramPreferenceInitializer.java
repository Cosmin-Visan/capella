/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.sirius.analysis.preferences;

import org.polarsys.capella.core.commands.preferences.service.AbstractPreferencesInitializer;
import org.polarsys.capella.core.preferences.Activator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.polarsys.capella.core.sirius.analysis.activator.SiriusViewActivator;

public class DiagramPreferenceInitializer extends AbstractPreferencesInitializer {
  public DiagramPreferenceInitializer() {
    super(SiriusViewActivator.ID);
  }

  @Override
  public void initializeDefaultPreferences() {
    IPreferenceStore store = Activator.getDefault().getPreferenceStore();

    store.setDefault(DiagramsPreferencePage.NAME_PREF_DISPLAY_INCOMPLETE_IN_FUNCTIONAL_CHAIN_LABEL, false);
    store.setDefault(DiagramsPreferencePage.NAME_PREF_DISPLAY_INCOMPLETE_IN_OPERATIONAL_PROCESS_LABEL, false);
    store.setDefault(DiagramsPreferencePage.NAME_PREF_DISPLAY_INCOMPLETE_IN_PHYSICAL_PATH_LABEL, false);

    store.setDefault(DiagramsPreferencePage.NAME_PREF_DISPLAY_INVALID_IN_FUNCTIONAL_CHAIN_LABEL, true);
    store.setDefault(DiagramsPreferencePage.NAME_PREF_DISPLAY_INVALID_IN_OPERATIONAL_PROCESS_LABEL, true);
    store.setDefault(DiagramsPreferencePage.NAME_PREF_DISPLAY_INVALID_IN_PHYSICAL_PATH_LABEL, true);
  }
}
