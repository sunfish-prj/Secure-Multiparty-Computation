/**
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc;

import soton.cybersec.smcaas.smc.SmcStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SmcStandaloneSetup extends SmcStandaloneSetupGenerated {
  public static void doSetup() {
    new SmcStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}