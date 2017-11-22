/*
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import soton.cyber.smcaas.smc.SmcRuntimeModule
import soton.cyber.smcaas.smc.SmcStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SmcIdeSetup extends SmcStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SmcRuntimeModule, new SmcIdeModule))
	}
	
}