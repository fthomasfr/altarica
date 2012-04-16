/**
 * <copyright>
 * </copyright>
 *
 */
package fr.onair.dsl.safety.altarica.altarica.impl;

import fr.onair.dsl.safety.altarica.altarica.AltaricaPackage;
import fr.onair.dsl.safety.altarica.altarica.Node;
import fr.onair.dsl.safety.altarica.altarica.NodeInstance;
import fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration;

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
 * An implementation of the model object '<em><b>Node Instance Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceDeclarationImpl#getOwnedNodeInstances <em>Owned Node Instances</em>}</li>
 *   <li>{@link fr.onair.dsl.safety.altarica.altarica.impl.NodeInstanceDeclarationImpl#getNodeType <em>Node Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeInstanceDeclarationImpl extends MinimalEObjectImpl.Container implements NodeInstanceDeclaration
{
  /**
   * The cached value of the '{@link #getOwnedNodeInstances() <em>Owned Node Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedNodeInstances()
   * @generated
   * @ordered
   */
  protected EList<NodeInstance> ownedNodeInstances;

  /**
   * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeType()
   * @generated
   * @ordered
   */
  protected Node nodeType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeInstanceDeclarationImpl()
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
    return AltaricaPackage.Literals.NODE_INSTANCE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeInstance> getOwnedNodeInstances()
  {
    if (ownedNodeInstances == null)
    {
      ownedNodeInstances = new EObjectContainmentEList<NodeInstance>(NodeInstance.class, this, AltaricaPackage.NODE_INSTANCE_DECLARATION__OWNED_NODE_INSTANCES);
    }
    return ownedNodeInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getNodeType()
  {
    if (nodeType != null && nodeType.eIsProxy())
    {
      InternalEObject oldNodeType = (InternalEObject)nodeType;
      nodeType = (Node)eResolveProxy(oldNodeType);
      if (nodeType != oldNodeType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AltaricaPackage.NODE_INSTANCE_DECLARATION__NODE_TYPE, oldNodeType, nodeType));
      }
    }
    return nodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetNodeType()
  {
    return nodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeType(Node newNodeType)
  {
    Node oldNodeType = nodeType;
    nodeType = newNodeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.NODE_INSTANCE_DECLARATION__NODE_TYPE, oldNodeType, nodeType));
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
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__OWNED_NODE_INSTANCES:
        return ((InternalEList<?>)getOwnedNodeInstances()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__OWNED_NODE_INSTANCES:
        return getOwnedNodeInstances();
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__NODE_TYPE:
        if (resolve) return getNodeType();
        return basicGetNodeType();
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
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__OWNED_NODE_INSTANCES:
        getOwnedNodeInstances().clear();
        getOwnedNodeInstances().addAll((Collection<? extends NodeInstance>)newValue);
        return;
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__NODE_TYPE:
        setNodeType((Node)newValue);
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
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__OWNED_NODE_INSTANCES:
        getOwnedNodeInstances().clear();
        return;
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__NODE_TYPE:
        setNodeType((Node)null);
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
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__OWNED_NODE_INSTANCES:
        return ownedNodeInstances != null && !ownedNodeInstances.isEmpty();
      case AltaricaPackage.NODE_INSTANCE_DECLARATION__NODE_TYPE:
        return nodeType != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeInstanceDeclarationImpl
