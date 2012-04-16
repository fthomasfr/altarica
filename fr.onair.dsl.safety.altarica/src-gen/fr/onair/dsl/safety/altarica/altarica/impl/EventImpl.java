/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.Event;
import fr.onair.dsl.safety.altarica.altarica.Priority;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.EventImpl#getOwnedPriority <em>Owned Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends NavigableVariableImpl implements Event
{
  /**
   * The cached value of the '{@link #getOwnedPriority() <em>Owned Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPriority()
   * @generated
   * @ordered
   */
  protected Priority ownedPriority;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return AltaricaPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority getOwnedPriority()
  {
    return ownedPriority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedPriority(Priority newOwnedPriority, NotificationChain msgs)
  {
    Priority oldOwnedPriority = ownedPriority;
    ownedPriority = newOwnedPriority;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.EVENT__OWNED_PRIORITY, oldOwnedPriority, newOwnedPriority);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedPriority(Priority newOwnedPriority)
  {
    if (newOwnedPriority != ownedPriority)
    {
      NotificationChain msgs = null;
      if (ownedPriority != null)
        msgs = ((InternalEObject)ownedPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.EVENT__OWNED_PRIORITY, null, msgs);
      if (newOwnedPriority != null)
        msgs = ((InternalEObject)newOwnedPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.EVENT__OWNED_PRIORITY, null, msgs);
      msgs = basicSetOwnedPriority(newOwnedPriority, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.EVENT__OWNED_PRIORITY, newOwnedPriority, newOwnedPriority));
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
      case AltaricaPackage.EVENT__OWNED_PRIORITY:
        return basicSetOwnedPriority(null, msgs);
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
      case AltaricaPackage.EVENT__OWNED_PRIORITY:
        return getOwnedPriority();
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
      case AltaricaPackage.EVENT__OWNED_PRIORITY:
        setOwnedPriority((Priority)newValue);
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
      case AltaricaPackage.EVENT__OWNED_PRIORITY:
        setOwnedPriority((Priority)null);
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
      case AltaricaPackage.EVENT__OWNED_PRIORITY:
        return ownedPriority != null;
    }
    return super.eIsSet(featureID);
  }

} //EventImpl
