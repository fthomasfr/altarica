/*******************************************************************************
* Copyright (c) 2011-2012 Frédéric Thomas.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* fthomas - Xtext generation
*******************************************************************************/
package fr.onair.dsl.safety.altarica;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AltaricaStandaloneSetup extends AltaricaStandaloneSetupGenerated{

	public static void doSetup() {
		new AltaricaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

