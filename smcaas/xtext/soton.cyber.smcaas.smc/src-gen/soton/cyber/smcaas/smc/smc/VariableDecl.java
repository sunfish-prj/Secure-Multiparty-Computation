/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.VariableDecl#getType <em>Type</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.VariableDecl#getName <em>Name</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.VariableDecl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see soton.cyber.smcaas.smc.smc.SmcPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends Command
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link soton.cyber.smcaas.smc.smc.BasicType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see soton.cyber.smcaas.smc.smc.BasicType
   * @see #setType(BasicType)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getVariableDecl_Type()
   * @model
   * @generated
   */
  BasicType getType();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.VariableDecl#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see soton.cyber.smcaas.smc.smc.BasicType
   * @see #getType()
   * @generated
   */
  void setType(BasicType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getVariableDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.VariableDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getVariableDecl_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.VariableDecl#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // VariableDecl
