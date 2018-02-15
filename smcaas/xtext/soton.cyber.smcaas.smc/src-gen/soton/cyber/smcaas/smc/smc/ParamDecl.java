/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.ParamDecl#getName <em>Name</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.ParamDecl#getStype <em>Stype</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.ParamDecl#getBtype <em>Btype</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.ParamDecl#getParName <em>Par Name</em>}</li>
 * </ul>
 *
 * @see soton.cyber.smcaas.smc.smc.SmcPackage#getParamDecl()
 * @model
 * @generated
 */
public interface ParamDecl extends Command
{
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
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getParamDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.ParamDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Stype</b></em>' attribute.
   * The literals are from the enumeration {@link soton.cyber.smcaas.smc.smc.SecType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stype</em>' attribute.
   * @see soton.cyber.smcaas.smc.smc.SecType
   * @see #setStype(SecType)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getParamDecl_Stype()
   * @model
   * @generated
   */
  SecType getStype();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.ParamDecl#getStype <em>Stype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stype</em>' attribute.
   * @see soton.cyber.smcaas.smc.smc.SecType
   * @see #getStype()
   * @generated
   */
  void setStype(SecType value);

  /**
   * Returns the value of the '<em><b>Btype</b></em>' attribute.
   * The literals are from the enumeration {@link soton.cyber.smcaas.smc.smc.BasicType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Btype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Btype</em>' attribute.
   * @see soton.cyber.smcaas.smc.smc.BasicType
   * @see #setBtype(BasicType)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getParamDecl_Btype()
   * @model
   * @generated
   */
  BasicType getBtype();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.ParamDecl#getBtype <em>Btype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Btype</em>' attribute.
   * @see soton.cyber.smcaas.smc.smc.BasicType
   * @see #getBtype()
   * @generated
   */
  void setBtype(BasicType value);

  /**
   * Returns the value of the '<em><b>Par Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par Name</em>' attribute.
   * @see #setParName(String)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getParamDecl_ParName()
   * @model
   * @generated
   */
  String getParName();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.ParamDecl#getParName <em>Par Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par Name</em>' attribute.
   * @see #getParName()
   * @generated
   */
  void setParName(String value);

} // ParamDecl
