/*******************************************************************************
 * Copyright (c) 2006, 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.data.helpers.capellacore.delegates;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.core.data.capellacore.Structure;

public class StructureHelper {
	private static StructureHelper instance;

	private StructureHelper() {
		// Do nothing
	}

	public static StructureHelper getInstance() {
		if (instance == null) {
			instance = new StructureHelper();
		}
		return instance;
	}

	public Object doSwitch(Structure element, EStructuralFeature feature) {
		// no helper found... searching in super classes...
		return NamespaceHelper.getInstance().doSwitch(element, feature);
	}
}
