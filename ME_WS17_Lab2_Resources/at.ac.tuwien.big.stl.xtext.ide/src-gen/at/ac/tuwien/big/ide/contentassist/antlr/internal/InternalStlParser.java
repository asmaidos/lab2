package at.ac.tuwien.big.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.services.StlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'system'", "'{'", "'}'", "'area'", "'item'", "'='", "'service'", "'('", "')'", "'name'", "'>'", "'slot'", "'generator'", "'generates'", "'wasteStore'", "'productStore'", "'buffer'", "'machine'", "'conveyor'", "'turntable'", "'-'", "'.'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

    	public void setGrammarAccess(StlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSystem"
    // InternalStl.g:54:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalStl.g:55:1: ( ruleSystem EOF )
            // InternalStl.g:56:1: ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalStl.g:63:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:67:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalStl.g:68:2: ( ( rule__System__Group__0 ) )
            {
            // InternalStl.g:68:2: ( ( rule__System__Group__0 ) )
            // InternalStl.g:69:3: ( rule__System__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup()); 
            }
            // InternalStl.g:70:3: ( rule__System__Group__0 )
            // InternalStl.g:70:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleArea"
    // InternalStl.g:79:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalStl.g:80:1: ( ruleArea EOF )
            // InternalStl.g:81:1: ruleArea EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArea();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalStl.g:88:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:92:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalStl.g:93:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalStl.g:93:2: ( ( rule__Area__Group__0 ) )
            // InternalStl.g:94:3: ( rule__Area__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getGroup()); 
            }
            // InternalStl.g:95:3: ( rule__Area__Group__0 )
            // InternalStl.g:95:4: rule__Area__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleItemType"
    // InternalStl.g:104:1: entryRuleItemType : ruleItemType EOF ;
    public final void entryRuleItemType() throws RecognitionException {
        try {
            // InternalStl.g:105:1: ( ruleItemType EOF )
            // InternalStl.g:106:1: ruleItemType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalStl.g:113:1: ruleItemType : ( ( rule__ItemType__Group__0 ) ) ;
    public final void ruleItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:117:2: ( ( ( rule__ItemType__Group__0 ) ) )
            // InternalStl.g:118:2: ( ( rule__ItemType__Group__0 ) )
            {
            // InternalStl.g:118:2: ( ( rule__ItemType__Group__0 ) )
            // InternalStl.g:119:3: ( rule__ItemType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getGroup()); 
            }
            // InternalStl.g:120:3: ( rule__ItemType__Group__0 )
            // InternalStl.g:120:4: rule__ItemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleComponent"
    // InternalStl.g:129:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalStl.g:130:1: ( ruleComponent EOF )
            // InternalStl.g:131:1: ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalStl.g:138:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:142:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalStl.g:143:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalStl.g:143:2: ( ( rule__Component__Alternatives ) )
            // InternalStl.g:144:3: ( rule__Component__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAlternatives()); 
            }
            // InternalStl.g:145:3: ( rule__Component__Alternatives )
            // InternalStl.g:145:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleService"
    // InternalStl.g:154:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalStl.g:155:1: ( ruleService EOF )
            // InternalStl.g:156:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalStl.g:163:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:167:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalStl.g:168:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalStl.g:168:2: ( ( rule__Service__Group__0 ) )
            // InternalStl.g:169:3: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // InternalStl.g:170:3: ( rule__Service__Group__0 )
            // InternalStl.g:170:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleParameter"
    // InternalStl.g:179:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalStl.g:180:1: ( ruleParameter EOF )
            // InternalStl.g:181:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalStl.g:188:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:192:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalStl.g:193:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalStl.g:193:2: ( ( rule__Parameter__Group__0 ) )
            // InternalStl.g:194:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalStl.g:195:3: ( rule__Parameter__Group__0 )
            // InternalStl.g:195:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConnector"
    // InternalStl.g:204:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalStl.g:205:1: ( ruleConnector EOF )
            // InternalStl.g:206:1: ruleConnector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalStl.g:213:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:217:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalStl.g:218:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalStl.g:218:2: ( ( rule__Connector__Group__0 ) )
            // InternalStl.g:219:3: ( rule__Connector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getGroup()); 
            }
            // InternalStl.g:220:3: ( rule__Connector__Group__0 )
            // InternalStl.g:220:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleSlot"
    // InternalStl.g:229:1: entryRuleSlot : ruleSlot EOF ;
    public final void entryRuleSlot() throws RecognitionException {
        try {
            // InternalStl.g:230:1: ( ruleSlot EOF )
            // InternalStl.g:231:1: ruleSlot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlot"


    // $ANTLR start "ruleSlot"
    // InternalStl.g:238:1: ruleSlot : ( ( rule__Slot__Group__0 ) ) ;
    public final void ruleSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:242:2: ( ( ( rule__Slot__Group__0 ) ) )
            // InternalStl.g:243:2: ( ( rule__Slot__Group__0 ) )
            {
            // InternalStl.g:243:2: ( ( rule__Slot__Group__0 ) )
            // InternalStl.g:244:3: ( rule__Slot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getGroup()); 
            }
            // InternalStl.g:245:3: ( rule__Slot__Group__0 )
            // InternalStl.g:245:4: rule__Slot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Slot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlot"


    // $ANTLR start "entryRuleItemGenerator"
    // InternalStl.g:254:1: entryRuleItemGenerator : ruleItemGenerator EOF ;
    public final void entryRuleItemGenerator() throws RecognitionException {
        try {
            // InternalStl.g:255:1: ( ruleItemGenerator EOF )
            // InternalStl.g:256:1: ruleItemGenerator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItemGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemGenerator"


    // $ANTLR start "ruleItemGenerator"
    // InternalStl.g:263:1: ruleItemGenerator : ( ( rule__ItemGenerator__Group__0 ) ) ;
    public final void ruleItemGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:267:2: ( ( ( rule__ItemGenerator__Group__0 ) ) )
            // InternalStl.g:268:2: ( ( rule__ItemGenerator__Group__0 ) )
            {
            // InternalStl.g:268:2: ( ( rule__ItemGenerator__Group__0 ) )
            // InternalStl.g:269:3: ( rule__ItemGenerator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGroup()); 
            }
            // InternalStl.g:270:3: ( rule__ItemGenerator__Group__0 )
            // InternalStl.g:270:4: rule__ItemGenerator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemGenerator"


    // $ANTLR start "entryRuleStore"
    // InternalStl.g:279:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalStl.g:280:1: ( ruleStore EOF )
            // InternalStl.g:281:1: ruleStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalStl.g:288:1: ruleStore : ( ( rule__Store__Alternatives ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:292:2: ( ( ( rule__Store__Alternatives ) ) )
            // InternalStl.g:293:2: ( ( rule__Store__Alternatives ) )
            {
            // InternalStl.g:293:2: ( ( rule__Store__Alternatives ) )
            // InternalStl.g:294:3: ( rule__Store__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreAccess().getAlternatives()); 
            }
            // InternalStl.g:295:3: ( rule__Store__Alternatives )
            // InternalStl.g:295:4: rule__Store__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Store__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleWasteStore"
    // InternalStl.g:304:1: entryRuleWasteStore : ruleWasteStore EOF ;
    public final void entryRuleWasteStore() throws RecognitionException {
        try {
            // InternalStl.g:305:1: ( ruleWasteStore EOF )
            // InternalStl.g:306:1: ruleWasteStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWasteStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWasteStore"


    // $ANTLR start "ruleWasteStore"
    // InternalStl.g:313:1: ruleWasteStore : ( ( rule__WasteStore__Group__0 ) ) ;
    public final void ruleWasteStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:317:2: ( ( ( rule__WasteStore__Group__0 ) ) )
            // InternalStl.g:318:2: ( ( rule__WasteStore__Group__0 ) )
            {
            // InternalStl.g:318:2: ( ( rule__WasteStore__Group__0 ) )
            // InternalStl.g:319:3: ( rule__WasteStore__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getGroup()); 
            }
            // InternalStl.g:320:3: ( rule__WasteStore__Group__0 )
            // InternalStl.g:320:4: rule__WasteStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWasteStore"


    // $ANTLR start "entryRuleProductStore"
    // InternalStl.g:329:1: entryRuleProductStore : ruleProductStore EOF ;
    public final void entryRuleProductStore() throws RecognitionException {
        try {
            // InternalStl.g:330:1: ( ruleProductStore EOF )
            // InternalStl.g:331:1: ruleProductStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProductStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProductStore"


    // $ANTLR start "ruleProductStore"
    // InternalStl.g:338:1: ruleProductStore : ( ( rule__ProductStore__Group__0 ) ) ;
    public final void ruleProductStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:342:2: ( ( ( rule__ProductStore__Group__0 ) ) )
            // InternalStl.g:343:2: ( ( rule__ProductStore__Group__0 ) )
            {
            // InternalStl.g:343:2: ( ( rule__ProductStore__Group__0 ) )
            // InternalStl.g:344:3: ( rule__ProductStore__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getGroup()); 
            }
            // InternalStl.g:345:3: ( rule__ProductStore__Group__0 )
            // InternalStl.g:345:4: rule__ProductStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductStore"


    // $ANTLR start "entryRuleBuffer"
    // InternalStl.g:354:1: entryRuleBuffer : ruleBuffer EOF ;
    public final void entryRuleBuffer() throws RecognitionException {
        try {
            // InternalStl.g:355:1: ( ruleBuffer EOF )
            // InternalStl.g:356:1: ruleBuffer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBuffer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuffer"


    // $ANTLR start "ruleBuffer"
    // InternalStl.g:363:1: ruleBuffer : ( ( rule__Buffer__Group__0 ) ) ;
    public final void ruleBuffer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:367:2: ( ( ( rule__Buffer__Group__0 ) ) )
            // InternalStl.g:368:2: ( ( rule__Buffer__Group__0 ) )
            {
            // InternalStl.g:368:2: ( ( rule__Buffer__Group__0 ) )
            // InternalStl.g:369:3: ( rule__Buffer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getGroup()); 
            }
            // InternalStl.g:370:3: ( rule__Buffer__Group__0 )
            // InternalStl.g:370:4: rule__Buffer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuffer"


    // $ANTLR start "entryRuleMachine"
    // InternalStl.g:379:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalStl.g:380:1: ( ruleMachine EOF )
            // InternalStl.g:381:1: ruleMachine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalStl.g:388:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:392:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalStl.g:393:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalStl.g:393:2: ( ( rule__Machine__Group__0 ) )
            // InternalStl.g:394:3: ( rule__Machine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup()); 
            }
            // InternalStl.g:395:3: ( rule__Machine__Group__0 )
            // InternalStl.g:395:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleConveyor"
    // InternalStl.g:404:1: entryRuleConveyor : ruleConveyor EOF ;
    public final void entryRuleConveyor() throws RecognitionException {
        try {
            // InternalStl.g:405:1: ( ruleConveyor EOF )
            // InternalStl.g:406:1: ruleConveyor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConveyor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConveyor"


    // $ANTLR start "ruleConveyor"
    // InternalStl.g:413:1: ruleConveyor : ( ( rule__Conveyor__Group__0 ) ) ;
    public final void ruleConveyor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:417:2: ( ( ( rule__Conveyor__Group__0 ) ) )
            // InternalStl.g:418:2: ( ( rule__Conveyor__Group__0 ) )
            {
            // InternalStl.g:418:2: ( ( rule__Conveyor__Group__0 ) )
            // InternalStl.g:419:3: ( rule__Conveyor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getGroup()); 
            }
            // InternalStl.g:420:3: ( rule__Conveyor__Group__0 )
            // InternalStl.g:420:4: rule__Conveyor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConveyor"


    // $ANTLR start "entryRuleTurnTable"
    // InternalStl.g:429:1: entryRuleTurnTable : ruleTurnTable EOF ;
    public final void entryRuleTurnTable() throws RecognitionException {
        try {
            // InternalStl.g:430:1: ( ruleTurnTable EOF )
            // InternalStl.g:431:1: ruleTurnTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTurnTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnTable"


    // $ANTLR start "ruleTurnTable"
    // InternalStl.g:438:1: ruleTurnTable : ( ( rule__TurnTable__Group__0 ) ) ;
    public final void ruleTurnTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:442:2: ( ( ( rule__TurnTable__Group__0 ) ) )
            // InternalStl.g:443:2: ( ( rule__TurnTable__Group__0 ) )
            {
            // InternalStl.g:443:2: ( ( rule__TurnTable__Group__0 ) )
            // InternalStl.g:444:3: ( rule__TurnTable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup()); 
            }
            // InternalStl.g:445:3: ( rule__TurnTable__Group__0 )
            // InternalStl.g:445:4: rule__TurnTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnTable"


    // $ANTLR start "entryRuleEDouble"
    // InternalStl.g:454:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalStl.g:455:1: ( ruleEDouble EOF )
            // InternalStl.g:456:1: ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalStl.g:463:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:467:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalStl.g:468:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalStl.g:468:2: ( ( rule__EDouble__Group__0 ) )
            // InternalStl.g:469:3: ( rule__EDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup()); 
            }
            // InternalStl.g:470:3: ( rule__EDouble__Group__0 )
            // InternalStl.g:470:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalStl.g:479:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalStl.g:480:1: ( ruleEString EOF )
            // InternalStl.g:481:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStl.g:488:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:492:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalStl.g:493:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalStl.g:493:2: ( ( rule__EString__Alternatives ) )
            // InternalStl.g:494:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalStl.g:495:3: ( rule__EString__Alternatives )
            // InternalStl.g:495:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalStl.g:504:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalStl.g:505:1: ( ruleEInt EOF )
            // InternalStl.g:506:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalStl.g:513:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:517:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalStl.g:518:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalStl.g:518:2: ( ( rule__EInt__Group__0 ) )
            // InternalStl.g:519:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalStl.g:520:3: ( rule__EInt__Group__0 )
            // InternalStl.g:520:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalStl.g:528:1: rule__Component__Alternatives : ( ( ruleItemGenerator ) | ( ruleStore ) | ( ruleBuffer ) | ( ruleConveyor ) | ( ruleMachine ) | ( ( rule__Component__Group_5__0 ) ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:532:1: ( ( ruleItemGenerator ) | ( ruleStore ) | ( ruleBuffer ) | ( ruleConveyor ) | ( ruleMachine ) | ( ( rule__Component__Group_5__0 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 27:
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalStl.g:533:2: ( ruleItemGenerator )
                    {
                    // InternalStl.g:533:2: ( ruleItemGenerator )
                    // InternalStl.g:534:3: ruleItemGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleItemGenerator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:539:2: ( ruleStore )
                    {
                    // InternalStl.g:539:2: ( ruleStore )
                    // InternalStl.g:540:3: ruleStore
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getStoreParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getStoreParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStl.g:545:2: ( ruleBuffer )
                    {
                    // InternalStl.g:545:2: ( ruleBuffer )
                    // InternalStl.g:546:3: ruleBuffer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getBufferParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBuffer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getBufferParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStl.g:551:2: ( ruleConveyor )
                    {
                    // InternalStl.g:551:2: ( ruleConveyor )
                    // InternalStl.g:552:3: ruleConveyor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getConveyorParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConveyor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getConveyorParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStl.g:557:2: ( ruleMachine )
                    {
                    // InternalStl.g:557:2: ( ruleMachine )
                    // InternalStl.g:558:3: ruleMachine
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getMachineParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMachine();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getMachineParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalStl.g:563:2: ( ( rule__Component__Group_5__0 ) )
                    {
                    // InternalStl.g:563:2: ( ( rule__Component__Group_5__0 ) )
                    // InternalStl.g:564:3: ( rule__Component__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getGroup_5()); 
                    }
                    // InternalStl.g:565:3: ( rule__Component__Group_5__0 )
                    // InternalStl.g:565:4: rule__Component__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__Store__Alternatives"
    // InternalStl.g:573:1: rule__Store__Alternatives : ( ( ruleWasteStore ) | ( ( rule__Store__Group_1__0 ) ) );
    public final void rule__Store__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:577:1: ( ( ruleWasteStore ) | ( ( rule__Store__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStl.g:578:2: ( ruleWasteStore )
                    {
                    // InternalStl.g:578:2: ( ruleWasteStore )
                    // InternalStl.g:579:3: ruleWasteStore
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWasteStore();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:584:2: ( ( rule__Store__Group_1__0 ) )
                    {
                    // InternalStl.g:584:2: ( ( rule__Store__Group_1__0 ) )
                    // InternalStl.g:585:3: ( rule__Store__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStoreAccess().getGroup_1()); 
                    }
                    // InternalStl.g:586:3: ( rule__Store__Group_1__0 )
                    // InternalStl.g:586:4: rule__Store__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Store__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStoreAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalStl.g:594:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:598:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStl.g:599:2: ( 'E' )
                    {
                    // InternalStl.g:599:2: ( 'E' )
                    // InternalStl.g:600:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:605:2: ( 'e' )
                    {
                    // InternalStl.g:605:2: ( 'e' )
                    // InternalStl.g:606:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalStl.g:615:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:619:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalStl.g:620:2: ( RULE_STRING )
                    {
                    // InternalStl.g:620:2: ( RULE_STRING )
                    // InternalStl.g:621:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:626:2: ( RULE_ID )
                    {
                    // InternalStl.g:626:2: ( RULE_ID )
                    // InternalStl.g:627:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalStl.g:636:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:640:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalStl.g:641:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalStl.g:648:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:652:1: ( ( 'system' ) )
            // InternalStl.g:653:1: ( 'system' )
            {
            // InternalStl.g:653:1: ( 'system' )
            // InternalStl.g:654:2: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalStl.g:663:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:667:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalStl.g:668:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalStl.g:675:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:679:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalStl.g:680:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalStl.g:680:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalStl.g:681:2: ( rule__System__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:682:2: ( rule__System__NameAssignment_1 )
            // InternalStl.g:682:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalStl.g:690:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:694:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalStl.g:695:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalStl.g:702:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:706:1: ( ( '{' ) )
            // InternalStl.g:707:1: ( '{' )
            {
            // InternalStl.g:707:1: ( '{' )
            // InternalStl.g:708:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalStl.g:717:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:721:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalStl.g:722:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__System__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalStl.g:729:1: rule__System__Group__3__Impl : ( ( ( rule__System__ItemTypesAssignment_3 ) ) ( ( rule__System__ItemTypesAssignment_3 )* ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:733:1: ( ( ( ( rule__System__ItemTypesAssignment_3 ) ) ( ( rule__System__ItemTypesAssignment_3 )* ) ) )
            // InternalStl.g:734:1: ( ( ( rule__System__ItemTypesAssignment_3 ) ) ( ( rule__System__ItemTypesAssignment_3 )* ) )
            {
            // InternalStl.g:734:1: ( ( ( rule__System__ItemTypesAssignment_3 ) ) ( ( rule__System__ItemTypesAssignment_3 )* ) )
            // InternalStl.g:735:2: ( ( rule__System__ItemTypesAssignment_3 ) ) ( ( rule__System__ItemTypesAssignment_3 )* )
            {
            // InternalStl.g:735:2: ( ( rule__System__ItemTypesAssignment_3 ) )
            // InternalStl.g:736:3: ( rule__System__ItemTypesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getItemTypesAssignment_3()); 
            }
            // InternalStl.g:737:3: ( rule__System__ItemTypesAssignment_3 )
            // InternalStl.g:737:4: rule__System__ItemTypesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__System__ItemTypesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getItemTypesAssignment_3()); 
            }

            }

            // InternalStl.g:740:2: ( ( rule__System__ItemTypesAssignment_3 )* )
            // InternalStl.g:741:3: ( rule__System__ItemTypesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getItemTypesAssignment_3()); 
            }
            // InternalStl.g:742:3: ( rule__System__ItemTypesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStl.g:742:4: rule__System__ItemTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__System__ItemTypesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getItemTypesAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalStl.g:751:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:755:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalStl.g:756:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__System__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalStl.g:763:1: rule__System__Group__4__Impl : ( ( ( rule__System__AreasAssignment_4 ) ) ( ( rule__System__AreasAssignment_4 )* ) ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:767:1: ( ( ( ( rule__System__AreasAssignment_4 ) ) ( ( rule__System__AreasAssignment_4 )* ) ) )
            // InternalStl.g:768:1: ( ( ( rule__System__AreasAssignment_4 ) ) ( ( rule__System__AreasAssignment_4 )* ) )
            {
            // InternalStl.g:768:1: ( ( ( rule__System__AreasAssignment_4 ) ) ( ( rule__System__AreasAssignment_4 )* ) )
            // InternalStl.g:769:2: ( ( rule__System__AreasAssignment_4 ) ) ( ( rule__System__AreasAssignment_4 )* )
            {
            // InternalStl.g:769:2: ( ( rule__System__AreasAssignment_4 ) )
            // InternalStl.g:770:3: ( rule__System__AreasAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getAreasAssignment_4()); 
            }
            // InternalStl.g:771:3: ( rule__System__AreasAssignment_4 )
            // InternalStl.g:771:4: rule__System__AreasAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__System__AreasAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getAreasAssignment_4()); 
            }

            }

            // InternalStl.g:774:2: ( ( rule__System__AreasAssignment_4 )* )
            // InternalStl.g:775:3: ( rule__System__AreasAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getAreasAssignment_4()); 
            }
            // InternalStl.g:776:3: ( rule__System__AreasAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStl.g:776:4: rule__System__AreasAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__System__AreasAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getAreasAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalStl.g:785:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:789:1: ( rule__System__Group__5__Impl )
            // InternalStl.g:790:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalStl.g:796:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:800:1: ( ( '}' ) )
            // InternalStl.g:801:1: ( '}' )
            {
            // InternalStl.g:801:1: ( '}' )
            // InternalStl.g:802:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__Area__Group__0"
    // InternalStl.g:812:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:816:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalStl.g:817:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Area__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0"


    // $ANTLR start "rule__Area__Group__0__Impl"
    // InternalStl.g:824:1: rule__Area__Group__0__Impl : ( 'area' ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:828:1: ( ( 'area' ) )
            // InternalStl.g:829:1: ( 'area' )
            {
            // InternalStl.g:829:1: ( 'area' )
            // InternalStl.g:830:2: 'area'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getAreaKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getAreaKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0__Impl"


    // $ANTLR start "rule__Area__Group__1"
    // InternalStl.g:839:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:843:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalStl.g:844:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Area__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1"


    // $ANTLR start "rule__Area__Group__1__Impl"
    // InternalStl.g:851:1: rule__Area__Group__1__Impl : ( ( rule__Area__NameAssignment_1 ) ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:855:1: ( ( ( rule__Area__NameAssignment_1 ) ) )
            // InternalStl.g:856:1: ( ( rule__Area__NameAssignment_1 ) )
            {
            // InternalStl.g:856:1: ( ( rule__Area__NameAssignment_1 ) )
            // InternalStl.g:857:2: ( rule__Area__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:858:2: ( rule__Area__NameAssignment_1 )
            // InternalStl.g:858:3: rule__Area__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Area__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1__Impl"


    // $ANTLR start "rule__Area__Group__2"
    // InternalStl.g:866:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:870:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalStl.g:871:2: rule__Area__Group__2__Impl rule__Area__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Area__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2"


    // $ANTLR start "rule__Area__Group__2__Impl"
    // InternalStl.g:878:1: rule__Area__Group__2__Impl : ( '{' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:882:1: ( ( '{' ) )
            // InternalStl.g:883:1: ( '{' )
            {
            // InternalStl.g:883:1: ( '{' )
            // InternalStl.g:884:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2__Impl"


    // $ANTLR start "rule__Area__Group__3"
    // InternalStl.g:893:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:897:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalStl.g:898:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Area__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__3"


    // $ANTLR start "rule__Area__Group__3__Impl"
    // InternalStl.g:905:1: rule__Area__Group__3__Impl : ( ( rule__Area__ComponentsAssignment_3 )* ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:909:1: ( ( ( rule__Area__ComponentsAssignment_3 )* ) )
            // InternalStl.g:910:1: ( ( rule__Area__ComponentsAssignment_3 )* )
            {
            // InternalStl.g:910:1: ( ( rule__Area__ComponentsAssignment_3 )* )
            // InternalStl.g:911:2: ( rule__Area__ComponentsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getComponentsAssignment_3()); 
            }
            // InternalStl.g:912:2: ( rule__Area__ComponentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25||(LA7_0>=27 && LA7_0<=32)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStl.g:912:3: rule__Area__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Area__ComponentsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getComponentsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__3__Impl"


    // $ANTLR start "rule__Area__Group__4"
    // InternalStl.g:920:1: rule__Area__Group__4 : rule__Area__Group__4__Impl rule__Area__Group__5 ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:924:1: ( rule__Area__Group__4__Impl rule__Area__Group__5 )
            // InternalStl.g:925:2: rule__Area__Group__4__Impl rule__Area__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Area__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__4"


    // $ANTLR start "rule__Area__Group__4__Impl"
    // InternalStl.g:932:1: rule__Area__Group__4__Impl : ( ( rule__Area__ConnectorsAssignment_4 )* ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:936:1: ( ( ( rule__Area__ConnectorsAssignment_4 )* ) )
            // InternalStl.g:937:1: ( ( rule__Area__ConnectorsAssignment_4 )* )
            {
            // InternalStl.g:937:1: ( ( rule__Area__ConnectorsAssignment_4 )* )
            // InternalStl.g:938:2: ( rule__Area__ConnectorsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getConnectorsAssignment_4()); 
            }
            // InternalStl.g:939:2: ( rule__Area__ConnectorsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStl.g:939:3: rule__Area__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Area__ConnectorsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getConnectorsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__4__Impl"


    // $ANTLR start "rule__Area__Group__5"
    // InternalStl.g:947:1: rule__Area__Group__5 : rule__Area__Group__5__Impl ;
    public final void rule__Area__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:951:1: ( rule__Area__Group__5__Impl )
            // InternalStl.g:952:2: rule__Area__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__5"


    // $ANTLR start "rule__Area__Group__5__Impl"
    // InternalStl.g:958:1: rule__Area__Group__5__Impl : ( '}' ) ;
    public final void rule__Area__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:962:1: ( ( '}' ) )
            // InternalStl.g:963:1: ( '}' )
            {
            // InternalStl.g:963:1: ( '}' )
            // InternalStl.g:964:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__5__Impl"


    // $ANTLR start "rule__ItemType__Group__0"
    // InternalStl.g:974:1: rule__ItemType__Group__0 : rule__ItemType__Group__0__Impl rule__ItemType__Group__1 ;
    public final void rule__ItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:978:1: ( rule__ItemType__Group__0__Impl rule__ItemType__Group__1 )
            // InternalStl.g:979:2: rule__ItemType__Group__0__Impl rule__ItemType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ItemType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__0"


    // $ANTLR start "rule__ItemType__Group__0__Impl"
    // InternalStl.g:986:1: rule__ItemType__Group__0__Impl : ( 'item' ) ;
    public final void rule__ItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:990:1: ( ( 'item' ) )
            // InternalStl.g:991:1: ( 'item' )
            {
            // InternalStl.g:991:1: ( 'item' )
            // InternalStl.g:992:2: 'item'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getItemKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getItemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__0__Impl"


    // $ANTLR start "rule__ItemType__Group__1"
    // InternalStl.g:1001:1: rule__ItemType__Group__1 : rule__ItemType__Group__1__Impl rule__ItemType__Group__2 ;
    public final void rule__ItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1005:1: ( rule__ItemType__Group__1__Impl rule__ItemType__Group__2 )
            // InternalStl.g:1006:2: rule__ItemType__Group__1__Impl rule__ItemType__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ItemType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__1"


    // $ANTLR start "rule__ItemType__Group__1__Impl"
    // InternalStl.g:1013:1: rule__ItemType__Group__1__Impl : ( ( rule__ItemType__NameAssignment_1 ) ) ;
    public final void rule__ItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1017:1: ( ( ( rule__ItemType__NameAssignment_1 ) ) )
            // InternalStl.g:1018:1: ( ( rule__ItemType__NameAssignment_1 ) )
            {
            // InternalStl.g:1018:1: ( ( rule__ItemType__NameAssignment_1 ) )
            // InternalStl.g:1019:2: ( rule__ItemType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1020:2: ( rule__ItemType__NameAssignment_1 )
            // InternalStl.g:1020:3: rule__ItemType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__1__Impl"


    // $ANTLR start "rule__ItemType__Group__2"
    // InternalStl.g:1028:1: rule__ItemType__Group__2 : rule__ItemType__Group__2__Impl rule__ItemType__Group__3 ;
    public final void rule__ItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1032:1: ( rule__ItemType__Group__2__Impl rule__ItemType__Group__3 )
            // InternalStl.g:1033:2: rule__ItemType__Group__2__Impl rule__ItemType__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ItemType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__2"


    // $ANTLR start "rule__ItemType__Group__2__Impl"
    // InternalStl.g:1040:1: rule__ItemType__Group__2__Impl : ( '=' ) ;
    public final void rule__ItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1044:1: ( ( '=' ) )
            // InternalStl.g:1045:1: ( '=' )
            {
            // InternalStl.g:1045:1: ( '=' )
            // InternalStl.g:1046:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__2__Impl"


    // $ANTLR start "rule__ItemType__Group__3"
    // InternalStl.g:1055:1: rule__ItemType__Group__3 : rule__ItemType__Group__3__Impl ;
    public final void rule__ItemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1059:1: ( rule__ItemType__Group__3__Impl )
            // InternalStl.g:1060:2: rule__ItemType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__3"


    // $ANTLR start "rule__ItemType__Group__3__Impl"
    // InternalStl.g:1066:1: rule__ItemType__Group__3__Impl : ( ( rule__ItemType__DescriptionAssignment_3 ) ) ;
    public final void rule__ItemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1070:1: ( ( ( rule__ItemType__DescriptionAssignment_3 ) ) )
            // InternalStl.g:1071:1: ( ( rule__ItemType__DescriptionAssignment_3 ) )
            {
            // InternalStl.g:1071:1: ( ( rule__ItemType__DescriptionAssignment_3 ) )
            // InternalStl.g:1072:2: ( rule__ItemType__DescriptionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getDescriptionAssignment_3()); 
            }
            // InternalStl.g:1073:2: ( rule__ItemType__DescriptionAssignment_3 )
            // InternalStl.g:1073:3: rule__ItemType__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__DescriptionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getDescriptionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Group__3__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // InternalStl.g:1082:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1086:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalStl.g:1087:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0"


    // $ANTLR start "rule__Component__Group_5__0__Impl"
    // InternalStl.g:1094:1: rule__Component__Group_5__0__Impl : ( ruleTurnTable ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1098:1: ( ( ruleTurnTable ) )
            // InternalStl.g:1099:1: ( ruleTurnTable )
            {
            // InternalStl.g:1099:1: ( ruleTurnTable )
            // InternalStl.g:1100:2: ruleTurnTable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTurnTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0__Impl"


    // $ANTLR start "rule__Component__Group_5__1"
    // InternalStl.g:1109:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl rule__Component__Group_5__2 ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1113:1: ( rule__Component__Group_5__1__Impl rule__Component__Group_5__2 )
            // InternalStl.g:1114:2: rule__Component__Group_5__1__Impl rule__Component__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1"


    // $ANTLR start "rule__Component__Group_5__1__Impl"
    // InternalStl.g:1121:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__CostAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1125:1: ( ( ( rule__Component__CostAssignment_5_1 ) ) )
            // InternalStl.g:1126:1: ( ( rule__Component__CostAssignment_5_1 ) )
            {
            // InternalStl.g:1126:1: ( ( rule__Component__CostAssignment_5_1 ) )
            // InternalStl.g:1127:2: ( rule__Component__CostAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCostAssignment_5_1()); 
            }
            // InternalStl.g:1128:2: ( rule__Component__CostAssignment_5_1 )
            // InternalStl.g:1128:3: rule__Component__CostAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__CostAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCostAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1__Impl"


    // $ANTLR start "rule__Component__Group_5__2"
    // InternalStl.g:1136:1: rule__Component__Group_5__2 : rule__Component__Group_5__2__Impl rule__Component__Group_5__3 ;
    public final void rule__Component__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1140:1: ( rule__Component__Group_5__2__Impl rule__Component__Group_5__3 )
            // InternalStl.g:1141:2: rule__Component__Group_5__2__Impl rule__Component__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__2"


    // $ANTLR start "rule__Component__Group_5__2__Impl"
    // InternalStl.g:1148:1: rule__Component__Group_5__2__Impl : ( '{' ) ;
    public final void rule__Component__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1152:1: ( ( '{' ) )
            // InternalStl.g:1153:1: ( '{' )
            {
            // InternalStl.g:1153:1: ( '{' )
            // InternalStl.g:1154:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__2__Impl"


    // $ANTLR start "rule__Component__Group_5__3"
    // InternalStl.g:1163:1: rule__Component__Group_5__3 : rule__Component__Group_5__3__Impl rule__Component__Group_5__4 ;
    public final void rule__Component__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1167:1: ( rule__Component__Group_5__3__Impl rule__Component__Group_5__4 )
            // InternalStl.g:1168:2: rule__Component__Group_5__3__Impl rule__Component__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__3"


    // $ANTLR start "rule__Component__Group_5__3__Impl"
    // InternalStl.g:1175:1: rule__Component__Group_5__3__Impl : ( ( rule__Component__ServicesAssignment_5_3 )* ) ;
    public final void rule__Component__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1179:1: ( ( ( rule__Component__ServicesAssignment_5_3 )* ) )
            // InternalStl.g:1180:1: ( ( rule__Component__ServicesAssignment_5_3 )* )
            {
            // InternalStl.g:1180:1: ( ( rule__Component__ServicesAssignment_5_3 )* )
            // InternalStl.g:1181:2: ( rule__Component__ServicesAssignment_5_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getServicesAssignment_5_3()); 
            }
            // InternalStl.g:1182:2: ( rule__Component__ServicesAssignment_5_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStl.g:1182:3: rule__Component__ServicesAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__ServicesAssignment_5_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getServicesAssignment_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__3__Impl"


    // $ANTLR start "rule__Component__Group_5__4"
    // InternalStl.g:1190:1: rule__Component__Group_5__4 : rule__Component__Group_5__4__Impl rule__Component__Group_5__5 ;
    public final void rule__Component__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1194:1: ( rule__Component__Group_5__4__Impl rule__Component__Group_5__5 )
            // InternalStl.g:1195:2: rule__Component__Group_5__4__Impl rule__Component__Group_5__5
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__4"


    // $ANTLR start "rule__Component__Group_5__4__Impl"
    // InternalStl.g:1202:1: rule__Component__Group_5__4__Impl : ( ( rule__Component__InputSlotsAssignment_5_4 )* ) ;
    public final void rule__Component__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1206:1: ( ( ( rule__Component__InputSlotsAssignment_5_4 )* ) )
            // InternalStl.g:1207:1: ( ( rule__Component__InputSlotsAssignment_5_4 )* )
            {
            // InternalStl.g:1207:1: ( ( rule__Component__InputSlotsAssignment_5_4 )* )
            // InternalStl.g:1208:2: ( rule__Component__InputSlotsAssignment_5_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getInputSlotsAssignment_5_4()); 
            }
            // InternalStl.g:1209:2: ( rule__Component__InputSlotsAssignment_5_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID) ) {
                        int LA10_3 = input.LA(3);

                        if ( (LA10_3==20) ) {
                            int LA10_4 = input.LA(4);

                            if ( (LA10_4==14) ) {
                                int LA10_5 = input.LA(5);

                                if ( (LA10_5==15) ) {
                                    int LA10_6 = input.LA(6);

                                    if ( (synpred14_InternalStl()) ) {
                                        alt10=1;
                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalStl.g:1209:3: rule__Component__InputSlotsAssignment_5_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Component__InputSlotsAssignment_5_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getInputSlotsAssignment_5_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__4__Impl"


    // $ANTLR start "rule__Component__Group_5__5"
    // InternalStl.g:1217:1: rule__Component__Group_5__5 : rule__Component__Group_5__5__Impl rule__Component__Group_5__6 ;
    public final void rule__Component__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1221:1: ( rule__Component__Group_5__5__Impl rule__Component__Group_5__6 )
            // InternalStl.g:1222:2: rule__Component__Group_5__5__Impl rule__Component__Group_5__6
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__5"


    // $ANTLR start "rule__Component__Group_5__5__Impl"
    // InternalStl.g:1229:1: rule__Component__Group_5__5__Impl : ( ( rule__Component__OutputSlotsAssignment_5_5 )* ) ;
    public final void rule__Component__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1233:1: ( ( ( rule__Component__OutputSlotsAssignment_5_5 )* ) )
            // InternalStl.g:1234:1: ( ( rule__Component__OutputSlotsAssignment_5_5 )* )
            {
            // InternalStl.g:1234:1: ( ( rule__Component__OutputSlotsAssignment_5_5 )* )
            // InternalStl.g:1235:2: ( rule__Component__OutputSlotsAssignment_5_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOutputSlotsAssignment_5_5()); 
            }
            // InternalStl.g:1236:2: ( rule__Component__OutputSlotsAssignment_5_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStl.g:1236:3: rule__Component__OutputSlotsAssignment_5_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Component__OutputSlotsAssignment_5_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOutputSlotsAssignment_5_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__5__Impl"


    // $ANTLR start "rule__Component__Group_5__6"
    // InternalStl.g:1244:1: rule__Component__Group_5__6 : rule__Component__Group_5__6__Impl ;
    public final void rule__Component__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1248:1: ( rule__Component__Group_5__6__Impl )
            // InternalStl.g:1249:2: rule__Component__Group_5__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__6"


    // $ANTLR start "rule__Component__Group_5__6__Impl"
    // InternalStl.g:1255:1: rule__Component__Group_5__6__Impl : ( '}' ) ;
    public final void rule__Component__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1259:1: ( ( '}' ) )
            // InternalStl.g:1260:1: ( '}' )
            {
            // InternalStl.g:1260:1: ( '}' )
            // InternalStl.g:1261:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_6()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__6__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalStl.g:1271:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1275:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalStl.g:1276:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalStl.g:1283:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1287:1: ( ( 'service' ) )
            // InternalStl.g:1288:1: ( 'service' )
            {
            // InternalStl.g:1288:1: ( 'service' )
            // InternalStl.g:1289:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalStl.g:1298:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1302:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalStl.g:1303:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalStl.g:1310:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1314:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalStl.g:1315:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalStl.g:1315:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalStl.g:1316:2: ( rule__Service__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1317:2: ( rule__Service__NameAssignment_1 )
            // InternalStl.g:1317:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalStl.g:1325:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1329:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalStl.g:1330:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalStl.g:1337:1: rule__Service__Group__2__Impl : ( '(' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1341:1: ( ( '(' ) )
            // InternalStl.g:1342:1: ( '(' )
            {
            // InternalStl.g:1342:1: ( '(' )
            // InternalStl.g:1343:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalStl.g:1352:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1356:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalStl.g:1357:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalStl.g:1364:1: rule__Service__Group__3__Impl : ( ( rule__Service__CostAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1368:1: ( ( ( rule__Service__CostAssignment_3 ) ) )
            // InternalStl.g:1369:1: ( ( rule__Service__CostAssignment_3 ) )
            {
            // InternalStl.g:1369:1: ( ( rule__Service__CostAssignment_3 ) )
            // InternalStl.g:1370:2: ( rule__Service__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:1371:2: ( rule__Service__CostAssignment_3 )
            // InternalStl.g:1371:3: rule__Service__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalStl.g:1379:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1383:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalStl.g:1384:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Service__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalStl.g:1391:1: rule__Service__Group__4__Impl : ( ( rule__Service__ProcessingTimeAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1395:1: ( ( ( rule__Service__ProcessingTimeAssignment_4 ) ) )
            // InternalStl.g:1396:1: ( ( rule__Service__ProcessingTimeAssignment_4 ) )
            {
            // InternalStl.g:1396:1: ( ( rule__Service__ProcessingTimeAssignment_4 ) )
            // InternalStl.g:1397:2: ( rule__Service__ProcessingTimeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeAssignment_4()); 
            }
            // InternalStl.g:1398:2: ( rule__Service__ProcessingTimeAssignment_4 )
            // InternalStl.g:1398:3: rule__Service__ProcessingTimeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Service__ProcessingTimeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalStl.g:1406:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1410:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalStl.g:1411:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalStl.g:1418:1: rule__Service__Group__5__Impl : ( ( rule__Service__ReliabilityAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1422:1: ( ( ( rule__Service__ReliabilityAssignment_5 ) ) )
            // InternalStl.g:1423:1: ( ( rule__Service__ReliabilityAssignment_5 ) )
            {
            // InternalStl.g:1423:1: ( ( rule__Service__ReliabilityAssignment_5 ) )
            // InternalStl.g:1424:2: ( rule__Service__ReliabilityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityAssignment_5()); 
            }
            // InternalStl.g:1425:2: ( rule__Service__ReliabilityAssignment_5 )
            // InternalStl.g:1425:3: rule__Service__ReliabilityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__ReliabilityAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalStl.g:1433:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1437:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalStl.g:1438:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalStl.g:1445:1: rule__Service__Group__6__Impl : ( ')' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1449:1: ( ( ')' ) )
            // InternalStl.g:1450:1: ( ')' )
            {
            // InternalStl.g:1450:1: ( ')' )
            // InternalStl.g:1451:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalStl.g:1460:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1464:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalStl.g:1465:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Service__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalStl.g:1472:1: rule__Service__Group__7__Impl : ( '{' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1476:1: ( ( '{' ) )
            // InternalStl.g:1477:1: ( '{' )
            {
            // InternalStl.g:1477:1: ( '{' )
            // InternalStl.g:1478:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_7()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalStl.g:1487:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1491:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalStl.g:1492:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Service__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalStl.g:1499:1: rule__Service__Group__8__Impl : ( ( rule__Service__ParametersAssignment_8 )* ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1503:1: ( ( ( rule__Service__ParametersAssignment_8 )* ) )
            // InternalStl.g:1504:1: ( ( rule__Service__ParametersAssignment_8 )* )
            {
            // InternalStl.g:1504:1: ( ( rule__Service__ParametersAssignment_8 )* )
            // InternalStl.g:1505:2: ( rule__Service__ParametersAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getParametersAssignment_8()); 
            }
            // InternalStl.g:1506:2: ( rule__Service__ParametersAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalStl.g:1506:3: rule__Service__ParametersAssignment_8
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Service__ParametersAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getParametersAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // InternalStl.g:1514:1: rule__Service__Group__9 : rule__Service__Group__9__Impl ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1518:1: ( rule__Service__Group__9__Impl )
            // InternalStl.g:1519:2: rule__Service__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // InternalStl.g:1525:1: rule__Service__Group__9__Impl : ( '}' ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1529:1: ( ( '}' ) )
            // InternalStl.g:1530:1: ( '}' )
            {
            // InternalStl.g:1530:1: ( '}' )
            // InternalStl.g:1531:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalStl.g:1541:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1545:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalStl.g:1546:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalStl.g:1553:1: rule__Parameter__Group__0__Impl : ( 'name' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1557:1: ( ( 'name' ) )
            // InternalStl.g:1558:1: ( 'name' )
            {
            // InternalStl.g:1558:1: ( 'name' )
            // InternalStl.g:1559:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalStl.g:1568:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1572:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalStl.g:1573:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalStl.g:1580:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1584:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalStl.g:1585:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalStl.g:1585:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalStl.g:1586:2: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1587:2: ( rule__Parameter__NameAssignment_1 )
            // InternalStl.g:1587:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalStl.g:1595:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1599:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalStl.g:1600:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalStl.g:1607:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1611:1: ( ( '{' ) )
            // InternalStl.g:1612:1: ( '{' )
            {
            // InternalStl.g:1612:1: ( '{' )
            // InternalStl.g:1613:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalStl.g:1622:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1626:1: ( rule__Parameter__Group__3__Impl )
            // InternalStl.g:1627:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalStl.g:1633:1: rule__Parameter__Group__3__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1637:1: ( ( '}' ) )
            // InternalStl.g:1638:1: ( '}' )
            {
            // InternalStl.g:1638:1: ( '}' )
            // InternalStl.g:1639:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalStl.g:1649:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1653:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalStl.g:1654:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Connector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalStl.g:1661:1: rule__Connector__Group__0__Impl : ( '{' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1665:1: ( ( '{' ) )
            // InternalStl.g:1666:1: ( '{' )
            {
            // InternalStl.g:1666:1: ( '{' )
            // InternalStl.g:1667:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalStl.g:1676:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1680:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalStl.g:1681:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Connector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalStl.g:1688:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__EntryAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1692:1: ( ( ( rule__Connector__EntryAssignment_1 ) ) )
            // InternalStl.g:1693:1: ( ( rule__Connector__EntryAssignment_1 ) )
            {
            // InternalStl.g:1693:1: ( ( rule__Connector__EntryAssignment_1 ) )
            // InternalStl.g:1694:2: ( rule__Connector__EntryAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntryAssignment_1()); 
            }
            // InternalStl.g:1695:2: ( rule__Connector__EntryAssignment_1 )
            // InternalStl.g:1695:3: rule__Connector__EntryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connector__EntryAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntryAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // InternalStl.g:1703:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1707:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalStl.g:1708:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Connector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connector__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // InternalStl.g:1715:1: rule__Connector__Group__2__Impl : ( '>' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1719:1: ( ( '>' ) )
            // InternalStl.g:1720:1: ( '>' )
            {
            // InternalStl.g:1720:1: ( '>' )
            // InternalStl.g:1721:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // InternalStl.g:1730:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1734:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalStl.g:1735:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Connector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connector__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3"


    // $ANTLR start "rule__Connector__Group__3__Impl"
    // InternalStl.g:1742:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__ExitAssignment_3 ) ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1746:1: ( ( ( rule__Connector__ExitAssignment_3 ) ) )
            // InternalStl.g:1747:1: ( ( rule__Connector__ExitAssignment_3 ) )
            {
            // InternalStl.g:1747:1: ( ( rule__Connector__ExitAssignment_3 ) )
            // InternalStl.g:1748:2: ( rule__Connector__ExitAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitAssignment_3()); 
            }
            // InternalStl.g:1749:2: ( rule__Connector__ExitAssignment_3 )
            // InternalStl.g:1749:3: rule__Connector__ExitAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connector__ExitAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__4"
    // InternalStl.g:1757:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1761:1: ( rule__Connector__Group__4__Impl )
            // InternalStl.g:1762:2: rule__Connector__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4"


    // $ANTLR start "rule__Connector__Group__4__Impl"
    // InternalStl.g:1768:1: rule__Connector__Group__4__Impl : ( '}' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1772:1: ( ( '}' ) )
            // InternalStl.g:1773:1: ( '}' )
            {
            // InternalStl.g:1773:1: ( '}' )
            // InternalStl.g:1774:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4__Impl"


    // $ANTLR start "rule__Slot__Group__0"
    // InternalStl.g:1784:1: rule__Slot__Group__0 : rule__Slot__Group__0__Impl rule__Slot__Group__1 ;
    public final void rule__Slot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1788:1: ( rule__Slot__Group__0__Impl rule__Slot__Group__1 )
            // InternalStl.g:1789:2: rule__Slot__Group__0__Impl rule__Slot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Slot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__0"


    // $ANTLR start "rule__Slot__Group__0__Impl"
    // InternalStl.g:1796:1: rule__Slot__Group__0__Impl : ( 'slot' ) ;
    public final void rule__Slot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1800:1: ( ( 'slot' ) )
            // InternalStl.g:1801:1: ( 'slot' )
            {
            // InternalStl.g:1801:1: ( 'slot' )
            // InternalStl.g:1802:2: 'slot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getSlotKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getSlotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__0__Impl"


    // $ANTLR start "rule__Slot__Group__1"
    // InternalStl.g:1811:1: rule__Slot__Group__1 : rule__Slot__Group__1__Impl rule__Slot__Group__2 ;
    public final void rule__Slot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1815:1: ( rule__Slot__Group__1__Impl rule__Slot__Group__2 )
            // InternalStl.g:1816:2: rule__Slot__Group__1__Impl rule__Slot__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Slot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slot__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__1"


    // $ANTLR start "rule__Slot__Group__1__Impl"
    // InternalStl.g:1823:1: rule__Slot__Group__1__Impl : ( ( rule__Slot__NameAssignment_1 ) ) ;
    public final void rule__Slot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1827:1: ( ( ( rule__Slot__NameAssignment_1 ) ) )
            // InternalStl.g:1828:1: ( ( rule__Slot__NameAssignment_1 ) )
            {
            // InternalStl.g:1828:1: ( ( rule__Slot__NameAssignment_1 ) )
            // InternalStl.g:1829:2: ( rule__Slot__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1830:2: ( rule__Slot__NameAssignment_1 )
            // InternalStl.g:1830:3: rule__Slot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Slot__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__1__Impl"


    // $ANTLR start "rule__Slot__Group__2"
    // InternalStl.g:1838:1: rule__Slot__Group__2 : rule__Slot__Group__2__Impl rule__Slot__Group__3 ;
    public final void rule__Slot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1842:1: ( rule__Slot__Group__2__Impl rule__Slot__Group__3 )
            // InternalStl.g:1843:2: rule__Slot__Group__2__Impl rule__Slot__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Slot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slot__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__2"


    // $ANTLR start "rule__Slot__Group__2__Impl"
    // InternalStl.g:1850:1: rule__Slot__Group__2__Impl : ( '(' ) ;
    public final void rule__Slot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1854:1: ( ( '(' ) )
            // InternalStl.g:1855:1: ( '(' )
            {
            // InternalStl.g:1855:1: ( '(' )
            // InternalStl.g:1856:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__2__Impl"


    // $ANTLR start "rule__Slot__Group__3"
    // InternalStl.g:1865:1: rule__Slot__Group__3 : rule__Slot__Group__3__Impl rule__Slot__Group__4 ;
    public final void rule__Slot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1869:1: ( rule__Slot__Group__3__Impl rule__Slot__Group__4 )
            // InternalStl.g:1870:2: rule__Slot__Group__3__Impl rule__Slot__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Slot__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slot__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__3"


    // $ANTLR start "rule__Slot__Group__3__Impl"
    // InternalStl.g:1877:1: rule__Slot__Group__3__Impl : ( '{' ) ;
    public final void rule__Slot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1881:1: ( ( '{' ) )
            // InternalStl.g:1882:1: ( '{' )
            {
            // InternalStl.g:1882:1: ( '{' )
            // InternalStl.g:1883:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__3__Impl"


    // $ANTLR start "rule__Slot__Group__4"
    // InternalStl.g:1892:1: rule__Slot__Group__4 : rule__Slot__Group__4__Impl ;
    public final void rule__Slot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1896:1: ( rule__Slot__Group__4__Impl )
            // InternalStl.g:1897:2: rule__Slot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slot__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__4"


    // $ANTLR start "rule__Slot__Group__4__Impl"
    // InternalStl.g:1903:1: rule__Slot__Group__4__Impl : ( '}' ) ;
    public final void rule__Slot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1907:1: ( ( '}' ) )
            // InternalStl.g:1908:1: ( '}' )
            {
            // InternalStl.g:1908:1: ( '}' )
            // InternalStl.g:1909:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__Group__4__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__0"
    // InternalStl.g:1919:1: rule__ItemGenerator__Group__0 : rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1 ;
    public final void rule__ItemGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1923:1: ( rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1 )
            // InternalStl.g:1924:2: rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ItemGenerator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__0"


    // $ANTLR start "rule__ItemGenerator__Group__0__Impl"
    // InternalStl.g:1931:1: rule__ItemGenerator__Group__0__Impl : ( 'generator' ) ;
    public final void rule__ItemGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1935:1: ( ( 'generator' ) )
            // InternalStl.g:1936:1: ( 'generator' )
            {
            // InternalStl.g:1936:1: ( 'generator' )
            // InternalStl.g:1937:2: 'generator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__0__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__1"
    // InternalStl.g:1946:1: rule__ItemGenerator__Group__1 : rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2 ;
    public final void rule__ItemGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1950:1: ( rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2 )
            // InternalStl.g:1951:2: rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ItemGenerator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__1"


    // $ANTLR start "rule__ItemGenerator__Group__1__Impl"
    // InternalStl.g:1958:1: rule__ItemGenerator__Group__1__Impl : ( ( rule__ItemGenerator__NameAssignment_1 ) ) ;
    public final void rule__ItemGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1962:1: ( ( ( rule__ItemGenerator__NameAssignment_1 ) ) )
            // InternalStl.g:1963:1: ( ( rule__ItemGenerator__NameAssignment_1 ) )
            {
            // InternalStl.g:1963:1: ( ( rule__ItemGenerator__NameAssignment_1 ) )
            // InternalStl.g:1964:2: ( rule__ItemGenerator__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1965:2: ( rule__ItemGenerator__NameAssignment_1 )
            // InternalStl.g:1965:3: rule__ItemGenerator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__1__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__2"
    // InternalStl.g:1973:1: rule__ItemGenerator__Group__2 : rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3 ;
    public final void rule__ItemGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1977:1: ( rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3 )
            // InternalStl.g:1978:2: rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ItemGenerator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__2"


    // $ANTLR start "rule__ItemGenerator__Group__2__Impl"
    // InternalStl.g:1985:1: rule__ItemGenerator__Group__2__Impl : ( ( rule__ItemGenerator__Group_2__0 )? ) ;
    public final void rule__ItemGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1989:1: ( ( ( rule__ItemGenerator__Group_2__0 )? ) )
            // InternalStl.g:1990:1: ( ( rule__ItemGenerator__Group_2__0 )? )
            {
            // InternalStl.g:1990:1: ( ( rule__ItemGenerator__Group_2__0 )? )
            // InternalStl.g:1991:2: ( rule__ItemGenerator__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGroup_2()); 
            }
            // InternalStl.g:1992:2: ( rule__ItemGenerator__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStl.g:1992:3: rule__ItemGenerator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ItemGenerator__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__2__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__3"
    // InternalStl.g:2000:1: rule__ItemGenerator__Group__3 : rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4 ;
    public final void rule__ItemGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2004:1: ( rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4 )
            // InternalStl.g:2005:2: rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ItemGenerator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__3"


    // $ANTLR start "rule__ItemGenerator__Group__3__Impl"
    // InternalStl.g:2012:1: rule__ItemGenerator__Group__3__Impl : ( '{' ) ;
    public final void rule__ItemGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2016:1: ( ( '{' ) )
            // InternalStl.g:2017:1: ( '{' )
            {
            // InternalStl.g:2017:1: ( '{' )
            // InternalStl.g:2018:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__3__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__4"
    // InternalStl.g:2027:1: rule__ItemGenerator__Group__4 : rule__ItemGenerator__Group__4__Impl ;
    public final void rule__ItemGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2031:1: ( rule__ItemGenerator__Group__4__Impl )
            // InternalStl.g:2032:2: rule__ItemGenerator__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__4"


    // $ANTLR start "rule__ItemGenerator__Group__4__Impl"
    // InternalStl.g:2038:1: rule__ItemGenerator__Group__4__Impl : ( '}' ) ;
    public final void rule__ItemGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2042:1: ( ( '}' ) )
            // InternalStl.g:2043:1: ( '}' )
            {
            // InternalStl.g:2043:1: ( '}' )
            // InternalStl.g:2044:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group__4__Impl"


    // $ANTLR start "rule__ItemGenerator__Group_2__0"
    // InternalStl.g:2054:1: rule__ItemGenerator__Group_2__0 : rule__ItemGenerator__Group_2__0__Impl rule__ItemGenerator__Group_2__1 ;
    public final void rule__ItemGenerator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2058:1: ( rule__ItemGenerator__Group_2__0__Impl rule__ItemGenerator__Group_2__1 )
            // InternalStl.g:2059:2: rule__ItemGenerator__Group_2__0__Impl rule__ItemGenerator__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ItemGenerator__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group_2__0"


    // $ANTLR start "rule__ItemGenerator__Group_2__0__Impl"
    // InternalStl.g:2066:1: rule__ItemGenerator__Group_2__0__Impl : ( 'generates' ) ;
    public final void rule__ItemGenerator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2070:1: ( ( 'generates' ) )
            // InternalStl.g:2071:1: ( 'generates' )
            {
            // InternalStl.g:2071:1: ( 'generates' )
            // InternalStl.g:2072:2: 'generates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group_2__0__Impl"


    // $ANTLR start "rule__ItemGenerator__Group_2__1"
    // InternalStl.g:2081:1: rule__ItemGenerator__Group_2__1 : rule__ItemGenerator__Group_2__1__Impl ;
    public final void rule__ItemGenerator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2085:1: ( rule__ItemGenerator__Group_2__1__Impl )
            // InternalStl.g:2086:2: rule__ItemGenerator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group_2__1"


    // $ANTLR start "rule__ItemGenerator__Group_2__1__Impl"
    // InternalStl.g:2092:1: rule__ItemGenerator__Group_2__1__Impl : ( ( rule__ItemGenerator__GeneratedTypeAssignment_2_1 ) ) ;
    public final void rule__ItemGenerator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2096:1: ( ( ( rule__ItemGenerator__GeneratedTypeAssignment_2_1 ) ) )
            // InternalStl.g:2097:1: ( ( rule__ItemGenerator__GeneratedTypeAssignment_2_1 ) )
            {
            // InternalStl.g:2097:1: ( ( rule__ItemGenerator__GeneratedTypeAssignment_2_1 ) )
            // InternalStl.g:2098:2: ( rule__ItemGenerator__GeneratedTypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeAssignment_2_1()); 
            }
            // InternalStl.g:2099:2: ( rule__ItemGenerator__GeneratedTypeAssignment_2_1 )
            // InternalStl.g:2099:3: rule__ItemGenerator__GeneratedTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__GeneratedTypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__Group_2__1__Impl"


    // $ANTLR start "rule__Store__Group_1__0"
    // InternalStl.g:2108:1: rule__Store__Group_1__0 : rule__Store__Group_1__0__Impl rule__Store__Group_1__1 ;
    public final void rule__Store__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2112:1: ( rule__Store__Group_1__0__Impl rule__Store__Group_1__1 )
            // InternalStl.g:2113:2: rule__Store__Group_1__0__Impl rule__Store__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Store__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Store__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_1__0"


    // $ANTLR start "rule__Store__Group_1__0__Impl"
    // InternalStl.g:2120:1: rule__Store__Group_1__0__Impl : ( ruleProductStore ) ;
    public final void rule__Store__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2124:1: ( ( ruleProductStore ) )
            // InternalStl.g:2125:1: ( ruleProductStore )
            {
            // InternalStl.g:2125:1: ( ruleProductStore )
            // InternalStl.g:2126:2: ruleProductStore
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProductStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_1__0__Impl"


    // $ANTLR start "rule__Store__Group_1__1"
    // InternalStl.g:2135:1: rule__Store__Group_1__1 : rule__Store__Group_1__1__Impl rule__Store__Group_1__2 ;
    public final void rule__Store__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2139:1: ( rule__Store__Group_1__1__Impl rule__Store__Group_1__2 )
            // InternalStl.g:2140:2: rule__Store__Group_1__1__Impl rule__Store__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Store__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Store__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_1__1"


    // $ANTLR start "rule__Store__Group_1__1__Impl"
    // InternalStl.g:2147:1: rule__Store__Group_1__1__Impl : ( ( rule__Store__CapacityAssignment_1_1 ) ) ;
    public final void rule__Store__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2151:1: ( ( ( rule__Store__CapacityAssignment_1_1 ) ) )
            // InternalStl.g:2152:1: ( ( rule__Store__CapacityAssignment_1_1 ) )
            {
            // InternalStl.g:2152:1: ( ( rule__Store__CapacityAssignment_1_1 ) )
            // InternalStl.g:2153:2: ( rule__Store__CapacityAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreAccess().getCapacityAssignment_1_1()); 
            }
            // InternalStl.g:2154:2: ( rule__Store__CapacityAssignment_1_1 )
            // InternalStl.g:2154:3: rule__Store__CapacityAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Store__CapacityAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreAccess().getCapacityAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_1__1__Impl"


    // $ANTLR start "rule__Store__Group_1__2"
    // InternalStl.g:2162:1: rule__Store__Group_1__2 : rule__Store__Group_1__2__Impl rule__Store__Group_1__3 ;
    public final void rule__Store__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2166:1: ( rule__Store__Group_1__2__Impl rule__Store__Group_1__3 )
            // InternalStl.g:2167:2: rule__Store__Group_1__2__Impl rule__Store__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__Store__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Store__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_1__2"


    // $ANTLR start "rule__Store__Group_1__2__Impl"
    // InternalStl.g:2174:1: rule__Store__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Store__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2178:1: ( ( '{' ) )
            // InternalStl.g:2179:1: ( '{' )
            {
            // InternalStl.g:2179:1: ( '{' )
            // InternalStl.g:2180:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_1_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_1__2__Impl"


    // $ANTLR start "rule__Store__Group_1__3"
    // InternalStl.g:2189:1: rule__Store__Group_1__3 : rule__Store__Group_1__3__Impl ;
    public final void rule__Store__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2193:1: ( rule__Store__Group_1__3__Impl )
            // InternalStl.g:2194:2: rule__Store__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_1__3"


    // $ANTLR start "rule__Store__Group_1__3__Impl"
    // InternalStl.g:2200:1: rule__Store__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Store__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2204:1: ( ( '}' ) )
            // InternalStl.g:2205:1: ( '}' )
            {
            // InternalStl.g:2205:1: ( '}' )
            // InternalStl.g:2206:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_1_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_1__3__Impl"


    // $ANTLR start "rule__WasteStore__Group__0"
    // InternalStl.g:2216:1: rule__WasteStore__Group__0 : rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1 ;
    public final void rule__WasteStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2220:1: ( rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1 )
            // InternalStl.g:2221:2: rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WasteStore__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__0"


    // $ANTLR start "rule__WasteStore__Group__0__Impl"
    // InternalStl.g:2228:1: rule__WasteStore__Group__0__Impl : ( 'wasteStore' ) ;
    public final void rule__WasteStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2232:1: ( ( 'wasteStore' ) )
            // InternalStl.g:2233:1: ( 'wasteStore' )
            {
            // InternalStl.g:2233:1: ( 'wasteStore' )
            // InternalStl.g:2234:2: 'wasteStore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__0__Impl"


    // $ANTLR start "rule__WasteStore__Group__1"
    // InternalStl.g:2243:1: rule__WasteStore__Group__1 : rule__WasteStore__Group__1__Impl ;
    public final void rule__WasteStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2247:1: ( rule__WasteStore__Group__1__Impl )
            // InternalStl.g:2248:2: rule__WasteStore__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__1"


    // $ANTLR start "rule__WasteStore__Group__1__Impl"
    // InternalStl.g:2254:1: rule__WasteStore__Group__1__Impl : ( ( rule__WasteStore__NameAssignment_1 ) ) ;
    public final void rule__WasteStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2258:1: ( ( ( rule__WasteStore__NameAssignment_1 ) ) )
            // InternalStl.g:2259:1: ( ( rule__WasteStore__NameAssignment_1 ) )
            {
            // InternalStl.g:2259:1: ( ( rule__WasteStore__NameAssignment_1 ) )
            // InternalStl.g:2260:2: ( rule__WasteStore__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2261:2: ( rule__WasteStore__NameAssignment_1 )
            // InternalStl.g:2261:3: rule__WasteStore__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__Group__1__Impl"


    // $ANTLR start "rule__ProductStore__Group__0"
    // InternalStl.g:2270:1: rule__ProductStore__Group__0 : rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1 ;
    public final void rule__ProductStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2274:1: ( rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1 )
            // InternalStl.g:2275:2: rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProductStore__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__0"


    // $ANTLR start "rule__ProductStore__Group__0__Impl"
    // InternalStl.g:2282:1: rule__ProductStore__Group__0__Impl : ( 'productStore' ) ;
    public final void rule__ProductStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2286:1: ( ( 'productStore' ) )
            // InternalStl.g:2287:1: ( 'productStore' )
            {
            // InternalStl.g:2287:1: ( 'productStore' )
            // InternalStl.g:2288:2: 'productStore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getProductStoreKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getProductStoreKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__0__Impl"


    // $ANTLR start "rule__ProductStore__Group__1"
    // InternalStl.g:2297:1: rule__ProductStore__Group__1 : rule__ProductStore__Group__1__Impl ;
    public final void rule__ProductStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2301:1: ( rule__ProductStore__Group__1__Impl )
            // InternalStl.g:2302:2: rule__ProductStore__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__1"


    // $ANTLR start "rule__ProductStore__Group__1__Impl"
    // InternalStl.g:2308:1: rule__ProductStore__Group__1__Impl : ( ( rule__ProductStore__NameAssignment_1 ) ) ;
    public final void rule__ProductStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2312:1: ( ( ( rule__ProductStore__NameAssignment_1 ) ) )
            // InternalStl.g:2313:1: ( ( rule__ProductStore__NameAssignment_1 ) )
            {
            // InternalStl.g:2313:1: ( ( rule__ProductStore__NameAssignment_1 ) )
            // InternalStl.g:2314:2: ( rule__ProductStore__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2315:2: ( rule__ProductStore__NameAssignment_1 )
            // InternalStl.g:2315:3: rule__ProductStore__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__Group__1__Impl"


    // $ANTLR start "rule__Buffer__Group__0"
    // InternalStl.g:2324:1: rule__Buffer__Group__0 : rule__Buffer__Group__0__Impl rule__Buffer__Group__1 ;
    public final void rule__Buffer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2328:1: ( rule__Buffer__Group__0__Impl rule__Buffer__Group__1 )
            // InternalStl.g:2329:2: rule__Buffer__Group__0__Impl rule__Buffer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Buffer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__0"


    // $ANTLR start "rule__Buffer__Group__0__Impl"
    // InternalStl.g:2336:1: rule__Buffer__Group__0__Impl : ( 'buffer' ) ;
    public final void rule__Buffer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2340:1: ( ( 'buffer' ) )
            // InternalStl.g:2341:1: ( 'buffer' )
            {
            // InternalStl.g:2341:1: ( 'buffer' )
            // InternalStl.g:2342:2: 'buffer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getBufferKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getBufferKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__0__Impl"


    // $ANTLR start "rule__Buffer__Group__1"
    // InternalStl.g:2351:1: rule__Buffer__Group__1 : rule__Buffer__Group__1__Impl rule__Buffer__Group__2 ;
    public final void rule__Buffer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2355:1: ( rule__Buffer__Group__1__Impl rule__Buffer__Group__2 )
            // InternalStl.g:2356:2: rule__Buffer__Group__1__Impl rule__Buffer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Buffer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__1"


    // $ANTLR start "rule__Buffer__Group__1__Impl"
    // InternalStl.g:2363:1: rule__Buffer__Group__1__Impl : ( ( rule__Buffer__NameAssignment_1 ) ) ;
    public final void rule__Buffer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2367:1: ( ( ( rule__Buffer__NameAssignment_1 ) ) )
            // InternalStl.g:2368:1: ( ( rule__Buffer__NameAssignment_1 ) )
            {
            // InternalStl.g:2368:1: ( ( rule__Buffer__NameAssignment_1 ) )
            // InternalStl.g:2369:2: ( rule__Buffer__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2370:2: ( rule__Buffer__NameAssignment_1 )
            // InternalStl.g:2370:3: rule__Buffer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__1__Impl"


    // $ANTLR start "rule__Buffer__Group__2"
    // InternalStl.g:2378:1: rule__Buffer__Group__2 : rule__Buffer__Group__2__Impl rule__Buffer__Group__3 ;
    public final void rule__Buffer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2382:1: ( rule__Buffer__Group__2__Impl rule__Buffer__Group__3 )
            // InternalStl.g:2383:2: rule__Buffer__Group__2__Impl rule__Buffer__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Buffer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__2"


    // $ANTLR start "rule__Buffer__Group__2__Impl"
    // InternalStl.g:2390:1: rule__Buffer__Group__2__Impl : ( '{' ) ;
    public final void rule__Buffer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2394:1: ( ( '{' ) )
            // InternalStl.g:2395:1: ( '{' )
            {
            // InternalStl.g:2395:1: ( '{' )
            // InternalStl.g:2396:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__2__Impl"


    // $ANTLR start "rule__Buffer__Group__3"
    // InternalStl.g:2405:1: rule__Buffer__Group__3 : rule__Buffer__Group__3__Impl ;
    public final void rule__Buffer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2409:1: ( rule__Buffer__Group__3__Impl )
            // InternalStl.g:2410:2: rule__Buffer__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__3"


    // $ANTLR start "rule__Buffer__Group__3__Impl"
    // InternalStl.g:2416:1: rule__Buffer__Group__3__Impl : ( '}' ) ;
    public final void rule__Buffer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2420:1: ( ( '}' ) )
            // InternalStl.g:2421:1: ( '}' )
            {
            // InternalStl.g:2421:1: ( '}' )
            // InternalStl.g:2422:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__0"
    // InternalStl.g:2432:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2436:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalStl.g:2437:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalStl.g:2444:1: rule__Machine__Group__0__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2448:1: ( ( 'machine' ) )
            // InternalStl.g:2449:1: ( 'machine' )
            {
            // InternalStl.g:2449:1: ( 'machine' )
            // InternalStl.g:2450:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalStl.g:2459:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2463:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalStl.g:2464:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalStl.g:2471:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__NameAssignment_1 ) ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2475:1: ( ( ( rule__Machine__NameAssignment_1 ) ) )
            // InternalStl.g:2476:1: ( ( rule__Machine__NameAssignment_1 ) )
            {
            // InternalStl.g:2476:1: ( ( rule__Machine__NameAssignment_1 ) )
            // InternalStl.g:2477:2: ( rule__Machine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2478:2: ( rule__Machine__NameAssignment_1 )
            // InternalStl.g:2478:3: rule__Machine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalStl.g:2486:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2490:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalStl.g:2491:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Machine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalStl.g:2498:1: rule__Machine__Group__2__Impl : ( '{' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2502:1: ( ( '{' ) )
            // InternalStl.g:2503:1: ( '{' )
            {
            // InternalStl.g:2503:1: ( '{' )
            // InternalStl.g:2504:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalStl.g:2513:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2517:1: ( rule__Machine__Group__3__Impl )
            // InternalStl.g:2518:2: rule__Machine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalStl.g:2524:1: rule__Machine__Group__3__Impl : ( '}' ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2528:1: ( ( '}' ) )
            // InternalStl.g:2529:1: ( '}' )
            {
            // InternalStl.g:2529:1: ( '}' )
            // InternalStl.g:2530:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Conveyor__Group__0"
    // InternalStl.g:2540:1: rule__Conveyor__Group__0 : rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1 ;
    public final void rule__Conveyor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2544:1: ( rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1 )
            // InternalStl.g:2545:2: rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Conveyor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__0"


    // $ANTLR start "rule__Conveyor__Group__0__Impl"
    // InternalStl.g:2552:1: rule__Conveyor__Group__0__Impl : ( 'conveyor' ) ;
    public final void rule__Conveyor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2556:1: ( ( 'conveyor' ) )
            // InternalStl.g:2557:1: ( 'conveyor' )
            {
            // InternalStl.g:2557:1: ( 'conveyor' )
            // InternalStl.g:2558:2: 'conveyor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getConveyorKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getConveyorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__0__Impl"


    // $ANTLR start "rule__Conveyor__Group__1"
    // InternalStl.g:2567:1: rule__Conveyor__Group__1 : rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2 ;
    public final void rule__Conveyor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2571:1: ( rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2 )
            // InternalStl.g:2572:2: rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Conveyor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__1"


    // $ANTLR start "rule__Conveyor__Group__1__Impl"
    // InternalStl.g:2579:1: rule__Conveyor__Group__1__Impl : ( ( rule__Conveyor__NameAssignment_1 ) ) ;
    public final void rule__Conveyor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2583:1: ( ( ( rule__Conveyor__NameAssignment_1 ) ) )
            // InternalStl.g:2584:1: ( ( rule__Conveyor__NameAssignment_1 ) )
            {
            // InternalStl.g:2584:1: ( ( rule__Conveyor__NameAssignment_1 ) )
            // InternalStl.g:2585:2: ( rule__Conveyor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2586:2: ( rule__Conveyor__NameAssignment_1 )
            // InternalStl.g:2586:3: rule__Conveyor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__1__Impl"


    // $ANTLR start "rule__Conveyor__Group__2"
    // InternalStl.g:2594:1: rule__Conveyor__Group__2 : rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3 ;
    public final void rule__Conveyor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2598:1: ( rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3 )
            // InternalStl.g:2599:2: rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Conveyor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__2"


    // $ANTLR start "rule__Conveyor__Group__2__Impl"
    // InternalStl.g:2606:1: rule__Conveyor__Group__2__Impl : ( '{' ) ;
    public final void rule__Conveyor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2610:1: ( ( '{' ) )
            // InternalStl.g:2611:1: ( '{' )
            {
            // InternalStl.g:2611:1: ( '{' )
            // InternalStl.g:2612:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__2__Impl"


    // $ANTLR start "rule__Conveyor__Group__3"
    // InternalStl.g:2621:1: rule__Conveyor__Group__3 : rule__Conveyor__Group__3__Impl ;
    public final void rule__Conveyor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2625:1: ( rule__Conveyor__Group__3__Impl )
            // InternalStl.g:2626:2: rule__Conveyor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__3"


    // $ANTLR start "rule__Conveyor__Group__3__Impl"
    // InternalStl.g:2632:1: rule__Conveyor__Group__3__Impl : ( '}' ) ;
    public final void rule__Conveyor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2636:1: ( ( '}' ) )
            // InternalStl.g:2637:1: ( '}' )
            {
            // InternalStl.g:2637:1: ( '}' )
            // InternalStl.g:2638:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__Group__3__Impl"


    // $ANTLR start "rule__TurnTable__Group__0"
    // InternalStl.g:2648:1: rule__TurnTable__Group__0 : rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1 ;
    public final void rule__TurnTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2652:1: ( rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1 )
            // InternalStl.g:2653:2: rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TurnTable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__0"


    // $ANTLR start "rule__TurnTable__Group__0__Impl"
    // InternalStl.g:2660:1: rule__TurnTable__Group__0__Impl : ( 'turntable' ) ;
    public final void rule__TurnTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2664:1: ( ( 'turntable' ) )
            // InternalStl.g:2665:1: ( 'turntable' )
            {
            // InternalStl.g:2665:1: ( 'turntable' )
            // InternalStl.g:2666:2: 'turntable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getTurntableKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getTurntableKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__0__Impl"


    // $ANTLR start "rule__TurnTable__Group__1"
    // InternalStl.g:2675:1: rule__TurnTable__Group__1 : rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2 ;
    public final void rule__TurnTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2679:1: ( rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2 )
            // InternalStl.g:2680:2: rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TurnTable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__1"


    // $ANTLR start "rule__TurnTable__Group__1__Impl"
    // InternalStl.g:2687:1: rule__TurnTable__Group__1__Impl : ( ( rule__TurnTable__NameAssignment_1 ) ) ;
    public final void rule__TurnTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2691:1: ( ( ( rule__TurnTable__NameAssignment_1 ) ) )
            // InternalStl.g:2692:1: ( ( rule__TurnTable__NameAssignment_1 ) )
            {
            // InternalStl.g:2692:1: ( ( rule__TurnTable__NameAssignment_1 ) )
            // InternalStl.g:2693:2: ( rule__TurnTable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2694:2: ( rule__TurnTable__NameAssignment_1 )
            // InternalStl.g:2694:3: rule__TurnTable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__1__Impl"


    // $ANTLR start "rule__TurnTable__Group__2"
    // InternalStl.g:2702:1: rule__TurnTable__Group__2 : rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3 ;
    public final void rule__TurnTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2706:1: ( rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3 )
            // InternalStl.g:2707:2: rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TurnTable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__2"


    // $ANTLR start "rule__TurnTable__Group__2__Impl"
    // InternalStl.g:2714:1: rule__TurnTable__Group__2__Impl : ( '{' ) ;
    public final void rule__TurnTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2718:1: ( ( '{' ) )
            // InternalStl.g:2719:1: ( '{' )
            {
            // InternalStl.g:2719:1: ( '{' )
            // InternalStl.g:2720:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__2__Impl"


    // $ANTLR start "rule__TurnTable__Group__3"
    // InternalStl.g:2729:1: rule__TurnTable__Group__3 : rule__TurnTable__Group__3__Impl ;
    public final void rule__TurnTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2733:1: ( rule__TurnTable__Group__3__Impl )
            // InternalStl.g:2734:2: rule__TurnTable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__3"


    // $ANTLR start "rule__TurnTable__Group__3__Impl"
    // InternalStl.g:2740:1: rule__TurnTable__Group__3__Impl : ( '}' ) ;
    public final void rule__TurnTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2744:1: ( ( '}' ) )
            // InternalStl.g:2745:1: ( '}' )
            {
            // InternalStl.g:2745:1: ( '}' )
            // InternalStl.g:2746:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalStl.g:2756:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2760:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalStl.g:2761:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalStl.g:2768:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2772:1: ( ( ( '-' )? ) )
            // InternalStl.g:2773:1: ( ( '-' )? )
            {
            // InternalStl.g:2773:1: ( ( '-' )? )
            // InternalStl.g:2774:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStl.g:2775:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStl.g:2775:3: '-'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalStl.g:2783:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2787:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalStl.g:2788:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalStl.g:2795:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2799:1: ( ( ( RULE_INT )? ) )
            // InternalStl.g:2800:1: ( ( RULE_INT )? )
            {
            // InternalStl.g:2800:1: ( ( RULE_INT )? )
            // InternalStl.g:2801:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }
            // InternalStl.g:2802:2: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStl.g:2802:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalStl.g:2810:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2814:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalStl.g:2815:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalStl.g:2822:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2826:1: ( ( '.' ) )
            // InternalStl.g:2827:1: ( '.' )
            {
            // InternalStl.g:2827:1: ( '.' )
            // InternalStl.g:2828:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalStl.g:2837:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2841:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalStl.g:2842:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalStl.g:2849:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2853:1: ( ( RULE_INT ) )
            // InternalStl.g:2854:1: ( RULE_INT )
            {
            // InternalStl.g:2854:1: ( RULE_INT )
            // InternalStl.g:2855:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalStl.g:2864:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2868:1: ( rule__EDouble__Group__4__Impl )
            // InternalStl.g:2869:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalStl.g:2875:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2879:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalStl.g:2880:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalStl.g:2880:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalStl.g:2881:2: ( rule__EDouble__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }
            // InternalStl.g:2882:2: ( rule__EDouble__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=11 && LA16_0<=12)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStl.g:2882:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalStl.g:2891:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2895:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalStl.g:2896:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalStl.g:2903:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2907:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalStl.g:2908:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalStl.g:2908:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalStl.g:2909:2: ( rule__EDouble__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }
            // InternalStl.g:2910:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalStl.g:2910:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalStl.g:2918:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2922:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalStl.g:2923:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalStl.g:2930:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2934:1: ( ( ( '-' )? ) )
            // InternalStl.g:2935:1: ( ( '-' )? )
            {
            // InternalStl.g:2935:1: ( ( '-' )? )
            // InternalStl.g:2936:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            }
            // InternalStl.g:2937:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalStl.g:2937:3: '-'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalStl.g:2945:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2949:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalStl.g:2950:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalStl.g:2956:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2960:1: ( ( RULE_INT ) )
            // InternalStl.g:2961:1: ( RULE_INT )
            {
            // InternalStl.g:2961:1: ( RULE_INT )
            // InternalStl.g:2962:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalStl.g:2972:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2976:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalStl.g:2977:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalStl.g:2984:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2988:1: ( ( ( '-' )? ) )
            // InternalStl.g:2989:1: ( ( '-' )? )
            {
            // InternalStl.g:2989:1: ( ( '-' )? )
            // InternalStl.g:2990:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStl.g:2991:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalStl.g:2991:3: '-'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalStl.g:2999:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3003:1: ( rule__EInt__Group__1__Impl )
            // InternalStl.g:3004:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalStl.g:3010:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3014:1: ( ( RULE_INT ) )
            // InternalStl.g:3015:1: ( RULE_INT )
            {
            // InternalStl.g:3015:1: ( RULE_INT )
            // InternalStl.g:3016:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalStl.g:3026:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3030:1: ( ( RULE_ID ) )
            // InternalStl.g:3031:2: ( RULE_ID )
            {
            // InternalStl.g:3031:2: ( RULE_ID )
            // InternalStl.g:3032:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ItemTypesAssignment_3"
    // InternalStl.g:3041:1: rule__System__ItemTypesAssignment_3 : ( ruleItemType ) ;
    public final void rule__System__ItemTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3045:1: ( ( ruleItemType ) )
            // InternalStl.g:3046:2: ( ruleItemType )
            {
            // InternalStl.g:3046:2: ( ruleItemType )
            // InternalStl.g:3047:3: ruleItemType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ItemTypesAssignment_3"


    // $ANTLR start "rule__System__AreasAssignment_4"
    // InternalStl.g:3056:1: rule__System__AreasAssignment_4 : ( ruleArea ) ;
    public final void rule__System__AreasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3060:1: ( ( ruleArea ) )
            // InternalStl.g:3061:2: ( ruleArea )
            {
            // InternalStl.g:3061:2: ( ruleArea )
            // InternalStl.g:3062:3: ruleArea
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__AreasAssignment_4"


    // $ANTLR start "rule__Area__NameAssignment_1"
    // InternalStl.g:3071:1: rule__Area__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Area__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3075:1: ( ( RULE_ID ) )
            // InternalStl.g:3076:2: ( RULE_ID )
            {
            // InternalStl.g:3076:2: ( RULE_ID )
            // InternalStl.g:3077:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__NameAssignment_1"


    // $ANTLR start "rule__Area__ComponentsAssignment_3"
    // InternalStl.g:3086:1: rule__Area__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Area__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3090:1: ( ( ruleComponent ) )
            // InternalStl.g:3091:2: ( ruleComponent )
            {
            // InternalStl.g:3091:2: ( ruleComponent )
            // InternalStl.g:3092:3: ruleComponent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__ComponentsAssignment_3"


    // $ANTLR start "rule__Area__ConnectorsAssignment_4"
    // InternalStl.g:3101:1: rule__Area__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__Area__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3105:1: ( ( ruleConnector ) )
            // InternalStl.g:3106:2: ( ruleConnector )
            {
            // InternalStl.g:3106:2: ( ruleConnector )
            // InternalStl.g:3107:3: ruleConnector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__ConnectorsAssignment_4"


    // $ANTLR start "rule__ItemType__NameAssignment_1"
    // InternalStl.g:3116:1: rule__ItemType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ItemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3120:1: ( ( RULE_ID ) )
            // InternalStl.g:3121:2: ( RULE_ID )
            {
            // InternalStl.g:3121:2: ( RULE_ID )
            // InternalStl.g:3122:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__NameAssignment_1"


    // $ANTLR start "rule__ItemType__DescriptionAssignment_3"
    // InternalStl.g:3131:1: rule__ItemType__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__ItemType__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3135:1: ( ( ruleEString ) )
            // InternalStl.g:3136:2: ( ruleEString )
            {
            // InternalStl.g:3136:2: ( ruleEString )
            // InternalStl.g:3137:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getDescriptionEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getDescriptionEStringParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__DescriptionAssignment_3"


    // $ANTLR start "rule__Component__CostAssignment_5_1"
    // InternalStl.g:3146:1: rule__Component__CostAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Component__CostAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3150:1: ( ( ruleEInt ) )
            // InternalStl.g:3151:2: ( ruleEInt )
            {
            // InternalStl.g:3151:2: ( ruleEInt )
            // InternalStl.g:3152:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCostEIntParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCostEIntParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__CostAssignment_5_1"


    // $ANTLR start "rule__Component__ServicesAssignment_5_3"
    // InternalStl.g:3161:1: rule__Component__ServicesAssignment_5_3 : ( ruleService ) ;
    public final void rule__Component__ServicesAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3165:1: ( ( ruleService ) )
            // InternalStl.g:3166:2: ( ruleService )
            {
            // InternalStl.g:3166:2: ( ruleService )
            // InternalStl.g:3167:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_5_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getServicesServiceParserRuleCall_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ServicesAssignment_5_3"


    // $ANTLR start "rule__Component__InputSlotsAssignment_5_4"
    // InternalStl.g:3176:1: rule__Component__InputSlotsAssignment_5_4 : ( ruleSlot ) ;
    public final void rule__Component__InputSlotsAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3180:1: ( ( ruleSlot ) )
            // InternalStl.g:3181:2: ( ruleSlot )
            {
            // InternalStl.g:3181:2: ( ruleSlot )
            // InternalStl.g:3182:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getInputSlotsSlotParserRuleCall_5_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getInputSlotsSlotParserRuleCall_5_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__InputSlotsAssignment_5_4"


    // $ANTLR start "rule__Component__OutputSlotsAssignment_5_5"
    // InternalStl.g:3191:1: rule__Component__OutputSlotsAssignment_5_5 : ( ruleSlot ) ;
    public final void rule__Component__OutputSlotsAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3195:1: ( ( ruleSlot ) )
            // InternalStl.g:3196:2: ( ruleSlot )
            {
            // InternalStl.g:3196:2: ( ruleSlot )
            // InternalStl.g:3197:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOutputSlotsSlotParserRuleCall_5_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOutputSlotsSlotParserRuleCall_5_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__OutputSlotsAssignment_5_5"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalStl.g:3206:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3210:1: ( ( RULE_ID ) )
            // InternalStl.g:3211:2: ( RULE_ID )
            {
            // InternalStl.g:3211:2: ( RULE_ID )
            // InternalStl.g:3212:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__CostAssignment_3"
    // InternalStl.g:3221:1: rule__Service__CostAssignment_3 : ( ruleEInt ) ;
    public final void rule__Service__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3225:1: ( ( ruleEInt ) )
            // InternalStl.g:3226:2: ( ruleEInt )
            {
            // InternalStl.g:3226:2: ( ruleEInt )
            // InternalStl.g:3227:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CostAssignment_3"


    // $ANTLR start "rule__Service__ProcessingTimeAssignment_4"
    // InternalStl.g:3236:1: rule__Service__ProcessingTimeAssignment_4 : ( ruleEInt ) ;
    public final void rule__Service__ProcessingTimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3240:1: ( ( ruleEInt ) )
            // InternalStl.g:3241:2: ( ruleEInt )
            {
            // InternalStl.g:3241:2: ( ruleEInt )
            // InternalStl.g:3242:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ProcessingTimeAssignment_4"


    // $ANTLR start "rule__Service__ReliabilityAssignment_5"
    // InternalStl.g:3251:1: rule__Service__ReliabilityAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Service__ReliabilityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3255:1: ( ( ruleEDouble ) )
            // InternalStl.g:3256:2: ( ruleEDouble )
            {
            // InternalStl.g:3256:2: ( ruleEDouble )
            // InternalStl.g:3257:3: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ReliabilityAssignment_5"


    // $ANTLR start "rule__Service__ParametersAssignment_8"
    // InternalStl.g:3266:1: rule__Service__ParametersAssignment_8 : ( ruleParameter ) ;
    public final void rule__Service__ParametersAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3270:1: ( ( ruleParameter ) )
            // InternalStl.g:3271:2: ( ruleParameter )
            {
            // InternalStl.g:3271:2: ( ruleParameter )
            // InternalStl.g:3272:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ParametersAssignment_8"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalStl.g:3281:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3285:1: ( ( RULE_ID ) )
            // InternalStl.g:3286:2: ( RULE_ID )
            {
            // InternalStl.g:3286:2: ( RULE_ID )
            // InternalStl.g:3287:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Connector__EntryAssignment_1"
    // InternalStl.g:3296:1: rule__Connector__EntryAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Connector__EntryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3300:1: ( ( ( RULE_ID ) ) )
            // InternalStl.g:3301:2: ( ( RULE_ID ) )
            {
            // InternalStl.g:3301:2: ( ( RULE_ID ) )
            // InternalStl.g:3302:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntrySlotCrossReference_1_0()); 
            }
            // InternalStl.g:3303:3: ( RULE_ID )
            // InternalStl.g:3304:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntrySlotIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntrySlotIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntrySlotCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__EntryAssignment_1"


    // $ANTLR start "rule__Connector__ExitAssignment_3"
    // InternalStl.g:3315:1: rule__Connector__ExitAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Connector__ExitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3319:1: ( ( ( RULE_ID ) ) )
            // InternalStl.g:3320:2: ( ( RULE_ID ) )
            {
            // InternalStl.g:3320:2: ( ( RULE_ID ) )
            // InternalStl.g:3321:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitSlotCrossReference_3_0()); 
            }
            // InternalStl.g:3322:3: ( RULE_ID )
            // InternalStl.g:3323:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitSlotIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitSlotIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitSlotCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__ExitAssignment_3"


    // $ANTLR start "rule__Slot__NameAssignment_1"
    // InternalStl.g:3334:1: rule__Slot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Slot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3338:1: ( ( RULE_ID ) )
            // InternalStl.g:3339:2: ( RULE_ID )
            {
            // InternalStl.g:3339:2: ( RULE_ID )
            // InternalStl.g:3340:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slot__NameAssignment_1"


    // $ANTLR start "rule__ItemGenerator__NameAssignment_1"
    // InternalStl.g:3349:1: rule__ItemGenerator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ItemGenerator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3353:1: ( ( RULE_ID ) )
            // InternalStl.g:3354:2: ( RULE_ID )
            {
            // InternalStl.g:3354:2: ( RULE_ID )
            // InternalStl.g:3355:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__NameAssignment_1"


    // $ANTLR start "rule__ItemGenerator__GeneratedTypeAssignment_2_1"
    // InternalStl.g:3364:1: rule__ItemGenerator__GeneratedTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ItemGenerator__GeneratedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3368:1: ( ( ( RULE_ID ) ) )
            // InternalStl.g:3369:2: ( ( RULE_ID ) )
            {
            // InternalStl.g:3369:2: ( ( RULE_ID ) )
            // InternalStl.g:3370:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_2_1_0()); 
            }
            // InternalStl.g:3371:3: ( RULE_ID )
            // InternalStl.g:3372:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGenerator__GeneratedTypeAssignment_2_1"


    // $ANTLR start "rule__Store__CapacityAssignment_1_1"
    // InternalStl.g:3383:1: rule__Store__CapacityAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__Store__CapacityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3387:1: ( ( ruleEInt ) )
            // InternalStl.g:3388:2: ( ruleEInt )
            {
            // InternalStl.g:3388:2: ( ruleEInt )
            // InternalStl.g:3389:3: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreAccess().getCapacityEIntParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreAccess().getCapacityEIntParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__CapacityAssignment_1_1"


    // $ANTLR start "rule__WasteStore__NameAssignment_1"
    // InternalStl.g:3398:1: rule__WasteStore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WasteStore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3402:1: ( ( RULE_ID ) )
            // InternalStl.g:3403:2: ( RULE_ID )
            {
            // InternalStl.g:3403:2: ( RULE_ID )
            // InternalStl.g:3404:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WasteStore__NameAssignment_1"


    // $ANTLR start "rule__ProductStore__NameAssignment_1"
    // InternalStl.g:3413:1: rule__ProductStore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProductStore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3417:1: ( ( RULE_ID ) )
            // InternalStl.g:3418:2: ( RULE_ID )
            {
            // InternalStl.g:3418:2: ( RULE_ID )
            // InternalStl.g:3419:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductStore__NameAssignment_1"


    // $ANTLR start "rule__Buffer__NameAssignment_1"
    // InternalStl.g:3428:1: rule__Buffer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Buffer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3432:1: ( ( RULE_ID ) )
            // InternalStl.g:3433:2: ( RULE_ID )
            {
            // InternalStl.g:3433:2: ( RULE_ID )
            // InternalStl.g:3434:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buffer__NameAssignment_1"


    // $ANTLR start "rule__Machine__NameAssignment_1"
    // InternalStl.g:3443:1: rule__Machine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3447:1: ( ( RULE_ID ) )
            // InternalStl.g:3448:2: ( RULE_ID )
            {
            // InternalStl.g:3448:2: ( RULE_ID )
            // InternalStl.g:3449:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_1"


    // $ANTLR start "rule__Conveyor__NameAssignment_1"
    // InternalStl.g:3458:1: rule__Conveyor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Conveyor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3462:1: ( ( RULE_ID ) )
            // InternalStl.g:3463:2: ( RULE_ID )
            {
            // InternalStl.g:3463:2: ( RULE_ID )
            // InternalStl.g:3464:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conveyor__NameAssignment_1"


    // $ANTLR start "rule__TurnTable__NameAssignment_1"
    // InternalStl.g:3473:1: rule__TurnTable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TurnTable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3477:1: ( ( RULE_ID ) )
            // InternalStl.g:3478:2: ( RULE_ID )
            {
            // InternalStl.g:3478:2: ( RULE_ID )
            // InternalStl.g:3479:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnTable__NameAssignment_1"

    // $ANTLR start synpred14_InternalStl
    public final void synpred14_InternalStl_fragment() throws RecognitionException {   
        // InternalStl.g:1209:3: ( rule__Component__InputSlotsAssignment_5_4 )
        // InternalStl.g:1209:3: rule__Component__InputSlotsAssignment_5_4
        {
        pushFollow(FOLLOW_2);
        rule__Component__InputSlotsAssignment_5_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalStl

    // Delegated rules

    public final boolean synpred14_InternalStl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalStl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001FA00C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001FA000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001088000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000600000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});

}