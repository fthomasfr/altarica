/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AbstractSpecification;
import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeImpl#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeImpl#getOwnedSpecifications <em>Owned Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends AbstractDeclarationImpl implements Node
{
  /**
   * The default value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMain()
   * @generated
   * @ordered
   */
  protected static final boolean IS_MAIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMain()
   * @generated
   * @ordered
   */
  protected boolean isMain = IS_MAIN_EDEFAULT;

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
   * The cached value of the '{@link #getOwnedSpecifications() <em>Owned Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedSpecifications()
   * @generated
   * @ordered
   */
  protected EList<AbstractSpecification> ownedSpecifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
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
    return AltaricaPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsMain()
  {
    return isMain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsMain(boolean newIsMain)
  {
    boolean oldIsMain = isMain;
    isMain = newIsMain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.NODE__IS_MAIN, oldIsMain, isMain));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractSpecification> getOwnedSpecifications()
  {
    if (ownedSpecifications == null)
    {
      ownedSpecifications = new EObjectContainmentEList<AbstractSpecification>(AbstractSpecification.class, this, AltaricaPackage.NODE__OWNED_SPECIFICATIONS);
    }
    return ownedSpecifications;
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
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        return ((InternalEList<?>)getOwnedSpecifications()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.NODE__IS_MAIN:
        return isIsMain();
      case AltaricaPackage.NODE__NAME:
        return getName();
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        return getOwnedSpecifications();
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
      case AltaricaPackage.NODE__IS_MAIN:
        setIsMain((Boolean)newValue);
        return;
      case AltaricaPackage.NODE__NAME:
        setName((String)newValue);
        return;
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        getOwnedSpecifications().clear();
        getOwnedSpecifications().addAll((Collection<? extends AbstractSpecification>)newValue);
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
      case AltaricaPackage.NODE__IS_MAIN:
        setIsMain(IS_MAIN_EDEFAULT);
        return;
      case AltaricaPackage.NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        getOwnedSpecifications().clear();
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
      case AltaricaPackage.NODE__IS_MAIN:
        return isMain != IS_MAIN_EDEFAULT;
      case AltaricaPackage.NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        return ownedSpecifications != null && !ownedSpecifications.isEmpty();
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
    result.append(" (isMain: ");
    result.append(isMain);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NodeImpl
