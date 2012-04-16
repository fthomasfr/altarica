/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.StateDeclaration;
import fr.onair.dsl.safety.altarica.altarica.StateSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.StateSpecificationImpl#getOwnedStateDeclarations <em>Owned State Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateSpecificationImpl extends AbstractSpecificationImpl implements StateSpecification
{
  /**
   * The cached value of the '{@link #getOwnedStateDeclarations() <em>Owned State Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedStateDeclarations()
   * @generated
   * @ordered
   */
  protected EList<StateDeclaration> ownedStateDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateSpecificationImpl()
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
    return AltaricaPackage.Literals.STATE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateDeclaration> getOwnedStateDeclarations()
  {
    if (ownedStateDeclarations == null)
    {
      ownedStateDeclarations = new EObjectContainmentEList<StateDeclaration>(StateDeclaration.class, this, AltaricaPackage.STATE_SPECIFICATION__OWNED_STATE_DECLARATIONS);
    }
    return ownedStateDeclarations;
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATE_DECLARATIONS:
        return ((InternalEList<?>)getOwnedStateDeclarations()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATE_DECLARATIONS:
        return getOwnedStateDeclarations();
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATE_DECLARATIONS:
        getOwnedStateDeclarations().clear();
        getOwnedStateDeclarations().addAll((Collection<? extends StateDeclaration>)newValue);
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATE_DECLARATIONS:
        getOwnedStateDeclarations().clear();
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATE_DECLARATIONS:
        return ownedStateDeclarations != null && !ownedStateDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateSpecificationImpl
