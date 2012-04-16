/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.FlowDeclaration;
import fr.onair.dsl.safety.altarica.altarica.FlowSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.FlowSpecificationImpl#getOwnedDeclarations <em>Owned Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowSpecificationImpl extends AbstractSpecificationImpl implements FlowSpecification
{
  /**
   * The cached value of the '{@link #getOwnedDeclarations() <em>Owned Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedDeclarations()
   * @generated
   * @ordered
   */
  protected EList<FlowDeclaration> ownedDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowSpecificationImpl()
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
    return AltaricaPackage.Literals.FLOW_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FlowDeclaration> getOwnedDeclarations()
  {
    if (ownedDeclarations == null)
    {
      ownedDeclarations = new EObjectContainmentEList<FlowDeclaration>(FlowDeclaration.class, this, AltaricaPackage.FLOW_SPECIFICATION__OWNED_DECLARATIONS);
    }
    return ownedDeclarations;
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_DECLARATIONS:
        return ((InternalEList<?>)getOwnedDeclarations()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_DECLARATIONS:
        return getOwnedDeclarations();
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_DECLARATIONS:
        getOwnedDeclarations().clear();
        getOwnedDeclarations().addAll((Collection<? extends FlowDeclaration>)newValue);
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_DECLARATIONS:
        getOwnedDeclarations().clear();
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_DECLARATIONS:
        return ownedDeclarations != null && !ownedDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FlowSpecificationImpl
