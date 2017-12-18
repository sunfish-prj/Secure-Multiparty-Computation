/**
 * generated by Xtext 2.13.0
 */
package soton.cyber.smcaas.smc.smc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block SMC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.BlockSMC#getType <em>Type</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.BlockSMC#getName <em>Name</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.BlockSMC#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see soton.cyber.smcaas.smc.smc.SmcPackage#getBlockSMC()
 * @model
 * @generated
 */
public interface BlockSMC extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link soton.cyber.smcaas.smc.smc.BlockType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see soton.cyber.smcaas.smc.smc.BlockType
   * @see #setType(BlockType)
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getBlockSMC_Type()
   * @model
   * @generated
   */
  BlockType getType();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.BlockSMC#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see soton.cyber.smcaas.smc.smc.BlockType
   * @see #getType()
   * @generated
   */
  void setType(BlockType value);

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
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getBlockSMC_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link soton.cyber.smcaas.smc.smc.BlockSMC#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link soton.cyber.smcaas.smc.smc.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see soton.cyber.smcaas.smc.smc.SmcPackage#getBlockSMC_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParameters();

} // BlockSMC
