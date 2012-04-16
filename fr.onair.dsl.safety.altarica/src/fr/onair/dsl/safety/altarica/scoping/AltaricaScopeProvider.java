/*******************************************************************************
* Copyright (c) 2011-2012 Frédéric Thomas.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* fthomas - Xtext generation
*******************************************************************************/
package fr.onair.dsl.safety.altarica.scoping;

import java.util.Collection;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import fr.onair.dsl.safety.altarica.altarica.NavigableVariable;
import fr.onair.dsl.safety.altarica.altarica.NestedQualifiedEventRef;
import fr.onair.dsl.safety.altarica.altarica.NestedQualifiedVariableRef;
import fr.onair.dsl.safety.altarica.altarica.Node;
import fr.onair.dsl.safety.altarica.altarica.NodeInstance;
import fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration;
import fr.onair.dsl.safety.altarica.altarica.System;
import fr.onair.dsl.safety.altarica.altarica.VariableRef;
import fr.onair.dsl.safety.altarica.utils.AltaricaUtils;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class AltaricaScopeProvider extends AbstractDeclarativeScopeProvider {

	IScope scope_NestedQualifiedEventRef_nestedVariable(NestedQualifiedEventRef qualifiedRef,
			EReference ref) {
		NavigableVariable variable = null;

		/* Determine if the Target is a NestedFunctionParamter of a regular one*/
		if (qualifiedRef.getTarget() instanceof NestedQualifiedEventRef) {
			variable = ((NestedQualifiedEventRef)qualifiedRef.getTarget()).getNestedVariable();
		} else {
			variable = qualifiedRef.getTarget().getVariable();
		}

		/* Get the attributes */
		if (variable instanceof NodeInstance) {
			NodeInstanceDeclaration declaration = (NodeInstanceDeclaration) variable.eContainer();
			Node context = declaration.getNodeType();	
			UniqueEList<IEObjectDescription> proposals = new UniqueEList<IEObjectDescription>();
			proposals.addAll((Collection<? extends IEObjectDescription>) AltaricaUtils.getEvents(context));
			proposals.addAll((Collection<? extends IEObjectDescription>) AltaricaUtils.getNodeInstances(context));
			return new SimpleScope(IScope.NULLSCOPE, proposals);
		} else {
		/* This situation should no happen*/
			return IScope.NULLSCOPE;
		}
	}
	
	IScope scope_VariableRef_variable(VariableRef variableRef,
			EReference ref) {
		IScope scope = super.delegateGetScope(variableRef, ref);
		System system = (System)EcoreUtil.getRootContainer(variableRef);
		UniqueEList<IEObjectDescription> proposals = new UniqueEList<IEObjectDescription>();
		proposals.addAll((Collection<? extends IEObjectDescription>) AltaricaUtils.getLiterals(system));
		return new SimpleScope(scope, proposals);
		
	}
		

	
	IScope scope_NestedQualifiedVariableRef_nestedVariable(NestedQualifiedVariableRef qualifiedRef,
			EReference ref) {
		NavigableVariable variable = null;

		/* Determine if the Target is a NestedFunctionParamter of a regular one*/
		if (qualifiedRef.getTarget() instanceof NestedQualifiedVariableRef) {
		variable = ((NestedQualifiedVariableRef)qualifiedRef.getTarget()).getNestedVariable();
		} else {
			variable = qualifiedRef.getTarget().getVariable();
		}

		/* Get the attributes */
		if (variable instanceof NodeInstance) {
			NodeInstanceDeclaration declaration = (NodeInstanceDeclaration) variable.eContainer();
			Node context = declaration.getNodeType();	
			UniqueEList<IEObjectDescription> proposals = new UniqueEList<IEObjectDescription>();
			proposals.addAll((Collection<? extends IEObjectDescription>) AltaricaUtils.getLocalVariables(context));
			proposals.addAll((Collection<? extends IEObjectDescription>) AltaricaUtils.getNodeInstances(context));
			return new SimpleScope(IScope.NULLSCOPE, proposals);
		} else {
		/* This situation should no happen*/
			return IScope.NULLSCOPE;
		}
	}
	
	
	
}
