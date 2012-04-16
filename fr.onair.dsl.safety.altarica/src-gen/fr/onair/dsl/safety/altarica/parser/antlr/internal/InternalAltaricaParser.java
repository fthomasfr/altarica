package fr.onair.dsl.safety.altarica.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import fr.onair.dsl.safety.altarica.services.AltaricaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAltaricaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "';'", "'='", "':'", "'domain'", "'['", "','", "']'", "'{'", "'}'", "'node'", "'Main'", "'edon'", "'init'", "'extern'", "'flow'", "'event'", "'!'", "'priority'", "'state'", "'sub'", "'assert'", "'sync'", "'<'", "'>'", "'?'", "'>='", "'trans'", "'|-'", "'->'", "':='", "'case {'", "'else'", "'if'", "'then'", "'+'", "'-'", "'*'", "'/'", "'and'", "'&'", "'or'", "'|'", "'!='", "'<='", "'=>'", "'~'", "'not'", "'('", "')'", "'.'", "'true'", "'false'", "'integer'", "'bool'", "'in'", "'out'", "'inout'"
    };
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=5;

        public InternalAltaricaParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g"; }



     	private AltaricaGrammarAccess grammarAccess;
     	
        public InternalAltaricaParser(TokenStream input, IAstFactory factory, AltaricaGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "System";	
       	}
       	
       	@Override
       	protected AltaricaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleSystem
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:78:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:79:2: (iv_ruleSystem= ruleSystem EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:80:2: iv_ruleSystem= ruleSystem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSystemRule(), currentNode); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem75);
            iv_ruleSystem=ruleSystem();
            _fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSystem


    // $ANTLR start ruleSystem
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:87:1: ruleSystem returns [EObject current=null] : ( (lv_ownedDeclarations_0_0= ruleAbstractDeclaration ) )* ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedDeclarations_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:92:6: ( ( (lv_ownedDeclarations_0_0= ruleAbstractDeclaration ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:93:1: ( (lv_ownedDeclarations_0_0= ruleAbstractDeclaration ) )*
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:93:1: ( (lv_ownedDeclarations_0_0= ruleAbstractDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:94:1: (lv_ownedDeclarations_0_0= ruleAbstractDeclaration )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:94:1: (lv_ownedDeclarations_0_0= ruleAbstractDeclaration )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:95:3: lv_ownedDeclarations_0_0= ruleAbstractDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSystemAccess().getOwnedDeclarationsAbstractDeclarationParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractDeclaration_in_ruleSystem130);
            	    lv_ownedDeclarations_0_0=ruleAbstractDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedDeclarations",
            	    	        		lv_ownedDeclarations_0_0, 
            	    	        		"AbstractDeclaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSystem


    // $ANTLR start entryRuleAbstractDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:125:1: entryRuleAbstractDeclaration returns [EObject current=null] : iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF ;
    public final EObject entryRuleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeclaration = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:126:2: (iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:127:2: iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration166);
            iv_ruleAbstractDeclaration=ruleAbstractDeclaration();
            _fsp--;

             current =iv_ruleAbstractDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclaration176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractDeclaration


    // $ANTLR start ruleAbstractDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:134:1: ruleAbstractDeclaration returns [EObject current=null] : (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode ) ;
    public final EObject ruleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Domain_0 = null;

        EObject this_ConstantDefinition_1 = null;

        EObject this_Node_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:139:6: ( (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:140:1: (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:140:1: (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("140:1: (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:141:5: this_Domain_0= ruleDomain
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomain_in_ruleAbstractDeclaration223);
                    this_Domain_0=ruleDomain();
                    _fsp--;

                     
                            current = this_Domain_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:151:5: this_ConstantDefinition_1= ruleConstantDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDeclarationAccess().getConstantDefinitionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstantDefinition_in_ruleAbstractDeclaration250);
                    this_ConstantDefinition_1=ruleConstantDefinition();
                    _fsp--;

                     
                            current = this_ConstantDefinition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:161:5: this_Node_2= ruleNode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDeclarationAccess().getNodeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNode_in_ruleAbstractDeclaration277);
                    this_Node_2=ruleNode();
                    _fsp--;

                     
                            current = this_Node_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractDeclaration


    // $ANTLR start entryRuleConstantDefinition
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:177:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:178:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:179:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition312);
            iv_ruleConstantDefinition=ruleConstantDefinition();
            _fsp--;

             current =iv_ruleConstantDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantDefinition


    // $ANTLR start ruleConstantDefinition
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:186:1: ruleConstantDefinition returns [EObject current=null] : ( 'const' ( (lv_constant_1_0= ruleConstant ) ) ( (lv_expression_2_0= ruleAbstractDefinitionConstant ) ) ';' ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_1_0 = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:191:6: ( ( 'const' ( (lv_constant_1_0= ruleConstant ) ) ( (lv_expression_2_0= ruleAbstractDefinitionConstant ) ) ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:192:1: ( 'const' ( (lv_constant_1_0= ruleConstant ) ) ( (lv_expression_2_0= ruleAbstractDefinitionConstant ) ) ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:192:1: ( 'const' ( (lv_constant_1_0= ruleConstant ) ) ( (lv_expression_2_0= ruleAbstractDefinitionConstant ) ) ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:192:3: 'const' ( (lv_constant_1_0= ruleConstant ) ) ( (lv_expression_2_0= ruleAbstractDefinitionConstant ) ) ';'
            {
            match(input,11,FOLLOW_11_in_ruleConstantDefinition357); 

                    createLeafNode(grammarAccess.getConstantDefinitionAccess().getConstKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:196:1: ( (lv_constant_1_0= ruleConstant ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:197:1: (lv_constant_1_0= ruleConstant )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:197:1: (lv_constant_1_0= ruleConstant )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:198:3: lv_constant_1_0= ruleConstant
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantDefinitionAccess().getConstantConstantParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstant_in_ruleConstantDefinition378);
            lv_constant_1_0=ruleConstant();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"constant",
            	        		lv_constant_1_0, 
            	        		"Constant", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:220:2: ( (lv_expression_2_0= ruleAbstractDefinitionConstant ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:221:1: (lv_expression_2_0= ruleAbstractDefinitionConstant )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:221:1: (lv_expression_2_0= ruleAbstractDefinitionConstant )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:222:3: lv_expression_2_0= ruleAbstractDefinitionConstant
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantDefinitionAccess().getExpressionAbstractDefinitionConstantParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractDefinitionConstant_in_ruleConstantDefinition399);
            lv_expression_2_0=ruleAbstractDefinitionConstant();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expression",
            	        		lv_expression_2_0, 
            	        		"AbstractDefinitionConstant", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleConstantDefinition409); 

                    createLeafNode(grammarAccess.getConstantDefinitionAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstantDefinition


    // $ANTLR start entryRuleConstant
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:256:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:257:2: (iv_ruleConstant= ruleConstant EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:258:2: iv_ruleConstant= ruleConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant445);
            iv_ruleConstant=ruleConstant();
            _fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant455); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstant


    // $ANTLR start ruleConstant
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:265:1: ruleConstant returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:270:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:271:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:271:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:272:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:272:1: (lv_name_0_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:273:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant496); 

            			createLeafNode(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstant


    // $ANTLR start entryRuleAbstractDefinitionConstant
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:303:1: entryRuleAbstractDefinitionConstant returns [EObject current=null] : iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF ;
    public final EObject entryRuleAbstractDefinitionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDefinitionConstant = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:304:2: (iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:305:2: iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractDefinitionConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractDefinitionConstant_in_entryRuleAbstractDefinitionConstant536);
            iv_ruleAbstractDefinitionConstant=ruleAbstractDefinitionConstant();
            _fsp--;

             current =iv_ruleAbstractDefinitionConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDefinitionConstant546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractDefinitionConstant


    // $ANTLR start ruleAbstractDefinitionConstant
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:312:1: ruleAbstractDefinitionConstant returns [EObject current=null] : (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant ) ;
    public final EObject ruleAbstractDefinitionConstant() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionConstant_0 = null;

        EObject this_DomainConstant_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:317:6: ( (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:318:1: (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:318:1: (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("318:1: (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:319:5: this_ExpressionConstant_0= ruleExpressionConstant
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDefinitionConstantAccess().getExpressionConstantParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpressionConstant_in_ruleAbstractDefinitionConstant593);
                    this_ExpressionConstant_0=ruleExpressionConstant();
                    _fsp--;

                     
                            current = this_ExpressionConstant_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:329:5: this_DomainConstant_1= ruleDomainConstant
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDefinitionConstantAccess().getDomainConstantParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainConstant_in_ruleAbstractDefinitionConstant620);
                    this_DomainConstant_1=ruleDomainConstant();
                    _fsp--;

                     
                            current = this_DomainConstant_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractDefinitionConstant


    // $ANTLR start entryRuleExpressionConstant
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:345:1: entryRuleExpressionConstant returns [EObject current=null] : iv_ruleExpressionConstant= ruleExpressionConstant EOF ;
    public final EObject entryRuleExpressionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstant = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:346:2: (iv_ruleExpressionConstant= ruleExpressionConstant EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:347:2: iv_ruleExpressionConstant= ruleExpressionConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpressionConstant_in_entryRuleExpressionConstant655);
            iv_ruleExpressionConstant=ruleExpressionConstant();
            _fsp--;

             current =iv_ruleExpressionConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionConstant665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpressionConstant


    // $ANTLR start ruleExpressionConstant
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:354:1: ruleExpressionConstant returns [EObject current=null] : ( '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionConstant() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpression_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:359:6: ( ( '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:360:1: ( '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:360:1: ( '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:360:3: '=' ( (lv_ownedExpression_1_0= ruleExpression ) )
            {
            match(input,13,FOLLOW_13_in_ruleExpressionConstant700); 

                    createLeafNode(grammarAccess.getExpressionConstantAccess().getEqualsSignKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:364:1: ( (lv_ownedExpression_1_0= ruleExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:365:1: (lv_ownedExpression_1_0= ruleExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:365:1: (lv_ownedExpression_1_0= ruleExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:366:3: lv_ownedExpression_1_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpressionConstantAccess().getOwnedExpressionExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionConstant721);
            lv_ownedExpression_1_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExpressionConstantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ownedExpression",
            	        		lv_ownedExpression_1_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpressionConstant


    // $ANTLR start entryRuleDomainConstant
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:396:1: entryRuleDomainConstant returns [EObject current=null] : iv_ruleDomainConstant= ruleDomainConstant EOF ;
    public final EObject entryRuleDomainConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainConstant = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:397:2: (iv_ruleDomainConstant= ruleDomainConstant EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:398:2: iv_ruleDomainConstant= ruleDomainConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainConstant_in_entryRuleDomainConstant757);
            iv_ruleDomainConstant=ruleDomainConstant();
            _fsp--;

             current =iv_ruleDomainConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainConstant767); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDomainConstant


    // $ANTLR start ruleDomainConstant
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:405:1: ruleDomainConstant returns [EObject current=null] : ( ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) ( '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDomainConstant() throws RecognitionException {
        EObject current = null;

        EObject lv_domain_1_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:410:6: ( ( ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) ( '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:411:1: ( ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) ( '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:411:1: ( ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) ( '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:411:3: ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) ( '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )?
            {
            match(input,14,FOLLOW_14_in_ruleDomainConstant802); 

                    createLeafNode(grammarAccess.getDomainConstantAccess().getColonKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:415:1: ( (lv_domain_1_0= ruleAbstractDomain ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:416:1: (lv_domain_1_0= ruleAbstractDomain )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:416:1: (lv_domain_1_0= ruleAbstractDomain )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:417:3: lv_domain_1_0= ruleAbstractDomain
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainConstantAccess().getDomainAbstractDomainParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractDomain_in_ruleDomainConstant823);
            lv_domain_1_0=ruleAbstractDomain();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainConstantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"domain",
            	        		lv_domain_1_0, 
            	        		"AbstractDomain", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:439:2: ( '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:439:4: '=' ( (lv_ownedExpression_3_0= ruleExpression ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleDomainConstant834); 

                            createLeafNode(grammarAccess.getDomainConstantAccess().getEqualsSignKeyword_2_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:443:1: ( (lv_ownedExpression_3_0= ruleExpression ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:444:1: (lv_ownedExpression_3_0= ruleExpression )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:444:1: (lv_ownedExpression_3_0= ruleExpression )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:445:3: lv_ownedExpression_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDomainConstantAccess().getOwnedExpressionExpressionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDomainConstant855);
                    lv_ownedExpression_3_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDomainConstantRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ownedExpression",
                    	        		lv_ownedExpression_3_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDomainConstant


    // $ANTLR start entryRuleDomain
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:475:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:476:2: (iv_ruleDomain= ruleDomain EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:477:2: iv_ruleDomain= ruleDomain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain893);
            iv_ruleDomain=ruleDomain();
            _fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDomain


    // $ANTLR start ruleDomain
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:484:1: ruleDomain returns [EObject current=null] : ( 'domain' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_domain_3_0= ruleAbstractDomain ) ) ';' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_domain_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:489:6: ( ( 'domain' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_domain_3_0= ruleAbstractDomain ) ) ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:490:1: ( 'domain' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_domain_3_0= ruleAbstractDomain ) ) ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:490:1: ( 'domain' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_domain_3_0= ruleAbstractDomain ) ) ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:490:3: 'domain' ( (lv_name_1_0= RULE_ID ) ) '=' ( (lv_domain_3_0= ruleAbstractDomain ) ) ';'
            {
            match(input,15,FOLLOW_15_in_ruleDomain938); 

                    createLeafNode(grammarAccess.getDomainAccess().getDomainKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:494:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:495:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:495:1: (lv_name_1_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:496:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain955); 

            			createLeafNode(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleDomain970); 

                    createLeafNode(grammarAccess.getDomainAccess().getEqualsSignKeyword_2(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:522:1: ( (lv_domain_3_0= ruleAbstractDomain ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:523:1: (lv_domain_3_0= ruleAbstractDomain )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:523:1: (lv_domain_3_0= ruleAbstractDomain )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:524:3: lv_domain_3_0= ruleAbstractDomain
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getDomainAbstractDomainParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractDomain_in_ruleDomain991);
            lv_domain_3_0=ruleAbstractDomain();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"domain",
            	        		lv_domain_3_0, 
            	        		"AbstractDomain", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleDomain1001); 

                    createLeafNode(grammarAccess.getDomainAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDomain


    // $ANTLR start entryRuleAbstractDomain
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:558:1: entryRuleAbstractDomain returns [EObject current=null] : iv_ruleAbstractDomain= ruleAbstractDomain EOF ;
    public final EObject entryRuleAbstractDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDomain = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:559:2: (iv_ruleAbstractDomain= ruleAbstractDomain EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:560:2: iv_ruleAbstractDomain= ruleAbstractDomain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractDomainRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractDomain_in_entryRuleAbstractDomain1037);
            iv_ruleAbstractDomain=ruleAbstractDomain();
            _fsp--;

             current =iv_ruleAbstractDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDomain1047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractDomain


    // $ANTLR start ruleAbstractDomain
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:567:1: ruleAbstractDomain returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleAbstractDomain() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_Range_1 = null;

        EObject this_Enumeration_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:572:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:573:1: (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:573:1: (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 64:
            case 65:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("573:1: (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:574:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDomainAccess().getPrimitiveTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleAbstractDomain1094);
                    this_PrimitiveType_0=rulePrimitiveType();
                    _fsp--;

                     
                            current = this_PrimitiveType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:584:5: this_Range_1= ruleRange
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDomainAccess().getRangeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRange_in_ruleAbstractDomain1121);
                    this_Range_1=ruleRange();
                    _fsp--;

                     
                            current = this_Range_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:594:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractDomainAccess().getEnumerationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleAbstractDomain1148);
                    this_Enumeration_2=ruleEnumeration();
                    _fsp--;

                     
                            current = this_Enumeration_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractDomain


    // $ANTLR start entryRuleRange
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:610:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:611:2: (iv_ruleRange= ruleRange EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:612:2: iv_ruleRange= ruleRange EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRangeRule(), currentNode); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange1183);
            iv_ruleRange=ruleRange();
            _fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange1193); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRange


    // $ANTLR start ruleRange
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:619:1: ruleRange returns [EObject current=null] : ( '[' ( (lv_lower_1_0= ruleAtom ) ) ',' ( (lv_upper_3_0= ruleAtom ) ) ']' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:624:6: ( ( '[' ( (lv_lower_1_0= ruleAtom ) ) ',' ( (lv_upper_3_0= ruleAtom ) ) ']' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:625:1: ( '[' ( (lv_lower_1_0= ruleAtom ) ) ',' ( (lv_upper_3_0= ruleAtom ) ) ']' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:625:1: ( '[' ( (lv_lower_1_0= ruleAtom ) ) ',' ( (lv_upper_3_0= ruleAtom ) ) ']' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:625:3: '[' ( (lv_lower_1_0= ruleAtom ) ) ',' ( (lv_upper_3_0= ruleAtom ) ) ']'
            {
            match(input,16,FOLLOW_16_in_ruleRange1228); 

                    createLeafNode(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:629:1: ( (lv_lower_1_0= ruleAtom ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:630:1: (lv_lower_1_0= ruleAtom )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:630:1: (lv_lower_1_0= ruleAtom )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:631:3: lv_lower_1_0= ruleAtom
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRangeAccess().getLowerAtomParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAtom_in_ruleRange1249);
            lv_lower_1_0=ruleAtom();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lower",
            	        		lv_lower_1_0, 
            	        		"Atom", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleRange1259); 

                    createLeafNode(grammarAccess.getRangeAccess().getCommaKeyword_2(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:657:1: ( (lv_upper_3_0= ruleAtom ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:658:1: (lv_upper_3_0= ruleAtom )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:658:1: (lv_upper_3_0= ruleAtom )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:659:3: lv_upper_3_0= ruleAtom
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRangeAccess().getUpperAtomParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAtom_in_ruleRange1280);
            lv_upper_3_0=ruleAtom();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"upper",
            	        		lv_upper_3_0, 
            	        		"Atom", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleRange1290); 

                    createLeafNode(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRange


    // $ANTLR start entryRuleEnumeration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:693:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:694:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:695:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1326);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1336); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:702:1: ruleEnumeration returns [EObject current=null] : ( '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) ( ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedLiterals_1_0 = null;

        EObject lv_ownedLiterals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:707:6: ( ( '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) ( ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* '}' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:708:1: ( '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) ( ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* '}' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:708:1: ( '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) ( ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* '}' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:708:3: '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) ( ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* '}'
            {
            match(input,19,FOLLOW_19_in_ruleEnumeration1371); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:712:1: ( (lv_ownedLiterals_1_0= ruleLiteral ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:713:1: (lv_ownedLiterals_1_0= ruleLiteral )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:713:1: (lv_ownedLiterals_1_0= ruleLiteral )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:714:3: lv_ownedLiterals_1_0= ruleLiteral
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getOwnedLiteralsLiteralParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleEnumeration1392);
            lv_ownedLiterals_1_0=ruleLiteral();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedLiterals",
            	        		lv_ownedLiterals_1_0, 
            	        		"Literal", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:736:2: ( ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:736:4: ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleEnumeration1403); 

            	            createLeafNode(grammarAccess.getEnumerationAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:740:1: ( (lv_ownedLiterals_3_0= ruleLiteral ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:741:1: (lv_ownedLiterals_3_0= ruleLiteral )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:741:1: (lv_ownedLiterals_3_0= ruleLiteral )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:742:3: lv_ownedLiterals_3_0= ruleLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getOwnedLiteralsLiteralParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumeration1424);
            	    lv_ownedLiterals_3_0=ruleLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedLiterals",
            	    	        		lv_ownedLiterals_3_0, 
            	    	        		"Literal", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_ruleEnumeration1436); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRulePrimitiveType
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:776:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:777:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:778:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1472);
            iv_rulePrimitiveType=rulePrimitiveType();
            _fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1482); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveType


    // $ANTLR start rulePrimitiveType
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:785:1: rulePrimitiveType returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeKind ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:790:6: ( ( (lv_name_0_0= rulePrimitiveTypeKind ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:791:1: ( (lv_name_0_0= rulePrimitiveTypeKind ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:791:1: ( (lv_name_0_0= rulePrimitiveTypeKind ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:792:1: (lv_name_0_0= rulePrimitiveTypeKind )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:792:1: (lv_name_0_0= rulePrimitiveTypeKind )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:793:3: lv_name_0_0= rulePrimitiveTypeKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNamePrimitiveTypeKindEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveTypeKind_in_rulePrimitiveType1527);
            lv_name_0_0=rulePrimitiveTypeKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"PrimitiveTypeKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveType


    // $ANTLR start entryRuleLiteral
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:823:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:824:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:825:2: iv_ruleLiteral= ruleLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1562);
            iv_ruleLiteral=ruleLiteral();
            _fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1572); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteral


    // $ANTLR start ruleLiteral
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:832:1: ruleLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:837:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:838:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:838:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:839:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:839:1: (lv_name_0_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:840:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral1613); 

            			createLeafNode(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteral


    // $ANTLR start entryRuleNode
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:870:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:871:2: (iv_ruleNode= ruleNode EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:872:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1653);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1663); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNode


    // $ANTLR start ruleNode
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:879:1: ruleNode returns [EObject current=null] : ( 'node' ( (lv_isMain_1_0= 'Main' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* 'edon' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_isMain_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_ownedSpecifications_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:884:6: ( ( 'node' ( (lv_isMain_1_0= 'Main' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* 'edon' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:885:1: ( 'node' ( (lv_isMain_1_0= 'Main' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* 'edon' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:885:1: ( 'node' ( (lv_isMain_1_0= 'Main' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* 'edon' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:885:3: 'node' ( (lv_isMain_1_0= 'Main' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* 'edon'
            {
            match(input,21,FOLLOW_21_in_ruleNode1698); 

                    createLeafNode(grammarAccess.getNodeAccess().getNodeKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:889:1: ( (lv_isMain_1_0= 'Main' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:890:1: (lv_isMain_1_0= 'Main' )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:890:1: (lv_isMain_1_0= 'Main' )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:891:3: lv_isMain_1_0= 'Main'
                    {
                    lv_isMain_1_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleNode1716); 

                            createLeafNode(grammarAccess.getNodeAccess().getIsMainMainKeyword_1_0(), "isMain"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isMain", true, "Main", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:910:3: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:911:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:911:1: (lv_name_2_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:912:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1747); 

            			createLeafNode(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:934:2: ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=27)||(LA8_0>=30 && LA8_0<=33)||LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:935:1: (lv_ownedSpecifications_3_0= ruleAbstractSpecification )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:935:1: (lv_ownedSpecifications_3_0= ruleAbstractSpecification )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:936:3: lv_ownedSpecifications_3_0= ruleAbstractSpecification
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getOwnedSpecificationsAbstractSpecificationParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractSpecification_in_ruleNode1773);
            	    lv_ownedSpecifications_3_0=ruleAbstractSpecification();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedSpecifications",
            	    	        		lv_ownedSpecifications_3_0, 
            	    	        		"AbstractSpecification", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleNode1784); 

                    createLeafNode(grammarAccess.getNodeAccess().getEdonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNode


    // $ANTLR start entryRuleAbstractSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:970:1: entryRuleAbstractSpecification returns [EObject current=null] : iv_ruleAbstractSpecification= ruleAbstractSpecification EOF ;
    public final EObject entryRuleAbstractSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:971:2: (iv_ruleAbstractSpecification= ruleAbstractSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:972:2: iv_ruleAbstractSpecification= ruleAbstractSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractSpecification_in_entryRuleAbstractSpecification1820);
            iv_ruleAbstractSpecification=ruleAbstractSpecification();
            _fsp--;

             current =iv_ruleAbstractSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSpecification1830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractSpecification


    // $ANTLR start ruleAbstractSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:979:1: ruleAbstractSpecification returns [EObject current=null] : (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification ) ;
    public final EObject ruleAbstractSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_FlowSpecification_0 = null;

        EObject this_StateSpecification_1 = null;

        EObject this_EventSpecification_2 = null;

        EObject this_NodeInstanceSpecification_3 = null;

        EObject this_AssertSpecification_4 = null;

        EObject this_VectorSpecification_5 = null;

        EObject this_TransitionSpecification_6 = null;

        EObject this_InitSpecification_7 = null;

        EObject this_ExternalSpecification_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:984:6: ( (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:985:1: (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:985:1: (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 31:
                {
                alt9=4;
                }
                break;
            case 32:
                {
                alt9=5;
                }
                break;
            case 33:
                {
                alt9=6;
                }
                break;
            case 38:
                {
                alt9=7;
                }
                break;
            case 24:
                {
                alt9=8;
                }
                break;
            case 25:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("985:1: (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:986:5: this_FlowSpecification_0= ruleFlowSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getFlowSpecificationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFlowSpecification_in_ruleAbstractSpecification1877);
                    this_FlowSpecification_0=ruleFlowSpecification();
                    _fsp--;

                     
                            current = this_FlowSpecification_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:996:5: this_StateSpecification_1= ruleStateSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getStateSpecificationParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStateSpecification_in_ruleAbstractSpecification1904);
                    this_StateSpecification_1=ruleStateSpecification();
                    _fsp--;

                     
                            current = this_StateSpecification_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1006:5: this_EventSpecification_2= ruleEventSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getEventSpecificationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEventSpecification_in_ruleAbstractSpecification1931);
                    this_EventSpecification_2=ruleEventSpecification();
                    _fsp--;

                     
                            current = this_EventSpecification_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1016:5: this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getNodeInstanceSpecificationParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNodeInstanceSpecification_in_ruleAbstractSpecification1958);
                    this_NodeInstanceSpecification_3=ruleNodeInstanceSpecification();
                    _fsp--;

                     
                            current = this_NodeInstanceSpecification_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1026:5: this_AssertSpecification_4= ruleAssertSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getAssertSpecificationParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssertSpecification_in_ruleAbstractSpecification1985);
                    this_AssertSpecification_4=ruleAssertSpecification();
                    _fsp--;

                     
                            current = this_AssertSpecification_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1036:5: this_VectorSpecification_5= ruleVectorSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getVectorSpecificationParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVectorSpecification_in_ruleAbstractSpecification2012);
                    this_VectorSpecification_5=ruleVectorSpecification();
                    _fsp--;

                     
                            current = this_VectorSpecification_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1046:5: this_TransitionSpecification_6= ruleTransitionSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getTransitionSpecificationParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleAbstractSpecification2039);
                    this_TransitionSpecification_6=ruleTransitionSpecification();
                    _fsp--;

                     
                            current = this_TransitionSpecification_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1056:5: this_InitSpecification_7= ruleInitSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getInitSpecificationParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInitSpecification_in_ruleAbstractSpecification2066);
                    this_InitSpecification_7=ruleInitSpecification();
                    _fsp--;

                     
                            current = this_InitSpecification_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1066:5: this_ExternalSpecification_8= ruleExternalSpecification
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractSpecificationAccess().getExternalSpecificationParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExternalSpecification_in_ruleAbstractSpecification2093);
                    this_ExternalSpecification_8=ruleExternalSpecification();
                    _fsp--;

                     
                            current = this_ExternalSpecification_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractSpecification


    // $ANTLR start entryRuleVariableAttribute
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1082:1: entryRuleVariableAttribute returns [EObject current=null] : iv_ruleVariableAttribute= ruleVariableAttribute EOF ;
    public final EObject entryRuleVariableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttribute = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1083:2: (iv_ruleVariableAttribute= ruleVariableAttribute EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1084:2: iv_ruleVariableAttribute= ruleVariableAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute2128);
            iv_ruleVariableAttribute=ruleVariableAttribute();
            _fsp--;

             current =iv_ruleVariableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute2138); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableAttribute


    // $ANTLR start ruleVariableAttribute
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1091:1: ruleVariableAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1096:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1097:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1097:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1098:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1098:1: (lv_name_0_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1099:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAttribute2179); 

            			createLeafNode(grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableAttribute


    // $ANTLR start entryRuleInitSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1129:1: entryRuleInitSpecification returns [EObject current=null] : iv_ruleInitSpecification= ruleInitSpecification EOF ;
    public final EObject entryRuleInitSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1130:2: (iv_ruleInitSpecification= ruleInitSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1131:2: iv_ruleInitSpecification= ruleInitSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitSpecification_in_entryRuleInitSpecification2219);
            iv_ruleInitSpecification=ruleInitSpecification();
            _fsp--;

             current =iv_ruleInitSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitSpecification2229); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInitSpecification


    // $ANTLR start ruleInitSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1138:1: ruleInitSpecification returns [EObject current=null] : ( 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )* ) ;
    public final EObject ruleInitSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedInitStatements_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1143:6: ( ( 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1144:1: ( 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1144:1: ( 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1144:3: 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )*
            {
            match(input,24,FOLLOW_24_in_ruleInitSpecification2264); 

                    createLeafNode(grammarAccess.getInitSpecificationAccess().getInitKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1148:1: ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1149:1: (lv_ownedInitStatements_1_0= ruleInitStatement )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1149:1: (lv_ownedInitStatements_1_0= ruleInitStatement )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1150:3: lv_ownedInitStatements_1_0= ruleInitStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInitSpecificationAccess().getOwnedInitStatementsInitStatementParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInitStatement_in_ruleInitSpecification2285);
            	    lv_ownedInitStatements_1_0=ruleInitStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInitSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedInitStatements",
            	    	        		lv_ownedInitStatements_1_0, 
            	    	        		"InitStatement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInitSpecification


    // $ANTLR start entryRuleInitStatement
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1180:1: entryRuleInitStatement returns [EObject current=null] : iv_ruleInitStatement= ruleInitStatement EOF ;
    public final EObject entryRuleInitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitStatement = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1181:2: (iv_ruleInitStatement= ruleInitStatement EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1182:2: iv_ruleInitStatement= ruleInitStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitStatement_in_entryRuleInitStatement2322);
            iv_ruleInitStatement=ruleInitStatement();
            _fsp--;

             current =iv_ruleInitStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitStatement2332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInitStatement


    // $ANTLR start ruleInitStatement
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1189:1: ruleInitStatement returns [EObject current=null] : ( ( (lv_affectation_0_0= ruleAffectation ) ) ';' ) ;
    public final EObject ruleInitStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_affectation_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1194:6: ( ( ( (lv_affectation_0_0= ruleAffectation ) ) ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1195:1: ( ( (lv_affectation_0_0= ruleAffectation ) ) ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1195:1: ( ( (lv_affectation_0_0= ruleAffectation ) ) ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1195:2: ( (lv_affectation_0_0= ruleAffectation ) ) ';'
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1195:2: ( (lv_affectation_0_0= ruleAffectation ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1196:1: (lv_affectation_0_0= ruleAffectation )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1196:1: (lv_affectation_0_0= ruleAffectation )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1197:3: lv_affectation_0_0= ruleAffectation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInitStatementAccess().getAffectationAffectationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAffectation_in_ruleInitStatement2378);
            lv_affectation_0_0=ruleAffectation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"affectation",
            	        		lv_affectation_0_0, 
            	        		"Affectation", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleInitStatement2388); 

                    createLeafNode(grammarAccess.getInitStatementAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInitStatement


    // $ANTLR start entryRuleExternalSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1231:1: entryRuleExternalSpecification returns [EObject current=null] : iv_ruleExternalSpecification= ruleExternalSpecification EOF ;
    public final EObject entryRuleExternalSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1232:2: (iv_ruleExternalSpecification= ruleExternalSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1233:2: iv_ruleExternalSpecification= ruleExternalSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalSpecification_in_entryRuleExternalSpecification2424);
            iv_ruleExternalSpecification=ruleExternalSpecification();
            _fsp--;

             current =iv_ruleExternalSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalSpecification2434); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExternalSpecification


    // $ANTLR start ruleExternalSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1240:1: ruleExternalSpecification returns [EObject current=null] : ( 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )* ) ;
    public final EObject ruleExternalSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedDirectives_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1245:6: ( ( 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1246:1: ( 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1246:1: ( 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1246:3: 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )*
            {
            match(input,25,FOLLOW_25_in_ruleExternalSpecification2469); 

                    createLeafNode(grammarAccess.getExternalSpecificationAccess().getExternKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1250:1: ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SL_COMMENT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1251:1: (lv_ownedDirectives_1_0= ruleExternalDirective )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1251:1: (lv_ownedDirectives_1_0= ruleExternalDirective )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1252:3: lv_ownedDirectives_1_0= ruleExternalDirective
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExternalSpecificationAccess().getOwnedDirectivesExternalDirectiveParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalDirective_in_ruleExternalSpecification2490);
            	    lv_ownedDirectives_1_0=ruleExternalDirective();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getExternalSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedDirectives",
            	    	        		lv_ownedDirectives_1_0, 
            	    	        		"ExternalDirective", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExternalSpecification


    // $ANTLR start entryRuleExternalDirective
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1282:1: entryRuleExternalDirective returns [EObject current=null] : iv_ruleExternalDirective= ruleExternalDirective EOF ;
    public final EObject entryRuleExternalDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDirective = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1283:2: (iv_ruleExternalDirective= ruleExternalDirective EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1284:2: iv_ruleExternalDirective= ruleExternalDirective EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExternalDirectiveRule(), currentNode); 
            pushFollow(FOLLOW_ruleExternalDirective_in_entryRuleExternalDirective2527);
            iv_ruleExternalDirective=ruleExternalDirective();
            _fsp--;

             current =iv_ruleExternalDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalDirective2537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExternalDirective


    // $ANTLR start ruleExternalDirective
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1291:1: ruleExternalDirective returns [EObject current=null] : ( (lv_directive_0_0= RULE_SL_COMMENT ) ) ;
    public final EObject ruleExternalDirective() throws RecognitionException {
        EObject current = null;

        Token lv_directive_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1296:6: ( ( (lv_directive_0_0= RULE_SL_COMMENT ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1297:1: ( (lv_directive_0_0= RULE_SL_COMMENT ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1297:1: ( (lv_directive_0_0= RULE_SL_COMMENT ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1298:1: (lv_directive_0_0= RULE_SL_COMMENT )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1298:1: (lv_directive_0_0= RULE_SL_COMMENT )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1299:3: lv_directive_0_0= RULE_SL_COMMENT
            {
            lv_directive_0_0=(Token)input.LT(1);
            match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleExternalDirective2578); 

            			createLeafNode(grammarAccess.getExternalDirectiveAccess().getDirectiveSL_COMMENTTerminalRuleCall_0(), "directive"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExternalDirectiveRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"directive",
            	        		lv_directive_0_0, 
            	        		"SL_COMMENT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExternalDirective


    // $ANTLR start entryRuleFlowSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1329:1: entryRuleFlowSpecification returns [EObject current=null] : iv_ruleFlowSpecification= ruleFlowSpecification EOF ;
    public final EObject entryRuleFlowSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1330:2: (iv_ruleFlowSpecification= ruleFlowSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1331:2: iv_ruleFlowSpecification= ruleFlowSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFlowSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleFlowSpecification_in_entryRuleFlowSpecification2618);
            iv_ruleFlowSpecification=ruleFlowSpecification();
            _fsp--;

             current =iv_ruleFlowSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowSpecification2628); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFlowSpecification


    // $ANTLR start ruleFlowSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1338:1: ruleFlowSpecification returns [EObject current=null] : ( 'flow' ( (lv_ownedDeclarations_1_0= ruleFlowDeclaration ) )* ) ;
    public final EObject ruleFlowSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedDeclarations_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1343:6: ( ( 'flow' ( (lv_ownedDeclarations_1_0= ruleFlowDeclaration ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1344:1: ( 'flow' ( (lv_ownedDeclarations_1_0= ruleFlowDeclaration ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1344:1: ( 'flow' ( (lv_ownedDeclarations_1_0= ruleFlowDeclaration ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1344:3: 'flow' ( (lv_ownedDeclarations_1_0= ruleFlowDeclaration ) )*
            {
            match(input,26,FOLLOW_26_in_ruleFlowSpecification2663); 

                    createLeafNode(grammarAccess.getFlowSpecificationAccess().getFlowKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1348:1: ( (lv_ownedDeclarations_1_0= ruleFlowDeclaration ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1349:1: (lv_ownedDeclarations_1_0= ruleFlowDeclaration )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1349:1: (lv_ownedDeclarations_1_0= ruleFlowDeclaration )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1350:3: lv_ownedDeclarations_1_0= ruleFlowDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFlowSpecificationAccess().getOwnedDeclarationsFlowDeclarationParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFlowDeclaration_in_ruleFlowSpecification2684);
            	    lv_ownedDeclarations_1_0=ruleFlowDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFlowSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedDeclarations",
            	    	        		lv_ownedDeclarations_1_0, 
            	    	        		"FlowDeclaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFlowSpecification


    // $ANTLR start entryRuleFlowDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1380:1: entryRuleFlowDeclaration returns [EObject current=null] : iv_ruleFlowDeclaration= ruleFlowDeclaration EOF ;
    public final EObject entryRuleFlowDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowDeclaration = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1381:2: (iv_ruleFlowDeclaration= ruleFlowDeclaration EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1382:2: iv_ruleFlowDeclaration= ruleFlowDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFlowDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleFlowDeclaration_in_entryRuleFlowDeclaration2721);
            iv_ruleFlowDeclaration=ruleFlowDeclaration();
            _fsp--;

             current =iv_ruleFlowDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowDeclaration2731); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFlowDeclaration


    // $ANTLR start ruleFlowDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1389:1: ruleFlowDeclaration returns [EObject current=null] : ( ( (lv_ownedFlows_0_0= ruleFlow ) ) ( ',' ( (lv_ownedFlows_2_0= ruleFlow ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_kind_6_0= ruleFlowKind ) ) )? ( ':' ( (lv_attribute_8_0= ruleVariableAttribute ) ) )? ';' ) ;
    public final EObject ruleFlowDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedFlows_0_0 = null;

        EObject lv_ownedFlows_2_0 = null;

        EObject lv_domain_4_0 = null;

        Enumerator lv_kind_6_0 = null;

        EObject lv_attribute_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1394:6: ( ( ( (lv_ownedFlows_0_0= ruleFlow ) ) ( ',' ( (lv_ownedFlows_2_0= ruleFlow ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_kind_6_0= ruleFlowKind ) ) )? ( ':' ( (lv_attribute_8_0= ruleVariableAttribute ) ) )? ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1395:1: ( ( (lv_ownedFlows_0_0= ruleFlow ) ) ( ',' ( (lv_ownedFlows_2_0= ruleFlow ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_kind_6_0= ruleFlowKind ) ) )? ( ':' ( (lv_attribute_8_0= ruleVariableAttribute ) ) )? ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1395:1: ( ( (lv_ownedFlows_0_0= ruleFlow ) ) ( ',' ( (lv_ownedFlows_2_0= ruleFlow ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_kind_6_0= ruleFlowKind ) ) )? ( ':' ( (lv_attribute_8_0= ruleVariableAttribute ) ) )? ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1395:2: ( (lv_ownedFlows_0_0= ruleFlow ) ) ( ',' ( (lv_ownedFlows_2_0= ruleFlow ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_kind_6_0= ruleFlowKind ) ) )? ( ':' ( (lv_attribute_8_0= ruleVariableAttribute ) ) )? ';'
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1395:2: ( (lv_ownedFlows_0_0= ruleFlow ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1396:1: (lv_ownedFlows_0_0= ruleFlow )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1396:1: (lv_ownedFlows_0_0= ruleFlow )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1397:3: lv_ownedFlows_0_0= ruleFlow
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFlowDeclarationAccess().getOwnedFlowsFlowParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFlow_in_ruleFlowDeclaration2777);
            lv_ownedFlows_0_0=ruleFlow();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFlowDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedFlows",
            	        		lv_ownedFlows_0_0, 
            	        		"Flow", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1419:2: ( ',' ( (lv_ownedFlows_2_0= ruleFlow ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1419:4: ',' ( (lv_ownedFlows_2_0= ruleFlow ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleFlowDeclaration2788); 

            	            createLeafNode(grammarAccess.getFlowDeclarationAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1423:1: ( (lv_ownedFlows_2_0= ruleFlow ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1424:1: (lv_ownedFlows_2_0= ruleFlow )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1424:1: (lv_ownedFlows_2_0= ruleFlow )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1425:3: lv_ownedFlows_2_0= ruleFlow
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFlowDeclarationAccess().getOwnedFlowsFlowParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFlow_in_ruleFlowDeclaration2809);
            	    lv_ownedFlows_2_0=ruleFlow();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFlowDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedFlows",
            	    	        		lv_ownedFlows_2_0, 
            	    	        		"Flow", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFlowDeclaration2821); 

                    createLeafNode(grammarAccess.getFlowDeclarationAccess().getColonKeyword_2(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1451:1: ( (lv_domain_4_0= ruleAbstractTypeRef ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1452:1: (lv_domain_4_0= ruleAbstractTypeRef )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1452:1: (lv_domain_4_0= ruleAbstractTypeRef )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1453:3: lv_domain_4_0= ruleAbstractTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFlowDeclarationAccess().getDomainAbstractTypeRefParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractTypeRef_in_ruleFlowDeclaration2842);
            lv_domain_4_0=ruleAbstractTypeRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFlowDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"domain",
            	        		lv_domain_4_0, 
            	        		"AbstractTypeRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1475:2: ( ':' ( (lv_kind_6_0= ruleFlowKind ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=66 && LA14_1<=68)) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1475:4: ':' ( (lv_kind_6_0= ruleFlowKind ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleFlowDeclaration2853); 

                            createLeafNode(grammarAccess.getFlowDeclarationAccess().getColonKeyword_4_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1479:1: ( (lv_kind_6_0= ruleFlowKind ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1480:1: (lv_kind_6_0= ruleFlowKind )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1480:1: (lv_kind_6_0= ruleFlowKind )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1481:3: lv_kind_6_0= ruleFlowKind
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFlowDeclarationAccess().getKindFlowKindEnumRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFlowKind_in_ruleFlowDeclaration2874);
                    lv_kind_6_0=ruleFlowKind();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFlowDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"kind",
                    	        		lv_kind_6_0, 
                    	        		"FlowKind", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1503:4: ( ':' ( (lv_attribute_8_0= ruleVariableAttribute ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1503:6: ':' ( (lv_attribute_8_0= ruleVariableAttribute ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleFlowDeclaration2887); 

                            createLeafNode(grammarAccess.getFlowDeclarationAccess().getColonKeyword_5_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1507:1: ( (lv_attribute_8_0= ruleVariableAttribute ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1508:1: (lv_attribute_8_0= ruleVariableAttribute )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1508:1: (lv_attribute_8_0= ruleVariableAttribute )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1509:3: lv_attribute_8_0= ruleVariableAttribute
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFlowDeclarationAccess().getAttributeVariableAttributeParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleFlowDeclaration2908);
                    lv_attribute_8_0=ruleVariableAttribute();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFlowDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"attribute",
                    	        		lv_attribute_8_0, 
                    	        		"VariableAttribute", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleFlowDeclaration2920); 

                    createLeafNode(grammarAccess.getFlowDeclarationAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFlowDeclaration


    // $ANTLR start entryRuleFlow
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1543:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1544:2: (iv_ruleFlow= ruleFlow EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1545:2: iv_ruleFlow= ruleFlow EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFlowRule(), currentNode); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow2956);
            iv_ruleFlow=ruleFlow();
            _fsp--;

             current =iv_ruleFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow2966); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFlow


    // $ANTLR start ruleFlow
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1552:1: ruleFlow returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1557:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1558:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1558:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1559:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1559:1: (lv_name_0_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1560:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlow3007); 

            			createLeafNode(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFlowRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFlow


    // $ANTLR start entryRuleEventSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1590:1: entryRuleEventSpecification returns [EObject current=null] : iv_ruleEventSpecification= ruleEventSpecification EOF ;
    public final EObject entryRuleEventSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1591:2: (iv_ruleEventSpecification= ruleEventSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1592:2: iv_ruleEventSpecification= ruleEventSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEventSpecification_in_entryRuleEventSpecification3047);
            iv_ruleEventSpecification=ruleEventSpecification();
            _fsp--;

             current =iv_ruleEventSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpecification3057); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEventSpecification


    // $ANTLR start ruleEventSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1599:1: ruleEventSpecification returns [EObject current=null] : ( 'event' ( (lv_ownedEventDeclarations_1_0= ruleEventDeclaration ) )* ) ;
    public final EObject ruleEventSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedEventDeclarations_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1604:6: ( ( 'event' ( (lv_ownedEventDeclarations_1_0= ruleEventDeclaration ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1605:1: ( 'event' ( (lv_ownedEventDeclarations_1_0= ruleEventDeclaration ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1605:1: ( 'event' ( (lv_ownedEventDeclarations_1_0= ruleEventDeclaration ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1605:3: 'event' ( (lv_ownedEventDeclarations_1_0= ruleEventDeclaration ) )*
            {
            match(input,27,FOLLOW_27_in_ruleEventSpecification3092); 

                    createLeafNode(grammarAccess.getEventSpecificationAccess().getEventKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1609:1: ( (lv_ownedEventDeclarations_1_0= ruleEventDeclaration ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1610:1: (lv_ownedEventDeclarations_1_0= ruleEventDeclaration )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1610:1: (lv_ownedEventDeclarations_1_0= ruleEventDeclaration )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1611:3: lv_ownedEventDeclarations_1_0= ruleEventDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEventSpecificationAccess().getOwnedEventDeclarationsEventDeclarationParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventDeclaration_in_ruleEventSpecification3113);
            	    lv_ownedEventDeclarations_1_0=ruleEventDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEventSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedEventDeclarations",
            	    	        		lv_ownedEventDeclarations_1_0, 
            	    	        		"EventDeclaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEventSpecification


    // $ANTLR start entryRuleEventDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1641:1: entryRuleEventDeclaration returns [EObject current=null] : iv_ruleEventDeclaration= ruleEventDeclaration EOF ;
    public final EObject entryRuleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclaration = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1642:2: (iv_ruleEventDeclaration= ruleEventDeclaration EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1643:2: iv_ruleEventDeclaration= ruleEventDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration3150);
            iv_ruleEventDeclaration=ruleEventDeclaration();
            _fsp--;

             current =iv_ruleEventDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclaration3160); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEventDeclaration


    // $ANTLR start ruleEventDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1650:1: ruleEventDeclaration returns [EObject current=null] : ( ( (lv_ownedEvents_0_0= ruleEvent ) ) ( ',' ( (lv_ownedEvents_2_0= ruleEvent ) ) )* ( ':' ( (lv_attribute_4_0= ruleVariableAttribute ) ) )? ';' ) ;
    public final EObject ruleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedEvents_0_0 = null;

        EObject lv_ownedEvents_2_0 = null;

        EObject lv_attribute_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1655:6: ( ( ( (lv_ownedEvents_0_0= ruleEvent ) ) ( ',' ( (lv_ownedEvents_2_0= ruleEvent ) ) )* ( ':' ( (lv_attribute_4_0= ruleVariableAttribute ) ) )? ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1656:1: ( ( (lv_ownedEvents_0_0= ruleEvent ) ) ( ',' ( (lv_ownedEvents_2_0= ruleEvent ) ) )* ( ':' ( (lv_attribute_4_0= ruleVariableAttribute ) ) )? ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1656:1: ( ( (lv_ownedEvents_0_0= ruleEvent ) ) ( ',' ( (lv_ownedEvents_2_0= ruleEvent ) ) )* ( ':' ( (lv_attribute_4_0= ruleVariableAttribute ) ) )? ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1656:2: ( (lv_ownedEvents_0_0= ruleEvent ) ) ( ',' ( (lv_ownedEvents_2_0= ruleEvent ) ) )* ( ':' ( (lv_attribute_4_0= ruleVariableAttribute ) ) )? ';'
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1656:2: ( (lv_ownedEvents_0_0= ruleEvent ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1657:1: (lv_ownedEvents_0_0= ruleEvent )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1657:1: (lv_ownedEvents_0_0= ruleEvent )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1658:3: lv_ownedEvents_0_0= ruleEvent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEventDeclarationAccess().getOwnedEventsEventParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleEventDeclaration3206);
            lv_ownedEvents_0_0=ruleEvent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEventDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedEvents",
            	        		lv_ownedEvents_0_0, 
            	        		"Event", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1680:2: ( ',' ( (lv_ownedEvents_2_0= ruleEvent ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1680:4: ',' ( (lv_ownedEvents_2_0= ruleEvent ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleEventDeclaration3217); 

            	            createLeafNode(grammarAccess.getEventDeclarationAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1684:1: ( (lv_ownedEvents_2_0= ruleEvent ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1685:1: (lv_ownedEvents_2_0= ruleEvent )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1685:1: (lv_ownedEvents_2_0= ruleEvent )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1686:3: lv_ownedEvents_2_0= ruleEvent
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEventDeclarationAccess().getOwnedEventsEventParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleEventDeclaration3238);
            	    lv_ownedEvents_2_0=ruleEvent();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEventDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedEvents",
            	    	        		lv_ownedEvents_2_0, 
            	    	        		"Event", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1708:4: ( ':' ( (lv_attribute_4_0= ruleVariableAttribute ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1708:6: ':' ( (lv_attribute_4_0= ruleVariableAttribute ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleEventDeclaration3251); 

                            createLeafNode(grammarAccess.getEventDeclarationAccess().getColonKeyword_2_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1712:1: ( (lv_attribute_4_0= ruleVariableAttribute ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1713:1: (lv_attribute_4_0= ruleVariableAttribute )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1713:1: (lv_attribute_4_0= ruleVariableAttribute )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1714:3: lv_attribute_4_0= ruleVariableAttribute
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEventDeclarationAccess().getAttributeVariableAttributeParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleEventDeclaration3272);
                    lv_attribute_4_0=ruleVariableAttribute();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEventDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"attribute",
                    	        		lv_attribute_4_0, 
                    	        		"VariableAttribute", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleEventDeclaration3284); 

                    createLeafNode(grammarAccess.getEventDeclarationAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEventDeclaration


    // $ANTLR start entryRuleEvent
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1748:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1749:2: (iv_ruleEvent= ruleEvent EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1750:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent3320);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent3330); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1757:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '[' ( (lv_ownedPriority_2_0= rulePriority ) ) ']' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_ownedPriority_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1762:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '[' ( (lv_ownedPriority_2_0= rulePriority ) ) ']' )? ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1763:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '[' ( (lv_ownedPriority_2_0= rulePriority ) ) ']' )? )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1763:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '[' ( (lv_ownedPriority_2_0= rulePriority ) ) ']' )? )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1763:2: ( (lv_name_0_0= RULE_ID ) ) ( '[' ( (lv_ownedPriority_2_0= rulePriority ) ) ']' )?
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1763:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1764:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1764:1: (lv_name_0_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1765:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent3372); 

            			createLeafNode(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1787:2: ( '[' ( (lv_ownedPriority_2_0= rulePriority ) ) ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1787:4: '[' ( (lv_ownedPriority_2_0= rulePriority ) ) ']'
                    {
                    match(input,16,FOLLOW_16_in_ruleEvent3388); 

                            createLeafNode(grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1791:1: ( (lv_ownedPriority_2_0= rulePriority ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1792:1: (lv_ownedPriority_2_0= rulePriority )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1792:1: (lv_ownedPriority_2_0= rulePriority )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1793:3: lv_ownedPriority_2_0= rulePriority
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEventAccess().getOwnedPriorityPriorityParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePriority_in_ruleEvent3409);
                    lv_ownedPriority_2_0=rulePriority();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEventRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ownedPriority",
                    	        		lv_ownedPriority_2_0, 
                    	        		"Priority", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleEvent3419); 

                            createLeafNode(grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEvent


    // $ANTLR start entryRulePriority
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1827:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1828:2: (iv_rulePriority= rulePriority EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1829:2: iv_rulePriority= rulePriority EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPriorityRule(), currentNode); 
            pushFollow(FOLLOW_rulePriority_in_entryRulePriority3457);
            iv_rulePriority=rulePriority();
            _fsp--;

             current =iv_rulePriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriority3467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePriority


    // $ANTLR start rulePriority
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1836:1: rulePriority returns [EObject current=null] : ( ( '!' | 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1841:6: ( ( ( '!' | 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1842:1: ( ( '!' | 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1842:1: ( ( '!' | 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1842:2: ( '!' | 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1842:2: ( '!' | 'priority' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1842:2: ( '!' | 'priority' )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1842:4: '!'
                    {
                    match(input,28,FOLLOW_28_in_rulePriority3503); 

                            createLeafNode(grammarAccess.getPriorityAccess().getExclamationMarkKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1847:7: 'priority'
                    {
                    match(input,29,FOLLOW_29_in_rulePriority3519); 

                            createLeafNode(grammarAccess.getPriorityAccess().getPriorityKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1851:2: ( (lv_ownedExpression_2_0= ruleAbstractExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1852:1: (lv_ownedExpression_2_0= ruleAbstractExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1852:1: (lv_ownedExpression_2_0= ruleAbstractExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1853:3: lv_ownedExpression_2_0= ruleAbstractExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPriorityAccess().getOwnedExpressionAbstractExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractExpression_in_rulePriority3541);
            lv_ownedExpression_2_0=ruleAbstractExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPriorityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ownedExpression",
            	        		lv_ownedExpression_2_0, 
            	        		"AbstractExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePriority


    // $ANTLR start entryRuleStateSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1883:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1884:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1885:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3577);
            iv_ruleStateSpecification=ruleStateSpecification();
            _fsp--;

             current =iv_ruleStateSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStateSpecification


    // $ANTLR start ruleStateSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1892:1: ruleStateSpecification returns [EObject current=null] : ( 'state' ( (lv_ownedStateDeclarations_1_0= ruleStateDeclaration ) )* ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedStateDeclarations_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1897:6: ( ( 'state' ( (lv_ownedStateDeclarations_1_0= ruleStateDeclaration ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1898:1: ( 'state' ( (lv_ownedStateDeclarations_1_0= ruleStateDeclaration ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1898:1: ( 'state' ( (lv_ownedStateDeclarations_1_0= ruleStateDeclaration ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1898:3: 'state' ( (lv_ownedStateDeclarations_1_0= ruleStateDeclaration ) )*
            {
            match(input,30,FOLLOW_30_in_ruleStateSpecification3622); 

                    createLeafNode(grammarAccess.getStateSpecificationAccess().getStateKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1902:1: ( (lv_ownedStateDeclarations_1_0= ruleStateDeclaration ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1903:1: (lv_ownedStateDeclarations_1_0= ruleStateDeclaration )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1903:1: (lv_ownedStateDeclarations_1_0= ruleStateDeclaration )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1904:3: lv_ownedStateDeclarations_1_0= ruleStateDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateSpecificationAccess().getOwnedStateDeclarationsStateDeclarationParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateDeclaration_in_ruleStateSpecification3643);
            	    lv_ownedStateDeclarations_1_0=ruleStateDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedStateDeclarations",
            	    	        		lv_ownedStateDeclarations_1_0, 
            	    	        		"StateDeclaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStateSpecification


    // $ANTLR start entryRuleStateDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1934:1: entryRuleStateDeclaration returns [EObject current=null] : iv_ruleStateDeclaration= ruleStateDeclaration EOF ;
    public final EObject entryRuleStateDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDeclaration = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1935:2: (iv_ruleStateDeclaration= ruleStateDeclaration EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1936:2: iv_ruleStateDeclaration= ruleStateDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateDeclaration_in_entryRuleStateDeclaration3680);
            iv_ruleStateDeclaration=ruleStateDeclaration();
            _fsp--;

             current =iv_ruleStateDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateDeclaration3690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStateDeclaration


    // $ANTLR start ruleStateDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1943:1: ruleStateDeclaration returns [EObject current=null] : ( ( (lv_ownedStates_0_0= ruleState ) ) ( ',' ( (lv_ownedStates_2_0= ruleState ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? ';' ) ;
    public final EObject ruleStateDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedStates_0_0 = null;

        EObject lv_ownedStates_2_0 = null;

        EObject lv_domain_4_0 = null;

        EObject lv_attribute_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1948:6: ( ( ( (lv_ownedStates_0_0= ruleState ) ) ( ',' ( (lv_ownedStates_2_0= ruleState ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1949:1: ( ( (lv_ownedStates_0_0= ruleState ) ) ( ',' ( (lv_ownedStates_2_0= ruleState ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1949:1: ( ( (lv_ownedStates_0_0= ruleState ) ) ( ',' ( (lv_ownedStates_2_0= ruleState ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1949:2: ( (lv_ownedStates_0_0= ruleState ) ) ( ',' ( (lv_ownedStates_2_0= ruleState ) ) )* ':' ( (lv_domain_4_0= ruleAbstractTypeRef ) ) ( ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? ';'
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1949:2: ( (lv_ownedStates_0_0= ruleState ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1950:1: (lv_ownedStates_0_0= ruleState )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1950:1: (lv_ownedStates_0_0= ruleState )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1951:3: lv_ownedStates_0_0= ruleState
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStateDeclarationAccess().getOwnedStatesStateParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleState_in_ruleStateDeclaration3736);
            lv_ownedStates_0_0=ruleState();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedStates",
            	        		lv_ownedStates_0_0, 
            	        		"State", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1973:2: ( ',' ( (lv_ownedStates_2_0= ruleState ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1973:4: ',' ( (lv_ownedStates_2_0= ruleState ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleStateDeclaration3747); 

            	            createLeafNode(grammarAccess.getStateDeclarationAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1977:1: ( (lv_ownedStates_2_0= ruleState ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1978:1: (lv_ownedStates_2_0= ruleState )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1978:1: (lv_ownedStates_2_0= ruleState )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:1979:3: lv_ownedStates_2_0= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateDeclarationAccess().getOwnedStatesStateParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStateDeclaration3768);
            	    lv_ownedStates_2_0=ruleState();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedStates",
            	    	        		lv_ownedStates_2_0, 
            	    	        		"State", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleStateDeclaration3780); 

                    createLeafNode(grammarAccess.getStateDeclarationAccess().getColonKeyword_2(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2005:1: ( (lv_domain_4_0= ruleAbstractTypeRef ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2006:1: (lv_domain_4_0= ruleAbstractTypeRef )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2006:1: (lv_domain_4_0= ruleAbstractTypeRef )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2007:3: lv_domain_4_0= ruleAbstractTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStateDeclarationAccess().getDomainAbstractTypeRefParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractTypeRef_in_ruleStateDeclaration3801);
            lv_domain_4_0=ruleAbstractTypeRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"domain",
            	        		lv_domain_4_0, 
            	        		"AbstractTypeRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2029:2: ( ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2029:4: ':' ( (lv_attribute_6_0= ruleVariableAttribute ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleStateDeclaration3812); 

                            createLeafNode(grammarAccess.getStateDeclarationAccess().getColonKeyword_4_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2033:1: ( (lv_attribute_6_0= ruleVariableAttribute ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2034:1: (lv_attribute_6_0= ruleVariableAttribute )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2034:1: (lv_attribute_6_0= ruleVariableAttribute )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2035:3: lv_attribute_6_0= ruleVariableAttribute
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStateDeclarationAccess().getAttributeVariableAttributeParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleStateDeclaration3833);
                    lv_attribute_6_0=ruleVariableAttribute();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStateDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"attribute",
                    	        		lv_attribute_6_0, 
                    	        		"VariableAttribute", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleStateDeclaration3845); 

                    createLeafNode(grammarAccess.getStateDeclarationAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStateDeclaration


    // $ANTLR start entryRuleState
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2069:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2070:2: (iv_ruleState= ruleState EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2071:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3881);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3891); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2078:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2083:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2084:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2084:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2085:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2085:1: (lv_name_0_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2086:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3932); 

            			createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleAbstractTypeRef
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2116:1: entryRuleAbstractTypeRef returns [EObject current=null] : iv_ruleAbstractTypeRef= ruleAbstractTypeRef EOF ;
    public final EObject entryRuleAbstractTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTypeRef = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2117:2: (iv_ruleAbstractTypeRef= ruleAbstractTypeRef EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2118:2: iv_ruleAbstractTypeRef= ruleAbstractTypeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractTypeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractTypeRef_in_entryRuleAbstractTypeRef3972);
            iv_ruleAbstractTypeRef=ruleAbstractTypeRef();
            _fsp--;

             current =iv_ruleAbstractTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractTypeRef3982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractTypeRef


    // $ANTLR start ruleAbstractTypeRef
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2125:1: ruleAbstractTypeRef returns [EObject current=null] : (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain ) ;
    public final EObject ruleAbstractTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_DomainRef_0 = null;

        EObject this_AbstractDomain_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2130:6: ( (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2131:1: (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2131:1: (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==16||LA24_0==19||(LA24_0>=64 && LA24_0<=65)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2131:1: (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2132:5: this_DomainRef_0= ruleDomainRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractTypeRefAccess().getDomainRefParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainRef_in_ruleAbstractTypeRef4029);
                    this_DomainRef_0=ruleDomainRef();
                    _fsp--;

                     
                            current = this_DomainRef_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2142:5: this_AbstractDomain_1= ruleAbstractDomain
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractTypeRefAccess().getAbstractDomainParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbstractDomain_in_ruleAbstractTypeRef4056);
                    this_AbstractDomain_1=ruleAbstractDomain();
                    _fsp--;

                     
                            current = this_AbstractDomain_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractTypeRef


    // $ANTLR start entryRuleDomainRef
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2158:1: entryRuleDomainRef returns [EObject current=null] : iv_ruleDomainRef= ruleDomainRef EOF ;
    public final EObject entryRuleDomainRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainRef = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2159:2: (iv_ruleDomainRef= ruleDomainRef EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2160:2: iv_ruleDomainRef= ruleDomainRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainRef_in_entryRuleDomainRef4091);
            iv_ruleDomainRef=ruleDomainRef();
            _fsp--;

             current =iv_ruleDomainRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainRef4101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDomainRef


    // $ANTLR start ruleDomainRef
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2167:1: ruleDomainRef returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleDomainRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2172:6: ( ( ( RULE_ID ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2173:1: ( ( RULE_ID ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2173:1: ( ( RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2174:1: ( RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2174:1: ( RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2175:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDomainRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainRef4143); 

            		createLeafNode(grammarAccess.getDomainRefAccess().getReferenceDomainCrossReference_0(), "reference"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDomainRef


    // $ANTLR start entryRuleNodeInstanceSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2195:1: entryRuleNodeInstanceSpecification returns [EObject current=null] : iv_ruleNodeInstanceSpecification= ruleNodeInstanceSpecification EOF ;
    public final EObject entryRuleNodeInstanceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeInstanceSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2196:2: (iv_ruleNodeInstanceSpecification= ruleNodeInstanceSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2197:2: iv_ruleNodeInstanceSpecification= ruleNodeInstanceSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeInstanceSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeInstanceSpecification_in_entryRuleNodeInstanceSpecification4178);
            iv_ruleNodeInstanceSpecification=ruleNodeInstanceSpecification();
            _fsp--;

             current =iv_ruleNodeInstanceSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeInstanceSpecification4188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNodeInstanceSpecification


    // $ANTLR start ruleNodeInstanceSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2204:1: ruleNodeInstanceSpecification returns [EObject current=null] : ( 'sub' ( (lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration ) )* ) ;
    public final EObject ruleNodeInstanceSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedNodeInstanceDeclarations_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2209:6: ( ( 'sub' ( (lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2210:1: ( 'sub' ( (lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2210:1: ( 'sub' ( (lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2210:3: 'sub' ( (lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration ) )*
            {
            match(input,31,FOLLOW_31_in_ruleNodeInstanceSpecification4223); 

                    createLeafNode(grammarAccess.getNodeInstanceSpecificationAccess().getSubKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2214:1: ( (lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2215:1: (lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2215:1: (lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2216:3: lv_ownedNodeInstanceDeclarations_1_0= ruleNodeInstanceDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNodeInstanceSpecificationAccess().getOwnedNodeInstanceDeclarationsNodeInstanceDeclarationParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeInstanceDeclaration_in_ruleNodeInstanceSpecification4244);
            	    lv_ownedNodeInstanceDeclarations_1_0=ruleNodeInstanceDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNodeInstanceSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedNodeInstanceDeclarations",
            	    	        		lv_ownedNodeInstanceDeclarations_1_0, 
            	    	        		"NodeInstanceDeclaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNodeInstanceSpecification


    // $ANTLR start entryRuleNodeInstanceDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2246:1: entryRuleNodeInstanceDeclaration returns [EObject current=null] : iv_ruleNodeInstanceDeclaration= ruleNodeInstanceDeclaration EOF ;
    public final EObject entryRuleNodeInstanceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeInstanceDeclaration = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2247:2: (iv_ruleNodeInstanceDeclaration= ruleNodeInstanceDeclaration EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2248:2: iv_ruleNodeInstanceDeclaration= ruleNodeInstanceDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeInstanceDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeInstanceDeclaration_in_entryRuleNodeInstanceDeclaration4281);
            iv_ruleNodeInstanceDeclaration=ruleNodeInstanceDeclaration();
            _fsp--;

             current =iv_ruleNodeInstanceDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeInstanceDeclaration4291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNodeInstanceDeclaration


    // $ANTLR start ruleNodeInstanceDeclaration
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2255:1: ruleNodeInstanceDeclaration returns [EObject current=null] : ( ( (lv_ownedNodeInstances_0_0= ruleNodeInstance ) ) ( ',' ( (lv_ownedNodeInstances_2_0= ruleNodeInstance ) ) )* ':' ( ( RULE_ID ) ) ';' ) ;
    public final EObject ruleNodeInstanceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedNodeInstances_0_0 = null;

        EObject lv_ownedNodeInstances_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2260:6: ( ( ( (lv_ownedNodeInstances_0_0= ruleNodeInstance ) ) ( ',' ( (lv_ownedNodeInstances_2_0= ruleNodeInstance ) ) )* ':' ( ( RULE_ID ) ) ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2261:1: ( ( (lv_ownedNodeInstances_0_0= ruleNodeInstance ) ) ( ',' ( (lv_ownedNodeInstances_2_0= ruleNodeInstance ) ) )* ':' ( ( RULE_ID ) ) ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2261:1: ( ( (lv_ownedNodeInstances_0_0= ruleNodeInstance ) ) ( ',' ( (lv_ownedNodeInstances_2_0= ruleNodeInstance ) ) )* ':' ( ( RULE_ID ) ) ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2261:2: ( (lv_ownedNodeInstances_0_0= ruleNodeInstance ) ) ( ',' ( (lv_ownedNodeInstances_2_0= ruleNodeInstance ) ) )* ':' ( ( RULE_ID ) ) ';'
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2261:2: ( (lv_ownedNodeInstances_0_0= ruleNodeInstance ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2262:1: (lv_ownedNodeInstances_0_0= ruleNodeInstance )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2262:1: (lv_ownedNodeInstances_0_0= ruleNodeInstance )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2263:3: lv_ownedNodeInstances_0_0= ruleNodeInstance
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNodeInstanceDeclarationAccess().getOwnedNodeInstancesNodeInstanceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNodeInstance_in_ruleNodeInstanceDeclaration4337);
            lv_ownedNodeInstances_0_0=ruleNodeInstance();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNodeInstanceDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedNodeInstances",
            	        		lv_ownedNodeInstances_0_0, 
            	        		"NodeInstance", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2285:2: ( ',' ( (lv_ownedNodeInstances_2_0= ruleNodeInstance ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2285:4: ',' ( (lv_ownedNodeInstances_2_0= ruleNodeInstance ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleNodeInstanceDeclaration4348); 

            	            createLeafNode(grammarAccess.getNodeInstanceDeclarationAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2289:1: ( (lv_ownedNodeInstances_2_0= ruleNodeInstance ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2290:1: (lv_ownedNodeInstances_2_0= ruleNodeInstance )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2290:1: (lv_ownedNodeInstances_2_0= ruleNodeInstance )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2291:3: lv_ownedNodeInstances_2_0= ruleNodeInstance
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNodeInstanceDeclarationAccess().getOwnedNodeInstancesNodeInstanceParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeInstance_in_ruleNodeInstanceDeclaration4369);
            	    lv_ownedNodeInstances_2_0=ruleNodeInstance();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNodeInstanceDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedNodeInstances",
            	    	        		lv_ownedNodeInstances_2_0, 
            	    	        		"NodeInstance", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleNodeInstanceDeclaration4381); 

                    createLeafNode(grammarAccess.getNodeInstanceDeclarationAccess().getColonKeyword_2(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2317:1: ( ( RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2318:1: ( RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2318:1: ( RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2319:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getNodeInstanceDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeInstanceDeclaration4399); 

            		createLeafNode(grammarAccess.getNodeInstanceDeclarationAccess().getNodeTypeNodeCrossReference_3_0(), "nodeType"); 
            	

            }


            }

            match(input,12,FOLLOW_12_in_ruleNodeInstanceDeclaration4409); 

                    createLeafNode(grammarAccess.getNodeInstanceDeclarationAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNodeInstanceDeclaration


    // $ANTLR start entryRuleNodeInstance
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2343:1: entryRuleNodeInstance returns [EObject current=null] : iv_ruleNodeInstance= ruleNodeInstance EOF ;
    public final EObject entryRuleNodeInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeInstance = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2344:2: (iv_ruleNodeInstance= ruleNodeInstance EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2345:2: iv_ruleNodeInstance= ruleNodeInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeInstance_in_entryRuleNodeInstance4445);
            iv_ruleNodeInstance=ruleNodeInstance();
            _fsp--;

             current =iv_ruleNodeInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeInstance4455); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNodeInstance


    // $ANTLR start ruleNodeInstance
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2352:1: ruleNodeInstance returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNodeInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2357:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2358:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2358:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2359:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2359:1: (lv_name_0_0= RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2360:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeInstance4496); 

            			createLeafNode(grammarAccess.getNodeInstanceAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNodeInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNodeInstance


    // $ANTLR start entryRuleAssertSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2390:1: entryRuleAssertSpecification returns [EObject current=null] : iv_ruleAssertSpecification= ruleAssertSpecification EOF ;
    public final EObject entryRuleAssertSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2391:2: (iv_ruleAssertSpecification= ruleAssertSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2392:2: iv_ruleAssertSpecification= ruleAssertSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssertSpecification_in_entryRuleAssertSpecification4536);
            iv_ruleAssertSpecification=ruleAssertSpecification();
            _fsp--;

             current =iv_ruleAssertSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertSpecification4546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssertSpecification


    // $ANTLR start ruleAssertSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2399:1: ruleAssertSpecification returns [EObject current=null] : ( 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )* ) ;
    public final EObject ruleAssertSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedAsserts_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2404:6: ( ( 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2405:1: ( 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2405:1: ( 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2405:3: 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )*
            {
            match(input,32,FOLLOW_32_in_ruleAssertSpecification4581); 

                    createLeafNode(grammarAccess.getAssertSpecificationAccess().getAssertKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2409:1: ( (lv_ownedAsserts_1_0= ruleAssert ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=RULE_STRING && LA27_0<=RULE_INT)||LA27_0==42||LA27_0==44||(LA27_0>=57 && LA27_0<=59)||(LA27_0>=62 && LA27_0<=63)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2410:1: (lv_ownedAsserts_1_0= ruleAssert )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2410:1: (lv_ownedAsserts_1_0= ruleAssert )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2411:3: lv_ownedAsserts_1_0= ruleAssert
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAssertSpecificationAccess().getOwnedAssertsAssertParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssert_in_ruleAssertSpecification4602);
            	    lv_ownedAsserts_1_0=ruleAssert();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAssertSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAsserts",
            	    	        		lv_ownedAsserts_1_0, 
            	    	        		"Assert", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssertSpecification


    // $ANTLR start entryRuleAssert
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2441:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2442:2: (iv_ruleAssert= ruleAssert EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2443:2: iv_ruleAssert= ruleAssert EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssert_in_entryRuleAssert4639);
            iv_ruleAssert=ruleAssert();
            _fsp--;

             current =iv_ruleAssert; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert4649); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssert


    // $ANTLR start ruleAssert
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2450:1: ruleAssert returns [EObject current=null] : ( ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) ';' ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpressions_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2455:6: ( ( ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2456:1: ( ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2456:1: ( ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2456:2: ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) ';'
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2456:2: ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2457:1: (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2457:1: (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2458:3: lv_ownedExpressions_0_0= ruleAbstractBooleanExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssertAccess().getOwnedExpressionsAbstractBooleanExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractBooleanExpression_in_ruleAssert4695);
            lv_ownedExpressions_0_0=ruleAbstractBooleanExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssertRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedExpressions",
            	        		lv_ownedExpressions_0_0, 
            	        		"AbstractBooleanExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleAssert4705); 

                    createLeafNode(grammarAccess.getAssertAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssert


    // $ANTLR start entryRuleVectorSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2492:1: entryRuleVectorSpecification returns [EObject current=null] : iv_ruleVectorSpecification= ruleVectorSpecification EOF ;
    public final EObject entryRuleVectorSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2493:2: (iv_ruleVectorSpecification= ruleVectorSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2494:2: iv_ruleVectorSpecification= ruleVectorSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVectorSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleVectorSpecification_in_entryRuleVectorSpecification4741);
            iv_ruleVectorSpecification=ruleVectorSpecification();
            _fsp--;

             current =iv_ruleVectorSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorSpecification4751); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVectorSpecification


    // $ANTLR start ruleVectorSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2501:1: ruleVectorSpecification returns [EObject current=null] : ( 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )* ) ;
    public final EObject ruleVectorSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedVectors_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2506:6: ( ( 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2507:1: ( 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2507:1: ( 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2507:3: 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )*
            {
            match(input,33,FOLLOW_33_in_ruleVectorSpecification4786); 

                    createLeafNode(grammarAccess.getVectorSpecificationAccess().getSyncKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2511:1: ( (lv_ownedVectors_1_0= ruleVector ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==34) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2512:1: (lv_ownedVectors_1_0= ruleVector )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2512:1: (lv_ownedVectors_1_0= ruleVector )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2513:3: lv_ownedVectors_1_0= ruleVector
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getVectorSpecificationAccess().getOwnedVectorsVectorParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVector_in_ruleVectorSpecification4807);
            	    lv_ownedVectors_1_0=ruleVector();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getVectorSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedVectors",
            	    	        		lv_ownedVectors_1_0, 
            	    	        		"Vector", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVectorSpecification


    // $ANTLR start entryRuleVector
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2543:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2544:2: (iv_ruleVector= ruleVector EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2545:2: iv_ruleVector= ruleVector EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVectorRule(), currentNode); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector4844);
            iv_ruleVector=ruleVector();
            _fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector4854); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVector


    // $ANTLR start ruleVector
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2552:1: ruleVector returns [EObject current=null] : ( '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) ( ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* '>' ( '[' ( (lv_cardinality_6_0= ruleCardinality ) ) ']' )? ';' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedParameters_1_0 = null;

        EObject lv_ownedParameters_3_0 = null;

        EObject lv_cardinality_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2557:6: ( ( '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) ( ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* '>' ( '[' ( (lv_cardinality_6_0= ruleCardinality ) ) ']' )? ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2558:1: ( '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) ( ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* '>' ( '[' ( (lv_cardinality_6_0= ruleCardinality ) ) ']' )? ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2558:1: ( '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) ( ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* '>' ( '[' ( (lv_cardinality_6_0= ruleCardinality ) ) ']' )? ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2558:3: '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) ( ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* '>' ( '[' ( (lv_cardinality_6_0= ruleCardinality ) ) ']' )? ';'
            {
            match(input,34,FOLLOW_34_in_ruleVector4889); 

                    createLeafNode(grammarAccess.getVectorAccess().getLessThanSignKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2562:1: ( (lv_ownedParameters_1_0= ruleVectorParameter ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2563:1: (lv_ownedParameters_1_0= ruleVectorParameter )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2563:1: (lv_ownedParameters_1_0= ruleVectorParameter )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2564:3: lv_ownedParameters_1_0= ruleVectorParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVectorAccess().getOwnedParametersVectorParameterParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVectorParameter_in_ruleVector4910);
            lv_ownedParameters_1_0=ruleVectorParameter();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVectorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"ownedParameters",
            	        		lv_ownedParameters_1_0, 
            	        		"VectorParameter", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2586:2: ( ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==17) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2586:4: ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleVector4921); 

            	            createLeafNode(grammarAccess.getVectorAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2590:1: ( (lv_ownedParameters_3_0= ruleVectorParameter ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2591:1: (lv_ownedParameters_3_0= ruleVectorParameter )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2591:1: (lv_ownedParameters_3_0= ruleVectorParameter )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2592:3: lv_ownedParameters_3_0= ruleVectorParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getVectorAccess().getOwnedParametersVectorParameterParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVectorParameter_in_ruleVector4942);
            	    lv_ownedParameters_3_0=ruleVectorParameter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getVectorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedParameters",
            	    	        		lv_ownedParameters_3_0, 
            	    	        		"VectorParameter", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,35,FOLLOW_35_in_ruleVector4954); 

                    createLeafNode(grammarAccess.getVectorAccess().getGreaterThanSignKeyword_3(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2618:1: ( '[' ( (lv_cardinality_6_0= ruleCardinality ) ) ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2618:3: '[' ( (lv_cardinality_6_0= ruleCardinality ) ) ']'
                    {
                    match(input,16,FOLLOW_16_in_ruleVector4965); 

                            createLeafNode(grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_4_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2622:1: ( (lv_cardinality_6_0= ruleCardinality ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2623:1: (lv_cardinality_6_0= ruleCardinality )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2623:1: (lv_cardinality_6_0= ruleCardinality )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2624:3: lv_cardinality_6_0= ruleCardinality
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVectorAccess().getCardinalityCardinalityParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleVector4986);
                    lv_cardinality_6_0=ruleCardinality();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVectorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"cardinality",
                    	        		lv_cardinality_6_0, 
                    	        		"Cardinality", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleVector4996); 

                            createLeafNode(grammarAccess.getVectorAccess().getRightSquareBracketKeyword_4_2(), null); 
                        

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleVector5008); 

                    createLeafNode(grammarAccess.getVectorAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVector


    // $ANTLR start entryRuleVectorParameter
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2662:1: entryRuleVectorParameter returns [EObject current=null] : iv_ruleVectorParameter= ruleVectorParameter EOF ;
    public final EObject entryRuleVectorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorParameter = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2663:2: (iv_ruleVectorParameter= ruleVectorParameter EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2664:2: iv_ruleVectorParameter= ruleVectorParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVectorParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleVectorParameter_in_entryRuleVectorParameter5044);
            iv_ruleVectorParameter=ruleVectorParameter();
            _fsp--;

             current =iv_ruleVectorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorParameter5054); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVectorParameter


    // $ANTLR start ruleVectorParameter
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2671:1: ruleVectorParameter returns [EObject current=null] : ( ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )? ) ;
    public final EObject ruleVectorParameter() throws RecognitionException {
        EObject current = null;

        Token lv_isRequired_1_0=null;
        EObject lv_eventParameter_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2676:6: ( ( ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )? ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2677:1: ( ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )? )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2677:1: ( ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )? )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2677:2: ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )?
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2677:2: ( (lv_eventParameter_0_0= ruleEventRef ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2678:1: (lv_eventParameter_0_0= ruleEventRef )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2678:1: (lv_eventParameter_0_0= ruleEventRef )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2679:3: lv_eventParameter_0_0= ruleEventRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVectorParameterAccess().getEventParameterEventRefParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEventRef_in_ruleVectorParameter5100);
            lv_eventParameter_0_0=ruleEventRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVectorParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"eventParameter",
            	        		lv_eventParameter_0_0, 
            	        		"EventRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2701:2: ( (lv_isRequired_1_0= '?' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2702:1: (lv_isRequired_1_0= '?' )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2702:1: (lv_isRequired_1_0= '?' )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2703:3: lv_isRequired_1_0= '?'
                    {
                    lv_isRequired_1_0=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleVectorParameter5118); 

                            createLeafNode(grammarAccess.getVectorParameterAccess().getIsRequiredQuestionMarkKeyword_1_0(), "isRequired"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVectorParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isRequired", true, "?", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVectorParameter


    // $ANTLR start entryRuleCardinality
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2730:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2731:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2732:2: iv_ruleCardinality= ruleCardinality EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCardinalityRule(), currentNode); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality5168);
            iv_ruleCardinality=ruleCardinality();
            _fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality5178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCardinality


    // $ANTLR start ruleCardinality
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2739:1: ruleCardinality returns [EObject current=null] : ( ( '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | ( '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | ( '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2744:6: ( ( ( '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | ( '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | ( '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2745:1: ( ( '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | ( '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | ( '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2745:1: ( ( '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | ( '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | ( '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt32=1;
                }
                break;
            case 37:
                {
                alt32=2;
                }
                break;
            case 13:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2745:1: ( ( '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | ( '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | ( '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2745:2: ( '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2745:2: ( '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2745:4: '>' ( (lv_expression_1_0= ruleAbstractExpression ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleCardinality5214); 

                            createLeafNode(grammarAccess.getCardinalityAccess().getGreaterThanSignKeyword_0_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2749:1: ( (lv_expression_1_0= ruleAbstractExpression ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2750:1: (lv_expression_1_0= ruleAbstractExpression )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2750:1: (lv_expression_1_0= ruleAbstractExpression )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2751:3: lv_expression_1_0= ruleAbstractExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCardinalityAccess().getExpressionAbstractExpressionParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractExpression_in_ruleCardinality5235);
                    lv_expression_1_0=ruleAbstractExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCardinalityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_1_0, 
                    	        		"AbstractExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2774:6: ( '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2774:6: ( '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2774:8: '>=' ( (lv_expression_3_0= ruleAbstractExpression ) )
                    {
                    match(input,37,FOLLOW_37_in_ruleCardinality5253); 

                            createLeafNode(grammarAccess.getCardinalityAccess().getGreaterThanSignEqualsSignKeyword_1_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2778:1: ( (lv_expression_3_0= ruleAbstractExpression ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2779:1: (lv_expression_3_0= ruleAbstractExpression )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2779:1: (lv_expression_3_0= ruleAbstractExpression )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2780:3: lv_expression_3_0= ruleAbstractExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCardinalityAccess().getExpressionAbstractExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractExpression_in_ruleCardinality5274);
                    lv_expression_3_0=ruleAbstractExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCardinalityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_3_0, 
                    	        		"AbstractExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2803:6: ( '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2803:6: ( '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2803:8: '=' ( (lv_expression_5_0= ruleAbstractExpression ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleCardinality5292); 

                            createLeafNode(grammarAccess.getCardinalityAccess().getEqualsSignKeyword_2_0(), null); 
                        
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2807:1: ( (lv_expression_5_0= ruleAbstractExpression ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2808:1: (lv_expression_5_0= ruleAbstractExpression )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2808:1: (lv_expression_5_0= ruleAbstractExpression )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2809:3: lv_expression_5_0= ruleAbstractExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCardinalityAccess().getExpressionAbstractExpressionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractExpression_in_ruleCardinality5313);
                    lv_expression_5_0=ruleAbstractExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCardinalityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expression",
                    	        		lv_expression_5_0, 
                    	        		"AbstractExpression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCardinality


    // $ANTLR start entryRuleTransitionSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2839:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2840:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2841:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransitionSpecificationRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification5350);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();
            _fsp--;

             current =iv_ruleTransitionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification5360); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransitionSpecification


    // $ANTLR start ruleTransitionSpecification
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2848:1: ruleTransitionSpecification returns [EObject current=null] : ( 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )* ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedTransitionTransitions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2853:6: ( ( 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2854:1: ( 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2854:1: ( 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2854:3: 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )*
            {
            match(input,38,FOLLOW_38_in_ruleTransitionSpecification5395); 

                    createLeafNode(grammarAccess.getTransitionSpecificationAccess().getTransKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2858:1: ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||(LA33_0>=RULE_STRING && LA33_0<=RULE_INT)||LA33_0==42||LA33_0==44||(LA33_0>=57 && LA33_0<=59)||(LA33_0>=62 && LA33_0<=63)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2859:1: (lv_ownedTransitionTransitions_1_0= ruleTransition )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2859:1: (lv_ownedTransitionTransitions_1_0= ruleTransition )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2860:3: lv_ownedTransitionTransitions_1_0= ruleTransition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTransitionSpecificationAccess().getOwnedTransitionTransitionsTransitionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleTransitionSpecification5416);
            	    lv_ownedTransitionTransitions_1_0=ruleTransition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTransitionSpecificationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedTransitionTransitions",
            	    	        		lv_ownedTransitionTransitions_1_0, 
            	    	        		"Transition", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransitionSpecification


    // $ANTLR start entryRuleTransition
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2890:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2891:2: (iv_ruleTransition= ruleTransition EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2892:2: iv_ruleTransition= ruleTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition5453);
            iv_ruleTransition=ruleTransition();
            _fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition5463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2899:1: ruleTransition returns [EObject current=null] : ( ( (lv_ownedExpresion_0_0= ruleAbstractExpression ) ) '|-' ( ( RULE_ID ) ) '->' ( ( (lv_ownedAffectations_4_0= ruleAffectation ) ) ( ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) ) )* )* ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpresion_0_0 = null;

        EObject lv_ownedAffectations_4_0 = null;

        EObject lv_ownedAffectations_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2904:6: ( ( ( (lv_ownedExpresion_0_0= ruleAbstractExpression ) ) '|-' ( ( RULE_ID ) ) '->' ( ( (lv_ownedAffectations_4_0= ruleAffectation ) ) ( ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) ) )* )* ';' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2905:1: ( ( (lv_ownedExpresion_0_0= ruleAbstractExpression ) ) '|-' ( ( RULE_ID ) ) '->' ( ( (lv_ownedAffectations_4_0= ruleAffectation ) ) ( ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) ) )* )* ';' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2905:1: ( ( (lv_ownedExpresion_0_0= ruleAbstractExpression ) ) '|-' ( ( RULE_ID ) ) '->' ( ( (lv_ownedAffectations_4_0= ruleAffectation ) ) ( ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) ) )* )* ';' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2905:2: ( (lv_ownedExpresion_0_0= ruleAbstractExpression ) ) '|-' ( ( RULE_ID ) ) '->' ( ( (lv_ownedAffectations_4_0= ruleAffectation ) ) ( ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) ) )* )* ';'
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2905:2: ( (lv_ownedExpresion_0_0= ruleAbstractExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2906:1: (lv_ownedExpresion_0_0= ruleAbstractExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2906:1: (lv_ownedExpresion_0_0= ruleAbstractExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2907:3: lv_ownedExpresion_0_0= ruleAbstractExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getOwnedExpresionAbstractExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractExpression_in_ruleTransition5509);
            lv_ownedExpresion_0_0=ruleAbstractExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ownedExpresion",
            	        		lv_ownedExpresion_0_0, 
            	        		"AbstractExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,39,FOLLOW_39_in_ruleTransition5519); 

                    createLeafNode(grammarAccess.getTransitionAccess().getVerticalLineHyphenMinusKeyword_1(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2933:1: ( ( RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2934:1: ( RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2934:1: ( RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2935:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition5537); 

            		createLeafNode(grammarAccess.getTransitionAccess().getEventEventCrossReference_2_0(), "event"); 
            	

            }


            }

            match(input,40,FOLLOW_40_in_ruleTransition5547); 

                    createLeafNode(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2951:1: ( ( (lv_ownedAffectations_4_0= ruleAffectation ) ) ( ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) ) )* )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2951:2: ( (lv_ownedAffectations_4_0= ruleAffectation ) ) ( ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) ) )*
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2951:2: ( (lv_ownedAffectations_4_0= ruleAffectation ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2952:1: (lv_ownedAffectations_4_0= ruleAffectation )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2952:1: (lv_ownedAffectations_4_0= ruleAffectation )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2953:3: lv_ownedAffectations_4_0= ruleAffectation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getOwnedAffectationsAffectationParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAffectation_in_ruleTransition5569);
            	    lv_ownedAffectations_4_0=ruleAffectation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedAffectations",
            	    	        		lv_ownedAffectations_4_0, 
            	    	        		"Affectation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2975:2: ( ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==17) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2975:4: ',' ( (lv_ownedAffectations_6_0= ruleAffectation ) )
            	    	    {
            	    	    match(input,17,FOLLOW_17_in_ruleTransition5580); 

            	    	            createLeafNode(grammarAccess.getTransitionAccess().getCommaKeyword_4_1_0(), null); 
            	    	        
            	    	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2979:1: ( (lv_ownedAffectations_6_0= ruleAffectation ) )
            	    	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2980:1: (lv_ownedAffectations_6_0= ruleAffectation )
            	    	    {
            	    	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2980:1: (lv_ownedAffectations_6_0= ruleAffectation )
            	    	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:2981:3: lv_ownedAffectations_6_0= ruleAffectation
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getOwnedAffectationsAffectationParserRuleCall_4_1_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAffectation_in_ruleTransition5601);
            	    	    lv_ownedAffectations_6_0=ruleAffectation();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"ownedAffectations",
            	    	    	        		lv_ownedAffectations_6_0, 
            	    	    	        		"Affectation", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleTransition5615); 

                    createLeafNode(grammarAccess.getTransitionAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleAffectation
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3015:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3016:2: (iv_ruleAffectation= ruleAffectation EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3017:2: iv_ruleAffectation= ruleAffectation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAffectationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation5651);
            iv_ruleAffectation=ruleAffectation();
            _fsp--;

             current =iv_ruleAffectation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation5661); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAffectation


    // $ANTLR start ruleAffectation
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3024:1: ruleAffectation returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedExpression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3029:6: ( ( ( ( RULE_ID ) ) ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3030:1: ( ( ( RULE_ID ) ) ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3030:1: ( ( ( RULE_ID ) ) ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3030:2: ( ( RULE_ID ) ) ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3030:2: ( ( RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3031:1: ( RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3031:1: ( RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3032:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAffectationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAffectation5704); 

            		createLeafNode(grammarAccess.getAffectationAccess().getStateStateCrossReference_0_0(), "state"); 
            	

            }


            }

            match(input,41,FOLLOW_41_in_ruleAffectation5714); 

                    createLeafNode(grammarAccess.getAffectationAccess().getColonEqualsSignKeyword_1(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3048:1: ( (lv_ownedExpression_2_0= ruleAbstractExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3049:1: (lv_ownedExpression_2_0= ruleAbstractExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3049:1: (lv_ownedExpression_2_0= ruleAbstractExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3050:3: lv_ownedExpression_2_0= ruleAbstractExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAffectationAccess().getOwnedExpressionAbstractExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractExpression_in_ruleAffectation5735);
            lv_ownedExpression_2_0=ruleAbstractExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAffectationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ownedExpression",
            	        		lv_ownedExpression_2_0, 
            	        		"AbstractExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAffectation


    // $ANTLR start entryRuleAbstractExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3080:1: entryRuleAbstractExpression returns [EObject current=null] : iv_ruleAbstractExpression= ruleAbstractExpression EOF ;
    public final EObject entryRuleAbstractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExpression = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3081:2: (iv_ruleAbstractExpression= ruleAbstractExpression EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3082:2: iv_ruleAbstractExpression= ruleAbstractExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractExpression_in_entryRuleAbstractExpression5771);
            iv_ruleAbstractExpression=ruleAbstractExpression();
            _fsp--;

             current =iv_ruleAbstractExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractExpression5781); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractExpression


    // $ANTLR start ruleAbstractExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3089:1: ruleAbstractExpression returns [EObject current=null] : (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression ) ;
    public final EObject ruleAbstractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfThenElse_0 = null;

        EObject this_Switch_1 = null;

        EObject this_Expression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3094:6: ( (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3095:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3095:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt36=1;
                }
                break;
            case 42:
                {
                alt36=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 57:
            case 58:
            case 59:
            case 62:
            case 63:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3095:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression )", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3096:5: this_IfThenElse_0= ruleIfThenElse
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractExpressionAccess().getIfThenElseParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleAbstractExpression5828);
                    this_IfThenElse_0=ruleIfThenElse();
                    _fsp--;

                     
                            current = this_IfThenElse_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3106:5: this_Switch_1= ruleSwitch
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractExpressionAccess().getSwitchParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleAbstractExpression5855);
                    this_Switch_1=ruleSwitch();
                    _fsp--;

                     
                            current = this_Switch_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3116:5: this_Expression_2= ruleExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractExpressionAccess().getExpressionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractExpression5882);
                    this_Expression_2=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractExpression


    // $ANTLR start entryRuleAbstractBooleanExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3132:1: entryRuleAbstractBooleanExpression returns [EObject current=null] : iv_ruleAbstractBooleanExpression= ruleAbstractBooleanExpression EOF ;
    public final EObject entryRuleAbstractBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBooleanExpression = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3133:2: (iv_ruleAbstractBooleanExpression= ruleAbstractBooleanExpression EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3134:2: iv_ruleAbstractBooleanExpression= ruleAbstractBooleanExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractBooleanExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractBooleanExpression_in_entryRuleAbstractBooleanExpression5917);
            iv_ruleAbstractBooleanExpression=ruleAbstractBooleanExpression();
            _fsp--;

             current =iv_ruleAbstractBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBooleanExpression5927); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractBooleanExpression


    // $ANTLR start ruleAbstractBooleanExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3141:1: ruleAbstractBooleanExpression returns [EObject current=null] : (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression ) ;
    public final EObject ruleAbstractBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfThenElse_0 = null;

        EObject this_Switch_1 = null;

        EObject this_BooleanExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3146:6: ( (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3147:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3147:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt37=1;
                }
                break;
            case 42:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 57:
            case 58:
            case 59:
            case 62:
            case 63:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3147:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3148:5: this_IfThenElse_0= ruleIfThenElse
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBooleanExpressionAccess().getIfThenElseParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleAbstractBooleanExpression5974);
                    this_IfThenElse_0=ruleIfThenElse();
                    _fsp--;

                     
                            current = this_IfThenElse_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3158:5: this_Switch_1= ruleSwitch
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBooleanExpressionAccess().getSwitchParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleAbstractBooleanExpression6001);
                    this_Switch_1=ruleSwitch();
                    _fsp--;

                     
                            current = this_Switch_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3168:5: this_BooleanExpression_2= ruleBooleanExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBooleanExpressionAccess().getBooleanExpressionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAbstractBooleanExpression6028);
                    this_BooleanExpression_2=ruleBooleanExpression();
                    _fsp--;

                     
                            current = this_BooleanExpression_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractBooleanExpression


    // $ANTLR start entryRuleSwitch
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3184:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3185:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3186:2: iv_ruleSwitch= ruleSwitch EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSwitchRule(), currentNode); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch6063);
            iv_ruleSwitch=ruleSwitch();
            _fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch6073); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSwitch


    // $ANTLR start ruleSwitch
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3193:1: ruleSwitch returns [EObject current=null] : ( 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* 'else' ( (lv_default_3_0= ruleExpression ) ) '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedCases_1_0 = null;

        EObject lv_default_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3198:6: ( ( 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* 'else' ( (lv_default_3_0= ruleExpression ) ) '}' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3199:1: ( 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* 'else' ( (lv_default_3_0= ruleExpression ) ) '}' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3199:1: ( 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* 'else' ( (lv_default_3_0= ruleExpression ) ) '}' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3199:3: 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* 'else' ( (lv_default_3_0= ruleExpression ) ) '}'
            {
            match(input,42,FOLLOW_42_in_ruleSwitch6108); 

                    createLeafNode(grammarAccess.getSwitchAccess().getCaseKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3203:1: ( (lv_ownedCases_1_0= ruleCaseExpression ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||(LA38_0>=RULE_STRING && LA38_0<=RULE_INT)||(LA38_0>=57 && LA38_0<=59)||(LA38_0>=62 && LA38_0<=63)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3204:1: (lv_ownedCases_1_0= ruleCaseExpression )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3204:1: (lv_ownedCases_1_0= ruleCaseExpression )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3205:3: lv_ownedCases_1_0= ruleCaseExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSwitchAccess().getOwnedCasesCaseExpressionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCaseExpression_in_ruleSwitch6129);
            	    lv_ownedCases_1_0=ruleCaseExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSwitchRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"ownedCases",
            	    	        		lv_ownedCases_1_0, 
            	    	        		"CaseExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            match(input,43,FOLLOW_43_in_ruleSwitch6140); 

                    createLeafNode(grammarAccess.getSwitchAccess().getElseKeyword_2(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3231:1: ( (lv_default_3_0= ruleExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3232:1: (lv_default_3_0= ruleExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3232:1: (lv_default_3_0= ruleExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3233:3: lv_default_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSwitchAccess().getDefaultExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitch6161);
            lv_default_3_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSwitchRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"default",
            	        		lv_default_3_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleSwitch6171); 

                    createLeafNode(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSwitch


    // $ANTLR start entryRuleCaseExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3267:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3268:2: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3269:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCaseExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression6207);
            iv_ruleCaseExpression=ruleCaseExpression();
            _fsp--;

             current =iv_ruleCaseExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression6217); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCaseExpression


    // $ANTLR start ruleCaseExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3276:1: ruleCaseExpression returns [EObject current=null] : ( ( (lv_condition_0_0= ruleBooleanExpression ) ) ':' ( (lv_body_2_0= ruleExpression ) ) ',' ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;

        EObject lv_body_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3281:6: ( ( ( (lv_condition_0_0= ruleBooleanExpression ) ) ':' ( (lv_body_2_0= ruleExpression ) ) ',' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3282:1: ( ( (lv_condition_0_0= ruleBooleanExpression ) ) ':' ( (lv_body_2_0= ruleExpression ) ) ',' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3282:1: ( ( (lv_condition_0_0= ruleBooleanExpression ) ) ':' ( (lv_body_2_0= ruleExpression ) ) ',' )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3282:2: ( (lv_condition_0_0= ruleBooleanExpression ) ) ':' ( (lv_body_2_0= ruleExpression ) ) ','
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3282:2: ( (lv_condition_0_0= ruleBooleanExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3283:1: (lv_condition_0_0= ruleBooleanExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3283:1: (lv_condition_0_0= ruleBooleanExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3284:3: lv_condition_0_0= ruleBooleanExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCaseExpressionAccess().getConditionBooleanExpressionParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleCaseExpression6263);
            lv_condition_0_0=ruleBooleanExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCaseExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"condition",
            	        		lv_condition_0_0, 
            	        		"BooleanExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleCaseExpression6273); 

                    createLeafNode(grammarAccess.getCaseExpressionAccess().getColonKeyword_1(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3310:1: ( (lv_body_2_0= ruleExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3311:1: (lv_body_2_0= ruleExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3311:1: (lv_body_2_0= ruleExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3312:3: lv_body_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCaseExpressionAccess().getBodyExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseExpression6294);
            lv_body_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCaseExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"body",
            	        		lv_body_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleCaseExpression6304); 

                    createLeafNode(grammarAccess.getCaseExpressionAccess().getCommaKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCaseExpression


    // $ANTLR start entryRuleIfThenElse
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3346:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3347:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3348:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfThenElseRule(), currentNode); 
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse6340);
            iv_ruleIfThenElse=ruleIfThenElse();
            _fsp--;

             current =iv_ruleIfThenElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse6350); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfThenElse


    // $ANTLR start ruleIfThenElse
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3355:1: ruleIfThenElse returns [EObject current=null] : ( 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) ) ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_1_0 = null;

        EObject lv_then_3_1 = null;

        EObject lv_then_3_2 = null;

        EObject lv_else_5_1 = null;

        EObject lv_else_5_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3360:6: ( ( 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3361:1: ( 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3361:1: ( 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3361:3: 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) )
            {
            match(input,44,FOLLOW_44_in_ruleIfThenElse6385); 

                    createLeafNode(grammarAccess.getIfThenElseAccess().getIfKeyword_0(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3365:1: ( (lv_condition_1_0= ruleBooleanExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3366:1: (lv_condition_1_0= ruleBooleanExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3366:1: (lv_condition_1_0= ruleBooleanExpression )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3367:3: lv_condition_1_0= ruleBooleanExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfThenElseAccess().getConditionBooleanExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleIfThenElse6406);
            lv_condition_1_0=ruleBooleanExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIfThenElseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"condition",
            	        		lv_condition_1_0, 
            	        		"BooleanExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,45,FOLLOW_45_in_ruleIfThenElse6416); 

                    createLeafNode(grammarAccess.getIfThenElseAccess().getThenKeyword_2(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3393:1: ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3394:1: ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3394:1: ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3395:1: (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3395:1: (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID||(LA39_0>=RULE_STRING && LA39_0<=RULE_INT)||(LA39_0>=57 && LA39_0<=59)||(LA39_0>=62 && LA39_0<=63)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3395:1: (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression )", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3396:3: lv_then_3_1= ruleSwitch
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfThenElseAccess().getThenSwitchParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSwitch_in_ruleIfThenElse6439);
                    lv_then_3_1=ruleSwitch();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfThenElseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"then",
                    	        		lv_then_3_1, 
                    	        		"Switch", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3417:8: lv_then_3_2= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfThenElseAccess().getThenExpressionParserRuleCall_3_0_1(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElse6458);
                    lv_then_3_2=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfThenElseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"then",
                    	        		lv_then_3_2, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }

            match(input,43,FOLLOW_43_in_ruleIfThenElse6471); 

                    createLeafNode(grammarAccess.getIfThenElseAccess().getElseKeyword_4(), null); 
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3445:1: ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3446:1: ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3446:1: ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3447:1: (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3447:1: (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID||(LA40_0>=RULE_STRING && LA40_0<=RULE_INT)||(LA40_0>=57 && LA40_0<=59)||(LA40_0>=62 && LA40_0<=63)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3447:1: (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3448:3: lv_else_5_1= ruleSwitch
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfThenElseAccess().getElseSwitchParserRuleCall_5_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSwitch_in_ruleIfThenElse6494);
                    lv_else_5_1=ruleSwitch();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfThenElseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"else",
                    	        		lv_else_5_1, 
                    	        		"Switch", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3469:8: lv_else_5_2= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfThenElseAccess().getElseExpressionParserRuleCall_5_0_1(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElse6513);
                    lv_else_5_2=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfThenElseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"else",
                    	        		lv_else_5_2, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfThenElse


    // $ANTLR start entryRuleExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3501:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3502:2: (iv_ruleExpression= ruleExpression EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3503:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6552);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6562); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3510:1: ruleExpression returns [EObject current=null] : (this_Minus_0= ruleMinus ( () '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Minus_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3515:6: ( (this_Minus_0= ruleMinus ( () '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3516:1: (this_Minus_0= ruleMinus ( () '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3516:1: (this_Minus_0= ruleMinus ( () '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3517:5: this_Minus_0= ruleMinus ( () '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getMinusParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMinus_in_ruleExpression6609);
            this_Minus_0=ruleMinus();
            _fsp--;

             
                    current = this_Minus_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3525:1: ( () '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==46) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3525:2: () '+' ( (lv_rightOperand_3_0= ruleMinus ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3525:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3526:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getExpressionAccess().getAdditionLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getExpressionAccess().getAdditionLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,46,FOLLOW_46_in_ruleExpression6628); 

            	            createLeafNode(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3545:1: ( (lv_rightOperand_3_0= ruleMinus ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3546:1: (lv_rightOperand_3_0= ruleMinus )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3546:1: (lv_rightOperand_3_0= ruleMinus )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3547:3: lv_rightOperand_3_0= ruleMinus
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightOperandMinusParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMinus_in_ruleExpression6649);
            	    lv_rightOperand_3_0=ruleMinus();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"Minus", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleMinus
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3577:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3578:2: (iv_ruleMinus= ruleMinus EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3579:2: iv_ruleMinus= ruleMinus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMinusRule(), currentNode); 
            pushFollow(FOLLOW_ruleMinus_in_entryRuleMinus6687);
            iv_ruleMinus=ruleMinus();
            _fsp--;

             current =iv_ruleMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinus6697); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMinus


    // $ANTLR start ruleMinus
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3586:1: ruleMinus returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3591:6: ( (this_Multiplication_0= ruleMultiplication ( () '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3592:1: (this_Multiplication_0= ruleMultiplication ( () '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3592:1: (this_Multiplication_0= ruleMultiplication ( () '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3593:5: this_Multiplication_0= ruleMultiplication ( () '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMinusAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleMinus6744);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3601:1: ( () '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==47) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3601:2: () '-' ( (lv_rightOperand_3_0= ruleMultiplication ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3601:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3602:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getMinusAccess().getMinusLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getMinusAccess().getMinusLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,47,FOLLOW_47_in_ruleMinus6763); 

            	            createLeafNode(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3621:1: ( (lv_rightOperand_3_0= ruleMultiplication ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3622:1: (lv_rightOperand_3_0= ruleMultiplication )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3622:1: (lv_rightOperand_3_0= ruleMultiplication )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3623:3: lv_rightOperand_3_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMinusAccess().getRightOperandMultiplicationParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleMinus6784);
            	    lv_rightOperand_3_0=ruleMultiplication();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMinusRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"Multiplication", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMinus


    // $ANTLR start entryRuleMultiplication
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3653:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3654:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3655:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication6822);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication6832); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3662:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_Division_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3667:6: ( (this_Division_0= ruleDivision ( () '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3668:1: (this_Division_0= ruleDivision ( () '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3668:1: (this_Division_0= ruleDivision ( () '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3669:5: this_Division_0= ruleDivision ( () '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication6879);
            this_Division_0=ruleDivision();
            _fsp--;

             
                    current = this_Division_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3677:1: ( () '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==48) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3677:2: () '*' ( (lv_rightOperand_3_0= ruleDivision ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3677:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3678:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getMultiplicationAccess().getMultiplicationLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getMultiplicationLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,48,FOLLOW_48_in_ruleMultiplication6898); 

            	            createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3697:1: ( (lv_rightOperand_3_0= ruleDivision ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3698:1: (lv_rightOperand_3_0= ruleDivision )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3698:1: (lv_rightOperand_3_0= ruleDivision )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3699:3: lv_rightOperand_3_0= ruleDivision
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightOperandDivisionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication6919);
            	    lv_rightOperand_3_0=ruleDivision();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"Division", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRuleDivision
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3729:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3730:2: (iv_ruleDivision= ruleDivision EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3731:2: iv_ruleDivision= ruleDivision EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDivisionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision6957);
            iv_ruleDivision=ruleDivision();
            _fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision6967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDivision


    // $ANTLR start ruleDivision
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3738:1: ruleDivision returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression ( () '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3743:6: ( (this_BooleanExpression_0= ruleBooleanExpression ( () '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3744:1: (this_BooleanExpression_0= ruleBooleanExpression ( () '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3744:1: (this_BooleanExpression_0= ruleBooleanExpression ( () '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3745:5: this_BooleanExpression_0= ruleBooleanExpression ( () '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getDivisionAccess().getBooleanExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleDivision7014);
            this_BooleanExpression_0=ruleBooleanExpression();
            _fsp--;

             
                    current = this_BooleanExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3753:1: ( () '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==49) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3753:2: () '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3753:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3754:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getDivisionAccess().getDivisionLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getDivisionAccess().getDivisionLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,49,FOLLOW_49_in_ruleDivision7033); 

            	            createLeafNode(grammarAccess.getDivisionAccess().getSolidusKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3773:1: ( (lv_rightOperand_3_0= ruleBooleanExpression ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3774:1: (lv_rightOperand_3_0= ruleBooleanExpression )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3774:1: (lv_rightOperand_3_0= ruleBooleanExpression )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3775:3: lv_rightOperand_3_0= ruleBooleanExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDivisionAccess().getRightOperandBooleanExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleDivision7054);
            	    lv_rightOperand_3_0=ruleBooleanExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDivisionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"BooleanExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDivision


    // $ANTLR start entryRuleBooleanExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3805:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3806:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3807:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression7092);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression7102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3814:1: ruleBooleanExpression returns [EObject current=null] : this_And_0= ruleAnd ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3819:6: (this_And_0= ruleAnd )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3821:5: this_And_0= ruleAnd
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleBooleanExpression7148);
            this_And_0=ruleAnd();
            _fsp--;

             
                    current = this_And_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleAnd
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3837:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3838:2: (iv_ruleAnd= ruleAnd EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3839:2: iv_ruleAnd= ruleAnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd7182);
            iv_ruleAnd=ruleAnd();
            _fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd7192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnd


    // $ANTLR start ruleAnd
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3846:1: ruleAnd returns [EObject current=null] : (this_Or_0= ruleOr ( () ( 'and' | '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject lv_rightOperand_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3851:6: ( (this_Or_0= ruleOr ( () ( 'and' | '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3852:1: (this_Or_0= ruleOr ( () ( 'and' | '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3852:1: (this_Or_0= ruleOr ( () ( 'and' | '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3853:5: this_Or_0= ruleOr ( () ( 'and' | '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndAccess().getOrParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleAnd7239);
            this_Or_0=ruleOr();
            _fsp--;

             
                    current = this_Or_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3861:1: ( () ( 'and' | '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=50 && LA46_0<=51)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3861:2: () ( 'and' | '&' ) ( (lv_rightOperand_4_0= ruleOr ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3861:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3862:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getAndAccess().getAndLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getAndAccess().getAndLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3877:2: ( 'and' | '&' )
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==50) ) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==51) ) {
            	        alt45=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("3877:2: ( 'and' | '&' )", 45, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3877:4: 'and'
            	            {
            	            match(input,50,FOLLOW_50_in_ruleAnd7259); 

            	                    createLeafNode(grammarAccess.getAndAccess().getAndKeyword_1_1_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3882:7: '&'
            	            {
            	            match(input,51,FOLLOW_51_in_ruleAnd7275); 

            	                    createLeafNode(grammarAccess.getAndAccess().getAmpersandKeyword_1_1_1(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3886:2: ( (lv_rightOperand_4_0= ruleOr ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3887:1: (lv_rightOperand_4_0= ruleOr )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3887:1: (lv_rightOperand_4_0= ruleOr )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3888:3: lv_rightOperand_4_0= ruleOr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndAccess().getRightOperandOrParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOr_in_ruleAnd7297);
            	    lv_rightOperand_4_0=ruleOr();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_4_0, 
            	    	        		"Or", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnd


    // $ANTLR start entryRuleOr
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3918:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3919:2: (iv_ruleOr= ruleOr EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3920:2: iv_ruleOr= ruleOr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrRule(), currentNode); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr7335);
            iv_ruleOr=ruleOr();
            _fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr7345); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOr


    // $ANTLR start ruleOr
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3927:1: ruleOr returns [EObject current=null] : (this_Equal_0= ruleEqual ( () ( 'or' | '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        EObject this_Equal_0 = null;

        EObject lv_rightOperand_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3932:6: ( (this_Equal_0= ruleEqual ( () ( 'or' | '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3933:1: (this_Equal_0= ruleEqual ( () ( 'or' | '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3933:1: (this_Equal_0= ruleEqual ( () ( 'or' | '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3934:5: this_Equal_0= ruleEqual ( () ( 'or' | '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrAccess().getEqualParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleEqual_in_ruleOr7392);
            this_Equal_0=ruleEqual();
            _fsp--;

             
                    current = this_Equal_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3942:1: ( () ( 'or' | '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=52 && LA48_0<=53)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3942:2: () ( 'or' | '|' ) ( (lv_rightOperand_4_0= ruleEqual ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3942:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3943:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getOrAccess().getOrLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getOrAccess().getOrLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3958:2: ( 'or' | '|' )
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==52) ) {
            	        alt47=1;
            	    }
            	    else if ( (LA47_0==53) ) {
            	        alt47=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("3958:2: ( 'or' | '|' )", 47, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3958:4: 'or'
            	            {
            	            match(input,52,FOLLOW_52_in_ruleOr7412); 

            	                    createLeafNode(grammarAccess.getOrAccess().getOrKeyword_1_1_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3963:7: '|'
            	            {
            	            match(input,53,FOLLOW_53_in_ruleOr7428); 

            	                    createLeafNode(grammarAccess.getOrAccess().getVerticalLineKeyword_1_1_1(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3967:2: ( (lv_rightOperand_4_0= ruleEqual ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3968:1: (lv_rightOperand_4_0= ruleEqual )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3968:1: (lv_rightOperand_4_0= ruleEqual )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3969:3: lv_rightOperand_4_0= ruleEqual
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrAccess().getRightOperandEqualParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqual_in_ruleOr7450);
            	    lv_rightOperand_4_0=ruleEqual();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_4_0, 
            	    	        		"Equal", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOr


    // $ANTLR start entryRuleEqual
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:3999:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4000:2: (iv_ruleEqual= ruleEqual EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4001:2: iv_ruleEqual= ruleEqual EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEqualRule(), currentNode); 
            pushFollow(FOLLOW_ruleEqual_in_entryRuleEqual7488);
            iv_ruleEqual=ruleEqual();
            _fsp--;

             current =iv_ruleEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqual7498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEqual


    // $ANTLR start ruleEqual
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4008:1: ruleEqual returns [EObject current=null] : (this_NotEqual_0= ruleNotEqual ( () '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )* ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        EObject this_NotEqual_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4013:6: ( (this_NotEqual_0= ruleNotEqual ( () '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4014:1: (this_NotEqual_0= ruleNotEqual ( () '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4014:1: (this_NotEqual_0= ruleNotEqual ( () '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4015:5: this_NotEqual_0= ruleNotEqual ( () '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getEqualAccess().getNotEqualParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleNotEqual_in_ruleEqual7545);
            this_NotEqual_0=ruleNotEqual();
            _fsp--;

             
                    current = this_NotEqual_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4023:1: ( () '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==13) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4023:2: () '=' ( (lv_rightOperand_3_0= ruleNotEqual ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4023:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4024:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getEqualAccess().getEqualLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getEqualAccess().getEqualLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,13,FOLLOW_13_in_ruleEqual7564); 

            	            createLeafNode(grammarAccess.getEqualAccess().getEqualsSignKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4043:1: ( (lv_rightOperand_3_0= ruleNotEqual ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4044:1: (lv_rightOperand_3_0= ruleNotEqual )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4044:1: (lv_rightOperand_3_0= ruleNotEqual )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4045:3: lv_rightOperand_3_0= ruleNotEqual
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEqualAccess().getRightOperandNotEqualParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotEqual_in_ruleEqual7585);
            	    lv_rightOperand_3_0=ruleNotEqual();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEqualRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"NotEqual", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEqual


    // $ANTLR start entryRuleNotEqual
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4075:1: entryRuleNotEqual returns [EObject current=null] : iv_ruleNotEqual= ruleNotEqual EOF ;
    public final EObject entryRuleNotEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqual = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4076:2: (iv_ruleNotEqual= ruleNotEqual EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4077:2: iv_ruleNotEqual= ruleNotEqual EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNotEqualRule(), currentNode); 
            pushFollow(FOLLOW_ruleNotEqual_in_entryRuleNotEqual7623);
            iv_ruleNotEqual=ruleNotEqual();
            _fsp--;

             current =iv_ruleNotEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqual7633); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNotEqual


    // $ANTLR start ruleNotEqual
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4084:1: ruleNotEqual returns [EObject current=null] : (this_StrictLower_0= ruleStrictLower ( () '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )* ) ;
    public final EObject ruleNotEqual() throws RecognitionException {
        EObject current = null;

        EObject this_StrictLower_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4089:6: ( (this_StrictLower_0= ruleStrictLower ( () '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4090:1: (this_StrictLower_0= ruleStrictLower ( () '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4090:1: (this_StrictLower_0= ruleStrictLower ( () '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4091:5: this_StrictLower_0= ruleStrictLower ( () '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getNotEqualAccess().getStrictLowerParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleStrictLower_in_ruleNotEqual7680);
            this_StrictLower_0=ruleStrictLower();
            _fsp--;

             
                    current = this_StrictLower_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4099:1: ( () '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==54) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4099:2: () '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4099:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4100:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getNotEqualAccess().getNotEqualLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getNotEqualAccess().getNotEqualLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,54,FOLLOW_54_in_ruleNotEqual7699); 

            	            createLeafNode(grammarAccess.getNotEqualAccess().getExclamationMarkEqualsSignKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4119:1: ( (lv_rightOperand_3_0= ruleStrictLower ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4120:1: (lv_rightOperand_3_0= ruleStrictLower )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4120:1: (lv_rightOperand_3_0= ruleStrictLower )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4121:3: lv_rightOperand_3_0= ruleStrictLower
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getNotEqualAccess().getRightOperandStrictLowerParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStrictLower_in_ruleNotEqual7720);
            	    lv_rightOperand_3_0=ruleStrictLower();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getNotEqualRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"StrictLower", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotEqual


    // $ANTLR start entryRuleStrictLower
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4151:1: entryRuleStrictLower returns [EObject current=null] : iv_ruleStrictLower= ruleStrictLower EOF ;
    public final EObject entryRuleStrictLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictLower = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4152:2: (iv_ruleStrictLower= ruleStrictLower EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4153:2: iv_ruleStrictLower= ruleStrictLower EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStrictLowerRule(), currentNode); 
            pushFollow(FOLLOW_ruleStrictLower_in_entryRuleStrictLower7758);
            iv_ruleStrictLower=ruleStrictLower();
            _fsp--;

             current =iv_ruleStrictLower; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrictLower7768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStrictLower


    // $ANTLR start ruleStrictLower
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4160:1: ruleStrictLower returns [EObject current=null] : (this_Lower_0= ruleLower ( () '<' ( (lv_rightOperand_3_0= ruleLower ) ) )* ) ;
    public final EObject ruleStrictLower() throws RecognitionException {
        EObject current = null;

        EObject this_Lower_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4165:6: ( (this_Lower_0= ruleLower ( () '<' ( (lv_rightOperand_3_0= ruleLower ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4166:1: (this_Lower_0= ruleLower ( () '<' ( (lv_rightOperand_3_0= ruleLower ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4166:1: (this_Lower_0= ruleLower ( () '<' ( (lv_rightOperand_3_0= ruleLower ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4167:5: this_Lower_0= ruleLower ( () '<' ( (lv_rightOperand_3_0= ruleLower ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getStrictLowerAccess().getLowerParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleLower_in_ruleStrictLower7815);
            this_Lower_0=ruleLower();
            _fsp--;

             
                    current = this_Lower_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4175:1: ( () '<' ( (lv_rightOperand_3_0= ruleLower ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==34) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4175:2: () '<' ( (lv_rightOperand_3_0= ruleLower ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4175:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4176:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getStrictLowerAccess().getStrictLowerLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getStrictLowerAccess().getStrictLowerLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,34,FOLLOW_34_in_ruleStrictLower7834); 

            	            createLeafNode(grammarAccess.getStrictLowerAccess().getLessThanSignKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4195:1: ( (lv_rightOperand_3_0= ruleLower ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4196:1: (lv_rightOperand_3_0= ruleLower )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4196:1: (lv_rightOperand_3_0= ruleLower )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4197:3: lv_rightOperand_3_0= ruleLower
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStrictLowerAccess().getRightOperandLowerParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLower_in_ruleStrictLower7855);
            	    lv_rightOperand_3_0=ruleLower();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStrictLowerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"Lower", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStrictLower


    // $ANTLR start entryRuleLower
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4227:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4228:2: (iv_ruleLower= ruleLower EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4229:2: iv_ruleLower= ruleLower EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLowerRule(), currentNode); 
            pushFollow(FOLLOW_ruleLower_in_entryRuleLower7893);
            iv_ruleLower=ruleLower();
            _fsp--;

             current =iv_ruleLower; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLower7903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLower


    // $ANTLR start ruleLower
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4236:1: ruleLower returns [EObject current=null] : (this_StrictUpper_0= ruleStrictUpper ( () '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )* ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        EObject this_StrictUpper_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4241:6: ( (this_StrictUpper_0= ruleStrictUpper ( () '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4242:1: (this_StrictUpper_0= ruleStrictUpper ( () '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4242:1: (this_StrictUpper_0= ruleStrictUpper ( () '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4243:5: this_StrictUpper_0= ruleStrictUpper ( () '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getLowerAccess().getStrictUpperParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleStrictUpper_in_ruleLower7950);
            this_StrictUpper_0=ruleStrictUpper();
            _fsp--;

             
                    current = this_StrictUpper_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4251:1: ( () '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==55) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4251:2: () '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4251:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4252:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getLowerAccess().getLowerLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getLowerAccess().getLowerLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,55,FOLLOW_55_in_ruleLower7969); 

            	            createLeafNode(grammarAccess.getLowerAccess().getLessThanSignEqualsSignKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4271:1: ( (lv_rightOperand_3_0= ruleStrictUpper ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4272:1: (lv_rightOperand_3_0= ruleStrictUpper )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4272:1: (lv_rightOperand_3_0= ruleStrictUpper )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4273:3: lv_rightOperand_3_0= ruleStrictUpper
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLowerAccess().getRightOperandStrictUpperParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStrictUpper_in_ruleLower7990);
            	    lv_rightOperand_3_0=ruleStrictUpper();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLowerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"StrictUpper", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLower


    // $ANTLR start entryRuleStrictUpper
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4303:1: entryRuleStrictUpper returns [EObject current=null] : iv_ruleStrictUpper= ruleStrictUpper EOF ;
    public final EObject entryRuleStrictUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictUpper = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4304:2: (iv_ruleStrictUpper= ruleStrictUpper EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4305:2: iv_ruleStrictUpper= ruleStrictUpper EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStrictUpperRule(), currentNode); 
            pushFollow(FOLLOW_ruleStrictUpper_in_entryRuleStrictUpper8028);
            iv_ruleStrictUpper=ruleStrictUpper();
            _fsp--;

             current =iv_ruleStrictUpper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrictUpper8038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStrictUpper


    // $ANTLR start ruleStrictUpper
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4312:1: ruleStrictUpper returns [EObject current=null] : (this_Upper_0= ruleUpper ( () '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )* ) ;
    public final EObject ruleStrictUpper() throws RecognitionException {
        EObject current = null;

        EObject this_Upper_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4317:6: ( (this_Upper_0= ruleUpper ( () '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4318:1: (this_Upper_0= ruleUpper ( () '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4318:1: (this_Upper_0= ruleUpper ( () '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4319:5: this_Upper_0= ruleUpper ( () '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getStrictUpperAccess().getUpperParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleUpper_in_ruleStrictUpper8085);
            this_Upper_0=ruleUpper();
            _fsp--;

             
                    current = this_Upper_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4327:1: ( () '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==35) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4327:2: () '>' ( (lv_rightOperand_3_0= ruleUpper ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4327:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4328:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getStrictUpperAccess().getStrictUpperLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getStrictUpperAccess().getStrictUpperLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,35,FOLLOW_35_in_ruleStrictUpper8104); 

            	            createLeafNode(grammarAccess.getStrictUpperAccess().getGreaterThanSignKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4347:1: ( (lv_rightOperand_3_0= ruleUpper ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4348:1: (lv_rightOperand_3_0= ruleUpper )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4348:1: (lv_rightOperand_3_0= ruleUpper )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4349:3: lv_rightOperand_3_0= ruleUpper
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStrictUpperAccess().getRightOperandUpperParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpper_in_ruleStrictUpper8125);
            	    lv_rightOperand_3_0=ruleUpper();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStrictUpperRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"Upper", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStrictUpper


    // $ANTLR start entryRuleUpper
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4379:1: entryRuleUpper returns [EObject current=null] : iv_ruleUpper= ruleUpper EOF ;
    public final EObject entryRuleUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpper = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4380:2: (iv_ruleUpper= ruleUpper EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4381:2: iv_ruleUpper= ruleUpper EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUpperRule(), currentNode); 
            pushFollow(FOLLOW_ruleUpper_in_entryRuleUpper8163);
            iv_ruleUpper=ruleUpper();
            _fsp--;

             current =iv_ruleUpper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpper8173); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUpper


    // $ANTLR start ruleUpper
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4388:1: ruleUpper returns [EObject current=null] : (this_Imply_0= ruleImply ( () '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )* ) ;
    public final EObject ruleUpper() throws RecognitionException {
        EObject current = null;

        EObject this_Imply_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4393:6: ( (this_Imply_0= ruleImply ( () '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4394:1: (this_Imply_0= ruleImply ( () '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4394:1: (this_Imply_0= ruleImply ( () '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4395:5: this_Imply_0= ruleImply ( () '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getUpperAccess().getImplyParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleImply_in_ruleUpper8220);
            this_Imply_0=ruleImply();
            _fsp--;

             
                    current = this_Imply_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4403:1: ( () '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==37) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4403:2: () '>=' ( (lv_rightOperand_3_0= ruleImply ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4403:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4404:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getUpperAccess().getUpperLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getUpperAccess().getUpperLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,37,FOLLOW_37_in_ruleUpper8239); 

            	            createLeafNode(grammarAccess.getUpperAccess().getGreaterThanSignEqualsSignKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4423:1: ( (lv_rightOperand_3_0= ruleImply ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4424:1: (lv_rightOperand_3_0= ruleImply )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4424:1: (lv_rightOperand_3_0= ruleImply )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4425:3: lv_rightOperand_3_0= ruleImply
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUpperAccess().getRightOperandImplyParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImply_in_ruleUpper8260);
            	    lv_rightOperand_3_0=ruleImply();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUpperRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"Imply", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUpper


    // $ANTLR start entryRuleImply
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4455:1: entryRuleImply returns [EObject current=null] : iv_ruleImply= ruleImply EOF ;
    public final EObject entryRuleImply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImply = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4456:2: (iv_ruleImply= ruleImply EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4457:2: iv_ruleImply= ruleImply EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImplyRule(), currentNode); 
            pushFollow(FOLLOW_ruleImply_in_entryRuleImply8298);
            iv_ruleImply=ruleImply();
            _fsp--;

             current =iv_ruleImply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImply8308); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImply


    // $ANTLR start ruleImply
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4464:1: ruleImply returns [EObject current=null] : (this_Not_0= ruleNot ( () '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleImply() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject lv_rightOperand_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4469:6: ( (this_Not_0= ruleNot ( () '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4470:1: (this_Not_0= ruleNot ( () '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4470:1: (this_Not_0= ruleNot ( () '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4471:5: this_Not_0= ruleNot ( () '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getImplyAccess().getNotParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleNot_in_ruleImply8355);
            this_Not_0=ruleNot();
            _fsp--;

             
                    current = this_Not_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4479:1: ( () '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==56) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4479:2: () '=>' ( (lv_rightOperand_3_0= ruleNot ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4479:2: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4480:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getImplyAccess().getImplyLeftOperandAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftOperand", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getImplyAccess().getImplyLeftOperandAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,56,FOLLOW_56_in_ruleImply8374); 

            	            createLeafNode(grammarAccess.getImplyAccess().getEqualsSignGreaterThanSignKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4499:1: ( (lv_rightOperand_3_0= ruleNot ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4500:1: (lv_rightOperand_3_0= ruleNot )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4500:1: (lv_rightOperand_3_0= ruleNot )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4501:3: lv_rightOperand_3_0= ruleNot
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImplyAccess().getRightOperandNotParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNot_in_ruleImply8395);
            	    lv_rightOperand_3_0=ruleNot();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImplyRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightOperand",
            	    	        		lv_rightOperand_3_0, 
            	    	        		"Not", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImply


    // $ANTLR start entryRuleNot
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4531:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4532:2: (iv_ruleNot= ruleNot EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4533:2: iv_ruleNot= ruleNot EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNotRule(), currentNode); 
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot8433);
            iv_ruleNot=ruleNot();
            _fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot8443); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNot


    // $ANTLR start ruleNot
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4540:1: ruleNot returns [EObject current=null] : ( ( ( '~' | 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_Atom_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4545:6: ( ( ( ( '~' | 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4546:1: ( ( ( '~' | 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4546:1: ( ( ( '~' | 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=57 && LA57_0<=58)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID||(LA57_0>=RULE_STRING && LA57_0<=RULE_INT)||LA57_0==59||(LA57_0>=62 && LA57_0<=63)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4546:1: ( ( ( '~' | 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4546:2: ( ( '~' | 'not' ) ( (lv_operand_2_0= ruleAtom ) ) )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4546:2: ( ( '~' | 'not' ) ( (lv_operand_2_0= ruleAtom ) ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4546:3: ( '~' | 'not' ) ( (lv_operand_2_0= ruleAtom ) )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4546:3: ( '~' | 'not' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==57) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==58) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("4546:3: ( '~' | 'not' )", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4546:5: '~'
                            {
                            match(input,57,FOLLOW_57_in_ruleNot8480); 

                                    createLeafNode(grammarAccess.getNotAccess().getTildeKeyword_0_0_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4551:7: 'not'
                            {
                            match(input,58,FOLLOW_58_in_ruleNot8496); 

                                    createLeafNode(grammarAccess.getNotAccess().getNotKeyword_0_0_1(), null); 
                                

                            }
                            break;

                    }

                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4555:2: ( (lv_operand_2_0= ruleAtom ) )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4556:1: (lv_operand_2_0= ruleAtom )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4556:1: (lv_operand_2_0= ruleAtom )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4557:3: lv_operand_2_0= ruleAtom
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNotAccess().getOperandAtomParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtom_in_ruleNot8518);
                    lv_operand_2_0=ruleAtom();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNotRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"operand",
                    	        		lv_operand_2_0, 
                    	        		"Atom", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4581:5: this_Atom_3= ruleAtom
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNotAccess().getAtomParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtom_in_ruleNot8547);
                    this_Atom_3=ruleAtom();
                    _fsp--;

                     
                            current = this_Atom_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNot


    // $ANTLR start entryRuleAtom
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4597:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4598:2: (iv_ruleAtom= ruleAtom EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4599:2: iv_ruleAtom= ruleAtom EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom8582);
            iv_ruleAtom=ruleAtom();
            _fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom8592); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtom


    // $ANTLR start ruleAtom
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4606:1: ruleAtom returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | ( '(' this_Expression_5= ruleExpression ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_IntegerLiteral_2 = null;

        EObject this_VariableRef_3 = null;

        EObject this_Expression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4611:6: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | ( '(' this_Expression_5= ruleExpression ')' ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4612:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | ( '(' this_Expression_5= ruleExpression ')' ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4612:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | ( '(' this_Expression_5= ruleExpression ')' ) )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 62:
            case 63:
                {
                alt58=1;
                }
                break;
            case RULE_STRING:
                {
                alt58=2;
                }
                break;
            case RULE_INT:
                {
                alt58=3;
                }
                break;
            case RULE_ID:
                {
                alt58=4;
                }
                break;
            case 59:
                {
                alt58=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4612:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | ( '(' this_Expression_5= ruleExpression ')' ) )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4613:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleAtom8639);
                    this_BooleanLiteral_0=ruleBooleanLiteral();
                    _fsp--;

                     
                            current = this_BooleanLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4623:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleAtom8666);
                    this_StringLiteral_1=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4633:5: this_IntegerLiteral_2= ruleIntegerLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleAtom8693);
                    this_IntegerLiteral_2=ruleIntegerLiteral();
                    _fsp--;

                     
                            current = this_IntegerLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4643:5: this_VariableRef_3= ruleVariableRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomAccess().getVariableRefParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableRef_in_ruleAtom8720);
                    this_VariableRef_3=ruleVariableRef();
                    _fsp--;

                     
                            current = this_VariableRef_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4652:6: ( '(' this_Expression_5= ruleExpression ')' )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4652:6: ( '(' this_Expression_5= ruleExpression ')' )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4652:8: '(' this_Expression_5= ruleExpression ')'
                    {
                    match(input,59,FOLLOW_59_in_ruleAtom8736); 

                            createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_4_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExpressionParserRuleCall_4_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtom8758);
                    this_Expression_5=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_5; 
                            currentNode = currentNode.getParent();
                        
                    match(input,60,FOLLOW_60_in_ruleAtom8767); 

                            createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtom


    // $ANTLR start entryRuleEventRef
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4677:1: entryRuleEventRef returns [EObject current=null] : iv_ruleEventRef= ruleEventRef EOF ;
    public final EObject entryRuleEventRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRef = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4678:2: (iv_ruleEventRef= ruleEventRef EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4679:2: iv_ruleEventRef= ruleEventRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleEventRef_in_entryRuleEventRef8804);
            iv_ruleEventRef=ruleEventRef();
            _fsp--;

             current =iv_ruleEventRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRef8814); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEventRef


    // $ANTLR start ruleEventRef
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4686:1: ruleEventRef returns [EObject current=null] : ( ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleEventRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4691:6: ( ( ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4692:1: ( ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4692:1: ( ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4692:2: ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )*
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4692:2: ( ( RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4693:1: ( RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4693:1: ( RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4694:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEventRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRef8857); 

            		createLeafNode(grammarAccess.getEventRefAccess().getVariableNavigableVariableCrossReference_0_0(), "variable"); 
            	

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4706:2: ( () '.' ( ( RULE_ID ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==61) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4706:3: () '.' ( ( RULE_ID ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4706:3: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4707:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getEventRefAccess().getNestedQualifiedEventRefTargetAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "target", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getEventRefAccess().getNestedQualifiedEventRefTargetAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,61,FOLLOW_61_in_ruleEventRef8877); 

            	            createLeafNode(grammarAccess.getEventRefAccess().getFullStopKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4726:1: ( ( RULE_ID ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4727:1: ( RULE_ID )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4727:1: ( RULE_ID )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4728:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getEventRefRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRef8895); 

            	    		createLeafNode(grammarAccess.getEventRefAccess().getNestedVariableNavigableVariableCrossReference_1_2_0(), "nestedVariable"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEventRef


    // $ANTLR start entryRuleVariableRef
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4748:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4749:2: (iv_ruleVariableRef= ruleVariableRef EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4750:2: iv_ruleVariableRef= ruleVariableRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableRef_in_entryRuleVariableRef8933);
            iv_ruleVariableRef=ruleVariableRef();
            _fsp--;

             current =iv_ruleVariableRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableRef8943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableRef


    // $ANTLR start ruleVariableRef
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4757:1: ruleVariableRef returns [EObject current=null] : ( ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4762:6: ( ( ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )* ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4763:1: ( ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )* )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4763:1: ( ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )* )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4763:2: ( ( RULE_ID ) ) ( () '.' ( ( RULE_ID ) ) )*
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4763:2: ( ( RULE_ID ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4764:1: ( RULE_ID )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4764:1: ( RULE_ID )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4765:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableRef8986); 

            		createLeafNode(grammarAccess.getVariableRefAccess().getVariableNavigableVariableCrossReference_0_0(), "variable"); 
            	

            }


            }

            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4777:2: ( () '.' ( ( RULE_ID ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==61) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4777:3: () '.' ( ( RULE_ID ) )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4777:3: ()
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4778:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getVariableRefAccess().getNestedQualifiedVariableRefTargetAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "target", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getVariableRefAccess().getNestedQualifiedVariableRefTargetAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,61,FOLLOW_61_in_ruleVariableRef9006); 

            	            createLeafNode(grammarAccess.getVariableRefAccess().getFullStopKeyword_1_1(), null); 
            	        
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4797:1: ( ( RULE_ID ) )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4798:1: ( RULE_ID )
            	    {
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4798:1: ( RULE_ID )
            	    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4799:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getVariableRefRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableRef9024); 

            	    		createLeafNode(grammarAccess.getVariableRefAccess().getNestedVariableNavigableVariableCrossReference_1_2_0(), "nestedVariable"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableRef


    // $ANTLR start entryRuleNonNavigableVariable
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4821:1: entryRuleNonNavigableVariable returns [EObject current=null] : iv_ruleNonNavigableVariable= ruleNonNavigableVariable EOF ;
    public final EObject entryRuleNonNavigableVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonNavigableVariable = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4822:2: (iv_ruleNonNavigableVariable= ruleNonNavigableVariable EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4823:2: iv_ruleNonNavigableVariable= ruleNonNavigableVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNonNavigableVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleNonNavigableVariable_in_entryRuleNonNavigableVariable9064);
            iv_ruleNonNavigableVariable=ruleNonNavigableVariable();
            _fsp--;

             current =iv_ruleNonNavigableVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonNavigableVariable9074); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNonNavigableVariable


    // $ANTLR start ruleNonNavigableVariable
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4830:1: ruleNonNavigableVariable returns [EObject current=null] : (this_State_0= ruleState | this_Literal_1= ruleLiteral | this_Constant_2= ruleConstant | this_Flow_3= ruleFlow ) ;
    public final EObject ruleNonNavigableVariable() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Literal_1 = null;

        EObject this_Constant_2 = null;

        EObject this_Flow_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4835:6: ( (this_State_0= ruleState | this_Literal_1= ruleLiteral | this_Constant_2= ruleConstant | this_Flow_3= ruleFlow ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4836:1: (this_State_0= ruleState | this_Literal_1= ruleLiteral | this_Constant_2= ruleConstant | this_Flow_3= ruleFlow )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4836:1: (this_State_0= ruleState | this_Literal_1= ruleLiteral | this_Constant_2= ruleConstant | this_Flow_3= ruleFlow )
            int alt61=4;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4836:1: (this_State_0= ruleState | this_Literal_1= ruleLiteral | this_Constant_2= ruleConstant | this_Flow_3= ruleFlow )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4837:5: this_State_0= ruleState
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonNavigableVariableAccess().getStateParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleNonNavigableVariable9121);
                    this_State_0=ruleState();
                    _fsp--;

                     
                            current = this_State_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4847:5: this_Literal_1= ruleLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonNavigableVariableAccess().getLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleNonNavigableVariable9148);
                    this_Literal_1=ruleLiteral();
                    _fsp--;

                     
                            current = this_Literal_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4857:5: this_Constant_2= ruleConstant
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonNavigableVariableAccess().getConstantParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleNonNavigableVariable9175);
                    this_Constant_2=ruleConstant();
                    _fsp--;

                     
                            current = this_Constant_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4867:5: this_Flow_3= ruleFlow
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNonNavigableVariableAccess().getFlowParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFlow_in_ruleNonNavigableVariable9202);
                    this_Flow_3=ruleFlow();
                    _fsp--;

                     
                            current = this_Flow_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNonNavigableVariable


    // $ANTLR start entryRuleBooleanLiteral
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4883:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4884:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4885:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9237);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();
            _fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral9247); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4892:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4897:6: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4898:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4898:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4899:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4899:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4900:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4900:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==62) ) {
                alt62=1;
            }
            else if ( (LA62_0==63) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4900:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4901:3: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_ruleBooleanLiteral9291); 

                            createLeafNode(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_0_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4919:8: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)input.LT(1);
                    match(input,63,FOLLOW_63_in_ruleBooleanLiteral9320); 

                            createLeafNode(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBooleanLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_0_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start entryRuleStringLiteral
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4948:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4949:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4950:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9371);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4957:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4962:6: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4963:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4963:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4964:1: (lv_value_0_0= RULE_STRING )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4964:1: (lv_value_0_0= RULE_STRING )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4965:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9422); 

            			createLeafNode(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleIntegerLiteral
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4995:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4996:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:4997:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral9462);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();
            _fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral9472); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntegerLiteral


    // $ANTLR start ruleIntegerLiteral
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5004:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5009:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5010:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5010:1: ( (lv_value_0_0= RULE_INT ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5011:1: (lv_value_0_0= RULE_INT )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5011:1: (lv_value_0_0= RULE_INT )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5012:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral9513); 

            			createLeafNode(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntegerLiteral


    // $ANTLR start rulePrimitiveTypeKind
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5042:1: rulePrimitiveTypeKind returns [Enumerator current=null] : ( ( 'integer' ) | ( 'bool' ) ) ;
    public final Enumerator rulePrimitiveTypeKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5046:6: ( ( ( 'integer' ) | ( 'bool' ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5047:1: ( ( 'integer' ) | ( 'bool' ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5047:1: ( ( 'integer' ) | ( 'bool' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==64) ) {
                alt63=1;
            }
            else if ( (LA63_0==65) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5047:1: ( ( 'integer' ) | ( 'bool' ) )", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5047:2: ( 'integer' )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5047:2: ( 'integer' )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5047:4: 'integer'
                    {
                    match(input,64,FOLLOW_64_in_rulePrimitiveTypeKind9565); 

                            current = grammarAccess.getPrimitiveTypeKindAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveTypeKindAccess().getINTEGEREnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5053:6: ( 'bool' )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5053:6: ( 'bool' )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5053:8: 'bool'
                    {
                    match(input,65,FOLLOW_65_in_rulePrimitiveTypeKind9580); 

                            current = grammarAccess.getPrimitiveTypeKindAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveTypeKindAccess().getBOOLEANEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveTypeKind


    // $ANTLR start ruleFlowKind
    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5063:1: ruleFlowKind returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) | ( 'inout' ) ) ;
    public final Enumerator ruleFlowKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5067:6: ( ( ( 'in' ) | ( 'out' ) | ( 'inout' ) ) )
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5068:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )
            {
            // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5068:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt64=1;
                }
                break;
            case 67:
                {
                alt64=2;
                }
                break;
            case 68:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("5068:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5068:2: ( 'in' )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5068:2: ( 'in' )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5068:4: 'in'
                    {
                    match(input,66,FOLLOW_66_in_ruleFlowKind9623); 

                            current = grammarAccess.getFlowKindAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFlowKindAccess().getINEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5074:6: ( 'out' )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5074:6: ( 'out' )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5074:8: 'out'
                    {
                    match(input,67,FOLLOW_67_in_ruleFlowKind9638); 

                            current = grammarAccess.getFlowKindAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFlowKindAccess().getOUTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5080:6: ( 'inout' )
                    {
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5080:6: ( 'inout' )
                    // ../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g:5080:8: 'inout'
                    {
                    match(input,68,FOLLOW_68_in_ruleFlowKind9653); 

                            current = grammarAccess.getFlowKindAccess().getINOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFlowKindAccess().getINOUTEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFlowKind


 

    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_ruleSystem130 = new BitSet(new long[]{0x0000000000208802L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleAbstractDeclaration223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleAbstractDeclaration250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleAbstractDeclaration277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConstantDefinition357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleConstantDefinition378 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleAbstractDefinitionConstant_in_ruleConstantDefinition399 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstantDefinition409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDefinitionConstant_in_entryRuleAbstractDefinitionConstant536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDefinitionConstant546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionConstant_in_ruleAbstractDefinitionConstant593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainConstant_in_ruleAbstractDefinitionConstant620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionConstant_in_entryRuleExpressionConstant655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionConstant665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExpressionConstant700 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionConstant721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainConstant_in_entryRuleDomainConstant757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainConstant767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDomainConstant802 = new BitSet(new long[]{0x0000000000090000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_ruleDomainConstant823 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleDomainConstant834 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDomainConstant855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDomain938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain955 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDomain970 = new BitSet(new long[]{0x0000000000090000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_ruleDomain991 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomain1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_entryRuleAbstractDomain1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDomain1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleAbstractDomain1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleAbstractDomain1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleAbstractDomain1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange1183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRange1228 = new BitSet(new long[]{0xC8000000000000D0L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleRange1249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRange1259 = new BitSet(new long[]{0xC8000000000000D0L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleRange1280 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRange1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnumeration1371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumeration1392 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleEnumeration1403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumeration1424 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20_in_ruleEnumeration1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeKind_in_rulePrimitiveType1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNode1698 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleNode1716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1747 = new BitSet(new long[]{0x00000043CF800000L});
    public static final BitSet FOLLOW_ruleAbstractSpecification_in_ruleNode1773 = new BitSet(new long[]{0x00000043CF800000L});
    public static final BitSet FOLLOW_23_in_ruleNode1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSpecification_in_entryRuleAbstractSpecification1820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSpecification1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowSpecification_in_ruleAbstractSpecification1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleAbstractSpecification1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpecification_in_ruleAbstractSpecification1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeInstanceSpecification_in_ruleAbstractSpecification1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertSpecification_in_ruleAbstractSpecification1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorSpecification_in_ruleAbstractSpecification2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleAbstractSpecification2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSpecification_in_ruleAbstractSpecification2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalSpecification_in_ruleAbstractSpecification2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute2128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAttribute2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSpecification_in_entryRuleInitSpecification2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitSpecification2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInitSpecification2264 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInitStatement_in_ruleInitSpecification2285 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInitStatement_in_entryRuleInitStatement2322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitStatement2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleInitStatement2378 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInitStatement2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalSpecification_in_entryRuleExternalSpecification2424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalSpecification2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleExternalSpecification2469 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleExternalDirective_in_ruleExternalSpecification2490 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleExternalDirective_in_entryRuleExternalDirective2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalDirective2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleExternalDirective2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowSpecification_in_entryRuleFlowSpecification2618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowSpecification2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFlowSpecification2663 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFlowDeclaration_in_ruleFlowSpecification2684 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFlowDeclaration_in_entryRuleFlowDeclaration2721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowDeclaration2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleFlowDeclaration2777 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleFlowDeclaration2788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleFlowDeclaration2809 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleFlowDeclaration2821 = new BitSet(new long[]{0x0000000000090010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAbstractTypeRef_in_ruleFlowDeclaration2842 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleFlowDeclaration2853 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleFlowKind_in_ruleFlowDeclaration2874 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleFlowDeclaration2887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleFlowDeclaration2908 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFlowDeclaration2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow2956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlow3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpecification_in_entryRuleEventSpecification3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpecification3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEventSpecification3092 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_ruleEventSpecification3113 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration3150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclaration3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEventDeclaration3206 = new BitSet(new long[]{0x0000000000025000L});
    public static final BitSet FOLLOW_17_in_ruleEventDeclaration3217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEventDeclaration3238 = new BitSet(new long[]{0x0000000000025000L});
    public static final BitSet FOLLOW_14_in_ruleEventDeclaration3251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleEventDeclaration3272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEventDeclaration3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent3372 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleEvent3388 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleEvent3409 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvent3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriority_in_entryRulePriority3457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriority3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePriority3503 = new BitSet(new long[]{0xCE001400000000D0L});
    public static final BitSet FOLLOW_29_in_rulePriority3519 = new BitSet(new long[]{0xCE001400000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_rulePriority3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStateSpecification3622 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStateDeclaration_in_ruleStateSpecification3643 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStateDeclaration_in_entryRuleStateDeclaration3680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateDeclaration3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateDeclaration3736 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleStateDeclaration3747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateDeclaration3768 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleStateDeclaration3780 = new BitSet(new long[]{0x0000000000090010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAbstractTypeRef_in_ruleStateDeclaration3801 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleStateDeclaration3812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleStateDeclaration3833 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStateDeclaration3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractTypeRef_in_entryRuleAbstractTypeRef3972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTypeRef3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainRef_in_ruleAbstractTypeRef4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_ruleAbstractTypeRef4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainRef_in_entryRuleDomainRef4091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainRef4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainRef4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeInstanceSpecification_in_entryRuleNodeInstanceSpecification4178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeInstanceSpecification4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleNodeInstanceSpecification4223 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNodeInstanceDeclaration_in_ruleNodeInstanceSpecification4244 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNodeInstanceDeclaration_in_entryRuleNodeInstanceDeclaration4281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeInstanceDeclaration4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeInstance_in_ruleNodeInstanceDeclaration4337 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleNodeInstanceDeclaration4348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeInstance_in_ruleNodeInstanceDeclaration4369 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleNodeInstanceDeclaration4381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeInstanceDeclaration4399 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNodeInstanceDeclaration4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeInstance_in_entryRuleNodeInstance4445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeInstance4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeInstance4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertSpecification_in_entryRuleAssertSpecification4536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertSpecification4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAssertSpecification4581 = new BitSet(new long[]{0xCE001400000000D2L});
    public static final BitSet FOLLOW_ruleAssert_in_ruleAssertSpecification4602 = new BitSet(new long[]{0xCE001400000000D2L});
    public static final BitSet FOLLOW_ruleAssert_in_entryRuleAssert4639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBooleanExpression_in_ruleAssert4695 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssert4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorSpecification_in_entryRuleVectorSpecification4741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorSpecification4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVectorSpecification4786 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleVectorSpecification4807 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVector4889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVectorParameter_in_ruleVector4910 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_17_in_ruleVector4921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVectorParameter_in_ruleVector4942 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_35_in_ruleVector4954 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleVector4965 = new BitSet(new long[]{0x0000002800002000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleVector4986 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVector4996 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVector5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorParameter_in_entryRuleVectorParameter5044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorParameter5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRef_in_ruleVectorParameter5100 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleVectorParameter5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality5168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCardinality5214 = new BitSet(new long[]{0xCE001400000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleCardinality5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCardinality5253 = new BitSet(new long[]{0xCE001400000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleCardinality5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCardinality5292 = new BitSet(new long[]{0xCE001400000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleCardinality5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification5350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTransitionSpecification5395 = new BitSet(new long[]{0xCE001400000000D2L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTransitionSpecification5416 = new BitSet(new long[]{0xCE001400000000D2L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition5453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleTransition5509 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTransition5519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition5537 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTransition5547 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleTransition5569 = new BitSet(new long[]{0x0000000000021010L});
    public static final BitSet FOLLOW_17_in_ruleTransition5580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleTransition5601 = new BitSet(new long[]{0x0000000000021010L});
    public static final BitSet FOLLOW_12_in_ruleTransition5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation5651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAffectation5704 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAffectation5714 = new BitSet(new long[]{0xCE001400000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleAffectation5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_entryRuleAbstractExpression5771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExpression5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleAbstractExpression5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleAbstractExpression5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractExpression5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBooleanExpression_in_entryRuleAbstractBooleanExpression5917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBooleanExpression5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleAbstractBooleanExpression5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleAbstractBooleanExpression6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAbstractBooleanExpression6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch6063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSwitch6108 = new BitSet(new long[]{0xCE000800000000D0L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_ruleSwitch6129 = new BitSet(new long[]{0xCE000800000000D0L});
    public static final BitSet FOLLOW_43_in_ruleSwitch6140 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch6161 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSwitch6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression6207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleCaseExpression6263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCaseExpression6273 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseExpression6294 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCaseExpression6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse6340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleIfThenElse6385 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleIfThenElse6406 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleIfThenElse6416 = new BitSet(new long[]{0xCE000400000000D0L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleIfThenElse6439 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElse6458 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleIfThenElse6471 = new BitSet(new long[]{0xCE000400000000D0L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleIfThenElse6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElse6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_ruleExpression6609 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExpression6628 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleMinus_in_ruleExpression6649 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_entryRuleMinus6687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinus6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleMinus6744 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleMinus6763 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleMinus6784 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication6822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication6879 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMultiplication6898 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication6919 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision6957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDivision7014 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDivision7033 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDivision7054 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression7092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleBooleanExpression7148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd7182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleAnd7239 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAnd7259 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_51_in_ruleAnd7275 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleAnd7297 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr7335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqual_in_ruleOr7392 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOr7412 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_53_in_ruleOr7428 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleEqual_in_ruleOr7450 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleEqual_in_entryRuleEqual7488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqual7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqual_in_ruleEqual7545 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEqual7564 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleNotEqual_in_ruleEqual7585 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleNotEqual_in_entryRuleNotEqual7623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqual7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrictLower_in_ruleNotEqual7680 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNotEqual7699 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleStrictLower_in_ruleNotEqual7720 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleStrictLower_in_entryRuleStrictLower7758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrictLower7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLower_in_ruleStrictLower7815 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleStrictLower7834 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleLower_in_ruleStrictLower7855 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleLower_in_entryRuleLower7893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLower7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrictUpper_in_ruleLower7950 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleLower7969 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleStrictUpper_in_ruleLower7990 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleStrictUpper_in_entryRuleStrictUpper8028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrictUpper8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpper_in_ruleStrictUpper8085 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleStrictUpper8104 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleUpper_in_ruleStrictUpper8125 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleUpper_in_entryRuleUpper8163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpper8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImply_in_ruleUpper8220 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleUpper8239 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleImply_in_ruleUpper8260 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleImply_in_entryRuleImply8298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImply8308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_ruleImply8355 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImply8374 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleNot_in_ruleImply8395 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNot8480 = new BitSet(new long[]{0xC8000000000000D0L});
    public static final BitSet FOLLOW_58_in_ruleNot8496 = new BitSet(new long[]{0xC8000000000000D0L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNot8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNot8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom8582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleAtom8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleAtom8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleAtom8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRef_in_ruleAtom8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleAtom8736 = new BitSet(new long[]{0xCE000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtom8758 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleAtom8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRef_in_entryRuleEventRef8804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRef8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRef8857 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEventRef8877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRef8895 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRef_in_entryRuleVariableRef8933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableRef8943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableRef8986 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleVariableRef9006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableRef9024 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleNonNavigableVariable_in_entryRuleNonNavigableVariable9064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonNavigableVariable9074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleNonNavigableVariable9121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleNonNavigableVariable9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleNonNavigableVariable9175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleNonNavigableVariable9202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral9247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBooleanLiteral9291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBooleanLiteral9320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral9462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral9472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral9513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimitiveTypeKind9565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimitiveTypeKind9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFlowKind9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFlowKind9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleFlowKind9653 = new BitSet(new long[]{0x0000000000000002L});

}