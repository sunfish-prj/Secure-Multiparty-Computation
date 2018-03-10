/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soton.cyber.smcaas.smc.smc.Count;
import soton.cyber.smcaas.smc.smc.SmcPackage;
import soton.cyber.smcaas.smc.smc.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.impl.CountImpl#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountImpl extends ComputationImpl implements Count
{
  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected VariableDecl array;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CountImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmcPackage.Literals.COUNT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl getArray()
  {
    if (array != null && array.eIsProxy())
    {
      InternalEObject oldArray = (InternalEObject)array;
      array = (VariableDecl)eResolveProxy(oldArray);
      if (array != oldArray)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmcPackage.COUNT__ARRAY, oldArray, array));
      }
    }
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl basicGetArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(VariableDecl newArray)
  {
    VariableDecl oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.COUNT__ARRAY, oldArray, array));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmcPackage.COUNT__ARRAY:
        if (resolve) return getArray();
        return basicGetArray();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmcPackage.COUNT__ARRAY:
        setArray((VariableDecl)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmcPackage.COUNT__ARRAY:
        setArray((VariableDecl)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmcPackage.COUNT__ARRAY:
        return array != null;
    }
    return super.eIsSet(featureID);
  }

} //CountImpl