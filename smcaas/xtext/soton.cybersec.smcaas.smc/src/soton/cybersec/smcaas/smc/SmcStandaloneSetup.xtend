/*
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SmcStandaloneSetup extends SmcStandaloneSetupGenerated {

	def static void doSetup() {
		new SmcStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}