
/*
 * generated by Xtext
 */
 
package fr.onair.dsl.safety.altarica.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class AltaricaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return fr.onair.dsl.safety.altarica.ui.internal.AltaricaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return fr.onair.dsl.safety.altarica.ui.internal.AltaricaActivator.getInstance().getInjector("fr.onair.dsl.safety.altarica.Altarica");
	}
	
}
