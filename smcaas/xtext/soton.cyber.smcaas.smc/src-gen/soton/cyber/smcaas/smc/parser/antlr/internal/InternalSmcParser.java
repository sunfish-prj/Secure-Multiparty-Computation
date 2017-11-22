package soton.cyber.smcaas.smc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import soton.cyber.smcaas.smc.services.SmcGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSmcParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_STRING", "RULE_DATE", "RULE_TIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'block'", "'='", "'new'", "'('", "','", "')'", "';'", "'main'", "'{'", "'}'", "'print'", "'while'", "'if'", "'else'", "'var'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'list('", "'.'", "'insert_data'", "'math_computation'", "'search'", "'anonymization'", "'access_control'", "'permission_release'", "'INT'", "'DOUBLE'", "'BOOLEAN'", "'STRING'", "'[]'", "'tuple'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_TIME=10;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=6;
    public static final int RULE_DATE=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSmcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmcParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmc.g"; }



     	private SmcGrammarAccess grammarAccess;

        public InternalSmcParser(TokenStream input, SmcGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Smc";
       	}

       	@Override
       	protected SmcGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSmc"
    // InternalSmc.g:65:1: entryRuleSmc returns [EObject current=null] : iv_ruleSmc= ruleSmc EOF ;
    public final EObject entryRuleSmc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmc = null;


        try {
            // InternalSmc.g:65:44: (iv_ruleSmc= ruleSmc EOF )
            // InternalSmc.g:66:2: iv_ruleSmc= ruleSmc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSmcRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSmc=ruleSmc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSmc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSmc"


    // $ANTLR start "ruleSmc"
    // InternalSmc.g:72:1: ruleSmc returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleSmc() throws RecognitionException {
        EObject current = null;

        EObject lv_blocks_1_0 = null;

        EObject lv_main_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )* ) ) ) )
            // InternalSmc.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )* ) ) )
            {
            // InternalSmc.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )* ) ) )
            // InternalSmc.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )* ) )
            {
            // InternalSmc.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )* ) )
            // InternalSmc.g:81:4: ( ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getSmcAccess().getUnorderedGroup());
            // InternalSmc.g:84:4: ( ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )* )
            // InternalSmc.g:85:5: ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )*
            {
            // InternalSmc.g:85:5: ( ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSmcAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSmcAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmc.g:86:3: ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) )
            	    {
            	    // InternalSmc.g:86:3: ({...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ ) )
            	    // InternalSmc.g:87:4: {...}? => ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSmcAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSmc", "getUnorderedGroupHelper().canSelect(grammarAccess.getSmcAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalSmc.g:87:97: ( ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+ )
            	    // InternalSmc.g:88:5: ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSmcAccess().getUnorderedGroup(), 0);
            	    // InternalSmc.g:91:8: ({...}? => ( (lv_blocks_1_0= ruleBlockSMC ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalSmc.g:91:9: {...}? => ( (lv_blocks_1_0= ruleBlockSMC ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleSmc", "true");
            	    	    }
            	    	    // InternalSmc.g:91:18: ( (lv_blocks_1_0= ruleBlockSMC ) )
            	    	    // InternalSmc.g:91:19: (lv_blocks_1_0= ruleBlockSMC )
            	    	    {
            	    	    // InternalSmc.g:91:19: (lv_blocks_1_0= ruleBlockSMC )
            	    	    // InternalSmc.g:92:9: lv_blocks_1_0= ruleBlockSMC
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      									newCompositeNode(grammarAccess.getSmcAccess().getBlocksBlockSMCParserRuleCall_0_0());
            	    	      								
            	    	    }
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_blocks_1_0=ruleBlockSMC();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									if (current==null) {
            	    	      										current = createModelElementForParent(grammarAccess.getSmcRule());
            	    	      									}
            	    	      									add(
            	    	      										current,
            	    	      										"blocks",
            	    	      										lv_blocks_1_0,
            	    	      										"soton.cyber.smcaas.smc.Smc.BlockSMC");
            	    	      									afterParserOrEnumRuleCall();
            	    	      								
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSmcAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSmc.g:114:3: ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) )
            	    {
            	    // InternalSmc.g:114:3: ({...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) ) )
            	    // InternalSmc.g:115:4: {...}? => ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSmcAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSmc", "getUnorderedGroupHelper().canSelect(grammarAccess.getSmcAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalSmc.g:115:97: ( ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) ) )
            	    // InternalSmc.g:116:5: ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSmcAccess().getUnorderedGroup(), 1);
            	    // InternalSmc.g:119:8: ({...}? => ( (lv_main_2_0= ruleMainSMC ) ) )
            	    // InternalSmc.g:119:9: {...}? => ( (lv_main_2_0= ruleMainSMC ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSmc", "true");
            	    }
            	    // InternalSmc.g:119:18: ( (lv_main_2_0= ruleMainSMC ) )
            	    // InternalSmc.g:119:19: (lv_main_2_0= ruleMainSMC )
            	    {
            	    // InternalSmc.g:119:19: (lv_main_2_0= ruleMainSMC )
            	    // InternalSmc.g:120:9: lv_main_2_0= ruleMainSMC
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getSmcAccess().getMainMainSMCParserRuleCall_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_main_2_0=ruleMainSMC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElementForParent(grammarAccess.getSmcRule());
            	      									}
            	      									set(
            	      										current,
            	      										"main",
            	      										lv_main_2_0,
            	      										"soton.cyber.smcaas.smc.Smc.MainSMC");
            	      									afterParserOrEnumRuleCall();
            	      								
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSmcAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getSmcAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSmc"


    // $ANTLR start "entryRuleBlockSMC"
    // InternalSmc.g:152:1: entryRuleBlockSMC returns [EObject current=null] : iv_ruleBlockSMC= ruleBlockSMC EOF ;
    public final EObject entryRuleBlockSMC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSMC = null;


        try {
            // InternalSmc.g:152:49: (iv_ruleBlockSMC= ruleBlockSMC EOF )
            // InternalSmc.g:153:2: iv_ruleBlockSMC= ruleBlockSMC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockSMCRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockSMC=ruleBlockSMC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockSMC; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlockSMC"


    // $ANTLR start "ruleBlockSMC"
    // InternalSmc.g:159:1: ruleBlockSMC returns [EObject current=null] : (otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' ( ( (lv_parameters_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) ) )* )? otherlv_9= ')' otherlv_10= ';' ) ;
    public final EObject ruleBlockSMC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:165:2: ( (otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' ( ( (lv_parameters_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) ) )* )? otherlv_9= ')' otherlv_10= ';' ) )
            // InternalSmc.g:166:2: (otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' ( ( (lv_parameters_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) ) )* )? otherlv_9= ')' otherlv_10= ';' )
            {
            // InternalSmc.g:166:2: (otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' ( ( (lv_parameters_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) ) )* )? otherlv_9= ')' otherlv_10= ';' )
            // InternalSmc.g:167:3: otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' ( ( (lv_parameters_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) ) )* )? otherlv_9= ')' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockSMCAccess().getBlockKeyword_0());
              		
            }
            // InternalSmc.g:171:3: ( (lv_type_1_0= ruleBlockType ) )
            // InternalSmc.g:172:4: (lv_type_1_0= ruleBlockType )
            {
            // InternalSmc.g:172:4: (lv_type_1_0= ruleBlockType )
            // InternalSmc.g:173:5: lv_type_1_0= ruleBlockType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockSMCAccess().getTypeBlockTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleBlockType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockSMCRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"soton.cyber.smcaas.smc.Smc.BlockType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmc.g:190:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmc.g:191:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmc.g:191:4: (lv_name_2_0= RULE_ID )
            // InternalSmc.g:192:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getBlockSMCAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBlockSMCRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockSMCAccess().getEqualsSignKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockSMCAccess().getNewKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBlockSMCAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalSmc.g:220:3: ( ( (lv_parameters_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_TIME)||LA4_0==18||(LA4_0>=42 && LA4_0<=43)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmc.g:221:4: ( (lv_parameters_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) ) )*
                    {
                    // InternalSmc.g:221:4: ( (lv_parameters_6_0= ruleExpression ) )
                    // InternalSmc.g:222:5: (lv_parameters_6_0= ruleExpression )
                    {
                    // InternalSmc.g:222:5: (lv_parameters_6_0= ruleExpression )
                    // InternalSmc.g:223:6: lv_parameters_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlockSMCAccess().getParametersExpressionParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_parameters_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlockSMCRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_6_0,
                      							"soton.cyber.smcaas.smc.Smc.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSmc.g:240:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmc.g:241:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getBlockSMCAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalSmc.g:245:5: ( (lv_parameters_8_0= ruleExpression ) )
                    	    // InternalSmc.g:246:6: (lv_parameters_8_0= ruleExpression )
                    	    {
                    	    // InternalSmc.g:246:6: (lv_parameters_8_0= ruleExpression )
                    	    // InternalSmc.g:247:7: lv_parameters_8_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBlockSMCAccess().getParametersExpressionParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameters_8_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBlockSMCRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_8_0,
                    	      								"soton.cyber.smcaas.smc.Smc.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getBlockSMCAccess().getRightParenthesisKeyword_7());
              		
            }
            otherlv_10=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getBlockSMCAccess().getSemicolonKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlockSMC"


    // $ANTLR start "entryRuleMainSMC"
    // InternalSmc.g:278:1: entryRuleMainSMC returns [EObject current=null] : iv_ruleMainSMC= ruleMainSMC EOF ;
    public final EObject entryRuleMainSMC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainSMC = null;


        try {
            // InternalSmc.g:278:48: (iv_ruleMainSMC= ruleMainSMC EOF )
            // InternalSmc.g:279:2: iv_ruleMainSMC= ruleMainSMC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainSMCRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMainSMC=ruleMainSMC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMainSMC; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMainSMC"


    // $ANTLR start "ruleMainSMC"
    // InternalSmc.g:285:1: ruleMainSMC returns [EObject current=null] : (otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleMainSMC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:291:2: ( (otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) )
            // InternalSmc.g:292:2: (otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            {
            // InternalSmc.g:292:2: (otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            // InternalSmc.g:293:3: otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMainSMCAccess().getMainKeyword_0());
              		
            }
            // InternalSmc.g:297:3: ()
            // InternalSmc.g:298:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMainSMCAccess().getMainSMCAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMainSMCAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSmc.g:308:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==23||(LA5_0>=25 && LA5_0<=27)||LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmc.g:309:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalSmc.g:309:4: (lv_commands_3_0= ruleCommand )
            	    // InternalSmc.g:310:5: lv_commands_3_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMainSMCAccess().getCommandsCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_commands_3_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMainSMCRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_3_0,
            	      						"soton.cyber.smcaas.smc.Smc.Command");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMainSMCAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMainSMC"


    // $ANTLR start "entryRuleCommand"
    // InternalSmc.g:335:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalSmc.g:335:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalSmc.g:336:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalSmc.g:342:1: ruleCommand returns [EObject current=null] : (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_Invocation_6= ruleInvocation ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_VariableDecl_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_IfThenElse_3 = null;

        EObject this_While_4 = null;

        EObject this_Print_5 = null;

        EObject this_Invocation_6 = null;



        	enterRule();

        try {
            // InternalSmc.g:348:2: ( (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_Invocation_6= ruleInvocation ) )
            // InternalSmc.g:349:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_Invocation_6= ruleInvocation )
            {
            // InternalSmc.g:349:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_Invocation_6= ruleInvocation )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==16) ) {
                    alt6=3;
                }
                else if ( (LA6_3==44) ) {
                    alt6=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 25:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSmc.g:350:3: this_Block_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getBlockParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmc.g:359:3: this_VariableDecl_1= ruleVariableDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getVariableDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDecl_1=ruleVariableDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDecl_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSmc.g:368:3: this_VariableAssignment_2= ruleVariableAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getVariableAssignmentParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableAssignment_2=ruleVariableAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableAssignment_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSmc.g:377:3: this_IfThenElse_3= ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getIfThenElseParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfThenElse_3=ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfThenElse_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSmc.g:386:3: this_While_4= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getWhileParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_While_4=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_While_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSmc.g:395:3: this_Print_5= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getPrintParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Print_5=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Print_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSmc.g:404:3: this_Invocation_6= ruleInvocation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getInvocationParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Invocation_6=ruleInvocation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Invocation_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleBlock"
    // InternalSmc.g:416:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalSmc.g:416:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalSmc.g:417:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalSmc.g:423:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:429:2: ( ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) )
            // InternalSmc.g:430:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            {
            // InternalSmc.g:430:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            // InternalSmc.g:431:3: () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}'
            {
            // InternalSmc.g:431:3: ()
            // InternalSmc.g:432:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSmc.g:442:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==23||(LA7_0>=25 && LA7_0<=27)||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmc.g:443:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalSmc.g:443:4: (lv_commands_2_0= ruleCommand )
            	    // InternalSmc.g:444:5: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getCommandsCommandParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_2_0,
            	      						"soton.cyber.smcaas.smc.Smc.Command");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRulePrint"
    // InternalSmc.g:469:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalSmc.g:469:46: (iv_rulePrint= rulePrint EOF )
            // InternalSmc.g:470:2: iv_rulePrint= rulePrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalSmc.g:476:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:482:2: ( (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalSmc.g:483:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalSmc.g:483:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalSmc.g:484:3: otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:492:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalSmc.g:493:4: (lv_value_2_0= ruleExpression )
            {
            // InternalSmc.g:493:4: (lv_value_2_0= ruleExpression )
            // InternalSmc.g:494:5: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"soton.cyber.smcaas.smc.Smc.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPrintAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPrintAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleWhile"
    // InternalSmc.g:523:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalSmc.g:523:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalSmc.g:524:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalSmc.g:530:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:536:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) )
            // InternalSmc.g:537:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            {
            // InternalSmc.g:537:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            // InternalSmc.g:538:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:546:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmc.g:547:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmc.g:547:4: (lv_condition_2_0= ruleExpression )
            // InternalSmc.g:548:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"soton.cyber.smcaas.smc.Smc.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSmc.g:569:3: ( (lv_body_4_0= ruleCommand ) )
            // InternalSmc.g:570:4: (lv_body_4_0= ruleCommand )
            {
            // InternalSmc.g:570:4: (lv_body_4_0= ruleCommand )
            // InternalSmc.g:571:5: lv_body_4_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getBodyCommandParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_4_0,
              						"soton.cyber.smcaas.smc.Smc.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalSmc.g:592:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalSmc.g:592:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalSmc.g:593:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalSmc.g:599:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenBrach_4_0 = null;

        EObject lv_elseBranch_6_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:605:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) )
            // InternalSmc.g:606:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            {
            // InternalSmc.g:606:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            // InternalSmc.g:607:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:615:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmc.g:616:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmc.g:616:4: (lv_condition_2_0= ruleExpression )
            // InternalSmc.g:617:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"soton.cyber.smcaas.smc.Smc.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSmc.g:638:3: ( (lv_thenBrach_4_0= ruleCommand ) )
            // InternalSmc.g:639:4: (lv_thenBrach_4_0= ruleCommand )
            {
            // InternalSmc.g:639:4: (lv_thenBrach_4_0= ruleCommand )
            // InternalSmc.g:640:5: lv_thenBrach_4_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfThenElseAccess().getThenBrachCommandParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_thenBrach_4_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              					}
              					set(
              						current,
              						"thenBrach",
              						lv_thenBrach_4_0,
              						"soton.cyber.smcaas.smc.Smc.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmc.g:657:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred1_InternalSmc()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalSmc.g:658:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) )
                    {
                    // InternalSmc.g:658:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalSmc.g:659:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalSmc.g:665:4: ( (lv_elseBranch_6_0= ruleCommand ) )
                    // InternalSmc.g:666:5: (lv_elseBranch_6_0= ruleCommand )
                    {
                    // InternalSmc.g:666:5: (lv_elseBranch_6_0= ruleCommand )
                    // InternalSmc.g:667:6: lv_elseBranch_6_0= ruleCommand
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseBranchCommandParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBranch_6_0=ruleCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                      						}
                      						set(
                      							current,
                      							"elseBranch",
                      							lv_elseBranch_6_0,
                      							"soton.cyber.smcaas.smc.Smc.Command");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleVariableDecl"
    // InternalSmc.g:689:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalSmc.g:689:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalSmc.g:690:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDecl=ruleVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // InternalSmc.g:696:1: ruleVariableDecl returns [EObject current=null] : (otherlv_0= 'var' ( (lv_type_1_0= ruleBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_exp_4_0= ruleExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:702:2: ( (otherlv_0= 'var' ( (lv_type_1_0= ruleBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_exp_4_0= ruleExpression ) ) )? otherlv_5= ';' ) )
            // InternalSmc.g:703:2: (otherlv_0= 'var' ( (lv_type_1_0= ruleBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_exp_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            {
            // InternalSmc.g:703:2: (otherlv_0= 'var' ( (lv_type_1_0= ruleBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_exp_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            // InternalSmc.g:704:3: otherlv_0= 'var' ( (lv_type_1_0= ruleBasicType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_exp_4_0= ruleExpression ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariableDeclAccess().getVarKeyword_0());
              		
            }
            // InternalSmc.g:708:3: ( (lv_type_1_0= ruleBasicType ) )
            // InternalSmc.g:709:4: (lv_type_1_0= ruleBasicType )
            {
            // InternalSmc.g:709:4: (lv_type_1_0= ruleBasicType )
            // InternalSmc.g:710:5: lv_type_1_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclAccess().getTypeBasicTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_type_1_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"soton.cyber.smcaas.smc.Smc.BasicType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmc.g:727:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmc.g:728:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmc.g:728:4: (lv_name_2_0= RULE_ID )
            // InternalSmc.g:729:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSmc.g:745:3: (otherlv_3= '=' ( (lv_exp_4_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmc.g:746:4: otherlv_3= '=' ( (lv_exp_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getVariableDeclAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalSmc.g:750:4: ( (lv_exp_4_0= ruleExpression ) )
                    // InternalSmc.g:751:5: (lv_exp_4_0= ruleExpression )
                    {
                    // InternalSmc.g:751:5: (lv_exp_4_0= ruleExpression )
                    // InternalSmc.g:752:6: lv_exp_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableDeclAccess().getExpExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_exp_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableDeclRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_4_0,
                      							"soton.cyber.smcaas.smc.Smc.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVariableDeclAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalSmc.g:778:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalSmc.g:778:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalSmc.g:779:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalSmc.g:785:1: ruleVariableAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:791:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalSmc.g:792:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalSmc.g:792:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalSmc.g:793:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalSmc.g:793:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmc.g:794:4: (otherlv_0= RULE_ID )
            {
            // InternalSmc.g:794:4: (otherlv_0= RULE_ID )
            // InternalSmc.g:795:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableAssignmentRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getVariableAssignmentAccess().getVarVariableDeclCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalSmc.g:810:3: ( (lv_exp_2_0= ruleExpression ) )
            // InternalSmc.g:811:4: (lv_exp_2_0= ruleExpression )
            {
            // InternalSmc.g:811:4: (lv_exp_2_0= ruleExpression )
            // InternalSmc.g:812:5: lv_exp_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_exp_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_2_0,
              						"soton.cyber.smcaas.smc.Smc.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVariableAssignmentAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalSmc.g:837:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmc.g:837:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmc.g:838:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSmc.g:844:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:850:2: (this_Or_0= ruleOr )
            // InternalSmc.g:851:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalSmc.g:862:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSmc.g:862:43: (iv_ruleOr= ruleOr EOF )
            // InternalSmc.g:863:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalSmc.g:869:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:875:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSmc.g:876:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSmc.g:876:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSmc.g:877:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:885:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmc.g:886:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSmc.g:886:4: ()
            	    // InternalSmc.g:887:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalSmc.g:897:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSmc.g:898:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSmc.g:898:5: (lv_right_3_0= ruleAnd )
            	    // InternalSmc.g:899:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"soton.cyber.smcaas.smc.Smc.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSmc.g:921:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSmc.g:921:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSmc.g:922:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSmc.g:928:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:934:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalSmc.g:935:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalSmc.g:935:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalSmc.g:936:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:944:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmc.g:945:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalSmc.g:945:4: ()
            	    // InternalSmc.g:946:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalSmc.g:956:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalSmc.g:957:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalSmc.g:957:5: (lv_right_3_0= ruleEquality )
            	    // InternalSmc.g:958:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"soton.cyber.smcaas.smc.Smc.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalSmc.g:980:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalSmc.g:980:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalSmc.g:981:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalSmc.g:987:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:993:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalSmc.g:994:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalSmc.g:994:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalSmc.g:995:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1003:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=32 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSmc.g:1004:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalSmc.g:1004:4: ()
            	    // InternalSmc.g:1005:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1011:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalSmc.g:1012:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalSmc.g:1012:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalSmc.g:1013:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalSmc.g:1013:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==32) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==33) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalSmc.g:1014:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmc.g:1025:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSmc.g:1038:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalSmc.g:1039:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalSmc.g:1039:5: (lv_right_3_0= ruleComparison )
            	    // InternalSmc.g:1040:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"soton.cyber.smcaas.smc.Smc.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalSmc.g:1062:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmc.g:1062:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmc.g:1063:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalSmc.g:1069:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1075:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalSmc.g:1076:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalSmc.g:1076:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalSmc.g:1077:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1085:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=34 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmc.g:1086:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalSmc.g:1086:4: ()
            	    // InternalSmc.g:1087:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1093:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalSmc.g:1094:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalSmc.g:1094:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalSmc.g:1095:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalSmc.g:1095:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalSmc.g:1096:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmc.g:1107:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalSmc.g:1118:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalSmc.g:1129:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,37,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSmc.g:1142:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalSmc.g:1143:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalSmc.g:1143:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalSmc.g:1144:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"soton.cyber.smcaas.smc.Smc.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalSmc.g:1166:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalSmc.g:1166:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalSmc.g:1167:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalSmc.g:1173:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1179:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalSmc.g:1180:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalSmc.g:1180:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalSmc.g:1181:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1189:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=38 && LA17_0<=39)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSmc.g:1190:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalSmc.g:1190:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==38) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==39) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalSmc.g:1191:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalSmc.g:1191:5: ( () otherlv_2= '+' )
            	            // InternalSmc.g:1192:6: () otherlv_2= '+'
            	            {
            	            // InternalSmc.g:1192:6: ()
            	            // InternalSmc.g:1193:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalSmc.g:1205:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalSmc.g:1205:5: ( () otherlv_4= '-' )
            	            // InternalSmc.g:1206:6: () otherlv_4= '-'
            	            {
            	            // InternalSmc.g:1206:6: ()
            	            // InternalSmc.g:1207:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSmc.g:1219:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalSmc.g:1220:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalSmc.g:1220:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalSmc.g:1221:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"soton.cyber.smcaas.smc.Smc.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalSmc.g:1243:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalSmc.g:1243:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalSmc.g:1244:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalSmc.g:1250:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1256:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalSmc.g:1257:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalSmc.g:1257:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalSmc.g:1258:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1266:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=40 && LA19_0<=41)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSmc.g:1267:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalSmc.g:1267:4: ()
            	    // InternalSmc.g:1268:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1274:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalSmc.g:1275:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalSmc.g:1275:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalSmc.g:1276:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalSmc.g:1276:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==40) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==41) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalSmc.g:1277:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMulOrDivRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmc.g:1288:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMulOrDivRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSmc.g:1301:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalSmc.g:1302:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalSmc.g:1302:5: (lv_right_3_0= rulePrimary )
            	    // InternalSmc.g:1303:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"soton.cyber.smcaas.smc.Smc.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalSmc.g:1325:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmc.g:1325:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmc.g:1326:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSmc.g:1332:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalSmc.g:1338:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalSmc.g:1339:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalSmc.g:1339:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt20=1;
                }
                break;
            case 42:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_STRING:
            case RULE_DATE:
            case RULE_TIME:
            case 43:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSmc.g:1340:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalSmc.g:1340:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalSmc.g:1341:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:1359:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalSmc.g:1359:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalSmc.g:1360:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalSmc.g:1360:4: ()
                    // InternalSmc.g:1361:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalSmc.g:1371:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalSmc.g:1372:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalSmc.g:1372:5: (lv_expression_5_0= rulePrimary )
                    // InternalSmc.g:1373:6: lv_expression_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"soton.cyber.smcaas.smc.Smc.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:1392:3: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalSmc.g:1404:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalSmc.g:1404:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalSmc.g:1405:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalSmc.g:1411:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_11_0=null;
        Token otherlv_13=null;
        EObject this_List_14 = null;

        EObject this_Invocation_15 = null;



        	enterRule();

        try {
            // InternalSmc.g:1417:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation ) )
            // InternalSmc.g:1418:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation )
            {
            // InternalSmc.g:1418:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation )
            int alt21=9;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSmc.g:1419:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalSmc.g:1419:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalSmc.g:1420:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalSmc.g:1420:4: ()
                    // InternalSmc.g:1421:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1427:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalSmc.g:1428:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalSmc.g:1428:5: (lv_value_1_0= RULE_INT )
                    // InternalSmc.g:1429:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"soton.cyber.smcaas.smc.Smc.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:1447:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    {
                    // InternalSmc.g:1447:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    // InternalSmc.g:1448:4: () ( (lv_value_3_0= RULE_REAL ) )
                    {
                    // InternalSmc.g:1448:4: ()
                    // InternalSmc.g:1449:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1455:4: ( (lv_value_3_0= RULE_REAL ) )
                    // InternalSmc.g:1456:5: (lv_value_3_0= RULE_REAL )
                    {
                    // InternalSmc.g:1456:5: (lv_value_3_0= RULE_REAL )
                    // InternalSmc.g:1457:6: lv_value_3_0= RULE_REAL
                    {
                    lv_value_3_0=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"soton.cyber.smcaas.smc.Smc.REAL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:1475:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalSmc.g:1475:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalSmc.g:1476:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalSmc.g:1476:4: ()
                    // InternalSmc.g:1477:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1483:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalSmc.g:1484:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalSmc.g:1484:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalSmc.g:1485:6: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueBOOLEANTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"soton.cyber.smcaas.smc.Smc.BOOLEAN");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:1503:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalSmc.g:1503:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalSmc.g:1504:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalSmc.g:1504:4: ()
                    // InternalSmc.g:1505:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1511:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalSmc.g:1512:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalSmc.g:1512:5: (lv_value_7_0= RULE_STRING )
                    // InternalSmc.g:1513:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"soton.cyber.smcaas.smc.Smc.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSmc.g:1531:3: ( () ( (lv_value_9_0= RULE_DATE ) ) )
                    {
                    // InternalSmc.g:1531:3: ( () ( (lv_value_9_0= RULE_DATE ) ) )
                    // InternalSmc.g:1532:4: () ( (lv_value_9_0= RULE_DATE ) )
                    {
                    // InternalSmc.g:1532:4: ()
                    // InternalSmc.g:1533:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDateLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1539:4: ( (lv_value_9_0= RULE_DATE ) )
                    // InternalSmc.g:1540:5: (lv_value_9_0= RULE_DATE )
                    {
                    // InternalSmc.g:1540:5: (lv_value_9_0= RULE_DATE )
                    // InternalSmc.g:1541:6: lv_value_9_0= RULE_DATE
                    {
                    lv_value_9_0=(Token)match(input,RULE_DATE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueDATETerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_9_0,
                      							"soton.cyber.smcaas.smc.Smc.DATE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSmc.g:1559:3: ( () ( (lv_value_11_0= RULE_TIME ) ) )
                    {
                    // InternalSmc.g:1559:3: ( () ( (lv_value_11_0= RULE_TIME ) ) )
                    // InternalSmc.g:1560:4: () ( (lv_value_11_0= RULE_TIME ) )
                    {
                    // InternalSmc.g:1560:4: ()
                    // InternalSmc.g:1561:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getTimeLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1567:4: ( (lv_value_11_0= RULE_TIME ) )
                    // InternalSmc.g:1568:5: (lv_value_11_0= RULE_TIME )
                    {
                    // InternalSmc.g:1568:5: (lv_value_11_0= RULE_TIME )
                    // InternalSmc.g:1569:6: lv_value_11_0= RULE_TIME
                    {
                    lv_value_11_0=(Token)match(input,RULE_TIME,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_11_0, grammarAccess.getAtomicAccess().getValueTIMETerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_11_0,
                      							"soton.cyber.smcaas.smc.Smc.TIME");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSmc.g:1587:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalSmc.g:1587:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalSmc.g:1588:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalSmc.g:1588:4: ()
                    // InternalSmc.g:1589:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1595:4: ( (otherlv_13= RULE_ID ) )
                    // InternalSmc.g:1596:5: (otherlv_13= RULE_ID )
                    {
                    // InternalSmc.g:1596:5: (otherlv_13= RULE_ID )
                    // InternalSmc.g:1597:6: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getAtomicAccess().getVariableVariableDeclCrossReference_6_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalSmc.g:1610:3: this_List_14= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getListParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_List_14=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_List_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalSmc.g:1619:3: this_Invocation_15= ruleInvocation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getInvocationParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Invocation_15=ruleInvocation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Invocation_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleList"
    // InternalSmc.g:1631:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSmc.g:1631:45: (iv_ruleList= ruleList EOF )
            // InternalSmc.g:1632:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalSmc.g:1638:1: ruleList returns [EObject current=null] : (otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_args_1_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1644:2: ( (otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')' ) )
            // InternalSmc.g:1645:2: (otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')' )
            {
            // InternalSmc.g:1645:2: (otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')' )
            // InternalSmc.g:1646:3: otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
              		
            }
            // InternalSmc.g:1650:3: ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* )
            // InternalSmc.g:1651:4: ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )*
            {
            // InternalSmc.g:1651:4: ( (lv_args_1_0= ruleAtomic ) )
            // InternalSmc.g:1652:5: (lv_args_1_0= ruleAtomic )
            {
            // InternalSmc.g:1652:5: (lv_args_1_0= ruleAtomic )
            // InternalSmc.g:1653:6: lv_args_1_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getListAccess().getArgsAtomicParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_10);
            lv_args_1_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getListRule());
              						}
              						add(
              							current,
              							"args",
              							lv_args_1_0,
              							"soton.cyber.smcaas.smc.Smc.Atomic");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalSmc.g:1670:4: (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSmc.g:1671:5: otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getListAccess().getCommaKeyword_1_1_0());
            	      				
            	    }
            	    // InternalSmc.g:1675:5: ( (lv_args_3_0= ruleAtomic ) )
            	    // InternalSmc.g:1676:6: (lv_args_3_0= ruleAtomic )
            	    {
            	    // InternalSmc.g:1676:6: (lv_args_3_0= ruleAtomic )
            	    // InternalSmc.g:1677:7: lv_args_3_0= ruleAtomic
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getListAccess().getArgsAtomicParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_args_3_0=ruleAtomic();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getListRule());
            	      							}
            	      							add(
            	      								current,
            	      								"args",
            	      								lv_args_3_0,
            	      								"soton.cyber.smcaas.smc.Smc.Atomic");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getListAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleInvocation"
    // InternalSmc.g:1704:1: entryRuleInvocation returns [EObject current=null] : iv_ruleInvocation= ruleInvocation EOF ;
    public final EObject entryRuleInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocation = null;


        try {
            // InternalSmc.g:1704:51: (iv_ruleInvocation= ruleInvocation EOF )
            // InternalSmc.g:1705:2: iv_ruleInvocation= ruleInvocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvocationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvocation=ruleInvocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvocation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvocation"


    // $ANTLR start "ruleInvocation"
    // InternalSmc.g:1711:1: ruleInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1717:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) )
            // InternalSmc.g:1718:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            {
            // InternalSmc.g:1718:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            // InternalSmc.g:1719:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')'
            {
            // InternalSmc.g:1719:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmc.g:1720:4: (otherlv_0= RULE_ID )
            {
            // InternalSmc.g:1720:4: (otherlv_0= RULE_ID )
            // InternalSmc.g:1721:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvocationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getInvocationAccess().getBlockNameBlockSMCCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvocationAccess().getFullStopKeyword_1());
              		
            }
            // InternalSmc.g:1736:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalSmc.g:1737:4: (lv_function_2_0= RULE_ID )
            {
            // InternalSmc.g:1737:4: (lv_function_2_0= RULE_ID )
            // InternalSmc.g:1738:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_function_2_0, grammarAccess.getInvocationAccess().getFunctionIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvocationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"function",
              						lv_function_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInvocationAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalSmc.g:1758:3: ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_TIME)||LA24_0==18||(LA24_0>=42 && LA24_0<=43)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmc.g:1759:4: ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    {
                    // InternalSmc.g:1759:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalSmc.g:1760:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalSmc.g:1760:5: (lv_args_4_0= ruleExpression )
                    // InternalSmc.g:1761:6: lv_args_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInvocationAccess().getArgsExpressionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_args_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInvocationRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_4_0,
                      							"soton.cyber.smcaas.smc.Smc.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSmc.g:1778:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==19) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSmc.g:1779:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getInvocationAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalSmc.g:1783:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalSmc.g:1784:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalSmc.g:1784:6: (lv_args_6_0= ruleExpression )
                    	    // InternalSmc.g:1785:7: lv_args_6_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInvocationAccess().getArgsExpressionParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_args_6_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInvocationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_6_0,
                    	      								"soton.cyber.smcaas.smc.Smc.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getInvocationAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInvocation"


    // $ANTLR start "ruleBlockType"
    // InternalSmc.g:1812:1: ruleBlockType returns [Enumerator current=null] : ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) ) ;
    public final Enumerator ruleBlockType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSmc.g:1818:2: ( ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) ) )
            // InternalSmc.g:1819:2: ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) )
            {
            // InternalSmc.g:1819:2: ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt25=1;
                }
                break;
            case 46:
                {
                alt25=2;
                }
                break;
            case 47:
                {
                alt25=3;
                }
                break;
            case 48:
                {
                alt25=4;
                }
                break;
            case 49:
                {
                alt25=5;
                }
                break;
            case 50:
                {
                alt25=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSmc.g:1820:3: (enumLiteral_0= 'insert_data' )
                    {
                    // InternalSmc.g:1820:3: (enumLiteral_0= 'insert_data' )
                    // InternalSmc.g:1821:4: enumLiteral_0= 'insert_data'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getINSERTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBlockTypeAccess().getINSERTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:1828:3: (enumLiteral_1= 'math_computation' )
                    {
                    // InternalSmc.g:1828:3: (enumLiteral_1= 'math_computation' )
                    // InternalSmc.g:1829:4: enumLiteral_1= 'math_computation'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getCOMPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBlockTypeAccess().getCOMPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:1836:3: (enumLiteral_2= 'search' )
                    {
                    // InternalSmc.g:1836:3: (enumLiteral_2= 'search' )
                    // InternalSmc.g:1837:4: enumLiteral_2= 'search'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getSEARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBlockTypeAccess().getSEARCHEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:1844:3: (enumLiteral_3= 'anonymization' )
                    {
                    // InternalSmc.g:1844:3: (enumLiteral_3= 'anonymization' )
                    // InternalSmc.g:1845:4: enumLiteral_3= 'anonymization'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getANONYMIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBlockTypeAccess().getANONYMIZATIONEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmc.g:1852:3: (enumLiteral_4= 'access_control' )
                    {
                    // InternalSmc.g:1852:3: (enumLiteral_4= 'access_control' )
                    // InternalSmc.g:1853:4: enumLiteral_4= 'access_control'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getACCESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBlockTypeAccess().getACCESSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmc.g:1860:3: (enumLiteral_5= 'permission_release' )
                    {
                    // InternalSmc.g:1860:3: (enumLiteral_5= 'permission_release' )
                    // InternalSmc.g:1861:4: enumLiteral_5= 'permission_release'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getPERMISSIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getBlockTypeAccess().getPERMISSIONEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlockType"


    // $ANTLR start "ruleBasicType"
    // InternalSmc.g:1871:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= '[]' ) | (enumLiteral_5= 'tuple' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSmc.g:1877:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= '[]' ) | (enumLiteral_5= 'tuple' ) ) )
            // InternalSmc.g:1878:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= '[]' ) | (enumLiteral_5= 'tuple' ) )
            {
            // InternalSmc.g:1878:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= '[]' ) | (enumLiteral_5= 'tuple' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt26=1;
                }
                break;
            case 52:
                {
                alt26=2;
                }
                break;
            case 53:
                {
                alt26=3;
                }
                break;
            case 54:
                {
                alt26=4;
                }
                break;
            case 55:
                {
                alt26=5;
                }
                break;
            case 56:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSmc.g:1879:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalSmc.g:1879:3: (enumLiteral_0= 'INT' )
                    // InternalSmc.g:1880:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:1887:3: (enumLiteral_1= 'DOUBLE' )
                    {
                    // InternalSmc.g:1887:3: (enumLiteral_1= 'DOUBLE' )
                    // InternalSmc.g:1888:4: enumLiteral_1= 'DOUBLE'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:1895:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalSmc.g:1895:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalSmc.g:1896:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:1903:3: (enumLiteral_3= 'STRING' )
                    {
                    // InternalSmc.g:1903:3: (enumLiteral_3= 'STRING' )
                    // InternalSmc.g:1904:4: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmc.g:1911:3: (enumLiteral_4= '[]' )
                    {
                    // InternalSmc.g:1911:3: (enumLiteral_4= '[]' )
                    // InternalSmc.g:1912:4: enumLiteral_4= '[]'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getLISTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getLISTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmc.g:1919:3: (enumLiteral_5= 'tuple' )
                    {
                    // InternalSmc.g:1919:3: (enumLiteral_5= 'tuple' )
                    // InternalSmc.g:1920:4: enumLiteral_5= 'tuple'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getTUPLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getTUPLEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicType"

    // $ANTLR start synpred1_InternalSmc
    public final void synpred1_InternalSmc_fragment() throws RecognitionException {   
        // InternalSmc.g:659:5: ( 'else' )
        // InternalSmc.g:659:6: 'else'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSmc

    // Delegated rules

    public final boolean synpred1_InternalSmc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSmc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\7\uffff\1\12\3\uffff";
    static final String dfa_3s = "\1\4\6\uffff\1\23\3\uffff";
    static final String dfa_4s = "\1\53\6\uffff\1\54\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\7";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\1\1\2\1\3\1\4\1\5\1\6\40\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\12\10\uffff\14\12\2\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1418:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0007E00000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000C00001407F0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000C00000407F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000C002F8407F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000C002E8407F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x01F8000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});

}
