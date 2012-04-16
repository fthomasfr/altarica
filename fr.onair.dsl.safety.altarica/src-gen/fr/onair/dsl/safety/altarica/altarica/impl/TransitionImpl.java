/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AbstractExpression;
import fr.onair.dsl.safety.altarica.altarica.Affectation;
import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.Event;
import fr.onair.dsl.safety.altarica.altarica.Transition;

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
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.TransitionImpl#getOwnedExpresion <em>Owned Expresion</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.TransitionImpl#getOwnedAffectations <em>Owned Affectations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getOwnedExpresion() <em>Owned Expresion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedExpresion()
   * @generated
   * @ordered
   */
  protected AbstractExpression ownedExpresion;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * The cached value of the '{@link #getOwnedAffectations() <em>Owned Affectations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedAffectations()
   * @generated
   * @ordered
   */
  protected EList<Affectation> ownedAffectations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return AltaricaPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractExpression getOwnedExpresion()
  {
    return ownedExpresion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedExpresion(AbstractExpression newOwnedExpresion, NotificationChain msgs)
  {
    AbstractExpression oldOwnedExpresion = ownedExpresion;
    ownedExpresion = newOwnedExpresion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.TRANSITION__OWNED_EXPRESION, oldOwnedExpresion, newOwnedExpresion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedExpresion(AbstractExpression newOwnedExpresion)
  {
    if (newOwnedExpresion != ownedExpresion)
    {
      NotificationChain msgs = null;
      if (ownedExpresion != null)
        msgs = ((InternalEObject)ownedExpresion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.TRANSITION__OWNED_EXPRESION, null, msgs);
      if (newOwnedExpresion != null)
        msgs = ((InternalEObject)newOwnedExpresion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.TRANSITION__OWNED_EXPRESION, null, msgs);
      msgs = basicSetOwnedExpresion(newOwnedExpresion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.TRANSITION__OWNED_EXPRESION, newOwnedExpresion, newOwnedExpresion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEvent()
  {
    if (event != null && event.eIsProxy())
    {
      InternalEObject oldEvent = (InternalEObject)event;
      event = (Event)eResolveProxy(oldEvent);
      if (event != oldEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AltaricaPackage.TRANSITION__EVENT, oldEvent, event));
      }
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Event newEvent)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.TRANSITION__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Affectation> getOwnedAffectations()
  {
    if (ownedAffectations == null)
    {
      ownedAffectations = new EObjectContainmentEList<Affectation>(Affectation.class, this, AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS);
    }
    return ownedAffectations;
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESION:
        return basicSetOwnedExpresion(null, msgs);
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        return ((InternalEList<?>)getOwnedAffectations()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESION:
        return getOwnedExpresion();
      case AltaricaPackage.TRANSITION__EVENT:
        if (resolve) return getEvent();
        return basicGetEvent();
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        return getOwnedAffectations();
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESION:
        setOwnedExpresion((AbstractExpression)newValue);
        return;
      case AltaricaPackage.TRANSITION__EVENT:
        setEvent((Event)newValue);
        return;
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        getOwnedAffectations().clear();
        getOwnedAffectations().addAll((Collection<? extends Affectation>)newValue);
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESION:
        setOwnedExpresion((AbstractExpression)null);
        return;
      case AltaricaPackage.TRANSITION__EVENT:
        setEvent((Event)null);
        return;
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        getOwnedAffectations().clear();
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESION:
        return ownedExpresion != null;
      case AltaricaPackage.TRANSITION__EVENT:
        return event != null;
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        return ownedAffectations != null && !ownedAffectations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl
