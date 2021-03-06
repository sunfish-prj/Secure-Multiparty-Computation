/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soton.cyber.smcaas.smc.smc.BlockSMC;
import soton.cyber.smcaas.smc.smc.Functions;
import soton.cyber.smcaas.smc.smc.Invocation;
import soton.cyber.smcaas.smc.smc.SmcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.impl.InvocationImpl#getBlockName <em>Block Name</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.impl.InvocationImpl#getFuncName <em>Func Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocationImpl extends ExpressionImpl implements Invocation
{
  /**
   * The cached value of the '{@link #getBlockName() <em>Block Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockName()
   * @generated
   * @ordered
   */
  protected BlockSMC blockName;

  /**
   * The cached value of the '{@link #getFuncName() <em>Func Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncName()
   * @generated
   * @ordered
   */
  protected Functions funcName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvocationImpl()
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
    return SmcPackage.Literals.INVOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockSMC getBlockName()
  {
    if (blockName != null && blockName.eIsProxy())
    {
      InternalEObject oldBlockName = (InternalEObject)blockName;
      blockName = (BlockSMC)eResolveProxy(oldBlockName);
      if (blockName != oldBlockName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmcPackage.INVOCATION__BLOCK_NAME, oldBlockName, blockName));
      }
    }
    return blockName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockSMC basicGetBlockName()
  {
    return blockName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlockName(BlockSMC newBlockName)
  {
    BlockSMC oldBlockName = blockName;
    blockName = newBlockName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.INVOCATION__BLOCK_NAME, oldBlockName, blockName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functions getFuncName()
  {
    return funcName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuncName(Functions newFuncName, NotificationChain msgs)
  {
    Functions oldFuncName = funcName;
    funcName = newFuncName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmcPackage.INVOCATION__FUNC_NAME, oldFuncName, newFuncName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuncName(Functions newFuncName)
  {
    if (newFuncName != funcName)
    {
      NotificationChain msgs = null;
      if (funcName != null)
        msgs = ((InternalEObject)funcName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmcPackage.INVOCATION__FUNC_NAME, null, msgs);
      if (newFuncName != null)
        msgs = ((InternalEObject)newFuncName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmcPackage.INVOCATION__FUNC_NAME, null, msgs);
      msgs = basicSetFuncName(newFuncName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.INVOCATION__FUNC_NAME, newFuncName, newFuncName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmcPackage.INVOCATION__FUNC_NAME:
        return basicSetFuncName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SmcPackage.INVOCATION__BLOCK_NAME:
        if (resolve) return getBlockName();
        return basicGetBlockName();
      case SmcPackage.INVOCATION__FUNC_NAME:
        return getFuncName();
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
      case SmcPackage.INVOCATION__BLOCK_NAME:
        setBlockName((BlockSMC)newValue);
        return;
      case SmcPackage.INVOCATION__FUNC_NAME:
        setFuncName((Functions)newValue);
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
      case SmcPackage.INVOCATION__BLOCK_NAME:
        setBlockName((BlockSMC)null);
        return;
      case SmcPackage.INVOCATION__FUNC_NAME:
        setFuncName((Functions)null);
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
      case SmcPackage.INVOCATION__BLOCK_NAME:
        return blockName != null;
      case SmcPackage.INVOCATION__FUNC_NAME:
        return funcName != null;
    }
    return super.eIsSet(featureID);
  }

} //InvocationImpl
