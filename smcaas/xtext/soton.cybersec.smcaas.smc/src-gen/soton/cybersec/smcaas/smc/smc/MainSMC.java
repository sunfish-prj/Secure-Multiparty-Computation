/**
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc.smc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main SMC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cybersec.smcaas.smc.smc.MainSMC#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see soton.cybersec.smcaas.smc.smc.SmcPackage#getMainSMC()
 * @model
 * @generated
 */
public interface MainSMC extends EObject
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link soton.cybersec.smcaas.smc.smc.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see soton.cybersec.smcaas.smc.smc.SmcPackage#getMainSMC_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // MainSMC
