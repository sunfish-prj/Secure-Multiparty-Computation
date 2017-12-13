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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_STRING", "RULE_DATE", "RULE_TIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'block'", "'='", "'new'", "'('", "','", "')'", "';'", "'main'", "'{'", "'}'", "'print'", "'while'", "'if'", "'else'", "'var'", "'[]'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'list('", "'.'", "'insert_data'", "'math_computation'", "'search'", "'anonymization'", "'access_control'", "'permission_release'", "'public'", "'private'", "'INT'", "'DOUBLE'", "'BOOLEAN'", "'STRING'"
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
    public static final int T__57=57;
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

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_TIME)||LA4_0==18||(LA4_0>=43 && LA4_0<=44)) ) {
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
    // InternalSmc.g:342:1: ruleCommand returns [EObject current=null] : (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_VariableDecl_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_IfThenElse_3 = null;

        EObject this_While_4 = null;

        EObject this_Print_5 = null;

        EObject this_InvocationVoid_6 = null;



        	enterRule();

        try {
            // InternalSmc.g:348:2: ( (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid ) )
            // InternalSmc.g:349:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid )
            {
            // InternalSmc.g:349:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid )
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
                else if ( (LA6_3==45) ) {
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
                    // InternalSmc.g:404:3: this_InvocationVoid_6= ruleInvocationVoid
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getInvocationVoidParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvocationVoid_6=ruleInvocationVoid();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvocationVoid_6;
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


    // $ANTLR start "entryRuleInvocationVoid"
    // InternalSmc.g:416:1: entryRuleInvocationVoid returns [EObject current=null] : iv_ruleInvocationVoid= ruleInvocationVoid EOF ;
    public final EObject entryRuleInvocationVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationVoid = null;


        try {
            // InternalSmc.g:416:55: (iv_ruleInvocationVoid= ruleInvocationVoid EOF )
            // InternalSmc.g:417:2: iv_ruleInvocationVoid= ruleInvocationVoid EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvocationVoidRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvocationVoid=ruleInvocationVoid();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvocationVoid; 
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
    // $ANTLR end "entryRuleInvocationVoid"


    // $ANTLR start "ruleInvocationVoid"
    // InternalSmc.g:423:1: ruleInvocationVoid returns [EObject current=null] : ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' ) ;
    public final EObject ruleInvocationVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_call_0_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:429:2: ( ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' ) )
            // InternalSmc.g:430:2: ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' )
            {
            // InternalSmc.g:430:2: ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' )
            // InternalSmc.g:431:3: ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';'
            {
            // InternalSmc.g:431:3: ( (lv_call_0_0= ruleInvocation ) )
            // InternalSmc.g:432:4: (lv_call_0_0= ruleInvocation )
            {
            // InternalSmc.g:432:4: (lv_call_0_0= ruleInvocation )
            // InternalSmc.g:433:5: lv_call_0_0= ruleInvocation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvocationVoidAccess().getCallInvocationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_call_0_0=ruleInvocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvocationVoidRule());
              					}
              					set(
              						current,
              						"call",
              						lv_call_0_0,
              						"soton.cyber.smcaas.smc.Smc.Invocation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvocationVoidAccess().getSemicolonKeyword_1());
              		
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
    // $ANTLR end "ruleInvocationVoid"


    // $ANTLR start "entryRuleBlock"
    // InternalSmc.g:458:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalSmc.g:458:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalSmc.g:459:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalSmc.g:465:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:471:2: ( ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) )
            // InternalSmc.g:472:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            {
            // InternalSmc.g:472:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            // InternalSmc.g:473:3: () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}'
            {
            // InternalSmc.g:473:3: ()
            // InternalSmc.g:474:4: 
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
            // InternalSmc.g:484:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==23||(LA7_0>=25 && LA7_0<=27)||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmc.g:485:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalSmc.g:485:4: (lv_commands_2_0= ruleCommand )
            	    // InternalSmc.g:486:5: lv_commands_2_0= ruleCommand
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
    // InternalSmc.g:511:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalSmc.g:511:46: (iv_rulePrint= rulePrint EOF )
            // InternalSmc.g:512:2: iv_rulePrint= rulePrint EOF
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
    // InternalSmc.g:518:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:524:2: ( (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalSmc.g:525:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalSmc.g:525:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalSmc.g:526:3: otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:534:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalSmc.g:535:4: (lv_value_2_0= ruleExpression )
            {
            // InternalSmc.g:535:4: (lv_value_2_0= ruleExpression )
            // InternalSmc.g:536:5: lv_value_2_0= ruleExpression
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
    // InternalSmc.g:565:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalSmc.g:565:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalSmc.g:566:2: iv_ruleWhile= ruleWhile EOF
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
    // InternalSmc.g:572:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:578:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) )
            // InternalSmc.g:579:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            {
            // InternalSmc.g:579:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            // InternalSmc.g:580:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:588:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmc.g:589:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmc.g:589:4: (lv_condition_2_0= ruleExpression )
            // InternalSmc.g:590:5: lv_condition_2_0= ruleExpression
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
            // InternalSmc.g:611:3: ( (lv_body_4_0= ruleCommand ) )
            // InternalSmc.g:612:4: (lv_body_4_0= ruleCommand )
            {
            // InternalSmc.g:612:4: (lv_body_4_0= ruleCommand )
            // InternalSmc.g:613:5: lv_body_4_0= ruleCommand
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
    // InternalSmc.g:634:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalSmc.g:634:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalSmc.g:635:2: iv_ruleIfThenElse= ruleIfThenElse EOF
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
    // InternalSmc.g:641:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) ;
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
            // InternalSmc.g:647:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) )
            // InternalSmc.g:648:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            {
            // InternalSmc.g:648:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            // InternalSmc.g:649:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:657:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmc.g:658:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmc.g:658:4: (lv_condition_2_0= ruleExpression )
            // InternalSmc.g:659:5: lv_condition_2_0= ruleExpression
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
            // InternalSmc.g:680:3: ( (lv_thenBrach_4_0= ruleCommand ) )
            // InternalSmc.g:681:4: (lv_thenBrach_4_0= ruleCommand )
            {
            // InternalSmc.g:681:4: (lv_thenBrach_4_0= ruleCommand )
            // InternalSmc.g:682:5: lv_thenBrach_4_0= ruleCommand
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

            // InternalSmc.g:699:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
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
                    // InternalSmc.g:700:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) )
                    {
                    // InternalSmc.g:700:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalSmc.g:701:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalSmc.g:707:4: ( (lv_elseBranch_6_0= ruleCommand ) )
                    // InternalSmc.g:708:5: (lv_elseBranch_6_0= ruleCommand )
                    {
                    // InternalSmc.g:708:5: (lv_elseBranch_6_0= ruleCommand )
                    // InternalSmc.g:709:6: lv_elseBranch_6_0= ruleCommand
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
    // InternalSmc.g:731:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalSmc.g:731:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalSmc.g:732:2: iv_ruleVariableDecl= ruleVariableDecl EOF
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
    // InternalSmc.g:738:1: ruleVariableDecl returns [EObject current=null] : (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_exp_6_0= ruleExpression ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:744:2: ( (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_exp_6_0= ruleExpression ) ) )? otherlv_7= ';' ) )
            // InternalSmc.g:745:2: (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_exp_6_0= ruleExpression ) ) )? otherlv_7= ';' )
            {
            // InternalSmc.g:745:2: (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_exp_6_0= ruleExpression ) ) )? otherlv_7= ';' )
            // InternalSmc.g:746:3: otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_exp_6_0= ruleExpression ) ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariableDeclAccess().getVarKeyword_0());
              		
            }
            // InternalSmc.g:750:3: ( (lv_visibility_1_0= ruleSecType ) )
            // InternalSmc.g:751:4: (lv_visibility_1_0= ruleSecType )
            {
            // InternalSmc.g:751:4: (lv_visibility_1_0= ruleSecType )
            // InternalSmc.g:752:5: lv_visibility_1_0= ruleSecType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclAccess().getVisibilitySecTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_visibility_1_0=ruleSecType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclRule());
              					}
              					set(
              						current,
              						"visibility",
              						lv_visibility_1_0,
              						"soton.cyber.smcaas.smc.Smc.SecType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmc.g:769:3: ( (lv_type_2_0= ruleBasicType ) )
            // InternalSmc.g:770:4: (lv_type_2_0= ruleBasicType )
            {
            // InternalSmc.g:770:4: (lv_type_2_0= ruleBasicType )
            // InternalSmc.g:771:5: lv_type_2_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclAccess().getTypeBasicTypeEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_type_2_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"soton.cyber.smcaas.smc.Smc.BasicType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmc.g:788:3: ( (lv_array_3_0= '[]' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmc.g:789:4: (lv_array_3_0= '[]' )
                    {
                    // InternalSmc.g:789:4: (lv_array_3_0= '[]' )
                    // InternalSmc.g:790:5: lv_array_3_0= '[]'
                    {
                    lv_array_3_0=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_array_3_0, grammarAccess.getVariableDeclAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVariableDeclRule());
                      					}
                      					setWithLastConsumed(current, "array", true, "[]");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSmc.g:802:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSmc.g:803:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSmc.g:803:4: (lv_name_4_0= RULE_ID )
            // InternalSmc.g:804:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSmc.g:820:3: (otherlv_5= '=' ( (lv_exp_6_0= ruleExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmc.g:821:4: otherlv_5= '=' ( (lv_exp_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getVariableDeclAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalSmc.g:825:4: ( (lv_exp_6_0= ruleExpression ) )
                    // InternalSmc.g:826:5: (lv_exp_6_0= ruleExpression )
                    {
                    // InternalSmc.g:826:5: (lv_exp_6_0= ruleExpression )
                    // InternalSmc.g:827:6: lv_exp_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableDeclAccess().getExpExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_exp_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableDeclRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_6_0,
                      							"soton.cyber.smcaas.smc.Smc.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getVariableDeclAccess().getSemicolonKeyword_6());
              		
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
    // InternalSmc.g:853:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalSmc.g:853:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalSmc.g:854:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
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
    // InternalSmc.g:860:1: ruleVariableAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:866:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalSmc.g:867:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalSmc.g:867:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalSmc.g:868:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalSmc.g:868:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmc.g:869:4: (otherlv_0= RULE_ID )
            {
            // InternalSmc.g:869:4: (otherlv_0= RULE_ID )
            // InternalSmc.g:870:5: otherlv_0= RULE_ID
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
            // InternalSmc.g:885:3: ( (lv_exp_2_0= ruleExpression ) )
            // InternalSmc.g:886:4: (lv_exp_2_0= ruleExpression )
            {
            // InternalSmc.g:886:4: (lv_exp_2_0= ruleExpression )
            // InternalSmc.g:887:5: lv_exp_2_0= ruleExpression
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
    // InternalSmc.g:912:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmc.g:912:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmc.g:913:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSmc.g:919:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:925:2: (this_Or_0= ruleOr )
            // InternalSmc.g:926:2: this_Or_0= ruleOr
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
    // InternalSmc.g:937:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSmc.g:937:43: (iv_ruleOr= ruleOr EOF )
            // InternalSmc.g:938:2: iv_ruleOr= ruleOr EOF
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
    // InternalSmc.g:944:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:950:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSmc.g:951:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSmc.g:951:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSmc.g:952:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:960:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmc.g:961:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSmc.g:961:4: ()
            	    // InternalSmc.g:962:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalSmc.g:972:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSmc.g:973:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSmc.g:973:5: (lv_right_3_0= ruleAnd )
            	    // InternalSmc.g:974:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSmc.g:996:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSmc.g:996:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSmc.g:997:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSmc.g:1003:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1009:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalSmc.g:1010:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalSmc.g:1010:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalSmc.g:1011:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1019:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmc.g:1020:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalSmc.g:1020:4: ()
            	    // InternalSmc.g:1021:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalSmc.g:1031:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalSmc.g:1032:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalSmc.g:1032:5: (lv_right_3_0= ruleEquality )
            	    // InternalSmc.g:1033:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop12;
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
    // InternalSmc.g:1055:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalSmc.g:1055:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalSmc.g:1056:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalSmc.g:1062:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1068:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalSmc.g:1069:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalSmc.g:1069:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalSmc.g:1070:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1078:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=33 && LA14_0<=34)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSmc.g:1079:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalSmc.g:1079:4: ()
            	    // InternalSmc.g:1080:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1086:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalSmc.g:1087:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalSmc.g:1087:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalSmc.g:1088:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalSmc.g:1088:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==33) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==34) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalSmc.g:1089:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalSmc.g:1100:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_11); if (state.failed) return current;
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

            	    // InternalSmc.g:1113:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalSmc.g:1114:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalSmc.g:1114:5: (lv_right_3_0= ruleComparison )
            	    // InternalSmc.g:1115:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop14;
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
    // InternalSmc.g:1137:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmc.g:1137:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmc.g:1138:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalSmc.g:1144:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalSmc.g:1150:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalSmc.g:1151:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalSmc.g:1151:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalSmc.g:1152:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1160:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=35 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSmc.g:1161:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalSmc.g:1161:4: ()
            	    // InternalSmc.g:1162:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1168:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalSmc.g:1169:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalSmc.g:1169:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalSmc.g:1170:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalSmc.g:1170:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalSmc.g:1171:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalSmc.g:1182:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalSmc.g:1193:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,37,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalSmc.g:1204:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,38,FOLLOW_11); if (state.failed) return current;
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

            	    // InternalSmc.g:1217:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalSmc.g:1218:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalSmc.g:1218:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalSmc.g:1219:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop16;
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
    // InternalSmc.g:1241:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalSmc.g:1241:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalSmc.g:1242:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalSmc.g:1248:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1254:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) )
            // InternalSmc.g:1255:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            {
            // InternalSmc.g:1255:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            // InternalSmc.g:1256:3: this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1264:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=39 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSmc.g:1265:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) )
            	    {
            	    // InternalSmc.g:1265:4: ()
            	    // InternalSmc.g:1266:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPlusOrMinusAccess().getPlusOrMinusLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1272:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalSmc.g:1273:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalSmc.g:1273:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalSmc.g:1274:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalSmc.g:1274:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==39) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==40) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalSmc.g:1275:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalSmc.g:1286:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSmc.g:1299:4: ( (lv_right_3_0= ruleMulOrDiv ) )
            	    // InternalSmc.g:1300:5: (lv_right_3_0= ruleMulOrDiv )
            	    {
            	    // InternalSmc.g:1300:5: (lv_right_3_0= ruleMulOrDiv )
            	    // InternalSmc.g:1301:6: lv_right_3_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"soton.cyber.smcaas.smc.Smc.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSmc.g:1323:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalSmc.g:1323:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalSmc.g:1324:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalSmc.g:1330:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1336:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalSmc.g:1337:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalSmc.g:1337:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalSmc.g:1338:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1346:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=41 && LA20_0<=42)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSmc.g:1347:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalSmc.g:1347:4: ()
            	    // InternalSmc.g:1348:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1354:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalSmc.g:1355:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalSmc.g:1355:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalSmc.g:1356:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalSmc.g:1356:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==41) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==42) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalSmc.g:1357:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalSmc.g:1368:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_11); if (state.failed) return current;
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

            	    // InternalSmc.g:1381:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalSmc.g:1382:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalSmc.g:1382:5: (lv_right_3_0= rulePrimary )
            	    // InternalSmc.g:1383:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop20;
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
    // InternalSmc.g:1405:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmc.g:1405:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmc.g:1406:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSmc.g:1412:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // InternalSmc.g:1418:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalSmc.g:1419:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalSmc.g:1419:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt21=1;
                }
                break;
            case 43:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_STRING:
            case RULE_DATE:
            case RULE_TIME:
            case 44:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSmc.g:1420:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalSmc.g:1420:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalSmc.g:1421:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
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
                    // InternalSmc.g:1439:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalSmc.g:1439:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalSmc.g:1440:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalSmc.g:1440:4: ()
                    // InternalSmc.g:1441:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalSmc.g:1451:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalSmc.g:1452:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalSmc.g:1452:5: (lv_expression_5_0= rulePrimary )
                    // InternalSmc.g:1453:6: lv_expression_5_0= rulePrimary
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
                    // InternalSmc.g:1472:3: this_Atomic_6= ruleAtomic
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
    // InternalSmc.g:1484:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalSmc.g:1484:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalSmc.g:1485:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalSmc.g:1491:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation ) ;
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
            // InternalSmc.g:1497:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation ) )
            // InternalSmc.g:1498:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation )
            {
            // InternalSmc.g:1498:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation )
            int alt22=9;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalSmc.g:1499:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalSmc.g:1499:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalSmc.g:1500:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalSmc.g:1500:4: ()
                    // InternalSmc.g:1501:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1507:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalSmc.g:1508:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalSmc.g:1508:5: (lv_value_1_0= RULE_INT )
                    // InternalSmc.g:1509:6: lv_value_1_0= RULE_INT
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
                    // InternalSmc.g:1527:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    {
                    // InternalSmc.g:1527:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    // InternalSmc.g:1528:4: () ( (lv_value_3_0= RULE_REAL ) )
                    {
                    // InternalSmc.g:1528:4: ()
                    // InternalSmc.g:1529:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1535:4: ( (lv_value_3_0= RULE_REAL ) )
                    // InternalSmc.g:1536:5: (lv_value_3_0= RULE_REAL )
                    {
                    // InternalSmc.g:1536:5: (lv_value_3_0= RULE_REAL )
                    // InternalSmc.g:1537:6: lv_value_3_0= RULE_REAL
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
                    // InternalSmc.g:1555:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalSmc.g:1555:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalSmc.g:1556:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalSmc.g:1556:4: ()
                    // InternalSmc.g:1557:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1563:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalSmc.g:1564:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalSmc.g:1564:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalSmc.g:1565:6: lv_value_5_0= RULE_BOOLEAN
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
                    // InternalSmc.g:1583:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalSmc.g:1583:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalSmc.g:1584:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalSmc.g:1584:4: ()
                    // InternalSmc.g:1585:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1591:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalSmc.g:1592:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalSmc.g:1592:5: (lv_value_7_0= RULE_STRING )
                    // InternalSmc.g:1593:6: lv_value_7_0= RULE_STRING
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
                    // InternalSmc.g:1611:3: ( () ( (lv_value_9_0= RULE_DATE ) ) )
                    {
                    // InternalSmc.g:1611:3: ( () ( (lv_value_9_0= RULE_DATE ) ) )
                    // InternalSmc.g:1612:4: () ( (lv_value_9_0= RULE_DATE ) )
                    {
                    // InternalSmc.g:1612:4: ()
                    // InternalSmc.g:1613:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDateLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1619:4: ( (lv_value_9_0= RULE_DATE ) )
                    // InternalSmc.g:1620:5: (lv_value_9_0= RULE_DATE )
                    {
                    // InternalSmc.g:1620:5: (lv_value_9_0= RULE_DATE )
                    // InternalSmc.g:1621:6: lv_value_9_0= RULE_DATE
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
                    // InternalSmc.g:1639:3: ( () ( (lv_value_11_0= RULE_TIME ) ) )
                    {
                    // InternalSmc.g:1639:3: ( () ( (lv_value_11_0= RULE_TIME ) ) )
                    // InternalSmc.g:1640:4: () ( (lv_value_11_0= RULE_TIME ) )
                    {
                    // InternalSmc.g:1640:4: ()
                    // InternalSmc.g:1641:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getTimeLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1647:4: ( (lv_value_11_0= RULE_TIME ) )
                    // InternalSmc.g:1648:5: (lv_value_11_0= RULE_TIME )
                    {
                    // InternalSmc.g:1648:5: (lv_value_11_0= RULE_TIME )
                    // InternalSmc.g:1649:6: lv_value_11_0= RULE_TIME
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
                    // InternalSmc.g:1667:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalSmc.g:1667:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalSmc.g:1668:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalSmc.g:1668:4: ()
                    // InternalSmc.g:1669:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1675:4: ( (otherlv_13= RULE_ID ) )
                    // InternalSmc.g:1676:5: (otherlv_13= RULE_ID )
                    {
                    // InternalSmc.g:1676:5: (otherlv_13= RULE_ID )
                    // InternalSmc.g:1677:6: otherlv_13= RULE_ID
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
                    // InternalSmc.g:1690:3: this_List_14= ruleList
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
                    // InternalSmc.g:1699:3: this_Invocation_15= ruleInvocation
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
    // InternalSmc.g:1711:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSmc.g:1711:45: (iv_ruleList= ruleList EOF )
            // InternalSmc.g:1712:2: iv_ruleList= ruleList EOF
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
    // InternalSmc.g:1718:1: ruleList returns [EObject current=null] : (otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_args_1_0 = null;

        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1724:2: ( (otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')' ) )
            // InternalSmc.g:1725:2: (otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')' )
            {
            // InternalSmc.g:1725:2: (otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')' )
            // InternalSmc.g:1726:3: otherlv_0= 'list(' ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
              		
            }
            // InternalSmc.g:1730:3: ( ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )* )
            // InternalSmc.g:1731:4: ( (lv_args_1_0= ruleAtomic ) ) (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )*
            {
            // InternalSmc.g:1731:4: ( (lv_args_1_0= ruleAtomic ) )
            // InternalSmc.g:1732:5: (lv_args_1_0= ruleAtomic )
            {
            // InternalSmc.g:1732:5: (lv_args_1_0= ruleAtomic )
            // InternalSmc.g:1733:6: lv_args_1_0= ruleAtomic
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

            // InternalSmc.g:1750:4: (otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSmc.g:1751:5: otherlv_2= ',' ( (lv_args_3_0= ruleAtomic ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getListAccess().getCommaKeyword_1_1_0());
            	      				
            	    }
            	    // InternalSmc.g:1755:5: ( (lv_args_3_0= ruleAtomic ) )
            	    // InternalSmc.g:1756:6: (lv_args_3_0= ruleAtomic )
            	    {
            	    // InternalSmc.g:1756:6: (lv_args_3_0= ruleAtomic )
            	    // InternalSmc.g:1757:7: lv_args_3_0= ruleAtomic
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
            	    break loop23;
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
    // InternalSmc.g:1784:1: entryRuleInvocation returns [EObject current=null] : iv_ruleInvocation= ruleInvocation EOF ;
    public final EObject entryRuleInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocation = null;


        try {
            // InternalSmc.g:1784:51: (iv_ruleInvocation= ruleInvocation EOF )
            // InternalSmc.g:1785:2: iv_ruleInvocation= ruleInvocation EOF
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
    // InternalSmc.g:1791:1: ruleInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) ;
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
            // InternalSmc.g:1797:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) )
            // InternalSmc.g:1798:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            {
            // InternalSmc.g:1798:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            // InternalSmc.g:1799:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )? otherlv_7= ')'
            {
            // InternalSmc.g:1799:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmc.g:1800:4: (otherlv_0= RULE_ID )
            {
            // InternalSmc.g:1800:4: (otherlv_0= RULE_ID )
            // InternalSmc.g:1801:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvocationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getInvocationAccess().getBlockNameBlockSMCCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvocationAccess().getFullStopKeyword_1());
              		
            }
            // InternalSmc.g:1816:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalSmc.g:1817:4: (lv_function_2_0= RULE_ID )
            {
            // InternalSmc.g:1817:4: (lv_function_2_0= RULE_ID )
            // InternalSmc.g:1818:5: lv_function_2_0= RULE_ID
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
            // InternalSmc.g:1838:3: ( ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_TIME)||LA25_0==18||(LA25_0>=43 && LA25_0<=44)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSmc.g:1839:4: ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    {
                    // InternalSmc.g:1839:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalSmc.g:1840:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalSmc.g:1840:5: (lv_args_4_0= ruleExpression )
                    // InternalSmc.g:1841:6: lv_args_4_0= ruleExpression
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

                    // InternalSmc.g:1858:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==19) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSmc.g:1859:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getInvocationAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalSmc.g:1863:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalSmc.g:1864:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalSmc.g:1864:6: (lv_args_6_0= ruleExpression )
                    	    // InternalSmc.g:1865:7: lv_args_6_0= ruleExpression
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
                    	    break loop24;
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
    // InternalSmc.g:1892:1: ruleBlockType returns [Enumerator current=null] : ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) ) ;
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
            // InternalSmc.g:1898:2: ( ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) ) )
            // InternalSmc.g:1899:2: ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) )
            {
            // InternalSmc.g:1899:2: ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt26=1;
                }
                break;
            case 47:
                {
                alt26=2;
                }
                break;
            case 48:
                {
                alt26=3;
                }
                break;
            case 49:
                {
                alt26=4;
                }
                break;
            case 50:
                {
                alt26=5;
                }
                break;
            case 51:
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
                    // InternalSmc.g:1900:3: (enumLiteral_0= 'insert_data' )
                    {
                    // InternalSmc.g:1900:3: (enumLiteral_0= 'insert_data' )
                    // InternalSmc.g:1901:4: enumLiteral_0= 'insert_data'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getINSERTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBlockTypeAccess().getINSERTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:1908:3: (enumLiteral_1= 'math_computation' )
                    {
                    // InternalSmc.g:1908:3: (enumLiteral_1= 'math_computation' )
                    // InternalSmc.g:1909:4: enumLiteral_1= 'math_computation'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getCOMPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBlockTypeAccess().getCOMPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:1916:3: (enumLiteral_2= 'search' )
                    {
                    // InternalSmc.g:1916:3: (enumLiteral_2= 'search' )
                    // InternalSmc.g:1917:4: enumLiteral_2= 'search'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getSEARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBlockTypeAccess().getSEARCHEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:1924:3: (enumLiteral_3= 'anonymization' )
                    {
                    // InternalSmc.g:1924:3: (enumLiteral_3= 'anonymization' )
                    // InternalSmc.g:1925:4: enumLiteral_3= 'anonymization'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getANONYMIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBlockTypeAccess().getANONYMIZATIONEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmc.g:1932:3: (enumLiteral_4= 'access_control' )
                    {
                    // InternalSmc.g:1932:3: (enumLiteral_4= 'access_control' )
                    // InternalSmc.g:1933:4: enumLiteral_4= 'access_control'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getACCESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBlockTypeAccess().getACCESSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmc.g:1940:3: (enumLiteral_5= 'permission_release' )
                    {
                    // InternalSmc.g:1940:3: (enumLiteral_5= 'permission_release' )
                    // InternalSmc.g:1941:4: enumLiteral_5= 'permission_release'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleSecType"
    // InternalSmc.g:1951:1: ruleSecType returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleSecType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmc.g:1957:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalSmc.g:1958:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalSmc.g:1958:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            else if ( (LA27_0==53) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSmc.g:1959:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSmc.g:1959:3: (enumLiteral_0= 'public' )
                    // InternalSmc.g:1960:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSecTypeAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSecTypeAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:1967:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSmc.g:1967:3: (enumLiteral_1= 'private' )
                    // InternalSmc.g:1968:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSecTypeAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getSecTypeAccess().getPRIVATEEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleSecType"


    // $ANTLR start "ruleBasicType"
    // InternalSmc.g:1978:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSmc.g:1984:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) ) )
            // InternalSmc.g:1985:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) )
            {
            // InternalSmc.g:1985:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt28=1;
                }
                break;
            case 55:
                {
                alt28=2;
                }
                break;
            case 56:
                {
                alt28=3;
                }
                break;
            case 57:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSmc.g:1986:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalSmc.g:1986:3: (enumLiteral_0= 'INT' )
                    // InternalSmc.g:1987:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:1994:3: (enumLiteral_1= 'DOUBLE' )
                    {
                    // InternalSmc.g:1994:3: (enumLiteral_1= 'DOUBLE' )
                    // InternalSmc.g:1995:4: enumLiteral_1= 'DOUBLE'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:2002:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalSmc.g:2002:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalSmc.g:2003:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:2010:3: (enumLiteral_3= 'STRING' )
                    {
                    // InternalSmc.g:2010:3: (enumLiteral_3= 'STRING' )
                    // InternalSmc.g:2011:4: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                      			
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
        // InternalSmc.g:701:5: ( 'else' )
        // InternalSmc.g:701:6: 'else'
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


    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\7\uffff\1\11\3\uffff";
    static final String dfa_3s = "\1\4\6\uffff\1\23\3\uffff";
    static final String dfa_4s = "\1\54\6\uffff\1\55\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\7\1\11";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\1\1\2\1\3\1\4\1\5\1\6\41\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\11\11\uffff\14\11\2\uffff\1\12",
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

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1498:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_List_14= ruleList | this_Invocation_15= ruleInvocation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000FC00000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00001800001407F0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00001800000407F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000018002F8407F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000018002E8407F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});

}
