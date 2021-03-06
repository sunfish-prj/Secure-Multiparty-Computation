/**
 * generated by Xtext 2.12.0
 */
package soton.cyber.smcaas.smc.smc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import soton.cyber.smcaas.smc.smc.AddValues;
import soton.cyber.smcaas.smc.smc.SmcPackage;
import soton.cyber.smcaas.smc.smc.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soton.cyber.smcaas.smc.smc.impl.AddValuesImpl#getTblname <em>Tblname</em>}</li>
 *   <li>{@link soton.cyber.smcaas.smc.smc.impl.AddValuesImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddValuesImpl extends FunctionsImpl implements AddValues
{
  /**
   * The cached value of the '{@link #getTblname() <em>Tblname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTblname()
   * @generated
   * @ordered
   */
  protected VariableDecl tblname;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<VariableDecl> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddValuesImpl()
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
    return SmcPackage.Literals.ADD_VALUES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl getTblname()
  {
    if (tblname != null && tblname.eIsProxy())
    {
      InternalEObject oldTblname = (InternalEObject)tblname;
      tblname = (VariableDecl)eResolveProxy(oldTblname);
      if (tblname != oldTblname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmcPackage.ADD_VALUES__TBLNAME, oldTblname, tblname));
      }
    }
    return tblname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl basicGetTblname()
  {
    return tblname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTblname(VariableDecl newTblname)
  {
    VariableDecl oldTblname = tblname;
    tblname = newTblname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.ADD_VALUES__TBLNAME, oldTblname, tblname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDecl> getArgs()
  {
    if (args == null)
    {
      args = new EObjectResolvingEList<VariableDecl>(VariableDecl.class, this, SmcPackage.ADD_VALUES__ARGS);
    }
    return args;
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
      case SmcPackage.ADD_VALUES__TBLNAME:
        if (resolve) return getTblname();
        return basicGetTblname();
      case SmcPackage.ADD_VALUES__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmcPackage.ADD_VALUES__TBLNAME:
        setTblname((VariableDecl)newValue);
        return;
      case SmcPackage.ADD_VALUES__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends VariableDecl>)newValue);
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
      case SmcPackage.ADD_VALUES__TBLNAME:
        setTblname((VariableDecl)null);
        return;
      case SmcPackage.ADD_VALUES__ARGS:
        getArgs().clear();
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
      case SmcPackage.ADD_VALUES__TBLNAME:
        return tblname != null;
      case SmcPackage.ADD_VALUES__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AddValuesImpl
