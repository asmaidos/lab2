package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.StlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'area'", "'item'", "'='", "'service'", "'('", "')'", "'name'", "'>'", "'slot'", "'generator'", "'generates'", "'wasteStore'", "'productStore'", "'buffer'", "'machine'", "'conveyor'", "'turntable'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStl.g"; }



     	private StlGrammarAccess grammarAccess;

        public InternalStlParser(TokenStream input, StlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected StlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalStl.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalStl.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalStl.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalStl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ ( (lv_areas_4_0= ruleArea ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_itemTypes_3_0 = null;

        EObject lv_areas_4_0 = null;



        	enterRule();

        try {
            // InternalStl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ ( (lv_areas_4_0= ruleArea ) )+ otherlv_5= '}' ) )
            // InternalStl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ ( (lv_areas_4_0= ruleArea ) )+ otherlv_5= '}' )
            {
            // InternalStl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ ( (lv_areas_4_0= ruleArea ) )+ otherlv_5= '}' )
            // InternalStl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )+ ( (lv_areas_4_0= ruleArea ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalStl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStl.g:105:3: ( (lv_itemTypes_3_0= ruleItemType ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStl.g:106:4: (lv_itemTypes_3_0= ruleItemType )
            	    {
            	    // InternalStl.g:106:4: (lv_itemTypes_3_0= ruleItemType )
            	    // InternalStl.g:107:5: lv_itemTypes_3_0= ruleItemType
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_itemTypes_3_0=ruleItemType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"itemTypes",
            	    						lv_itemTypes_3_0,
            	    						"at.ac.tuwien.big.Stl.ItemType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalStl.g:124:3: ( (lv_areas_4_0= ruleArea ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStl.g:125:4: (lv_areas_4_0= ruleArea )
            	    {
            	    // InternalStl.g:125:4: (lv_areas_4_0= ruleArea )
            	    // InternalStl.g:126:5: lv_areas_4_0= ruleArea
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_areas_4_0=ruleArea();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"areas",
            	    						lv_areas_4_0,
            	    						"at.ac.tuwien.big.Stl.Area");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleArea"
    // InternalStl.g:151:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalStl.g:151:45: (iv_ruleArea= ruleArea EOF )
            // InternalStl.g:152:2: iv_ruleArea= ruleArea EOF
            {
             newCompositeNode(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArea=ruleArea();

            state._fsp--;

             current =iv_ruleArea; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalStl.g:158:1: ruleArea returns [EObject current=null] : (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) ;
    public final EObject ruleArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_components_3_0 = null;

        EObject lv_connectors_4_0 = null;



        	enterRule();

        try {
            // InternalStl.g:164:2: ( (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) )
            // InternalStl.g:165:2: (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            {
            // InternalStl.g:165:2: (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            // InternalStl.g:166:3: otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getAreaKeyword_0());
            		
            // InternalStl.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAreaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStl.g:192:3: ( (lv_components_3_0= ruleComponent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23||(LA3_0>=25 && LA3_0<=30)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStl.g:193:4: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalStl.g:193:4: (lv_components_3_0= ruleComponent )
            	    // InternalStl.g:194:5: lv_components_3_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAreaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_3_0,
            	    						"at.ac.tuwien.big.Stl.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalStl.g:211:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStl.g:212:4: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // InternalStl.g:212:4: (lv_connectors_4_0= ruleConnector )
            	    // InternalStl.g:213:5: lv_connectors_4_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_connectors_4_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAreaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_4_0,
            	    						"at.ac.tuwien.big.Stl.Connector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleItemType"
    // InternalStl.g:238:1: entryRuleItemType returns [EObject current=null] : iv_ruleItemType= ruleItemType EOF ;
    public final EObject entryRuleItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemType = null;


        try {
            // InternalStl.g:238:49: (iv_ruleItemType= ruleItemType EOF )
            // InternalStl.g:239:2: iv_ruleItemType= ruleItemType EOF
            {
             newCompositeNode(grammarAccess.getItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemType=ruleItemType();

            state._fsp--;

             current =iv_ruleItemType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalStl.g:245:1: ruleItemType returns [EObject current=null] : (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) ) ) ;
    public final EObject ruleItemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalStl.g:251:2: ( (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) ) ) )
            // InternalStl.g:252:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) ) )
            {
            // InternalStl.g:252:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) ) )
            // InternalStl.g:253:3: otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getItemTypeAccess().getItemKeyword_0());
            		
            // InternalStl.g:257:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:258:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:258:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:259:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2());
            		
            // InternalStl.g:279:3: ( (lv_description_3_0= ruleEString ) )
            // InternalStl.g:280:4: (lv_description_3_0= ruleEString )
            {
            // InternalStl.g:280:4: (lv_description_3_0= ruleEString )
            // InternalStl.g:281:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getItemTypeAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemTypeRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"at.ac.tuwien.big.Stl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleComponent"
    // InternalStl.g:302:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalStl.g:302:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalStl.g:303:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalStl.g:309:1: ruleComponent returns [EObject current=null] : (this_ItemGenerator_0= ruleItemGenerator | this_Store_1= ruleStore | this_Buffer_2= ruleBuffer | this_Conveyor_3= ruleConveyor | this_Machine_4= ruleMachine | (this_TurnTable_5= ruleTurnTable ( (lv_cost_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_services_8_0= ruleService ) )* ( (lv_inputSlots_9_0= ruleSlot ) )* ( (lv_outputSlots_10_0= ruleSlot ) )* otherlv_11= '}' ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject this_ItemGenerator_0 = null;

        EObject this_Store_1 = null;

        EObject this_Buffer_2 = null;

        EObject this_Conveyor_3 = null;

        EObject this_Machine_4 = null;

        EObject this_TurnTable_5 = null;

        AntlrDatatypeRuleToken lv_cost_6_0 = null;

        EObject lv_services_8_0 = null;

        EObject lv_inputSlots_9_0 = null;

        EObject lv_outputSlots_10_0 = null;



        	enterRule();

        try {
            // InternalStl.g:315:2: ( (this_ItemGenerator_0= ruleItemGenerator | this_Store_1= ruleStore | this_Buffer_2= ruleBuffer | this_Conveyor_3= ruleConveyor | this_Machine_4= ruleMachine | (this_TurnTable_5= ruleTurnTable ( (lv_cost_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_services_8_0= ruleService ) )* ( (lv_inputSlots_9_0= ruleSlot ) )* ( (lv_outputSlots_10_0= ruleSlot ) )* otherlv_11= '}' ) ) )
            // InternalStl.g:316:2: (this_ItemGenerator_0= ruleItemGenerator | this_Store_1= ruleStore | this_Buffer_2= ruleBuffer | this_Conveyor_3= ruleConveyor | this_Machine_4= ruleMachine | (this_TurnTable_5= ruleTurnTable ( (lv_cost_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_services_8_0= ruleService ) )* ( (lv_inputSlots_9_0= ruleSlot ) )* ( (lv_outputSlots_10_0= ruleSlot ) )* otherlv_11= '}' ) )
            {
            // InternalStl.g:316:2: (this_ItemGenerator_0= ruleItemGenerator | this_Store_1= ruleStore | this_Buffer_2= ruleBuffer | this_Conveyor_3= ruleConveyor | this_Machine_4= ruleMachine | (this_TurnTable_5= ruleTurnTable ( (lv_cost_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_services_8_0= ruleService ) )* ( (lv_inputSlots_9_0= ruleSlot ) )* ( (lv_outputSlots_10_0= ruleSlot ) )* otherlv_11= '}' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 25:
            case 26:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 30:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalStl.g:317:3: this_ItemGenerator_0= ruleItemGenerator
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemGenerator_0=ruleItemGenerator();

                    state._fsp--;


                    			current = this_ItemGenerator_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStl.g:326:3: this_Store_1= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getStoreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_1=ruleStore();

                    state._fsp--;


                    			current = this_Store_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStl.g:335:3: this_Buffer_2= ruleBuffer
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getBufferParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Buffer_2=ruleBuffer();

                    state._fsp--;


                    			current = this_Buffer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalStl.g:344:3: this_Conveyor_3= ruleConveyor
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getConveyorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conveyor_3=ruleConveyor();

                    state._fsp--;


                    			current = this_Conveyor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalStl.g:353:3: this_Machine_4= ruleMachine
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getMachineParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Machine_4=ruleMachine();

                    state._fsp--;


                    			current = this_Machine_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalStl.g:362:3: (this_TurnTable_5= ruleTurnTable ( (lv_cost_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_services_8_0= ruleService ) )* ( (lv_inputSlots_9_0= ruleSlot ) )* ( (lv_outputSlots_10_0= ruleSlot ) )* otherlv_11= '}' )
                    {
                    // InternalStl.g:362:3: (this_TurnTable_5= ruleTurnTable ( (lv_cost_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_services_8_0= ruleService ) )* ( (lv_inputSlots_9_0= ruleSlot ) )* ( (lv_outputSlots_10_0= ruleSlot ) )* otherlv_11= '}' )
                    // InternalStl.g:363:4: this_TurnTable_5= ruleTurnTable ( (lv_cost_6_0= ruleEInt ) ) otherlv_7= '{' ( (lv_services_8_0= ruleService ) )* ( (lv_inputSlots_9_0= ruleSlot ) )* ( (lv_outputSlots_10_0= ruleSlot ) )* otherlv_11= '}'
                    {

                    				newCompositeNode(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_5_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_TurnTable_5=ruleTurnTable();

                    state._fsp--;


                    				current = this_TurnTable_5;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalStl.g:371:4: ( (lv_cost_6_0= ruleEInt ) )
                    // InternalStl.g:372:5: (lv_cost_6_0= ruleEInt )
                    {
                    // InternalStl.g:372:5: (lv_cost_6_0= ruleEInt )
                    // InternalStl.g:373:6: lv_cost_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getCostEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_cost_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						set(
                    							current,
                    							"cost",
                    							lv_cost_6_0,
                    							"at.ac.tuwien.big.Stl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalStl.g:394:4: ( (lv_services_8_0= ruleService ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStl.g:395:5: (lv_services_8_0= ruleService )
                    	    {
                    	    // InternalStl.g:395:5: (lv_services_8_0= ruleService )
                    	    // InternalStl.g:396:6: lv_services_8_0= ruleService
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_services_8_0=ruleService();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"services",
                    	    							lv_services_8_0,
                    	    							"at.ac.tuwien.big.Stl.Service");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalStl.g:413:4: ( (lv_inputSlots_9_0= ruleSlot ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==RULE_ID) ) {
                                int LA6_3 = input.LA(3);

                                if ( (LA6_3==18) ) {
                                    int LA6_4 = input.LA(4);

                                    if ( (LA6_4==12) ) {
                                        int LA6_5 = input.LA(5);

                                        if ( (LA6_5==13) ) {
                                            alt6=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalStl.g:414:5: (lv_inputSlots_9_0= ruleSlot )
                    	    {
                    	    // InternalStl.g:414:5: (lv_inputSlots_9_0= ruleSlot )
                    	    // InternalStl.g:415:6: lv_inputSlots_9_0= ruleSlot
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentAccess().getInputSlotsSlotParserRuleCall_5_4_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_inputSlots_9_0=ruleSlot();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputSlots",
                    	    							lv_inputSlots_9_0,
                    	    							"at.ac.tuwien.big.Stl.Slot");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalStl.g:432:4: ( (lv_outputSlots_10_0= ruleSlot ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStl.g:433:5: (lv_outputSlots_10_0= ruleSlot )
                    	    {
                    	    // InternalStl.g:433:5: (lv_outputSlots_10_0= ruleSlot )
                    	    // InternalStl.g:434:6: lv_outputSlots_10_0= ruleSlot
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentAccess().getOutputSlotsSlotParserRuleCall_5_5_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_outputSlots_10_0=ruleSlot();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputSlots",
                    	    							lv_outputSlots_10_0,
                    	    							"at.ac.tuwien.big.Stl.Slot");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleService"
    // InternalStl.g:460:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalStl.g:460:48: (iv_ruleService= ruleService EOF )
            // InternalStl.g:461:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalStl.g:467:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cost_3_0= ruleEInt ) ) ( (lv_processingTime_4_0= ruleEInt ) ) ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) )* otherlv_9= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_cost_3_0 = null;

        AntlrDatatypeRuleToken lv_processingTime_4_0 = null;

        AntlrDatatypeRuleToken lv_reliability_5_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalStl.g:473:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cost_3_0= ruleEInt ) ) ( (lv_processingTime_4_0= ruleEInt ) ) ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) )* otherlv_9= '}' ) )
            // InternalStl.g:474:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cost_3_0= ruleEInt ) ) ( (lv_processingTime_4_0= ruleEInt ) ) ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) )* otherlv_9= '}' )
            {
            // InternalStl.g:474:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cost_3_0= ruleEInt ) ) ( (lv_processingTime_4_0= ruleEInt ) ) ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) )* otherlv_9= '}' )
            // InternalStl.g:475:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_cost_3_0= ruleEInt ) ) ( (lv_processingTime_4_0= ruleEInt ) ) ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalStl.g:479:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:480:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:480:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:481:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalStl.g:501:3: ( (lv_cost_3_0= ruleEInt ) )
            // InternalStl.g:502:4: (lv_cost_3_0= ruleEInt )
            {
            // InternalStl.g:502:4: (lv_cost_3_0= ruleEInt )
            // InternalStl.g:503:5: lv_cost_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_cost_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"cost",
            						lv_cost_3_0,
            						"at.ac.tuwien.big.Stl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStl.g:520:3: ( (lv_processingTime_4_0= ruleEInt ) )
            // InternalStl.g:521:4: (lv_processingTime_4_0= ruleEInt )
            {
            // InternalStl.g:521:4: (lv_processingTime_4_0= ruleEInt )
            // InternalStl.g:522:5: lv_processingTime_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_processingTime_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"processingTime",
            						lv_processingTime_4_0,
            						"at.ac.tuwien.big.Stl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStl.g:539:3: ( (lv_reliability_5_0= ruleEDouble ) )
            // InternalStl.g:540:4: (lv_reliability_5_0= ruleEDouble )
            {
            // InternalStl.g:540:4: (lv_reliability_5_0= ruleEDouble )
            // InternalStl.g:541:5: lv_reliability_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_reliability_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"reliability",
            						lv_reliability_5_0,
            						"at.ac.tuwien.big.Stl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalStl.g:566:3: ( (lv_parameters_8_0= ruleParameter ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStl.g:567:4: (lv_parameters_8_0= ruleParameter )
            	    {
            	    // InternalStl.g:567:4: (lv_parameters_8_0= ruleParameter )
            	    // InternalStl.g:568:5: lv_parameters_8_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_parameters_8_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_8_0,
            	    						"at.ac.tuwien.big.Stl.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleParameter"
    // InternalStl.g:593:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalStl.g:593:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalStl.g:594:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalStl.g:600:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStl.g:606:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalStl.g:607:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalStl.g:607:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalStl.g:608:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getNameKeyword_0());
            		
            // InternalStl.g:612:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:613:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:613:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:614:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConnector"
    // InternalStl.g:642:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalStl.g:642:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalStl.g:643:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalStl.g:649:1: ruleConnector returns [EObject current=null] : (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStl.g:655:2: ( (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalStl.g:656:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalStl.g:656:2: (otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // InternalStl.g:657:3: otherlv_0= '{' ( (otherlv_1= RULE_ID ) ) otherlv_2= '>' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalStl.g:661:3: ( (otherlv_1= RULE_ID ) )
            // InternalStl.g:662:4: (otherlv_1= RULE_ID )
            {
            // InternalStl.g:662:4: (otherlv_1= RULE_ID )
            // InternalStl.g:663:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getEntrySlotCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_2());
            		
            // InternalStl.g:678:3: ( (otherlv_3= RULE_ID ) )
            // InternalStl.g:679:4: (otherlv_3= RULE_ID )
            {
            // InternalStl.g:679:4: (otherlv_3= RULE_ID )
            // InternalStl.g:680:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getExitSlotCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleSlot"
    // InternalStl.g:699:1: entryRuleSlot returns [EObject current=null] : iv_ruleSlot= ruleSlot EOF ;
    public final EObject entryRuleSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlot = null;


        try {
            // InternalStl.g:699:45: (iv_ruleSlot= ruleSlot EOF )
            // InternalStl.g:700:2: iv_ruleSlot= ruleSlot EOF
            {
             newCompositeNode(grammarAccess.getSlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlot=ruleSlot();

            state._fsp--;

             current =iv_ruleSlot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSlot"


    // $ANTLR start "ruleSlot"
    // InternalStl.g:706:1: ruleSlot returns [EObject current=null] : (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleSlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStl.g:712:2: ( (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= '{' otherlv_4= '}' ) )
            // InternalStl.g:713:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalStl.g:713:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= '{' otherlv_4= '}' )
            // InternalStl.g:714:3: otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSlotAccess().getSlotKeyword_0());
            		
            // InternalStl.g:718:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:719:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:719:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:720:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSlotAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSlotAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSlotAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSlot"


    // $ANTLR start "entryRuleItemGenerator"
    // InternalStl.g:752:1: entryRuleItemGenerator returns [EObject current=null] : iv_ruleItemGenerator= ruleItemGenerator EOF ;
    public final EObject entryRuleItemGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemGenerator = null;


        try {
            // InternalStl.g:752:54: (iv_ruleItemGenerator= ruleItemGenerator EOF )
            // InternalStl.g:753:2: iv_ruleItemGenerator= ruleItemGenerator EOF
            {
             newCompositeNode(grammarAccess.getItemGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemGenerator=ruleItemGenerator();

            state._fsp--;

             current =iv_ruleItemGenerator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItemGenerator"


    // $ANTLR start "ruleItemGenerator"
    // InternalStl.g:759:1: ruleItemGenerator returns [EObject current=null] : (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'generates' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleItemGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalStl.g:765:2: ( (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'generates' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' ) )
            // InternalStl.g:766:2: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'generates' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' )
            {
            // InternalStl.g:766:2: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'generates' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' )
            // InternalStl.g:767:3: otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'generates' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0());
            		
            // InternalStl.g:771:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:772:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:772:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:773:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStl.g:789:3: (otherlv_2= 'generates' ( (otherlv_3= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStl.g:790:4: otherlv_2= 'generates' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2_0());
                    			
                    // InternalStl.g:794:4: ( (otherlv_3= RULE_ID ) )
                    // InternalStl.g:795:5: (otherlv_3= RULE_ID )
                    {
                    // InternalStl.g:795:5: (otherlv_3= RULE_ID )
                    // InternalStl.g:796:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemGeneratorRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_3, grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getItemGeneratorAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemGenerator"


    // $ANTLR start "entryRuleStore"
    // InternalStl.g:820:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalStl.g:820:46: (iv_ruleStore= ruleStore EOF )
            // InternalStl.g:821:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalStl.g:827:1: ruleStore returns [EObject current=null] : (this_WasteStore_0= ruleWasteStore | (this_ProductStore_1= ruleProductStore ( (lv_capacity_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= '}' ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_WasteStore_0 = null;

        EObject this_ProductStore_1 = null;

        AntlrDatatypeRuleToken lv_capacity_2_0 = null;



        	enterRule();

        try {
            // InternalStl.g:833:2: ( (this_WasteStore_0= ruleWasteStore | (this_ProductStore_1= ruleProductStore ( (lv_capacity_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= '}' ) ) )
            // InternalStl.g:834:2: (this_WasteStore_0= ruleWasteStore | (this_ProductStore_1= ruleProductStore ( (lv_capacity_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= '}' ) )
            {
            // InternalStl.g:834:2: (this_WasteStore_0= ruleWasteStore | (this_ProductStore_1= ruleProductStore ( (lv_capacity_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= '}' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalStl.g:835:3: this_WasteStore_0= ruleWasteStore
                    {

                    			newCompositeNode(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WasteStore_0=ruleWasteStore();

                    state._fsp--;


                    			current = this_WasteStore_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStl.g:844:3: (this_ProductStore_1= ruleProductStore ( (lv_capacity_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= '}' )
                    {
                    // InternalStl.g:844:3: (this_ProductStore_1= ruleProductStore ( (lv_capacity_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= '}' )
                    // InternalStl.g:845:4: this_ProductStore_1= ruleProductStore ( (lv_capacity_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= '}'
                    {

                    				newCompositeNode(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_ProductStore_1=ruleProductStore();

                    state._fsp--;


                    				current = this_ProductStore_1;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalStl.g:853:4: ( (lv_capacity_2_0= ruleEInt ) )
                    // InternalStl.g:854:5: (lv_capacity_2_0= ruleEInt )
                    {
                    // InternalStl.g:854:5: (lv_capacity_2_0= ruleEInt )
                    // InternalStl.g:855:6: lv_capacity_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStoreAccess().getCapacityEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_capacity_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStoreRule());
                    						}
                    						set(
                    							current,
                    							"capacity",
                    							lv_capacity_2_0,
                    							"at.ac.tuwien.big.Stl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleWasteStore"
    // InternalStl.g:885:1: entryRuleWasteStore returns [EObject current=null] : iv_ruleWasteStore= ruleWasteStore EOF ;
    public final EObject entryRuleWasteStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWasteStore = null;


        try {
            // InternalStl.g:885:51: (iv_ruleWasteStore= ruleWasteStore EOF )
            // InternalStl.g:886:2: iv_ruleWasteStore= ruleWasteStore EOF
            {
             newCompositeNode(grammarAccess.getWasteStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWasteStore=ruleWasteStore();

            state._fsp--;

             current =iv_ruleWasteStore; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWasteStore"


    // $ANTLR start "ruleWasteStore"
    // InternalStl.g:892:1: ruleWasteStore returns [EObject current=null] : (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleWasteStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStl.g:898:2: ( (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStl.g:899:2: (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStl.g:899:2: (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStl.g:900:3: otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0());
            		
            // InternalStl.g:904:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:905:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:905:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:906:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWasteStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWasteStore"


    // $ANTLR start "entryRuleProductStore"
    // InternalStl.g:926:1: entryRuleProductStore returns [EObject current=null] : iv_ruleProductStore= ruleProductStore EOF ;
    public final EObject entryRuleProductStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductStore = null;


        try {
            // InternalStl.g:926:53: (iv_ruleProductStore= ruleProductStore EOF )
            // InternalStl.g:927:2: iv_ruleProductStore= ruleProductStore EOF
            {
             newCompositeNode(grammarAccess.getProductStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductStore=ruleProductStore();

            state._fsp--;

             current =iv_ruleProductStore; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProductStore"


    // $ANTLR start "ruleProductStore"
    // InternalStl.g:933:1: ruleProductStore returns [EObject current=null] : (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProductStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStl.g:939:2: ( (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStl.g:940:2: (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStl.g:940:2: (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStl.g:941:3: otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProductStoreAccess().getProductStoreKeyword_0());
            		
            // InternalStl.g:945:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:946:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:946:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:947:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductStore"


    // $ANTLR start "entryRuleBuffer"
    // InternalStl.g:967:1: entryRuleBuffer returns [EObject current=null] : iv_ruleBuffer= ruleBuffer EOF ;
    public final EObject entryRuleBuffer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuffer = null;


        try {
            // InternalStl.g:967:47: (iv_ruleBuffer= ruleBuffer EOF )
            // InternalStl.g:968:2: iv_ruleBuffer= ruleBuffer EOF
            {
             newCompositeNode(grammarAccess.getBufferRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuffer=ruleBuffer();

            state._fsp--;

             current =iv_ruleBuffer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBuffer"


    // $ANTLR start "ruleBuffer"
    // InternalStl.g:974:1: ruleBuffer returns [EObject current=null] : (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleBuffer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStl.g:980:2: ( (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalStl.g:981:2: (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalStl.g:981:2: (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalStl.g:982:3: otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBufferAccess().getBufferKeyword_0());
            		
            // InternalStl.g:986:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:987:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:987:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:988:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBufferRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getBufferAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuffer"


    // $ANTLR start "entryRuleMachine"
    // InternalStl.g:1016:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalStl.g:1016:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalStl.g:1017:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalStl.g:1023:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStl.g:1029:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalStl.g:1030:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalStl.g:1030:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalStl.g:1031:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalStl.g:1035:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1036:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1036:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1037:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleConveyor"
    // InternalStl.g:1065:1: entryRuleConveyor returns [EObject current=null] : iv_ruleConveyor= ruleConveyor EOF ;
    public final EObject entryRuleConveyor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConveyor = null;


        try {
            // InternalStl.g:1065:49: (iv_ruleConveyor= ruleConveyor EOF )
            // InternalStl.g:1066:2: iv_ruleConveyor= ruleConveyor EOF
            {
             newCompositeNode(grammarAccess.getConveyorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConveyor=ruleConveyor();

            state._fsp--;

             current =iv_ruleConveyor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConveyor"


    // $ANTLR start "ruleConveyor"
    // InternalStl.g:1072:1: ruleConveyor returns [EObject current=null] : (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleConveyor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStl.g:1078:2: ( (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalStl.g:1079:2: (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalStl.g:1079:2: (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalStl.g:1080:3: otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConveyorAccess().getConveyorKeyword_0());
            		
            // InternalStl.g:1084:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1085:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1085:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1086:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConveyorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getConveyorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConveyor"


    // $ANTLR start "entryRuleTurnTable"
    // InternalStl.g:1114:1: entryRuleTurnTable returns [EObject current=null] : iv_ruleTurnTable= ruleTurnTable EOF ;
    public final EObject entryRuleTurnTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnTable = null;


        try {
            // InternalStl.g:1114:50: (iv_ruleTurnTable= ruleTurnTable EOF )
            // InternalStl.g:1115:2: iv_ruleTurnTable= ruleTurnTable EOF
            {
             newCompositeNode(grammarAccess.getTurnTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnTable=ruleTurnTable();

            state._fsp--;

             current =iv_ruleTurnTable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTurnTable"


    // $ANTLR start "ruleTurnTable"
    // InternalStl.g:1121:1: ruleTurnTable returns [EObject current=null] : (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleTurnTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStl.g:1127:2: ( (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalStl.g:1128:2: (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalStl.g:1128:2: (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalStl.g:1129:3: otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnTableAccess().getTurntableKeyword_0());
            		
            // InternalStl.g:1133:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1134:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1134:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1135:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnTableAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnTable"


    // $ANTLR start "entryRuleEDouble"
    // InternalStl.g:1163:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalStl.g:1163:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalStl.g:1164:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalStl.g:1170:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalStl.g:1176:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalStl.g:1177:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalStl.g:1177:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalStl.g:1178:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalStl.g:1178:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStl.g:1179:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalStl.g:1185:3: (this_INT_1= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStl.g:1186:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_23); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalStl.g:1206:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=33 && LA16_0<=34)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStl.g:1207:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalStl.g:1207:4: (kw= 'E' | kw= 'e' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==33) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==34) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalStl.g:1208:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalStl.g:1214:5: kw= 'e'
                            {
                            kw=(Token)match(input,34,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalStl.g:1220:4: (kw= '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==31) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalStl.g:1221:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalStl.g:1239:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStl.g:1239:47: (iv_ruleEString= ruleEString EOF )
            // InternalStl.g:1240:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStl.g:1246:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalStl.g:1252:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalStl.g:1253:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalStl.g:1253:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalStl.g:1254:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStl.g:1262:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalStl.g:1273:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalStl.g:1273:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalStl.g:1274:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalStl.g:1280:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalStl.g:1286:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalStl.g:1287:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalStl.g:1287:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalStl.g:1288:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalStl.g:1288:3: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalStl.g:1289:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000007E803000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000422000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000002L});

}