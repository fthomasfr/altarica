/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AbstractTypeRef;
import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.State;
import fr.onair.dsl.safety.altarica.altarica.StateDeclaration;
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
 * An implementation of the model object '<em><b>State Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.StateDeclarationImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.StateDeclarationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.StateDeclarationImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateDeclarationImpl extends MinimalEObjectImpl.Container implements StateDeclaration
{
  /**
   * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedStates()
   * @generated
   * @ordered
   */
  protected EList<State> ownedStates;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected AbstractTypeRef domain;

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
  protected StateDeclarationImpl()
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
    return AltaricaPackage.Literals.STATE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getOwnedStates()
  {
    if (ownedStates == null)
    {
      ownedStates = new EObjectContainmentEList<State>(State.class, this, AltaricaPackage.STATE_DECLARATION__OWNED_STATES);
    }
    return ownedStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractTypeRef getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomain(AbstractTypeRef newDomain, NotificationChain msgs)
  {
    AbstractTypeRef oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.STATE_DECLARATION__DOMAIN, oldDomain, newDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomain(AbstractTypeRef newDomain)
  {
    if (newDomain != domain)
    {
      NotificationChain msgs = null;
      if (domain != null)
        msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.STATE_DECLARATION__DOMAIN, null, msgs);
      if (newDomain != null)
        msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.STATE_DECLARATION__DOMAIN, null, msgs);
      msgs = basicSetDomain(newDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.STATE_DECLARATION__DOMAIN, newDomain, newDomain));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.STATE_DECLARATION__ATTRIBUTE, oldAttribute, newAttribute);
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
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.STATE_DECLARATION__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.STATE_DECLARATION__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.STATE_DECLARATION__ATTRIBUTE, newAttribute, newAttribute));
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
      case AltaricaPackage.STATE_DECLARATION__OWNED_STATES:
        return ((InternalEList<?>)getOwnedStates()).basicRemove(otherEnd, msgs);
      case AltaricaPackage.STATE_DECLARATION__DOMAIN:
        return basicSetDomain(null, msgs);
      case AltaricaPackage.STATE_DECLARATION__ATTRIBUTE:
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
      case AltaricaPackage.STATE_DECLARATION__OWNED_STATES:
        return getOwnedStates();
      case AltaricaPackage.STATE_DECLARATION__DOMAIN:
        return getDomain();
      case AltaricaPackage.STATE_DECLARATION__ATTRIBUTE:
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
      case AltaricaPackage.STATE_DECLARATION__OWNED_STATES:
        getOwnedStates().clear();
        getOwnedStates().addAll((Collection<? extends State>)newValue);
        return;
      case AltaricaPackage.STATE_DECLARATION__DOMAIN:
        setDomain((AbstractTypeRef)newValue);
        return;
      case AltaricaPackage.STATE_DECLARATION__ATTRIBUTE:
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
      case AltaricaPackage.STATE_DECLARATION__OWNED_STATES:
        getOwnedStates().clear();
        return;
      case AltaricaPackage.STATE_DECLARATION__DOMAIN:
        setDomain((AbstractTypeRef)null);
        return;
      case AltaricaPackage.STATE_DECLARATION__ATTRIBUTE:
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
      case AltaricaPackage.STATE_DECLARATION__OWNED_STATES:
        return ownedStates != null && !ownedStates.isEmpty();
      case AltaricaPackage.STATE_DECLARATION__DOMAIN:
        return domain != null;
      case AltaricaPackage.STATE_DECLARATION__ATTRIBUTE:
        return attribute != null;
    }
    return super.eIsSet(featureID);
  }

} //StateDeclarationImpl
