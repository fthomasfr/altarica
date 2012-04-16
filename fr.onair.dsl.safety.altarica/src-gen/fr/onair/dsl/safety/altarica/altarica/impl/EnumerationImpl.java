/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.Enumeration;
import fr.onair.dsl.safety.altarica.altarica.Literal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.EnumerationImpl#getOwnedLiterals <em>Owned Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends AbstractDomainImpl implements Enumeration
{
  /**
   * The cached value of the '{@link #getOwnedLiterals() <em>Owned Literals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedLiterals()
   * @generated
   * @ordered
   */
  protected EList<Literal> ownedLiterals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationImpl()
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
    return AltaricaPackage.Literals.ENUMERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Literal> getOwnedLiterals()
  {
    if (ownedLiterals == null)
    {
      ownedLiterals = new EObjectContainmentEList<Literal>(Literal.class, this, AltaricaPackage.ENUMERATION__OWNED_LITERALS);
    }
    return ownedLiterals;
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
      case AltaricaPackage.ENUMERATION__OWNED_LITERALS:
        return ((InternalEList<?>)getOwnedLiterals()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.ENUMERATION__OWNED_LITERALS:
        return getOwnedLiterals();
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
      case AltaricaPackage.ENUMERATION__OWNED_LITERALS:
        getOwnedLiterals().clear();
        getOwnedLiterals().addAll((Collection<? extends Literal>)newValue);
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
      case AltaricaPackage.ENUMERATION__OWNED_LITERALS:
        getOwnedLiterals().clear();
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
      case AltaricaPackage.ENUMERATION__OWNED_LITERALS:
        return ownedLiterals != null && !ownedLiterals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumerationImpl
