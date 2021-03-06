/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Covered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.Covered#getMatch <em>Match</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.Covered#getCovered <em>Covered</em>}</li>
 * </ul>
 *
 * @see soton.cyber.smcaas.smc.smc.SmcPackage#getCovered()
 * @model
 * @generated
 */
public interface Covered extends AccessControl
{
  /**
   * Returns the value of the '<em><b>Match</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match</em>' reference.
   * @see #setMatch(VariableDecl)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getCovered_Match()
   * @model
   * @generated
   */
  VariableDecl getMatch();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.Covered#getMatch <em>Match</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match</em>' reference.
   * @see #getMatch()
   * @generated
   */
  void setMatch(VariableDecl value);

  /**
   * Returns the value of the '<em><b>Covered</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Covered</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Covered</em>' reference.
   * @see #setCovered(VariableDecl)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getCovered_Covered()
   * @model
   * @generated
   */
  VariableDecl getCovered();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.Covered#getCovered <em>Covered</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Covered</em>' reference.
   * @see #getCovered()
   * @generated
   */
  void setCovered(VariableDecl value);

} // Covered
