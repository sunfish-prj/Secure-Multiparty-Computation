/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.CreateTable#getTblname <em>Tblname</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.CreateTable#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see soton.cyber.smcaas.smc.smc.SmcPackage#getCreateTable()
 * @model
 * @generated
 */
public interface CreateTable extends Functions
{
  /**
   * Returns the value of the '<em><b>Tblname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tblname</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tblname</em>' reference.
   * @see #setTblname(VariableDecl)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getCreateTable_Tblname()
   * @model
   * @generated
   */
  VariableDecl getTblname();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.CreateTable#getTblname <em>Tblname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tblname</em>' reference.
   * @see #getTblname()
   * @generated
   */
  void setTblname(VariableDecl value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' reference list.
   * The list contents are of type {@link soton.cyber.smcaas.smc.smc.ParamDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' reference list.
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getCreateTable_Params()
   * @model
   * @generated
   */
  EList<ParamDecl> getParams();

} // CreateTable