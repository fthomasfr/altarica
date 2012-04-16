/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.EventDeclaration;
import fr.onair.dsl.safety.altarica.altarica.EventSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.EventSpecificationImpl#getOwnedEventDeclarations <em>Owned Event Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventSpecificationImpl extends AbstractSpecificationImpl implements EventSpecification
{
  /**
   * The cached value of the '{@link #getOwnedEventDeclarations() <em>Owned Event Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedEventDeclarations()
   * @generated
   * @ordered
   */
  protected EList<EventDeclaration> ownedEventDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventSpecificationImpl()
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
    return AltaricaPackage.Literals.EVENT_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventDeclaration> getOwnedEventDeclarations()
  {
    if (ownedEventDeclarations == null)
    {
      ownedEventDeclarations = new EObjectContainmentEList<EventDeclaration>(EventDeclaration.class, this, AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENT_DECLARATIONS);
    }
    return ownedEventDeclarations;
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENT_DECLARATIONS:
        return ((InternalEList<?>)getOwnedEventDeclarations()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENT_DECLARATIONS:
        return getOwnedEventDeclarations();
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENT_DECLARATIONS:
        getOwnedEventDeclarations().clear();
        getOwnedEventDeclarations().addAll((Collection<? extends EventDeclaration>)newValue);
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENT_DECLARATIONS:
        getOwnedEventDeclarations().clear();
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENT_DECLARATIONS:
        return ownedEventDeclarations != null && !ownedEventDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EventSpecificationImpl
