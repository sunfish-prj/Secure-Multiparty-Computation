/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.Smc#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.Smc#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @see soton.cyber.smcaas.smc.smc.SmcPackage#getSmc()
 * @model
 * @generated
 */
public interface Smc extends EObject
{
  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link soton.cyber.smcaas.smc.smc.BlockSMC}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getSmc_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<BlockSMC> getBlocks();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(MainSMC)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getSmc_Main()
   * @model containment="true"
   * @generated
   */
  MainSMC getMain();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.Smc#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(MainSMC value);

} // Smc
