/*******************************************************************************
* Copyright (c) 2011-2012 Frédéric Thomas.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* fthomas - initial grammar
*******************************************************************************/
package fr.onair.dsl.safety.altarica.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;

import fr.onair.dsl.safety.altarica.altarica.AbstractDeclaration;
import fr.onair.dsl.safety.altarica.altarica.AbstractDomain;
import fr.onair.dsl.safety.altarica.altarica.AbstractSpecification;
import fr.onair.dsl.safety.altarica.altarica.Domain;
import fr.onair.dsl.safety.altarica.altarica.Enumeration;
import fr.onair.dsl.safety.altarica.altarica.Event;
import fr.onair.dsl.safety.altarica.altarica.EventDeclaration;
import fr.onair.dsl.safety.altarica.altarica.EventSpecification;
import fr.onair.dsl.safety.altarica.altarica.Flow;
import fr.onair.dsl.safety.altarica.altarica.FlowDeclaration;
import fr.onair.dsl.safety.altarica.altarica.FlowSpecification;
import fr.onair.dsl.safety.altarica.altarica.Literal;
import fr.onair.dsl.safety.altarica.altarica.Node;
import fr.onair.dsl.safety.altarica.altarica.NodeInstance;
import fr.onair.dsl.safety.altarica.altarica.NodeInstanceDeclaration;
import fr.onair.dsl.safety.altarica.altarica.NodeInstanceSpecification;
import fr.onair.dsl.safety.altarica.altarica.State;
import fr.onair.dsl.safety.altarica.altarica.StateDeclaration;
import fr.onair.dsl.safety.altarica.altarica.StateSpecification;
import fr.onair.dsl.safety.altarica.altarica.System;

/**
 * An altarica utils.
 * @author fthomas
 *
 */
public class AltaricaUtils {
	
	/**
	 * Gets all event description from the node.
	 * @param node the current node
	 * @return the events or an empty list
	 */
	public static Iterable<IEObjectDescription> getEvents(Node node) {
		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		if (node == null)
			return result;
		for (AbstractSpecification specification : node
				.getOwnedSpecifications()) {
			if (specification instanceof EventSpecification) {
				EventSpecification eventSpecification = (EventSpecification) specification;
				for (EventDeclaration declaration : eventSpecification
						.getOwnedEventDeclarations()) {
					for (Event event : declaration.getOwnedEvents()) {
						result.add(new EObjectDescription(event.getName(),
								event, null));
					}
				}
			}
		}
		return result;

	}

	/**
	 * Gets all local variables description from the node.
	 * @param node the current node
	 * @return the variables or an empty list
	 */
	public static Iterable<IEObjectDescription> getLocalVariables(Node node) {
		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		if (node == null)
			return result;
		for (AbstractSpecification specification : node
				.getOwnedSpecifications()) {
			if (specification instanceof FlowSpecification) {
				FlowSpecification flowSpecification = (FlowSpecification) specification;
		
				for (FlowDeclaration declaration : flowSpecification
						.getOwnedDeclarations()) {
					for (Flow flow : declaration.getOwnedFlows()) {
						result.add(new EObjectDescription(flow.getName(), flow,
								null));
					}
				}
			}
			if (specification instanceof StateSpecification) {
				StateSpecification stateSpecification = (StateSpecification) specification;
				for (StateDeclaration declaration : stateSpecification
						.getOwnedStateDeclarations()) {
					for (State state : declaration.getOwnedStates()) {
						result.add(new EObjectDescription(state.getName(),
								state, null));
					}
				}

			}
		
		}
		return result;

	}

	/**
	 * Gets all the node instances form the node
	 * @param node the current node
	 * @return the instances or an empty list
	 */
	public static Iterable<IEObjectDescription> getNodeInstances(Node node) {
		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (AbstractSpecification specification : node
				.getOwnedSpecifications()) {
			if (specification instanceof NodeInstanceSpecification) {
				NodeInstanceSpecification nodeInstanceSpecification = (NodeInstanceSpecification) specification;
				for (NodeInstanceDeclaration declaration : nodeInstanceSpecification
						.getOwnedNodeInstanceDeclarations()) {
					for (NodeInstance nodeInstance : declaration
							.getOwnedNodeInstances()) {
						result.add(new EObjectDescription(nodeInstance
								.getName(), nodeInstance, null));
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the literals description from a system.
	 * @param system the system
	 * @return the literals
	 */
	public static Iterable<IEObjectDescription> getLiterals(System system){
		UniqueEList<IEObjectDescription> results = new UniqueEList<IEObjectDescription>();
		for (AbstractDeclaration declaration : system.getOwnedDeclarations()) {
			if(declaration instanceof Domain){
				AbstractDomain domain = ((Domain)declaration).getDomain();
				if(domain instanceof Enumeration){
					Enumeration enumeration = (Enumeration)domain;
					for (Literal literal : enumeration.getOwnedLiterals()) {
						results.add(new EObjectDescription(literal.getName(),literal, null));
					}
				}
			}
		}
		return results;
	}
}
