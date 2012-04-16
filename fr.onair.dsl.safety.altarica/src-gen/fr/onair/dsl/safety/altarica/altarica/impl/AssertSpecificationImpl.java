/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.Assert;
import fr.onair.dsl.safety.altarica.altarica.AssertSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.AssertSpecificationImpl#getOwnedAsserts <em>Owned Asserts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertSpecificationImpl extends AbstractSpecificationImpl implements AssertSpecification
{
  /**
   * The cached value of the '{@link #getOwnedAsserts() <em>Owned Asserts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedAsserts()
   * @generated
   * @ordered
   */
  protected EList<Assert> ownedAsserts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertSpecificationImpl()
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
    return AltaricaPackage.Literals.ASSERT_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assert> getOwnedAsserts()
  {
    if (ownedAsserts == null)
    {
      ownedAsserts = new EObjectContainmentEList<Assert>(Assert.class, this, AltaricaPackage.ASSERT_SPECIFICATION__OWNED_ASSERTS);
    }
    return ownedAsserts;
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
      case AltaricaPackage.ASSERT_SPECIFICATION__OWNED_ASSERTS:
        return ((InternalEList<?>)getOwnedAsserts()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.ASSERT_SPECIFICATION__OWNED_ASSERTS:
        return getOwnedAsserts();
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
      case AltaricaPackage.ASSERT_SPECIFICATION__OWNED_ASSERTS:
        getOwnedAsserts().clear();
        getOwnedAsserts().addAll((Collection<? extends Assert>)newValue);
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
      case AltaricaPackage.ASSERT_SPECIFICATION__OWNED_ASSERTS:
        getOwnedAsserts().clear();
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
      case AltaricaPackage.ASSERT_SPECIFICATION__OWNED_ASSERTS:
        return ownedAsserts != null && !ownedAsserts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssertSpecificationImpl
