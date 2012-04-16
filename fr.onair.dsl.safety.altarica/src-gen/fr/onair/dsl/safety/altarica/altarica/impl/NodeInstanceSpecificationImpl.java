/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration;
import fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceSpecificationImpl#getOwnedNodeInstanceDeclarations <em>Owned Node Instance Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeInstanceSpecificationImpl extends AbstractSpecificationImpl implements NodeInstanceSpecification
{
  /**
   * The cached value of the '{@link #getOwnedNodeInstanceDeclarations() <em>Owned Node Instance Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedNodeInstanceDeclarations()
   * @generated
   * @ordered
   */
  protected EList<NodeInstanceDeclaration> ownedNodeInstanceDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeInstanceSpecificationImpl()
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
    return AltaricaPackage.Literals.NODE_INSTANCE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeInstanceDeclaration> getOwnedNodeInstanceDeclarations()
  {
    if (ownedNodeInstanceDeclarations == null)
    {
      ownedNodeInstanceDeclarations = new EObjectContainmentEList<NodeInstanceDeclaration>(NodeInstanceDeclaration.class, this, AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCE_DECLARATIONS);
    }
    return ownedNodeInstanceDeclarations;
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCE_DECLARATIONS:
        return ((InternalEList<?>)getOwnedNodeInstanceDeclarations()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCE_DECLARATIONS:
        return getOwnedNodeInstanceDeclarations();
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCE_DECLARATIONS:
        getOwnedNodeInstanceDeclarations().clear();
        getOwnedNodeInstanceDeclarations().addAll((Collection<? extends NodeInstanceDeclaration>)newValue);
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCE_DECLARATIONS:
        getOwnedNodeInstanceDeclarations().clear();
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCE_DECLARATIONS:
        return ownedNodeInstanceDeclarations != null && !ownedNodeInstanceDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NodeInstanceSpecificationImpl
