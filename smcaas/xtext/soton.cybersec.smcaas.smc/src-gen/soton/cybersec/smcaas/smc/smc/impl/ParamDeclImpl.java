/**
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc.smc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import soton.cybersec.smcaas.smc.smc.BasicType;
import soton.cybersec.smcaas.smc.smc.ParamDecl;
import soton.cybersec.smcaas.smc.smc.SecType;
import soton.cybersec.smcaas.smc.smc.SmcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soton.cybersec.smcaas.smc.smc.impl.ParamDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link soton.cybersec.smcaas.smc.smc.impl.ParamDeclImpl#getStype <em>Stype</em>}</li>
 *   <li>{@link soton.cybersec.smcaas.smc.smc.impl.ParamDeclImpl#getBtype <em>Btype</em>}</li>
 *   <li>{@link soton.cybersec.smcaas.smc.smc.impl.ParamDeclImpl#getParName <em>Par Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamDeclImpl extends CommandImpl implements ParamDecl
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getStype() <em>Stype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStype()
   * @generated
   * @ordered
   */
  protected static final SecType STYPE_EDEFAULT = SecType.PUBLIC;

  /**
   * The cached value of the '{@link #getStype() <em>Stype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStype()
   * @generated
   * @ordered
   */
  protected SecType stype = STYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getBtype() <em>Btype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBtype()
   * @generated
   * @ordered
   */
  protected static final BasicType BTYPE_EDEFAULT = BasicType.INT;

  /**
   * The cached value of the '{@link #getBtype() <em>Btype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBtype()
   * @generated
   * @ordered
   */
  protected BasicType btype = BTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getParName() <em>Par Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParName()
   * @generated
   * @ordered
   */
  protected static final String PAR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParName() <em>Par Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParName()
   * @generated
   * @ordered
   */
  protected String parName = PAR_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamDeclImpl()
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
    return SmcPackage.Literals.PARAM_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PARAM_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecType getStype()
  {
    return stype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStype(SecType newStype)
  {
    SecType oldStype = stype;
    stype = newStype == null ? STYPE_EDEFAULT : newStype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PARAM_DECL__STYPE, oldStype, stype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType getBtype()
  {
    return btype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBtype(BasicType newBtype)
  {
    BasicType oldBtype = btype;
    btype = newBtype == null ? BTYPE_EDEFAULT : newBtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PARAM_DECL__BTYPE, oldBtype, btype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParName()
  {
    return parName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParName(String newParName)
  {
    String oldParName = parName;
    parName = newParName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmcPackage.PARAM_DECL__PAR_NAME, oldParName, parName));
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
      case SmcPackage.PARAM_DECL__NAME:
        return getName();
      case SmcPackage.PARAM_DECL__STYPE:
        return getStype();
      case SmcPackage.PARAM_DECL__BTYPE:
        return getBtype();
      case SmcPackage.PARAM_DECL__PAR_NAME:
        return getParName();
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
      case SmcPackage.PARAM_DECL__NAME:
        setName((String)newValue);
        return;
      case SmcPackage.PARAM_DECL__STYPE:
        setStype((SecType)newValue);
        return;
      case SmcPackage.PARAM_DECL__BTYPE:
        setBtype((BasicType)newValue);
        return;
      case SmcPackage.PARAM_DECL__PAR_NAME:
        setParName((String)newValue);
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
      case SmcPackage.PARAM_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SmcPackage.PARAM_DECL__STYPE:
        setStype(STYPE_EDEFAULT);
        return;
      case SmcPackage.PARAM_DECL__BTYPE:
        setBtype(BTYPE_EDEFAULT);
        return;
      case SmcPackage.PARAM_DECL__PAR_NAME:
        setParName(PAR_NAME_EDEFAULT);
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
      case SmcPackage.PARAM_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SmcPackage.PARAM_DECL__STYPE:
        return stype != STYPE_EDEFAULT;
      case SmcPackage.PARAM_DECL__BTYPE:
        return btype != BTYPE_EDEFAULT;
      case SmcPackage.PARAM_DECL__PAR_NAME:
        return PAR_NAME_EDEFAULT == null ? parName != null : !PAR_NAME_EDEFAULT.equals(parName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", stype: ");
    result.append(stype);
    result.append(", btype: ");
    result.append(btype);
    result.append(", parName: ");
    result.append(parName);
    result.append(')');
    return result.toString();
  }

} //ParamDeclImpl