/**
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc.smc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cybersec.smcaas.smc.smc.Block#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see soton.cybersec.smcaas.smc.smc.SmcPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Command
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
   * @see soton.cybersec.smcaas.smc.smc.SmcPackage#getBlock_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Block
