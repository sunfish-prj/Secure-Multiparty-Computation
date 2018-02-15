/**
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc.smc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cybersec.smcaas.smc.smc.VariableAssignment#getVar <em>Var</em>}</li>
 *   <li>{@link soton.cybersec.smcaas.smc.smc.VariableAssignment#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see soton.cybersec.smcaas.smc.smc.SmcPackage#getVariableAssignment()
 * @model
 * @generated
 */
public interface VariableAssignment extends Command
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(VariableDecl)
   * @see soton.cybersec.smcaas.smc.smc.SmcPackage#getVariableAssignment_Var()
   * @model
   * @generated
   */
  VariableDecl getVar();

  /**
   * Sets the value of the '{@link soton.cybersec.smcaas.smc.smc.VariableAssignment#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VariableDecl value);

  /**
   * Returns the value of the '<em><b>Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' containment reference.
   * @see #setOption(AbstractAssignment)
   * @see soton.cybersec.smcaas.smc.smc.SmcPackage#getVariableAssignment_Option()
   * @model containment="true"
   * @generated
   */
  AbstractAssignment getOption();

  /**
   * Sets the value of the '{@link soton.cybersec.smcaas.smc.smc.VariableAssignment#getOption <em>Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' containment reference.
   * @see #getOption()
   * @generated
   */
  void setOption(AbstractAssignment value);

} // VariableAssignment