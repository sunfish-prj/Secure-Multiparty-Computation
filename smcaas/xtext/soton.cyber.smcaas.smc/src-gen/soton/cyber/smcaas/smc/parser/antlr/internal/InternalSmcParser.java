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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_DATE", "RULE_TIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'block'", "'='", "'new'", "'('", "')'", "';'", "'main'", "'{'", "'}'", "'parameter'", "'<'", "'>'", "'print'", "'while'", "'if'", "'else'", "'var'", "'[]'", "'retrieveFromClient'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'tuple'", "','", "'list'", "'dict'", "'.'", "'insert_data'", "'math_computation'", "'search'", "'anonymization'", "'access_control'", "'permission_release'", "'public'", "'private'", "'INT'", "'DOUBLE'", "'BOOLEAN'", "'STRING'", "'ENCRYPTED'", "'createDataset'", "'addValues'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_TIME=10;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=7;
    public static final int RULE_DATE=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
                else if ( LA2_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSmcAccess().getUnorderedGroup(), 1) ) {
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
    // InternalSmc.g:159:1: ruleBlockSMC returns [EObject current=null] : (otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleBlockSMC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:165:2: ( (otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' otherlv_6= ')' otherlv_7= ';' ) )
            // InternalSmc.g:166:2: (otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalSmc.g:166:2: (otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' otherlv_6= ')' otherlv_7= ';' )
            // InternalSmc.g:167:3: otherlv_0= 'block' ( (lv_type_1_0= ruleBlockType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' otherlv_4= 'new' otherlv_5= '(' otherlv_6= ')' otherlv_7= ';'
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
            otherlv_6=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBlockSMCAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getBlockSMCAccess().getSemicolonKeyword_7());
              		
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
    // InternalSmc.g:232:1: entryRuleMainSMC returns [EObject current=null] : iv_ruleMainSMC= ruleMainSMC EOF ;
    public final EObject entryRuleMainSMC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainSMC = null;


        try {
            // InternalSmc.g:232:48: (iv_ruleMainSMC= ruleMainSMC EOF )
            // InternalSmc.g:233:2: iv_ruleMainSMC= ruleMainSMC EOF
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
    // InternalSmc.g:239:1: ruleMainSMC returns [EObject current=null] : (otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) ;
    public final EObject ruleMainSMC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:245:2: ( (otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' ) )
            // InternalSmc.g:246:2: (otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            {
            // InternalSmc.g:246:2: (otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}' )
            // InternalSmc.g:247:3: otherlv_0= 'main' () otherlv_2= '{' ( (lv_commands_3_0= ruleCommand ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMainSMCAccess().getMainKeyword_0());
              		
            }
            // InternalSmc.g:251:3: ()
            // InternalSmc.g:252:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMainSMCAccess().getMainSMCAction_1(),
              					current);
              			
            }

            }

            otherlv_2=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMainSMCAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSmc.g:262:3: ( (lv_commands_3_0= ruleCommand ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==22||LA3_0==24||(LA3_0>=27 && LA3_0<=29)||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmc.g:263:4: (lv_commands_3_0= ruleCommand )
            	    {
            	    // InternalSmc.g:263:4: (lv_commands_3_0= ruleCommand )
            	    // InternalSmc.g:264:5: lv_commands_3_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMainSMCAccess().getCommandsCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
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
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:289:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalSmc.g:289:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalSmc.g:290:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalSmc.g:296:1: ruleCommand returns [EObject current=null] : (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_VariableDecl_1 = null;

        EObject this_VariableAssignment_2 = null;

        EObject this_IfThenElse_3 = null;

        EObject this_While_4 = null;

        EObject this_Print_5 = null;

        EObject this_InvocationVoid_6 = null;

        EObject this_ParamDecl_7 = null;



        	enterRule();

        try {
            // InternalSmc.g:302:2: ( (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl ) )
            // InternalSmc.g:303:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl )
            {
            // InternalSmc.g:303:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSmc.g:304:3: this_Block_0= ruleBlock
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
                    // InternalSmc.g:313:3: this_VariableDecl_1= ruleVariableDecl
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
                    // InternalSmc.g:322:3: this_VariableAssignment_2= ruleVariableAssignment
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
                    // InternalSmc.g:331:3: this_IfThenElse_3= ruleIfThenElse
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
                    // InternalSmc.g:340:3: this_While_4= ruleWhile
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
                    // InternalSmc.g:349:3: this_Print_5= rulePrint
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
                    // InternalSmc.g:358:3: this_InvocationVoid_6= ruleInvocationVoid
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
                case 8 :
                    // InternalSmc.g:367:3: this_ParamDecl_7= ruleParamDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getParamDeclParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParamDecl_7=ruleParamDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParamDecl_7;
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


    // $ANTLR start "entryRuleParamDecl"
    // InternalSmc.g:379:1: entryRuleParamDecl returns [EObject current=null] : iv_ruleParamDecl= ruleParamDecl EOF ;
    public final EObject entryRuleParamDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDecl = null;


        try {
            // InternalSmc.g:379:50: (iv_ruleParamDecl= ruleParamDecl EOF )
            // InternalSmc.g:380:2: iv_ruleParamDecl= ruleParamDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamDecl=ruleParamDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamDecl; 
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
    // $ANTLR end "entryRuleParamDecl"


    // $ANTLR start "ruleParamDecl"
    // InternalSmc.g:386:1: ruleParamDecl returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ;
    public final EObject ruleParamDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_parName_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_stype_4_0 = null;

        Enumerator lv_btype_5_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:392:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
            // InternalSmc.g:393:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';' )
            {
            // InternalSmc.g:393:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';' )
            // InternalSmc.g:394:3: otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParamDeclAccess().getParameterKeyword_0());
              		
            }
            // InternalSmc.g:398:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmc.g:399:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmc.g:399:4: (lv_name_1_0= RULE_ID )
            // InternalSmc.g:400:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParamDeclAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParamDeclAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getParamDeclAccess().getLessThanSignKeyword_3());
              		
            }
            // InternalSmc.g:424:3: ( (lv_stype_4_0= ruleSecType ) )
            // InternalSmc.g:425:4: (lv_stype_4_0= ruleSecType )
            {
            // InternalSmc.g:425:4: (lv_stype_4_0= ruleSecType )
            // InternalSmc.g:426:5: lv_stype_4_0= ruleSecType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamDeclAccess().getStypeSecTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_stype_4_0=ruleSecType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamDeclRule());
              					}
              					set(
              						current,
              						"stype",
              						lv_stype_4_0,
              						"soton.cyber.smcaas.smc.Smc.SecType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmc.g:443:3: ( (lv_btype_5_0= ruleBasicType ) )
            // InternalSmc.g:444:4: (lv_btype_5_0= ruleBasicType )
            {
            // InternalSmc.g:444:4: (lv_btype_5_0= ruleBasicType )
            // InternalSmc.g:445:5: lv_btype_5_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamDeclAccess().getBtypeBasicTypeEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_btype_5_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParamDeclRule());
              					}
              					set(
              						current,
              						"btype",
              						lv_btype_5_0,
              						"soton.cyber.smcaas.smc.Smc.BasicType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getParamDeclAccess().getGreaterThanSignKeyword_6());
              		
            }
            // InternalSmc.g:466:3: ( (lv_parName_7_0= RULE_STRING ) )
            // InternalSmc.g:467:4: (lv_parName_7_0= RULE_STRING )
            {
            // InternalSmc.g:467:4: (lv_parName_7_0= RULE_STRING )
            // InternalSmc.g:468:5: lv_parName_7_0= RULE_STRING
            {
            lv_parName_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_parName_7_0, grammarAccess.getParamDeclAccess().getParNameSTRINGTerminalRuleCall_7_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"parName",
              						lv_parName_7_0,
              						"soton.cyber.smcaas.smc.Smc.STRING");
              				
            }

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getParamDeclAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleParamDecl"


    // $ANTLR start "entryRuleInvocationVoid"
    // InternalSmc.g:492:1: entryRuleInvocationVoid returns [EObject current=null] : iv_ruleInvocationVoid= ruleInvocationVoid EOF ;
    public final EObject entryRuleInvocationVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationVoid = null;


        try {
            // InternalSmc.g:492:55: (iv_ruleInvocationVoid= ruleInvocationVoid EOF )
            // InternalSmc.g:493:2: iv_ruleInvocationVoid= ruleInvocationVoid EOF
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
    // InternalSmc.g:499:1: ruleInvocationVoid returns [EObject current=null] : ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' ) ;
    public final EObject ruleInvocationVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_call_0_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:505:2: ( ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' ) )
            // InternalSmc.g:506:2: ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' )
            {
            // InternalSmc.g:506:2: ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' )
            // InternalSmc.g:507:3: ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';'
            {
            // InternalSmc.g:507:3: ( (lv_call_0_0= ruleInvocation ) )
            // InternalSmc.g:508:4: (lv_call_0_0= ruleInvocation )
            {
            // InternalSmc.g:508:4: (lv_call_0_0= ruleInvocation )
            // InternalSmc.g:509:5: lv_call_0_0= ruleInvocation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvocationVoidAccess().getCallInvocationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:534:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalSmc.g:534:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalSmc.g:535:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalSmc.g:541:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:547:2: ( ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) )
            // InternalSmc.g:548:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            {
            // InternalSmc.g:548:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            // InternalSmc.g:549:3: () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}'
            {
            // InternalSmc.g:549:3: ()
            // InternalSmc.g:550:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSmc.g:560:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==22||LA5_0==24||(LA5_0>=27 && LA5_0<=29)||LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmc.g:561:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalSmc.g:561:4: (lv_commands_2_0= ruleCommand )
            	    // InternalSmc.g:562:5: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getCommandsCommandParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
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
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:587:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalSmc.g:587:46: (iv_rulePrint= rulePrint EOF )
            // InternalSmc.g:588:2: iv_rulePrint= rulePrint EOF
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
    // InternalSmc.g:594:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:600:2: ( (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalSmc.g:601:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalSmc.g:601:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalSmc.g:602:3: otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:610:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalSmc.g:611:4: (lv_value_2_0= ruleExpression )
            {
            // InternalSmc.g:611:4: (lv_value_2_0= ruleExpression )
            // InternalSmc.g:612:5: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPrintAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:641:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalSmc.g:641:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalSmc.g:642:2: iv_ruleWhile= ruleWhile EOF
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
    // InternalSmc.g:648:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:654:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) )
            // InternalSmc.g:655:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            {
            // InternalSmc.g:655:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            // InternalSmc.g:656:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:664:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmc.g:665:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmc.g:665:4: (lv_condition_2_0= ruleExpression )
            // InternalSmc.g:666:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSmc.g:687:3: ( (lv_body_4_0= ruleCommand ) )
            // InternalSmc.g:688:4: (lv_body_4_0= ruleCommand )
            {
            // InternalSmc.g:688:4: (lv_body_4_0= ruleCommand )
            // InternalSmc.g:689:5: lv_body_4_0= ruleCommand
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
    // InternalSmc.g:710:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalSmc.g:710:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalSmc.g:711:2: iv_ruleIfThenElse= ruleIfThenElse EOF
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
    // InternalSmc.g:717:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) ;
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
            // InternalSmc.g:723:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) )
            // InternalSmc.g:724:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            {
            // InternalSmc.g:724:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            // InternalSmc.g:725:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:733:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmc.g:734:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmc.g:734:4: (lv_condition_2_0= ruleExpression )
            // InternalSmc.g:735:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSmc.g:756:3: ( (lv_thenBrach_4_0= ruleCommand ) )
            // InternalSmc.g:757:4: (lv_thenBrach_4_0= ruleCommand )
            {
            // InternalSmc.g:757:4: (lv_thenBrach_4_0= ruleCommand )
            // InternalSmc.g:758:5: lv_thenBrach_4_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfThenElseAccess().getThenBrachCommandParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_20);
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

            // InternalSmc.g:775:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred1_InternalSmc()) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalSmc.g:776:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) )
                    {
                    // InternalSmc.g:776:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalSmc.g:777:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalSmc.g:783:4: ( (lv_elseBranch_6_0= ruleCommand ) )
                    // InternalSmc.g:784:5: (lv_elseBranch_6_0= ruleCommand )
                    {
                    // InternalSmc.g:784:5: (lv_elseBranch_6_0= ruleCommand )
                    // InternalSmc.g:785:6: lv_elseBranch_6_0= ruleCommand
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
    // InternalSmc.g:807:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalSmc.g:807:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalSmc.g:808:2: iv_ruleVariableDecl= ruleVariableDecl EOF
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
    // InternalSmc.g:814:1: ruleVariableDecl returns [EObject current=null] : (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_option_6_0= ruleAbstractAssignment ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_option_6_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:820:2: ( (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_option_6_0= ruleAbstractAssignment ) ) )? otherlv_7= ';' ) )
            // InternalSmc.g:821:2: (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_option_6_0= ruleAbstractAssignment ) ) )? otherlv_7= ';' )
            {
            // InternalSmc.g:821:2: (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_option_6_0= ruleAbstractAssignment ) ) )? otherlv_7= ';' )
            // InternalSmc.g:822:3: otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( (lv_array_3_0= '[]' ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '=' ( (lv_option_6_0= ruleAbstractAssignment ) ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariableDeclAccess().getVarKeyword_0());
              		
            }
            // InternalSmc.g:826:3: ( (lv_visibility_1_0= ruleSecType ) )
            // InternalSmc.g:827:4: (lv_visibility_1_0= ruleSecType )
            {
            // InternalSmc.g:827:4: (lv_visibility_1_0= ruleSecType )
            // InternalSmc.g:828:5: lv_visibility_1_0= ruleSecType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclAccess().getVisibilitySecTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalSmc.g:845:3: ( (lv_type_2_0= ruleBasicType ) )
            // InternalSmc.g:846:4: (lv_type_2_0= ruleBasicType )
            {
            // InternalSmc.g:846:4: (lv_type_2_0= ruleBasicType )
            // InternalSmc.g:847:5: lv_type_2_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclAccess().getTypeBasicTypeEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            // InternalSmc.g:864:3: ( (lv_array_3_0= '[]' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmc.g:865:4: (lv_array_3_0= '[]' )
                    {
                    // InternalSmc.g:865:4: (lv_array_3_0= '[]' )
                    // InternalSmc.g:866:5: lv_array_3_0= '[]'
                    {
                    lv_array_3_0=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
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

            // InternalSmc.g:878:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSmc.g:879:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSmc.g:879:4: (lv_name_4_0= RULE_ID )
            // InternalSmc.g:880:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
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

            // InternalSmc.g:896:3: (otherlv_5= '=' ( (lv_option_6_0= ruleAbstractAssignment ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmc.g:897:4: otherlv_5= '=' ( (lv_option_6_0= ruleAbstractAssignment ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getVariableDeclAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalSmc.g:901:4: ( (lv_option_6_0= ruleAbstractAssignment ) )
                    // InternalSmc.g:902:5: (lv_option_6_0= ruleAbstractAssignment )
                    {
                    // InternalSmc.g:902:5: (lv_option_6_0= ruleAbstractAssignment )
                    // InternalSmc.g:903:6: lv_option_6_0= ruleAbstractAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableDeclAccess().getOptionAbstractAssignmentParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_option_6_0=ruleAbstractAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableDeclRule());
                      						}
                      						set(
                      							current,
                      							"option",
                      							lv_option_6_0,
                      							"soton.cyber.smcaas.smc.Smc.AbstractAssignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:929:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalSmc.g:929:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalSmc.g:930:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
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
    // InternalSmc.g:936:1: ruleVariableAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_option_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:942:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';' ) )
            // InternalSmc.g:943:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';' )
            {
            // InternalSmc.g:943:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';' )
            // InternalSmc.g:944:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';'
            {
            // InternalSmc.g:944:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmc.g:945:4: (otherlv_0= RULE_ID )
            {
            // InternalSmc.g:945:4: (otherlv_0= RULE_ID )
            // InternalSmc.g:946:5: otherlv_0= RULE_ID
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

            otherlv_1=(Token)match(input,16,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalSmc.g:961:3: ( (lv_option_2_0= ruleAbstractAssignment ) )
            // InternalSmc.g:962:4: (lv_option_2_0= ruleAbstractAssignment )
            {
            // InternalSmc.g:962:4: (lv_option_2_0= ruleAbstractAssignment )
            // InternalSmc.g:963:5: lv_option_2_0= ruleAbstractAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getOptionAbstractAssignmentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_option_2_0=ruleAbstractAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
              					}
              					set(
              						current,
              						"option",
              						lv_option_2_0,
              						"soton.cyber.smcaas.smc.Smc.AbstractAssignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAbstractAssignment"
    // InternalSmc.g:988:1: entryRuleAbstractAssignment returns [EObject current=null] : iv_ruleAbstractAssignment= ruleAbstractAssignment EOF ;
    public final EObject entryRuleAbstractAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAssignment = null;


        try {
            // InternalSmc.g:988:59: (iv_ruleAbstractAssignment= ruleAbstractAssignment EOF )
            // InternalSmc.g:989:2: iv_ruleAbstractAssignment= ruleAbstractAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractAssignment=ruleAbstractAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractAssignment; 
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
    // $ANTLR end "entryRuleAbstractAssignment"


    // $ANTLR start "ruleAbstractAssignment"
    // InternalSmc.g:995:1: ruleAbstractAssignment returns [EObject current=null] : (this_Expression_0= ruleExpression | this_Download_1= ruleDownload ) ;
    public final EObject ruleAbstractAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_Download_1 = null;



        	enterRule();

        try {
            // InternalSmc.g:1001:2: ( (this_Expression_0= ruleExpression | this_Download_1= ruleDownload ) )
            // InternalSmc.g:1002:2: (this_Expression_0= ruleExpression | this_Download_1= ruleDownload )
            {
            // InternalSmc.g:1002:2: (this_Expression_0= ruleExpression | this_Download_1= ruleDownload )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_TIME)||LA9_0==18||(LA9_0>=44 && LA9_0<=45)||(LA9_0>=47 && LA9_0<=48)) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmc.g:1003:3: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractAssignmentAccess().getExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmc.g:1012:3: this_Download_1= ruleDownload
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractAssignmentAccess().getDownloadParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Download_1=ruleDownload();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Download_1;
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
    // $ANTLR end "ruleAbstractAssignment"


    // $ANTLR start "entryRuleDownload"
    // InternalSmc.g:1024:1: entryRuleDownload returns [EObject current=null] : iv_ruleDownload= ruleDownload EOF ;
    public final EObject entryRuleDownload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownload = null;


        try {
            // InternalSmc.g:1024:49: (iv_ruleDownload= ruleDownload EOF )
            // InternalSmc.g:1025:2: iv_ruleDownload= ruleDownload EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDownloadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDownload=ruleDownload();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDownload; 
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
    // $ANTLR end "entryRuleDownload"


    // $ANTLR start "ruleDownload"
    // InternalSmc.g:1031:1: ruleDownload returns [EObject current=null] : (otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleDownload() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_arg_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmc.g:1037:2: ( (otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalSmc.g:1038:2: (otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalSmc.g:1038:2: (otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalSmc.g:1039:3: otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDownloadAccess().getRetrieveFromClientKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDownloadAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:1047:3: ( (lv_arg_2_0= RULE_STRING ) )
            // InternalSmc.g:1048:4: (lv_arg_2_0= RULE_STRING )
            {
            // InternalSmc.g:1048:4: (lv_arg_2_0= RULE_STRING )
            // InternalSmc.g:1049:5: lv_arg_2_0= RULE_STRING
            {
            lv_arg_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_arg_2_0, grammarAccess.getDownloadAccess().getArgSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDownloadRule());
              					}
              					setWithLastConsumed(
              						current,
              						"arg",
              						lv_arg_2_0,
              						"soton.cyber.smcaas.smc.Smc.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDownloadAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleDownload"


    // $ANTLR start "entryRuleExpression"
    // InternalSmc.g:1073:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmc.g:1073:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmc.g:1074:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSmc.g:1080:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1086:2: (this_Or_0= ruleOr )
            // InternalSmc.g:1087:2: this_Or_0= ruleOr
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
    // InternalSmc.g:1098:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSmc.g:1098:43: (iv_ruleOr= ruleOr EOF )
            // InternalSmc.g:1099:2: iv_ruleOr= ruleOr EOF
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
    // InternalSmc.g:1105:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1111:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSmc.g:1112:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSmc.g:1112:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSmc.g:1113:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1121:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmc.g:1122:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSmc.g:1122:4: ()
            	    // InternalSmc.g:1123:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalSmc.g:1133:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSmc.g:1134:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSmc.g:1134:5: (lv_right_3_0= ruleAnd )
            	    // InternalSmc.g:1135:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
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
    // InternalSmc.g:1157:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSmc.g:1157:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSmc.g:1158:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSmc.g:1164:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1170:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalSmc.g:1171:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalSmc.g:1171:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalSmc.g:1172:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1180:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSmc.g:1181:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalSmc.g:1181:4: ()
            	    // InternalSmc.g:1182:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalSmc.g:1192:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalSmc.g:1193:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalSmc.g:1193:5: (lv_right_3_0= ruleEquality )
            	    // InternalSmc.g:1194:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
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
    // InternalSmc.g:1216:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalSmc.g:1216:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalSmc.g:1217:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalSmc.g:1223:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1229:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalSmc.g:1230:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalSmc.g:1230:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalSmc.g:1231:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1239:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=36 && LA13_0<=37)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSmc.g:1240:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalSmc.g:1240:4: ()
            	    // InternalSmc.g:1241:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1247:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalSmc.g:1248:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalSmc.g:1248:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalSmc.g:1249:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalSmc.g:1249:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==36) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==37) ) {
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
            	            // InternalSmc.g:1250:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1261:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_18); if (state.failed) return current;
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

            	    // InternalSmc.g:1274:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalSmc.g:1275:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalSmc.g:1275:5: (lv_right_3_0= ruleComparison )
            	    // InternalSmc.g:1276:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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
    // InternalSmc.g:1298:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmc.g:1298:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmc.g:1299:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalSmc.g:1305:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalSmc.g:1311:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalSmc.g:1312:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalSmc.g:1312:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalSmc.g:1313:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1321:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=25 && LA15_0<=26)||(LA15_0>=38 && LA15_0<=39)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmc.g:1322:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalSmc.g:1322:4: ()
            	    // InternalSmc.g:1323:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1329:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalSmc.g:1330:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalSmc.g:1330:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalSmc.g:1331:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalSmc.g:1331:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 25:
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
            	            // InternalSmc.g:1332:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,38,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1343:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1354:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1365:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
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

            	    // InternalSmc.g:1378:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalSmc.g:1379:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalSmc.g:1379:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalSmc.g:1380:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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
    // InternalSmc.g:1402:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalSmc.g:1402:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalSmc.g:1403:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalSmc.g:1409:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1415:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) )
            // InternalSmc.g:1416:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            {
            // InternalSmc.g:1416:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            // InternalSmc.g:1417:3: this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1425:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=40 && LA17_0<=41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSmc.g:1426:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) )
            	    {
            	    // InternalSmc.g:1426:4: ()
            	    // InternalSmc.g:1427:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPlusOrMinusAccess().getPlusOrMinusLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1433:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalSmc.g:1434:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalSmc.g:1434:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalSmc.g:1435:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalSmc.g:1435:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==40) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==41) ) {
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
            	            // InternalSmc.g:1436:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1447:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_18); if (state.failed) return current;
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

            	    // InternalSmc.g:1460:4: ( (lv_right_3_0= ruleMulOrDiv ) )
            	    // InternalSmc.g:1461:5: (lv_right_3_0= ruleMulOrDiv )
            	    {
            	    // InternalSmc.g:1461:5: (lv_right_3_0= ruleMulOrDiv )
            	    // InternalSmc.g:1462:6: lv_right_3_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
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
    // InternalSmc.g:1484:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalSmc.g:1484:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalSmc.g:1485:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalSmc.g:1491:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1497:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalSmc.g:1498:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalSmc.g:1498:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalSmc.g:1499:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1507:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=42 && LA19_0<=43)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSmc.g:1508:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalSmc.g:1508:4: ()
            	    // InternalSmc.g:1509:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1515:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalSmc.g:1516:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalSmc.g:1516:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalSmc.g:1517:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalSmc.g:1517:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==42) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==43) ) {
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
            	            // InternalSmc.g:1518:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1529:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
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

            	    // InternalSmc.g:1542:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalSmc.g:1543:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalSmc.g:1543:5: (lv_right_3_0= rulePrimary )
            	    // InternalSmc.g:1544:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
    // InternalSmc.g:1566:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmc.g:1566:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmc.g:1567:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSmc.g:1573:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // InternalSmc.g:1579:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalSmc.g:1580:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalSmc.g:1580:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt20=1;
                }
                break;
            case 44:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_DATE:
            case RULE_TIME:
            case 45:
            case 47:
            case 48:
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
                    // InternalSmc.g:1581:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalSmc.g:1581:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalSmc.g:1582:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:1600:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalSmc.g:1600:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalSmc.g:1601:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalSmc.g:1601:4: ()
                    // InternalSmc.g:1602:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalSmc.g:1612:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalSmc.g:1613:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalSmc.g:1613:5: (lv_expression_5_0= rulePrimary )
                    // InternalSmc.g:1614:6: lv_expression_5_0= rulePrimary
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
                    // InternalSmc.g:1633:3: this_Atomic_6= ruleAtomic
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
    // InternalSmc.g:1645:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalSmc.g:1645:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalSmc.g:1646:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalSmc.g:1652:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_11_0=null;
        Token otherlv_13=null;
        EObject this_Tuple_14 = null;

        EObject this_List_15 = null;

        EObject this_Dict_16 = null;

        EObject this_Invocation_17 = null;



        	enterRule();

        try {
            // InternalSmc.g:1658:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation ) )
            // InternalSmc.g:1659:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation )
            {
            // InternalSmc.g:1659:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation )
            int alt21=11;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalSmc.g:1660:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalSmc.g:1660:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalSmc.g:1661:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalSmc.g:1661:4: ()
                    // InternalSmc.g:1662:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1668:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalSmc.g:1669:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalSmc.g:1669:5: (lv_value_1_0= RULE_INT )
                    // InternalSmc.g:1670:6: lv_value_1_0= RULE_INT
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
                    // InternalSmc.g:1688:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    {
                    // InternalSmc.g:1688:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    // InternalSmc.g:1689:4: () ( (lv_value_3_0= RULE_REAL ) )
                    {
                    // InternalSmc.g:1689:4: ()
                    // InternalSmc.g:1690:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1696:4: ( (lv_value_3_0= RULE_REAL ) )
                    // InternalSmc.g:1697:5: (lv_value_3_0= RULE_REAL )
                    {
                    // InternalSmc.g:1697:5: (lv_value_3_0= RULE_REAL )
                    // InternalSmc.g:1698:6: lv_value_3_0= RULE_REAL
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
                    // InternalSmc.g:1716:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalSmc.g:1716:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalSmc.g:1717:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalSmc.g:1717:4: ()
                    // InternalSmc.g:1718:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1724:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalSmc.g:1725:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalSmc.g:1725:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalSmc.g:1726:6: lv_value_5_0= RULE_BOOLEAN
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
                    // InternalSmc.g:1744:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalSmc.g:1744:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalSmc.g:1745:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalSmc.g:1745:4: ()
                    // InternalSmc.g:1746:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1752:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalSmc.g:1753:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalSmc.g:1753:5: (lv_value_7_0= RULE_STRING )
                    // InternalSmc.g:1754:6: lv_value_7_0= RULE_STRING
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
                    // InternalSmc.g:1772:3: ( () ( (lv_value_9_0= RULE_DATE ) ) )
                    {
                    // InternalSmc.g:1772:3: ( () ( (lv_value_9_0= RULE_DATE ) ) )
                    // InternalSmc.g:1773:4: () ( (lv_value_9_0= RULE_DATE ) )
                    {
                    // InternalSmc.g:1773:4: ()
                    // InternalSmc.g:1774:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDateLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1780:4: ( (lv_value_9_0= RULE_DATE ) )
                    // InternalSmc.g:1781:5: (lv_value_9_0= RULE_DATE )
                    {
                    // InternalSmc.g:1781:5: (lv_value_9_0= RULE_DATE )
                    // InternalSmc.g:1782:6: lv_value_9_0= RULE_DATE
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
                    // InternalSmc.g:1800:3: ( () ( (lv_value_11_0= RULE_TIME ) ) )
                    {
                    // InternalSmc.g:1800:3: ( () ( (lv_value_11_0= RULE_TIME ) ) )
                    // InternalSmc.g:1801:4: () ( (lv_value_11_0= RULE_TIME ) )
                    {
                    // InternalSmc.g:1801:4: ()
                    // InternalSmc.g:1802:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getTimeLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1808:4: ( (lv_value_11_0= RULE_TIME ) )
                    // InternalSmc.g:1809:5: (lv_value_11_0= RULE_TIME )
                    {
                    // InternalSmc.g:1809:5: (lv_value_11_0= RULE_TIME )
                    // InternalSmc.g:1810:6: lv_value_11_0= RULE_TIME
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
                    // InternalSmc.g:1828:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalSmc.g:1828:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalSmc.g:1829:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalSmc.g:1829:4: ()
                    // InternalSmc.g:1830:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1836:4: ( (otherlv_13= RULE_ID ) )
                    // InternalSmc.g:1837:5: (otherlv_13= RULE_ID )
                    {
                    // InternalSmc.g:1837:5: (otherlv_13= RULE_ID )
                    // InternalSmc.g:1838:6: otherlv_13= RULE_ID
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
                    // InternalSmc.g:1851:3: this_Tuple_14= ruleTuple
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getTupleParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Tuple_14=ruleTuple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Tuple_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalSmc.g:1860:3: this_List_15= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getListParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_List_15=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_List_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalSmc.g:1869:3: this_Dict_16= ruleDict
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getDictParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Dict_16=ruleDict();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Dict_16;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalSmc.g:1878:3: this_Invocation_17= ruleInvocation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getInvocationParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Invocation_17=ruleInvocation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Invocation_17;
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


    // $ANTLR start "entryRuleTuple"
    // InternalSmc.g:1890:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalSmc.g:1890:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalSmc.g:1891:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
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
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // InternalSmc.g:1897:1: ruleTuple returns [EObject current=null] : (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg1_2_0 = null;

        EObject lv_arg2_4_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1903:2: ( (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>' ) )
            // InternalSmc.g:1904:2: (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>' )
            {
            // InternalSmc.g:1904:2: (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>' )
            // InternalSmc.g:1905:3: otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLessThanSignKeyword_1());
              		
            }
            // InternalSmc.g:1913:3: ( (lv_arg1_2_0= ruleAtomic ) )
            // InternalSmc.g:1914:4: (lv_arg1_2_0= ruleAtomic )
            {
            // InternalSmc.g:1914:4: (lv_arg1_2_0= ruleAtomic )
            // InternalSmc.g:1915:5: lv_arg1_2_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleAccess().getArg1AtomicParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_arg1_2_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleRule());
              					}
              					add(
              						current,
              						"arg1",
              						lv_arg1_2_0,
              						"soton.cyber.smcaas.smc.Smc.Atomic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:1936:3: ( (lv_arg2_4_0= ruleAtomic ) )
            // InternalSmc.g:1937:4: (lv_arg2_4_0= ruleAtomic )
            {
            // InternalSmc.g:1937:4: (lv_arg2_4_0= ruleAtomic )
            // InternalSmc.g:1938:5: lv_arg2_4_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleAccess().getArg2AtomicParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_arg2_4_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleRule());
              					}
              					add(
              						current,
              						"arg2",
              						lv_arg2_4_0,
              						"soton.cyber.smcaas.smc.Smc.Atomic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleAccess().getGreaterThanSignKeyword_5());
              		
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
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleList"
    // InternalSmc.g:1963:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSmc.g:1963:45: (iv_ruleList= ruleList EOF )
            // InternalSmc.g:1964:2: iv_ruleList= ruleList EOF
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
    // InternalSmc.g:1970:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1976:2: ( (otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')' ) )
            // InternalSmc.g:1977:2: (otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')' )
            {
            // InternalSmc.g:1977:2: (otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')' )
            // InternalSmc.g:1978:3: otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:1986:3: ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* )
            // InternalSmc.g:1987:4: ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )*
            {
            // InternalSmc.g:1987:4: ( (lv_args_2_0= ruleAtomic ) )
            // InternalSmc.g:1988:5: (lv_args_2_0= ruleAtomic )
            {
            // InternalSmc.g:1988:5: (lv_args_2_0= ruleAtomic )
            // InternalSmc.g:1989:6: lv_args_2_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getListAccess().getArgsAtomicParserRuleCall_2_0_0());
              					
            }
            pushFollow(FOLLOW_31);
            lv_args_2_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getListRule());
              						}
              						add(
              							current,
              							"args",
              							lv_args_2_0,
              							"soton.cyber.smcaas.smc.Smc.Atomic");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalSmc.g:2006:4: (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSmc.g:2007:5: otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_2_1_0());
            	      				
            	    }
            	    // InternalSmc.g:2011:5: ( (lv_args_4_0= ruleAtomic ) )
            	    // InternalSmc.g:2012:6: (lv_args_4_0= ruleAtomic )
            	    {
            	    // InternalSmc.g:2012:6: (lv_args_4_0= ruleAtomic )
            	    // InternalSmc.g:2013:7: lv_args_4_0= ruleAtomic
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getListAccess().getArgsAtomicParserRuleCall_2_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_args_4_0=ruleAtomic();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getListRule());
            	      							}
            	      							add(
            	      								current,
            	      								"args",
            	      								lv_args_4_0,
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

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getListAccess().getRightParenthesisKeyword_3());
              		
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


    // $ANTLR start "entryRuleDict"
    // InternalSmc.g:2040:1: entryRuleDict returns [EObject current=null] : iv_ruleDict= ruleDict EOF ;
    public final EObject entryRuleDict() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDict = null;


        try {
            // InternalSmc.g:2040:45: (iv_ruleDict= ruleDict EOF )
            // InternalSmc.g:2041:2: iv_ruleDict= ruleDict EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDict=ruleDict();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDict; 
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
    // $ANTLR end "entryRuleDict"


    // $ANTLR start "ruleDict"
    // InternalSmc.g:2047:1: ruleDict returns [EObject current=null] : (otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleDict() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_key_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:2053:2: ( (otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalSmc.g:2054:2: (otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalSmc.g:2054:2: (otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalSmc.g:2055:3: otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDictAccess().getDictKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDictAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2063:3: ( (lv_key_2_0= ruleAtomic ) )
            // InternalSmc.g:2064:4: (lv_key_2_0= ruleAtomic )
            {
            // InternalSmc.g:2064:4: (lv_key_2_0= ruleAtomic )
            // InternalSmc.g:2065:5: lv_key_2_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDictAccess().getKeyAtomicParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_key_2_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDictRule());
              					}
              					add(
              						current,
              						"key",
              						lv_key_2_0,
              						"soton.cyber.smcaas.smc.Smc.Atomic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDictAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:2086:3: ( (otherlv_4= RULE_ID ) )
            // InternalSmc.g:2087:4: (otherlv_4= RULE_ID )
            {
            // InternalSmc.g:2087:4: (otherlv_4= RULE_ID )
            // InternalSmc.g:2088:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDictRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getDictAccess().getValueListCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDictAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleDict"


    // $ANTLR start "entryRuleInvocation"
    // InternalSmc.g:2107:1: entryRuleInvocation returns [EObject current=null] : iv_ruleInvocation= ruleInvocation EOF ;
    public final EObject entryRuleInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocation = null;


        try {
            // InternalSmc.g:2107:51: (iv_ruleInvocation= ruleInvocation EOF )
            // InternalSmc.g:2108:2: iv_ruleInvocation= ruleInvocation EOF
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
    // InternalSmc.g:2114:1: ruleInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_funcName_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:2120:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' ) )
            // InternalSmc.g:2121:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            {
            // InternalSmc.g:2121:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')' )
            // InternalSmc.g:2122:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ')'
            {
            // InternalSmc.g:2122:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmc.g:2123:4: (otherlv_0= RULE_ID )
            {
            // InternalSmc.g:2123:4: (otherlv_0= RULE_ID )
            // InternalSmc.g:2124:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvocationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getInvocationAccess().getBlockNameBlockSMCCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvocationAccess().getFullStopKeyword_1());
              		
            }
            // InternalSmc.g:2139:3: ( (lv_funcName_2_0= ruleFunctions ) )
            // InternalSmc.g:2140:4: (lv_funcName_2_0= ruleFunctions )
            {
            // InternalSmc.g:2140:4: (lv_funcName_2_0= ruleFunctions )
            // InternalSmc.g:2141:5: lv_funcName_2_0= ruleFunctions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvocationAccess().getFuncNameFunctionsEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_funcName_2_0=ruleFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvocationRule());
              					}
              					set(
              						current,
              						"funcName",
              						lv_funcName_2_0,
              						"soton.cyber.smcaas.smc.Smc.Functions");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInvocationAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalSmc.g:2162:3: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmc.g:2163:4: ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // InternalSmc.g:2163:4: ( (otherlv_4= RULE_ID ) )
                    // InternalSmc.g:2164:5: (otherlv_4= RULE_ID )
                    {
                    // InternalSmc.g:2164:5: (otherlv_4= RULE_ID )
                    // InternalSmc.g:2165:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInvocationRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getInvocationAccess().getArgsParamDeclCrossReference_4_0_0());
                      					
                    }

                    }


                    }

                    // InternalSmc.g:2176:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==46) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSmc.g:2177:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getInvocationAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalSmc.g:2181:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalSmc.g:2182:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalSmc.g:2182:6: (otherlv_6= RULE_ID )
                    	    // InternalSmc.g:2183:7: otherlv_6= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getInvocationRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_6, grammarAccess.getInvocationAccess().getArgsParamDeclCrossReference_4_1_1_0());
                    	      						
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

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:2204:1: ruleBlockType returns [Enumerator current=null] : ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) ) ;
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
            // InternalSmc.g:2210:2: ( ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) ) )
            // InternalSmc.g:2211:2: ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) )
            {
            // InternalSmc.g:2211:2: ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt25=1;
                }
                break;
            case 51:
                {
                alt25=2;
                }
                break;
            case 52:
                {
                alt25=3;
                }
                break;
            case 53:
                {
                alt25=4;
                }
                break;
            case 54:
                {
                alt25=5;
                }
                break;
            case 55:
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
                    // InternalSmc.g:2212:3: (enumLiteral_0= 'insert_data' )
                    {
                    // InternalSmc.g:2212:3: (enumLiteral_0= 'insert_data' )
                    // InternalSmc.g:2213:4: enumLiteral_0= 'insert_data'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getINSERTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBlockTypeAccess().getINSERTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:2220:3: (enumLiteral_1= 'math_computation' )
                    {
                    // InternalSmc.g:2220:3: (enumLiteral_1= 'math_computation' )
                    // InternalSmc.g:2221:4: enumLiteral_1= 'math_computation'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getCOMPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBlockTypeAccess().getCOMPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:2228:3: (enumLiteral_2= 'search' )
                    {
                    // InternalSmc.g:2228:3: (enumLiteral_2= 'search' )
                    // InternalSmc.g:2229:4: enumLiteral_2= 'search'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getSEARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBlockTypeAccess().getSEARCHEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:2236:3: (enumLiteral_3= 'anonymization' )
                    {
                    // InternalSmc.g:2236:3: (enumLiteral_3= 'anonymization' )
                    // InternalSmc.g:2237:4: enumLiteral_3= 'anonymization'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getANONYMIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBlockTypeAccess().getANONYMIZATIONEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmc.g:2244:3: (enumLiteral_4= 'access_control' )
                    {
                    // InternalSmc.g:2244:3: (enumLiteral_4= 'access_control' )
                    // InternalSmc.g:2245:4: enumLiteral_4= 'access_control'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getACCESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBlockTypeAccess().getACCESSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmc.g:2252:3: (enumLiteral_5= 'permission_release' )
                    {
                    // InternalSmc.g:2252:3: (enumLiteral_5= 'permission_release' )
                    // InternalSmc.g:2253:4: enumLiteral_5= 'permission_release'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:2263:1: ruleSecType returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleSecType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmc.g:2269:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalSmc.g:2270:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalSmc.g:2270:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==56) ) {
                alt26=1;
            }
            else if ( (LA26_0==57) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSmc.g:2271:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSmc.g:2271:3: (enumLiteral_0= 'public' )
                    // InternalSmc.g:2272:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSecTypeAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSecTypeAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:2279:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSmc.g:2279:3: (enumLiteral_1= 'private' )
                    // InternalSmc.g:2280:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:2290:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= 'ENCRYPTED' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSmc.g:2296:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= 'ENCRYPTED' ) ) )
            // InternalSmc.g:2297:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= 'ENCRYPTED' ) )
            {
            // InternalSmc.g:2297:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= 'ENCRYPTED' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt27=1;
                }
                break;
            case 59:
                {
                alt27=2;
                }
                break;
            case 60:
                {
                alt27=3;
                }
                break;
            case 61:
                {
                alt27=4;
                }
                break;
            case 62:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSmc.g:2298:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalSmc.g:2298:3: (enumLiteral_0= 'INT' )
                    // InternalSmc.g:2299:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:2306:3: (enumLiteral_1= 'DOUBLE' )
                    {
                    // InternalSmc.g:2306:3: (enumLiteral_1= 'DOUBLE' )
                    // InternalSmc.g:2307:4: enumLiteral_1= 'DOUBLE'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:2314:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalSmc.g:2314:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalSmc.g:2315:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:2322:3: (enumLiteral_3= 'STRING' )
                    {
                    // InternalSmc.g:2322:3: (enumLiteral_3= 'STRING' )
                    // InternalSmc.g:2323:4: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmc.g:2330:3: (enumLiteral_4= 'ENCRYPTED' )
                    {
                    // InternalSmc.g:2330:3: (enumLiteral_4= 'ENCRYPTED' )
                    // InternalSmc.g:2331:4: enumLiteral_4= 'ENCRYPTED'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getENCRYPTEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getENCRYPTEDEnumLiteralDeclaration_4());
                      			
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


    // $ANTLR start "ruleFunctions"
    // InternalSmc.g:2341:1: ruleFunctions returns [Enumerator current=null] : ( (enumLiteral_0= 'createDataset' ) | (enumLiteral_1= 'addValues' ) ) ;
    public final Enumerator ruleFunctions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmc.g:2347:2: ( ( (enumLiteral_0= 'createDataset' ) | (enumLiteral_1= 'addValues' ) ) )
            // InternalSmc.g:2348:2: ( (enumLiteral_0= 'createDataset' ) | (enumLiteral_1= 'addValues' ) )
            {
            // InternalSmc.g:2348:2: ( (enumLiteral_0= 'createDataset' ) | (enumLiteral_1= 'addValues' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==63) ) {
                alt28=1;
            }
            else if ( (LA28_0==64) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSmc.g:2349:3: (enumLiteral_0= 'createDataset' )
                    {
                    // InternalSmc.g:2349:3: (enumLiteral_0= 'createDataset' )
                    // InternalSmc.g:2350:4: enumLiteral_0= 'createDataset'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionsAccess().getCREATE_DBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getFunctionsAccess().getCREATE_DBEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:2357:3: (enumLiteral_1= 'addValues' )
                    {
                    // InternalSmc.g:2357:3: (enumLiteral_1= 'addValues' )
                    // InternalSmc.g:2358:4: enumLiteral_1= 'addValues'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFunctionsAccess().getADD_VALUESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getFunctionsAccess().getADD_VALUESEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleFunctions"

    // $ANTLR start synpred1_InternalSmc
    public final void synpred1_InternalSmc_fragment() throws RecognitionException {   
        // InternalSmc.g:777:5: ( 'else' )
        // InternalSmc.g:777:6: 'else'
        {
        match(input,30,FOLLOW_2); if (state.failed) return ;

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\20\6\uffff";
    static final String dfa_3s = "\1\37\2\uffff\1\61\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\10\1\3\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\21\uffff\1\1\1\uffff\1\7\2\uffff\1\6\1\5\1\4\1\uffff\1\2",
            "",
            "",
            "\1\10\40\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "303:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\7\uffff\1\14\5\uffff";
    static final String dfa_9s = "\1\4\6\uffff\1\23\5\uffff";
    static final String dfa_10s = "\1\60\6\uffff\1\61\5\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\7";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\7\1\4\1\1\1\2\1\3\1\5\1\6\42\uffff\1\10\1\uffff\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\14\4\uffff\2\14\7\uffff\12\14\2\uffff\1\14\2\uffff\1\13",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1659:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00FC000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000B9C00010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x7C00000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001B000000407F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000B9400010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001B002000407F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000C006000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000080010L});

}
