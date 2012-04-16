/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.Event;
import fr.onair.dsl.safety.altarica.altarica.EventDeclaration;
import fr.onair.dsl.safety.altarica.altarica.VariableAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.EventDeclarationImpl#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.EventDeclarationImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventDeclarationImpl extends MinimalEObjectImpl.Container implements EventDeclaration
{
  /**
   * The cached value of the '{@link #getOwnedEvents() <em>Owned Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> ownedEvents;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected VariableAttribute attribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventDeclarationImpl()
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
    return AltaricaPackage.Literals.EVENT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getOwnedEvents()
  {
    if (ownedEvents == null)
    {
      ownedEvents = new EObjectContainmentEList<Event>(Event.class, this, AltaricaPackage.EVENT_DECLARATION__OWNED_EVENTS);
    }
    return ownedEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAttribute getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribute(VariableAttribute newAttribute, NotificationChain msgs)
  {
    VariableAttribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE, oldAttribute, newAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(VariableAttribute newAttribute)
  {
    if (newAttribute != attribute)
    {
      NotificationChain msgs = null;
      if (attribute != null)
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE, newAttribute, newAttribute));
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
      case AltaricaPackage.EVENT_DECLARATION__OWNED_EVENTS:
        return ((InternalEList<?>)getOwnedEvents()).basicRemove(otherEnd, msgs);
      case AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE:
        return basicSetAttribute(null, msgs);
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
      case AltaricaPackage.EVENT_DECLARATION__OWNED_EVENTS:
        return getOwnedEvents();
      case AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE:
        return getAttribute();
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
      case AltaricaPackage.EVENT_DECLARATION__OWNED_EVENTS:
        getOwnedEvents().clear();
        getOwnedEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE:
        setAttribute((VariableAttribute)newValue);
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
      case AltaricaPackage.EVENT_DECLARATION__OWNED_EVENTS:
        getOwnedEvents().clear();
        return;
      case AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE:
        setAttribute((VariableAttribute)null);
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
      case AltaricaPackage.EVENT_DECLARATION__OWNED_EVENTS:
        return ownedEvents != null && !ownedEvents.isEmpty();
      case AltaricaPackage.EVENT_DECLARATION__ATTRIBUTE:
        return attribute != null;
    }
    return super.eIsSet(featureID);
  }

} //EventDeclarationImpl
