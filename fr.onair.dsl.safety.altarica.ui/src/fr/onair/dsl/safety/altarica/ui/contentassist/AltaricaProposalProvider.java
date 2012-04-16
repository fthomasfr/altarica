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
package fr.onair.dsl.safety.altarica.ui.contentassist;

import java.util.Collection;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import fr.onair.dsl.safety.altarica.altarica.System;
import fr.onair.dsl.safety.altarica.utils.AltaricaUtils;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class AltaricaProposalProvider extends AbstractAltaricaProposalProvider {

	public void completeVariableRef_Variable(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
			  // call implementation in superclass
			  super.completeVariableRef_Variable(
			    model, 
			    assignment, 
			    context, 
			    acceptor); 	

			  
			UniqueEList<IEObjectDescription> proposals = new UniqueEList<IEObjectDescription>();
			System system = (System)EcoreUtil.getRootContainer(model);
			proposals.addAll((Collection<? extends IEObjectDescription>) AltaricaUtils.getLiterals(system));
			for (IEObjectDescription ieObjectDescription : proposals) {
				  ICompletionProposal completionProposal = createCompletionProposal(ieObjectDescription.getName(), context);
			  // register the proposal, the acceptor handles null-values gracefully
				  acceptor.accept(completionProposal);
			}
	}
	
	
}
