/*******************************************************************************
 * Copyright (c) 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.platform.sirius.ui.project.sample;

import java.io.File;
import java.io.FilenameFilter;

public class ZipFilenameFilter implements FilenameFilter {

  @Override
  public boolean accept(File dir, String name) {
    return name.endsWith("zip");
  }

}
