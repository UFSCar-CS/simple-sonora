/*
 * generated by Xtext
 */
package org.xtext.simplesonora;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SimpleSonoraUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.simplesonora.ui.internal.SimpleSonoraActivator.getInstance().getInjector("org.xtext.simplesonora.SimpleSonora");
	}
	
}