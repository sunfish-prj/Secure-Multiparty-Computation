/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bell Lapadula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.BellLapadula#getCur <em>Cur</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.BellLapadula#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see soton.cyber.smcaas.smc.smc.SmcPackage#getBellLapadula()
 * @model
 * @generated
 */
public interface BellLapadula extends AccessControl
{
  /**
   * Returns the value of the '<em><b>Cur</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cur</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cur</em>' reference.
   * @see #setCur(VariableDecl)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getBellLapadula_Cur()
   * @model
   * @generated
   */
  VariableDecl getCur();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.BellLapadula#getCur <em>Cur</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cur</em>' reference.
   * @see #getCur()
   * @generated
   */
  void setCur(VariableDecl value);

  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(String)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getBellLapadula_Mode()
   * @model
   * @generated
   */
  String getMode();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.BellLapadula#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
  void setMode(String value);

} // BellLapadula
