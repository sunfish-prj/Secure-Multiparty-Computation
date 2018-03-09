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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOLEAN", "RULE_DATE", "RULE_TIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'block'", "'='", "'new'", "'('", "')'", "';'", "'main'", "'{'", "'}'", "'return'", "'parameter'", "'<'", "'>'", "'print'", "'while'", "'if'", "'else'", "'var'", "'['", "']'", "'retrieveFromDB'", "','", "'retrieveFromClient'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'tuple'", "'list'", "'dict'", "'.'", "'multiplication'", "'median'", "'w_avg'", "'avg'", "'count'", "'accessControlBLP'", "'accessControlCovered'", "'search'", "'bloomFilter'", "'checkDataset'", "'addValues'", "'createDataset'", "'insert_data'", "'math_computation'", "'anonymization'", "'access_control'", "'permission_release'", "'public'", "'private'", "'INT'", "'DOUBLE'", "'BOOLEAN'", "'STRING'", "'ENCRYPTED'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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

                if ( (LA3_0==RULE_ID||LA3_0==22||(LA3_0>=24 && LA3_0<=25)||(LA3_0>=28 && LA3_0<=30)||LA3_0==32) ) {
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
    // InternalSmc.g:296:1: ruleCommand returns [EObject current=null] : (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl | this_Return_8= ruleReturn ) ;
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

        EObject this_Return_8 = null;



        	enterRule();

        try {
            // InternalSmc.g:302:2: ( (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl | this_Return_8= ruleReturn ) )
            // InternalSmc.g:303:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl | this_Return_8= ruleReturn )
            {
            // InternalSmc.g:303:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl | this_Return_8= ruleReturn )
            int alt4=9;
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
                case 9 :
                    // InternalSmc.g:376:3: this_Return_8= ruleReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getReturnParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Return_8=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Return_8;
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


    // $ANTLR start "entryRuleReturn"
    // InternalSmc.g:388:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalSmc.g:388:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalSmc.g:389:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalSmc.g:395:1: ruleReturn returns [EObject current=null] : ( () otherlv_1= 'return' otherlv_2= ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSmc.g:401:2: ( ( () otherlv_1= 'return' otherlv_2= ';' ) )
            // InternalSmc.g:402:2: ( () otherlv_1= 'return' otherlv_2= ';' )
            {
            // InternalSmc.g:402:2: ( () otherlv_1= 'return' otherlv_2= ';' )
            // InternalSmc.g:403:3: () otherlv_1= 'return' otherlv_2= ';'
            {
            // InternalSmc.g:403:3: ()
            // InternalSmc.g:404:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnAccess().getReturnAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getReturnKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getSemicolonKeyword_2());
              		
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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleParamDecl"
    // InternalSmc.g:422:1: entryRuleParamDecl returns [EObject current=null] : iv_ruleParamDecl= ruleParamDecl EOF ;
    public final EObject entryRuleParamDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDecl = null;


        try {
            // InternalSmc.g:422:50: (iv_ruleParamDecl= ruleParamDecl EOF )
            // InternalSmc.g:423:2: iv_ruleParamDecl= ruleParamDecl EOF
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
    // InternalSmc.g:429:1: ruleParamDecl returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';' ) ;
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
            // InternalSmc.g:435:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
            // InternalSmc.g:436:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';' )
            {
            // InternalSmc.g:436:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';' )
            // InternalSmc.g:437:3: otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '<' ( (lv_stype_4_0= ruleSecType ) ) ( (lv_btype_5_0= ruleBasicType ) ) otherlv_6= '>' ( (lv_parName_7_0= RULE_STRING ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParamDeclAccess().getParameterKeyword_0());
              		
            }
            // InternalSmc.g:441:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmc.g:442:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmc.g:442:4: (lv_name_1_0= RULE_ID )
            // InternalSmc.g:443:5: lv_name_1_0= RULE_ID
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
            otherlv_3=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getParamDeclAccess().getLessThanSignKeyword_3());
              		
            }
            // InternalSmc.g:467:3: ( (lv_stype_4_0= ruleSecType ) )
            // InternalSmc.g:468:4: (lv_stype_4_0= ruleSecType )
            {
            // InternalSmc.g:468:4: (lv_stype_4_0= ruleSecType )
            // InternalSmc.g:469:5: lv_stype_4_0= ruleSecType
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

            // InternalSmc.g:486:3: ( (lv_btype_5_0= ruleBasicType ) )
            // InternalSmc.g:487:4: (lv_btype_5_0= ruleBasicType )
            {
            // InternalSmc.g:487:4: (lv_btype_5_0= ruleBasicType )
            // InternalSmc.g:488:5: lv_btype_5_0= ruleBasicType
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

            otherlv_6=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getParamDeclAccess().getGreaterThanSignKeyword_6());
              		
            }
            // InternalSmc.g:509:3: ( (lv_parName_7_0= RULE_STRING ) )
            // InternalSmc.g:510:4: (lv_parName_7_0= RULE_STRING )
            {
            // InternalSmc.g:510:4: (lv_parName_7_0= RULE_STRING )
            // InternalSmc.g:511:5: lv_parName_7_0= RULE_STRING
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
    // InternalSmc.g:535:1: entryRuleInvocationVoid returns [EObject current=null] : iv_ruleInvocationVoid= ruleInvocationVoid EOF ;
    public final EObject entryRuleInvocationVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationVoid = null;


        try {
            // InternalSmc.g:535:55: (iv_ruleInvocationVoid= ruleInvocationVoid EOF )
            // InternalSmc.g:536:2: iv_ruleInvocationVoid= ruleInvocationVoid EOF
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
    // InternalSmc.g:542:1: ruleInvocationVoid returns [EObject current=null] : ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' ) ;
    public final EObject ruleInvocationVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_call_0_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:548:2: ( ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' ) )
            // InternalSmc.g:549:2: ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' )
            {
            // InternalSmc.g:549:2: ( ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';' )
            // InternalSmc.g:550:3: ( (lv_call_0_0= ruleInvocation ) ) otherlv_1= ';'
            {
            // InternalSmc.g:550:3: ( (lv_call_0_0= ruleInvocation ) )
            // InternalSmc.g:551:4: (lv_call_0_0= ruleInvocation )
            {
            // InternalSmc.g:551:4: (lv_call_0_0= ruleInvocation )
            // InternalSmc.g:552:5: lv_call_0_0= ruleInvocation
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
    // InternalSmc.g:577:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalSmc.g:577:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalSmc.g:578:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalSmc.g:584:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:590:2: ( ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' ) )
            // InternalSmc.g:591:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            {
            // InternalSmc.g:591:2: ( () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}' )
            // InternalSmc.g:592:3: () otherlv_1= '{' ( (lv_commands_2_0= ruleCommand ) )* otherlv_3= '}'
            {
            // InternalSmc.g:592:3: ()
            // InternalSmc.g:593:4: 
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
            // InternalSmc.g:603:3: ( (lv_commands_2_0= ruleCommand ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==22||(LA5_0>=24 && LA5_0<=25)||(LA5_0>=28 && LA5_0<=30)||LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmc.g:604:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalSmc.g:604:4: (lv_commands_2_0= ruleCommand )
            	    // InternalSmc.g:605:5: lv_commands_2_0= ruleCommand
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
    // InternalSmc.g:630:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalSmc.g:630:46: (iv_rulePrint= rulePrint EOF )
            // InternalSmc.g:631:2: iv_rulePrint= rulePrint EOF
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
    // InternalSmc.g:637:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:643:2: ( (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalSmc.g:644:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalSmc.g:644:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalSmc.g:645:3: otherlv_0= 'print' otherlv_1= '(' ( (lv_value_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:653:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalSmc.g:654:4: (lv_value_2_0= ruleExpression )
            {
            // InternalSmc.g:654:4: (lv_value_2_0= ruleExpression )
            // InternalSmc.g:655:5: lv_value_2_0= ruleExpression
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
    // InternalSmc.g:684:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalSmc.g:684:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalSmc.g:685:2: iv_ruleWhile= ruleWhile EOF
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
    // InternalSmc.g:691:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:697:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) ) )
            // InternalSmc.g:698:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            {
            // InternalSmc.g:698:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) ) )
            // InternalSmc.g:699:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleCommand ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:707:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmc.g:708:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmc.g:708:4: (lv_condition_2_0= ruleExpression )
            // InternalSmc.g:709:5: lv_condition_2_0= ruleExpression
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
            // InternalSmc.g:730:3: ( (lv_body_4_0= ruleCommand ) )
            // InternalSmc.g:731:4: (lv_body_4_0= ruleCommand )
            {
            // InternalSmc.g:731:4: (lv_body_4_0= ruleCommand )
            // InternalSmc.g:732:5: lv_body_4_0= ruleCommand
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
    // InternalSmc.g:753:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalSmc.g:753:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalSmc.g:754:2: iv_ruleIfThenElse= ruleIfThenElse EOF
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
    // InternalSmc.g:760:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) ;
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
            // InternalSmc.g:766:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? ) )
            // InternalSmc.g:767:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            {
            // InternalSmc.g:767:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )? )
            // InternalSmc.g:768:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBrach_4_0= ruleCommand ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:776:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSmc.g:777:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSmc.g:777:4: (lv_condition_2_0= ruleExpression )
            // InternalSmc.g:778:5: lv_condition_2_0= ruleExpression
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
            // InternalSmc.g:799:3: ( (lv_thenBrach_4_0= ruleCommand ) )
            // InternalSmc.g:800:4: (lv_thenBrach_4_0= ruleCommand )
            {
            // InternalSmc.g:800:4: (lv_thenBrach_4_0= ruleCommand )
            // InternalSmc.g:801:5: lv_thenBrach_4_0= ruleCommand
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

            // InternalSmc.g:818:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred1_InternalSmc()) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalSmc.g:819:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBranch_6_0= ruleCommand ) )
                    {
                    // InternalSmc.g:819:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalSmc.g:820:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalSmc.g:826:4: ( (lv_elseBranch_6_0= ruleCommand ) )
                    // InternalSmc.g:827:5: (lv_elseBranch_6_0= ruleCommand )
                    {
                    // InternalSmc.g:827:5: (lv_elseBranch_6_0= ruleCommand )
                    // InternalSmc.g:828:6: lv_elseBranch_6_0= ruleCommand
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
    // InternalSmc.g:850:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalSmc.g:850:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalSmc.g:851:2: iv_ruleVariableDecl= ruleVariableDecl EOF
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
    // InternalSmc.g:857:1: ruleVariableDecl returns [EObject current=null] : (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_length_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_option_8_0= ruleAbstractAssignment ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_3_0=null;
        Token lv_length_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_option_8_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:863:2: ( (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_length_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_option_8_0= ruleAbstractAssignment ) ) )? otherlv_9= ';' ) )
            // InternalSmc.g:864:2: (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_length_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_option_8_0= ruleAbstractAssignment ) ) )? otherlv_9= ';' )
            {
            // InternalSmc.g:864:2: (otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_length_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_option_8_0= ruleAbstractAssignment ) ) )? otherlv_9= ';' )
            // InternalSmc.g:865:3: otherlv_0= 'var' ( (lv_visibility_1_0= ruleSecType ) ) ( (lv_type_2_0= ruleBasicType ) ) ( ( (lv_array_3_0= '[' ) ) ( (lv_length_4_0= RULE_INT ) )? otherlv_5= ']' )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_option_8_0= ruleAbstractAssignment ) ) )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariableDeclAccess().getVarKeyword_0());
              		
            }
            // InternalSmc.g:869:3: ( (lv_visibility_1_0= ruleSecType ) )
            // InternalSmc.g:870:4: (lv_visibility_1_0= ruleSecType )
            {
            // InternalSmc.g:870:4: (lv_visibility_1_0= ruleSecType )
            // InternalSmc.g:871:5: lv_visibility_1_0= ruleSecType
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

            // InternalSmc.g:888:3: ( (lv_type_2_0= ruleBasicType ) )
            // InternalSmc.g:889:4: (lv_type_2_0= ruleBasicType )
            {
            // InternalSmc.g:889:4: (lv_type_2_0= ruleBasicType )
            // InternalSmc.g:890:5: lv_type_2_0= ruleBasicType
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

            // InternalSmc.g:907:3: ( ( (lv_array_3_0= '[' ) ) ( (lv_length_4_0= RULE_INT ) )? otherlv_5= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmc.g:908:4: ( (lv_array_3_0= '[' ) ) ( (lv_length_4_0= RULE_INT ) )? otherlv_5= ']'
                    {
                    // InternalSmc.g:908:4: ( (lv_array_3_0= '[' ) )
                    // InternalSmc.g:909:5: (lv_array_3_0= '[' )
                    {
                    // InternalSmc.g:909:5: (lv_array_3_0= '[' )
                    // InternalSmc.g:910:6: lv_array_3_0= '['
                    {
                    lv_array_3_0=(Token)match(input,33,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_array_3_0, grammarAccess.getVariableDeclAccess().getArrayLeftSquareBracketKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableDeclRule());
                      						}
                      						setWithLastConsumed(current, "array", true, "[");
                      					
                    }

                    }


                    }

                    // InternalSmc.g:922:4: ( (lv_length_4_0= RULE_INT ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSmc.g:923:5: (lv_length_4_0= RULE_INT )
                            {
                            // InternalSmc.g:923:5: (lv_length_4_0= RULE_INT )
                            // InternalSmc.g:924:6: lv_length_4_0= RULE_INT
                            {
                            lv_length_4_0=(Token)match(input,RULE_INT,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_length_4_0, grammarAccess.getVariableDeclAccess().getLengthINTTerminalRuleCall_3_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getVariableDeclRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"length",
                              							lv_length_4_0,
                              							"soton.cyber.smcaas.smc.Smc.INT");
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getVariableDeclAccess().getRightSquareBracketKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSmc.g:945:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalSmc.g:946:4: (lv_name_6_0= RULE_ID )
            {
            // InternalSmc.g:946:4: (lv_name_6_0= RULE_ID )
            // InternalSmc.g:947:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_6_0, grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_6_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSmc.g:963:3: (otherlv_7= '=' ( (lv_option_8_0= ruleAbstractAssignment ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmc.g:964:4: otherlv_7= '=' ( (lv_option_8_0= ruleAbstractAssignment ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getVariableDeclAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalSmc.g:968:4: ( (lv_option_8_0= ruleAbstractAssignment ) )
                    // InternalSmc.g:969:5: (lv_option_8_0= ruleAbstractAssignment )
                    {
                    // InternalSmc.g:969:5: (lv_option_8_0= ruleAbstractAssignment )
                    // InternalSmc.g:970:6: lv_option_8_0= ruleAbstractAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVariableDeclAccess().getOptionAbstractAssignmentParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_option_8_0=ruleAbstractAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVariableDeclRule());
                      						}
                      						set(
                      							current,
                      							"option",
                      							lv_option_8_0,
                      							"soton.cyber.smcaas.smc.Smc.AbstractAssignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getVariableDeclAccess().getSemicolonKeyword_6());
              		
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
    // InternalSmc.g:996:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalSmc.g:996:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalSmc.g:997:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
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
    // InternalSmc.g:1003:1: ruleVariableAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_option_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1009:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';' ) )
            // InternalSmc.g:1010:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';' )
            {
            // InternalSmc.g:1010:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';' )
            // InternalSmc.g:1011:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_option_2_0= ruleAbstractAssignment ) ) otherlv_3= ';'
            {
            // InternalSmc.g:1011:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmc.g:1012:4: (otherlv_0= RULE_ID )
            {
            // InternalSmc.g:1012:4: (otherlv_0= RULE_ID )
            // InternalSmc.g:1013:5: otherlv_0= RULE_ID
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

            otherlv_1=(Token)match(input,16,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalSmc.g:1028:3: ( (lv_option_2_0= ruleAbstractAssignment ) )
            // InternalSmc.g:1029:4: (lv_option_2_0= ruleAbstractAssignment )
            {
            // InternalSmc.g:1029:4: (lv_option_2_0= ruleAbstractAssignment )
            // InternalSmc.g:1030:5: lv_option_2_0= ruleAbstractAssignment
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
    // InternalSmc.g:1055:1: entryRuleAbstractAssignment returns [EObject current=null] : iv_ruleAbstractAssignment= ruleAbstractAssignment EOF ;
    public final EObject entryRuleAbstractAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAssignment = null;


        try {
            // InternalSmc.g:1055:59: (iv_ruleAbstractAssignment= ruleAbstractAssignment EOF )
            // InternalSmc.g:1056:2: iv_ruleAbstractAssignment= ruleAbstractAssignment EOF
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
    // InternalSmc.g:1062:1: ruleAbstractAssignment returns [EObject current=null] : (this_Expression_0= ruleExpression | this_Download_1= ruleDownload ) ;
    public final EObject ruleAbstractAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_Download_1 = null;



        	enterRule();

        try {
            // InternalSmc.g:1068:2: ( (this_Expression_0= ruleExpression | this_Download_1= ruleDownload ) )
            // InternalSmc.g:1069:2: (this_Expression_0= ruleExpression | this_Download_1= ruleDownload )
            {
            // InternalSmc.g:1069:2: (this_Expression_0= ruleExpression | this_Download_1= ruleDownload )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_TIME)||LA10_0==18||(LA10_0>=48 && LA10_0<=51)) ) {
                alt10=1;
            }
            else if ( (LA10_0==35||LA10_0==37) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmc.g:1070:3: this_Expression_0= ruleExpression
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
                    // InternalSmc.g:1079:3: this_Download_1= ruleDownload
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
    // InternalSmc.g:1091:1: entryRuleDownload returns [EObject current=null] : iv_ruleDownload= ruleDownload EOF ;
    public final EObject entryRuleDownload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDownload = null;


        try {
            // InternalSmc.g:1091:49: (iv_ruleDownload= ruleDownload EOF )
            // InternalSmc.g:1092:2: iv_ruleDownload= ruleDownload EOF
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
    // InternalSmc.g:1098:1: ruleDownload returns [EObject current=null] : (this_Client_0= ruleClient | this_Database_1= ruleDatabase ) ;
    public final EObject ruleDownload() throws RecognitionException {
        EObject current = null;

        EObject this_Client_0 = null;

        EObject this_Database_1 = null;



        	enterRule();

        try {
            // InternalSmc.g:1104:2: ( (this_Client_0= ruleClient | this_Database_1= ruleDatabase ) )
            // InternalSmc.g:1105:2: (this_Client_0= ruleClient | this_Database_1= ruleDatabase )
            {
            // InternalSmc.g:1105:2: (this_Client_0= ruleClient | this_Database_1= ruleDatabase )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            else if ( (LA11_0==35) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmc.g:1106:3: this_Client_0= ruleClient
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDownloadAccess().getClientParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Client_0=ruleClient();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Client_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmc.g:1115:3: this_Database_1= ruleDatabase
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDownloadAccess().getDatabaseParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Database_1=ruleDatabase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Database_1;
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
    // $ANTLR end "ruleDownload"


    // $ANTLR start "entryRuleDatabase"
    // InternalSmc.g:1127:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalSmc.g:1127:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalSmc.g:1128:2: iv_ruleDatabase= ruleDatabase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatabaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatabase; 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalSmc.g:1134:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'retrieveFromDB' otherlv_1= '(' ( (lv_tbl_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_clm_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_clm_4_0=null;
        Token otherlv_5=null;
        EObject lv_tbl_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1140:2: ( (otherlv_0= 'retrieveFromDB' otherlv_1= '(' ( (lv_tbl_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_clm_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalSmc.g:1141:2: (otherlv_0= 'retrieveFromDB' otherlv_1= '(' ( (lv_tbl_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_clm_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalSmc.g:1141:2: (otherlv_0= 'retrieveFromDB' otherlv_1= '(' ( (lv_tbl_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_clm_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalSmc.g:1142:3: otherlv_0= 'retrieveFromDB' otherlv_1= '(' ( (lv_tbl_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_clm_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getRetrieveFromDBKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDatabaseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:1150:3: ( (lv_tbl_2_0= ruleAtomic ) )
            // InternalSmc.g:1151:4: (lv_tbl_2_0= ruleAtomic )
            {
            // InternalSmc.g:1151:4: (lv_tbl_2_0= ruleAtomic )
            // InternalSmc.g:1152:5: lv_tbl_2_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDatabaseAccess().getTblAtomicParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_tbl_2_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDatabaseRule());
              					}
              					set(
              						current,
              						"tbl",
              						lv_tbl_2_0,
              						"soton.cyber.smcaas.smc.Smc.Atomic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDatabaseAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:1173:3: ( (lv_clm_4_0= RULE_STRING ) )
            // InternalSmc.g:1174:4: (lv_clm_4_0= RULE_STRING )
            {
            // InternalSmc.g:1174:4: (lv_clm_4_0= RULE_STRING )
            // InternalSmc.g:1175:5: lv_clm_4_0= RULE_STRING
            {
            lv_clm_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_clm_4_0, grammarAccess.getDatabaseAccess().getClmSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDatabaseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"clm",
              						lv_clm_4_0,
              						"soton.cyber.smcaas.smc.Smc.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDatabaseAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleClient"
    // InternalSmc.g:1199:1: entryRuleClient returns [EObject current=null] : iv_ruleClient= ruleClient EOF ;
    public final EObject entryRuleClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClient = null;


        try {
            // InternalSmc.g:1199:47: (iv_ruleClient= ruleClient EOF )
            // InternalSmc.g:1200:2: iv_ruleClient= ruleClient EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClientRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClient=ruleClient();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClient; 
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
    // $ANTLR end "entryRuleClient"


    // $ANTLR start "ruleClient"
    // InternalSmc.g:1206:1: ruleClient returns [EObject current=null] : (otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_arg_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmc.g:1212:2: ( (otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalSmc.g:1213:2: (otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalSmc.g:1213:2: (otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalSmc.g:1214:3: otherlv_0= 'retrieveFromClient' otherlv_1= '(' ( (lv_arg_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClientAccess().getRetrieveFromClientKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClientAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:1222:3: ( (lv_arg_2_0= RULE_STRING ) )
            // InternalSmc.g:1223:4: (lv_arg_2_0= RULE_STRING )
            {
            // InternalSmc.g:1223:4: (lv_arg_2_0= RULE_STRING )
            // InternalSmc.g:1224:5: lv_arg_2_0= RULE_STRING
            {
            lv_arg_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_arg_2_0, grammarAccess.getClientAccess().getArgSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClientRule());
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

              			newLeafNode(otherlv_3, grammarAccess.getClientAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleClient"


    // $ANTLR start "entryRuleExpression"
    // InternalSmc.g:1248:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSmc.g:1248:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSmc.g:1249:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSmc.g:1255:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1261:2: (this_Or_0= ruleOr )
            // InternalSmc.g:1262:2: this_Or_0= ruleOr
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
    // InternalSmc.g:1273:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSmc.g:1273:43: (iv_ruleOr= ruleOr EOF )
            // InternalSmc.g:1274:2: iv_ruleOr= ruleOr EOF
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
    // InternalSmc.g:1280:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1286:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSmc.g:1287:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSmc.g:1287:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSmc.g:1288:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1296:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmc.g:1297:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSmc.g:1297:4: ()
            	    // InternalSmc.g:1298:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalSmc.g:1308:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSmc.g:1309:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSmc.g:1309:5: (lv_right_3_0= ruleAnd )
            	    // InternalSmc.g:1310:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSmc.g:1332:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSmc.g:1332:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSmc.g:1333:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSmc.g:1339:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1345:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalSmc.g:1346:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalSmc.g:1346:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalSmc.g:1347:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1355:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSmc.g:1356:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalSmc.g:1356:4: ()
            	    // InternalSmc.g:1357:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalSmc.g:1367:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalSmc.g:1368:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalSmc.g:1368:5: (lv_right_3_0= ruleEquality )
            	    // InternalSmc.g:1369:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalSmc.g:1391:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalSmc.g:1391:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalSmc.g:1392:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalSmc.g:1398:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1404:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalSmc.g:1405:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalSmc.g:1405:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalSmc.g:1406:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1414:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=40 && LA15_0<=41)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmc.g:1415:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalSmc.g:1415:4: ()
            	    // InternalSmc.g:1416:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1422:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalSmc.g:1423:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalSmc.g:1423:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalSmc.g:1424:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalSmc.g:1424:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==40) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==41) ) {
            	        alt14=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalSmc.g:1425:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1436:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_18); if (state.failed) return current;
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

            	    // InternalSmc.g:1449:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalSmc.g:1450:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalSmc.g:1450:5: (lv_right_3_0= ruleComparison )
            	    // InternalSmc.g:1451:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalSmc.g:1473:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalSmc.g:1473:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalSmc.g:1474:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalSmc.g:1480:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalSmc.g:1486:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalSmc.g:1487:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalSmc.g:1487:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalSmc.g:1488:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1496:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=26 && LA17_0<=27)||(LA17_0>=42 && LA17_0<=43)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSmc.g:1497:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalSmc.g:1497:4: ()
            	    // InternalSmc.g:1498:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1504:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalSmc.g:1505:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalSmc.g:1505:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalSmc.g:1506:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalSmc.g:1506:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt16=4;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // InternalSmc.g:1507:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1518:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1529:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1540:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
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

            	    // InternalSmc.g:1553:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalSmc.g:1554:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalSmc.g:1554:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalSmc.g:1555:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalSmc.g:1577:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalSmc.g:1577:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalSmc.g:1578:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalSmc.g:1584:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1590:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) )
            // InternalSmc.g:1591:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            {
            // InternalSmc.g:1591:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            // InternalSmc.g:1592:3: this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1600:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=44 && LA19_0<=45)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSmc.g:1601:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) )
            	    {
            	    // InternalSmc.g:1601:4: ()
            	    // InternalSmc.g:1602:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPlusOrMinusAccess().getPlusOrMinusLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1608:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalSmc.g:1609:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalSmc.g:1609:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalSmc.g:1610:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalSmc.g:1610:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==44) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==45) ) {
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
            	            // InternalSmc.g:1611:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,44,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1622:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,45,FOLLOW_18); if (state.failed) return current;
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

            	    // InternalSmc.g:1635:4: ( (lv_right_3_0= ruleMulOrDiv ) )
            	    // InternalSmc.g:1636:5: (lv_right_3_0= ruleMulOrDiv )
            	    {
            	    // InternalSmc.g:1636:5: (lv_right_3_0= ruleMulOrDiv )
            	    // InternalSmc.g:1637:6: lv_right_3_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalSmc.g:1659:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalSmc.g:1659:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalSmc.g:1660:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalSmc.g:1666:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:1672:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalSmc.g:1673:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalSmc.g:1673:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalSmc.g:1674:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmc.g:1682:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=46 && LA21_0<=47)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSmc.g:1683:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalSmc.g:1683:4: ()
            	    // InternalSmc.g:1684:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSmc.g:1690:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalSmc.g:1691:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalSmc.g:1691:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalSmc.g:1692:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalSmc.g:1692:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==46) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==47) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalSmc.g:1693:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
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
            	            // InternalSmc.g:1704:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
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

            	    // InternalSmc.g:1717:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalSmc.g:1718:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalSmc.g:1718:5: (lv_right_3_0= rulePrimary )
            	    // InternalSmc.g:1719:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    break loop21;
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
    // InternalSmc.g:1741:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSmc.g:1741:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSmc.g:1742:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalSmc.g:1748:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // InternalSmc.g:1754:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalSmc.g:1755:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalSmc.g:1755:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt22=1;
                }
                break;
            case 48:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOLEAN:
            case RULE_DATE:
            case RULE_TIME:
            case 49:
            case 50:
            case 51:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSmc.g:1756:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalSmc.g:1756:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalSmc.g:1757:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
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
                    // InternalSmc.g:1775:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalSmc.g:1775:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalSmc.g:1776:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalSmc.g:1776:4: ()
                    // InternalSmc.g:1777:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalSmc.g:1787:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalSmc.g:1788:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalSmc.g:1788:5: (lv_expression_5_0= rulePrimary )
                    // InternalSmc.g:1789:6: lv_expression_5_0= rulePrimary
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
                    // InternalSmc.g:1808:3: this_Atomic_6= ruleAtomic
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
    // InternalSmc.g:1820:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalSmc.g:1820:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalSmc.g:1821:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalSmc.g:1827:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation ) ;
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
            // InternalSmc.g:1833:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation ) )
            // InternalSmc.g:1834:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation )
            {
            // InternalSmc.g:1834:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation )
            int alt23=11;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalSmc.g:1835:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalSmc.g:1835:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalSmc.g:1836:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalSmc.g:1836:4: ()
                    // InternalSmc.g:1837:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1843:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalSmc.g:1844:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalSmc.g:1844:5: (lv_value_1_0= RULE_INT )
                    // InternalSmc.g:1845:6: lv_value_1_0= RULE_INT
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
                    // InternalSmc.g:1863:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    {
                    // InternalSmc.g:1863:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    // InternalSmc.g:1864:4: () ( (lv_value_3_0= RULE_REAL ) )
                    {
                    // InternalSmc.g:1864:4: ()
                    // InternalSmc.g:1865:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1871:4: ( (lv_value_3_0= RULE_REAL ) )
                    // InternalSmc.g:1872:5: (lv_value_3_0= RULE_REAL )
                    {
                    // InternalSmc.g:1872:5: (lv_value_3_0= RULE_REAL )
                    // InternalSmc.g:1873:6: lv_value_3_0= RULE_REAL
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
                    // InternalSmc.g:1891:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalSmc.g:1891:3: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalSmc.g:1892:4: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalSmc.g:1892:4: ()
                    // InternalSmc.g:1893:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1899:4: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalSmc.g:1900:5: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalSmc.g:1900:5: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalSmc.g:1901:6: lv_value_5_0= RULE_BOOLEAN
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
                    // InternalSmc.g:1919:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalSmc.g:1919:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalSmc.g:1920:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalSmc.g:1920:4: ()
                    // InternalSmc.g:1921:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1927:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalSmc.g:1928:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalSmc.g:1928:5: (lv_value_7_0= RULE_STRING )
                    // InternalSmc.g:1929:6: lv_value_7_0= RULE_STRING
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
                    // InternalSmc.g:1947:3: ( () ( (lv_value_9_0= RULE_DATE ) ) )
                    {
                    // InternalSmc.g:1947:3: ( () ( (lv_value_9_0= RULE_DATE ) ) )
                    // InternalSmc.g:1948:4: () ( (lv_value_9_0= RULE_DATE ) )
                    {
                    // InternalSmc.g:1948:4: ()
                    // InternalSmc.g:1949:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDateLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1955:4: ( (lv_value_9_0= RULE_DATE ) )
                    // InternalSmc.g:1956:5: (lv_value_9_0= RULE_DATE )
                    {
                    // InternalSmc.g:1956:5: (lv_value_9_0= RULE_DATE )
                    // InternalSmc.g:1957:6: lv_value_9_0= RULE_DATE
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
                    // InternalSmc.g:1975:3: ( () ( (lv_value_11_0= RULE_TIME ) ) )
                    {
                    // InternalSmc.g:1975:3: ( () ( (lv_value_11_0= RULE_TIME ) ) )
                    // InternalSmc.g:1976:4: () ( (lv_value_11_0= RULE_TIME ) )
                    {
                    // InternalSmc.g:1976:4: ()
                    // InternalSmc.g:1977:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getTimeLiteralAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:1983:4: ( (lv_value_11_0= RULE_TIME ) )
                    // InternalSmc.g:1984:5: (lv_value_11_0= RULE_TIME )
                    {
                    // InternalSmc.g:1984:5: (lv_value_11_0= RULE_TIME )
                    // InternalSmc.g:1985:6: lv_value_11_0= RULE_TIME
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
                    // InternalSmc.g:2003:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalSmc.g:2003:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalSmc.g:2004:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalSmc.g:2004:4: ()
                    // InternalSmc.g:2005:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmc.g:2011:4: ( (otherlv_13= RULE_ID ) )
                    // InternalSmc.g:2012:5: (otherlv_13= RULE_ID )
                    {
                    // InternalSmc.g:2012:5: (otherlv_13= RULE_ID )
                    // InternalSmc.g:2013:6: otherlv_13= RULE_ID
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
                    // InternalSmc.g:2026:3: this_Tuple_14= ruleTuple
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
                    // InternalSmc.g:2035:3: this_List_15= ruleList
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
                    // InternalSmc.g:2044:3: this_Dict_16= ruleDict
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
                    // InternalSmc.g:2053:3: this_Invocation_17= ruleInvocation
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
    // InternalSmc.g:2065:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalSmc.g:2065:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalSmc.g:2066:2: iv_ruleTuple= ruleTuple EOF
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
    // InternalSmc.g:2072:1: ruleTuple returns [EObject current=null] : (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>' ) ;
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
            // InternalSmc.g:2078:2: ( (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>' ) )
            // InternalSmc.g:2079:2: (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>' )
            {
            // InternalSmc.g:2079:2: (otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>' )
            // InternalSmc.g:2080:3: otherlv_0= 'tuple' otherlv_1= '<' ( (lv_arg1_2_0= ruleAtomic ) ) otherlv_3= ',' ( (lv_arg2_4_0= ruleAtomic ) ) otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLessThanSignKeyword_1());
              		
            }
            // InternalSmc.g:2088:3: ( (lv_arg1_2_0= ruleAtomic ) )
            // InternalSmc.g:2089:4: (lv_arg1_2_0= ruleAtomic )
            {
            // InternalSmc.g:2089:4: (lv_arg1_2_0= ruleAtomic )
            // InternalSmc.g:2090:5: lv_arg1_2_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleAccess().getArg1AtomicParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_arg1_2_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleRule());
              					}
              					set(
              						current,
              						"arg1",
              						lv_arg1_2_0,
              						"soton.cyber.smcaas.smc.Smc.Atomic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:2111:3: ( (lv_arg2_4_0= ruleAtomic ) )
            // InternalSmc.g:2112:4: (lv_arg2_4_0= ruleAtomic )
            {
            // InternalSmc.g:2112:4: (lv_arg2_4_0= ruleAtomic )
            // InternalSmc.g:2113:5: lv_arg2_4_0= ruleAtomic
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
              					set(
              						current,
              						"arg2",
              						lv_arg2_4_0,
              						"soton.cyber.smcaas.smc.Smc.Atomic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:2138:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSmc.g:2138:45: (iv_ruleList= ruleList EOF )
            // InternalSmc.g:2139:2: iv_ruleList= ruleList EOF
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
    // InternalSmc.g:2145:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')' ) ;
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
            // InternalSmc.g:2151:2: ( (otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')' ) )
            // InternalSmc.g:2152:2: (otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')' )
            {
            // InternalSmc.g:2152:2: (otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')' )
            // InternalSmc.g:2153:3: otherlv_0= 'list' otherlv_1= '(' ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2161:3: ( ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )* )
            // InternalSmc.g:2162:4: ( (lv_args_2_0= ruleAtomic ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )*
            {
            // InternalSmc.g:2162:4: ( (lv_args_2_0= ruleAtomic ) )
            // InternalSmc.g:2163:5: (lv_args_2_0= ruleAtomic )
            {
            // InternalSmc.g:2163:5: (lv_args_2_0= ruleAtomic )
            // InternalSmc.g:2164:6: lv_args_2_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getListAccess().getArgsAtomicParserRuleCall_2_0_0());
              					
            }
            pushFollow(FOLLOW_33);
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

            // InternalSmc.g:2181:4: (otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSmc.g:2182:5: otherlv_3= ',' ( (lv_args_4_0= ruleAtomic ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_2_1_0());
            	      				
            	    }
            	    // InternalSmc.g:2186:5: ( (lv_args_4_0= ruleAtomic ) )
            	    // InternalSmc.g:2187:6: (lv_args_4_0= ruleAtomic )
            	    {
            	    // InternalSmc.g:2187:6: (lv_args_4_0= ruleAtomic )
            	    // InternalSmc.g:2188:7: lv_args_4_0= ruleAtomic
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getListAccess().getArgsAtomicParserRuleCall_2_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop24;
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
    // InternalSmc.g:2215:1: entryRuleDict returns [EObject current=null] : iv_ruleDict= ruleDict EOF ;
    public final EObject entryRuleDict() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDict = null;


        try {
            // InternalSmc.g:2215:45: (iv_ruleDict= ruleDict EOF )
            // InternalSmc.g:2216:2: iv_ruleDict= ruleDict EOF
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
    // InternalSmc.g:2222:1: ruleDict returns [EObject current=null] : (otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalSmc.g:2228:2: ( (otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalSmc.g:2229:2: (otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalSmc.g:2229:2: (otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalSmc.g:2230:3: otherlv_0= 'dict' otherlv_1= '(' ( (lv_key_2_0= ruleAtomic ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDictAccess().getDictKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDictAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2238:3: ( (lv_key_2_0= ruleAtomic ) )
            // InternalSmc.g:2239:4: (lv_key_2_0= ruleAtomic )
            {
            // InternalSmc.g:2239:4: (lv_key_2_0= ruleAtomic )
            // InternalSmc.g:2240:5: lv_key_2_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDictAccess().getKeyAtomicParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_key_2_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDictRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_2_0,
              						"soton.cyber.smcaas.smc.Smc.Atomic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDictAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:2261:3: ( (otherlv_4= RULE_ID ) )
            // InternalSmc.g:2262:4: (otherlv_4= RULE_ID )
            {
            // InternalSmc.g:2262:4: (otherlv_4= RULE_ID )
            // InternalSmc.g:2263:5: otherlv_4= RULE_ID
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
    // InternalSmc.g:2282:1: entryRuleInvocation returns [EObject current=null] : iv_ruleInvocation= ruleInvocation EOF ;
    public final EObject entryRuleInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocation = null;


        try {
            // InternalSmc.g:2282:51: (iv_ruleInvocation= ruleInvocation EOF )
            // InternalSmc.g:2283:2: iv_ruleInvocation= ruleInvocation EOF
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
    // InternalSmc.g:2289:1: ruleInvocation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) ) ;
    public final EObject ruleInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_funcName_2_0 = null;



        	enterRule();

        try {
            // InternalSmc.g:2295:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) ) )
            // InternalSmc.g:2296:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) )
            {
            // InternalSmc.g:2296:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) ) )
            // InternalSmc.g:2297:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_funcName_2_0= ruleFunctions ) )
            {
            // InternalSmc.g:2297:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmc.g:2298:4: (otherlv_0= RULE_ID )
            {
            // InternalSmc.g:2298:4: (otherlv_0= RULE_ID )
            // InternalSmc.g:2299:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInvocationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getInvocationAccess().getBlockNameBlockSMCCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvocationAccess().getFullStopKeyword_1());
              		
            }
            // InternalSmc.g:2314:3: ( (lv_funcName_2_0= ruleFunctions ) )
            // InternalSmc.g:2315:4: (lv_funcName_2_0= ruleFunctions )
            {
            // InternalSmc.g:2315:4: (lv_funcName_2_0= ruleFunctions )
            // InternalSmc.g:2316:5: lv_funcName_2_0= ruleFunctions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvocationAccess().getFuncNameFunctionsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleFunctions"
    // InternalSmc.g:2337:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalSmc.g:2337:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalSmc.g:2338:2: iv_ruleFunctions= ruleFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctions=ruleFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctions; 
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
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalSmc.g:2344:1: ruleFunctions returns [EObject current=null] : (this_CreateTable_0= ruleCreateTable | this_CheckTable_1= ruleCheckTable | this_AddValues_2= ruleAddValues | this_BloomFilter_3= ruleBloomFilter | this_Search_4= ruleSearch | this_AccessControl_5= ruleAccessControl | this_Computation_6= ruleComputation ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject this_CreateTable_0 = null;

        EObject this_CheckTable_1 = null;

        EObject this_AddValues_2 = null;

        EObject this_BloomFilter_3 = null;

        EObject this_Search_4 = null;

        EObject this_AccessControl_5 = null;

        EObject this_Computation_6 = null;



        	enterRule();

        try {
            // InternalSmc.g:2350:2: ( (this_CreateTable_0= ruleCreateTable | this_CheckTable_1= ruleCheckTable | this_AddValues_2= ruleAddValues | this_BloomFilter_3= ruleBloomFilter | this_Search_4= ruleSearch | this_AccessControl_5= ruleAccessControl | this_Computation_6= ruleComputation ) )
            // InternalSmc.g:2351:2: (this_CreateTable_0= ruleCreateTable | this_CheckTable_1= ruleCheckTable | this_AddValues_2= ruleAddValues | this_BloomFilter_3= ruleBloomFilter | this_Search_4= ruleSearch | this_AccessControl_5= ruleAccessControl | this_Computation_6= ruleComputation )
            {
            // InternalSmc.g:2351:2: (this_CreateTable_0= ruleCreateTable | this_CheckTable_1= ruleCheckTable | this_AddValues_2= ruleAddValues | this_BloomFilter_3= ruleBloomFilter | this_Search_4= ruleSearch | this_AccessControl_5= ruleAccessControl | this_Computation_6= ruleComputation )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt25=1;
                }
                break;
            case 62:
                {
                alt25=2;
                }
                break;
            case 63:
                {
                alt25=3;
                }
                break;
            case 61:
                {
                alt25=4;
                }
                break;
            case 60:
                {
                alt25=5;
                }
                break;
            case 58:
            case 59:
                {
                alt25=6;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt25=7;
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
                    // InternalSmc.g:2352:3: this_CreateTable_0= ruleCreateTable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionsAccess().getCreateTableParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CreateTable_0=ruleCreateTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CreateTable_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmc.g:2361:3: this_CheckTable_1= ruleCheckTable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionsAccess().getCheckTableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CheckTable_1=ruleCheckTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CheckTable_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSmc.g:2370:3: this_AddValues_2= ruleAddValues
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionsAccess().getAddValuesParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddValues_2=ruleAddValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddValues_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSmc.g:2379:3: this_BloomFilter_3= ruleBloomFilter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionsAccess().getBloomFilterParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BloomFilter_3=ruleBloomFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BloomFilter_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSmc.g:2388:3: this_Search_4= ruleSearch
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionsAccess().getSearchParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Search_4=ruleSearch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Search_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSmc.g:2397:3: this_AccessControl_5= ruleAccessControl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionsAccess().getAccessControlParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AccessControl_5=ruleAccessControl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AccessControl_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSmc.g:2406:3: this_Computation_6= ruleComputation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionsAccess().getComputationParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Computation_6=ruleComputation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Computation_6;
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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleComputation"
    // InternalSmc.g:2418:1: entryRuleComputation returns [EObject current=null] : iv_ruleComputation= ruleComputation EOF ;
    public final EObject entryRuleComputation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputation = null;


        try {
            // InternalSmc.g:2418:52: (iv_ruleComputation= ruleComputation EOF )
            // InternalSmc.g:2419:2: iv_ruleComputation= ruleComputation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComputation=ruleComputation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComputation; 
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
    // $ANTLR end "entryRuleComputation"


    // $ANTLR start "ruleComputation"
    // InternalSmc.g:2425:1: ruleComputation returns [EObject current=null] : (this_Count_0= ruleCount | this_Average_1= ruleAverage | this_WeightedAvg_2= ruleWeightedAvg | this_Median_3= ruleMedian | this_Multiplication_4= ruleMultiplication ) ;
    public final EObject ruleComputation() throws RecognitionException {
        EObject current = null;

        EObject this_Count_0 = null;

        EObject this_Average_1 = null;

        EObject this_WeightedAvg_2 = null;

        EObject this_Median_3 = null;

        EObject this_Multiplication_4 = null;



        	enterRule();

        try {
            // InternalSmc.g:2431:2: ( (this_Count_0= ruleCount | this_Average_1= ruleAverage | this_WeightedAvg_2= ruleWeightedAvg | this_Median_3= ruleMedian | this_Multiplication_4= ruleMultiplication ) )
            // InternalSmc.g:2432:2: (this_Count_0= ruleCount | this_Average_1= ruleAverage | this_WeightedAvg_2= ruleWeightedAvg | this_Median_3= ruleMedian | this_Multiplication_4= ruleMultiplication )
            {
            // InternalSmc.g:2432:2: (this_Count_0= ruleCount | this_Average_1= ruleAverage | this_WeightedAvg_2= ruleWeightedAvg | this_Median_3= ruleMedian | this_Multiplication_4= ruleMultiplication )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt26=1;
                }
                break;
            case 56:
                {
                alt26=2;
                }
                break;
            case 55:
                {
                alt26=3;
                }
                break;
            case 54:
                {
                alt26=4;
                }
                break;
            case 53:
                {
                alt26=5;
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
                    // InternalSmc.g:2433:3: this_Count_0= ruleCount
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComputationAccess().getCountParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Count_0=ruleCount();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Count_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmc.g:2442:3: this_Average_1= ruleAverage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComputationAccess().getAverageParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Average_1=ruleAverage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Average_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSmc.g:2451:3: this_WeightedAvg_2= ruleWeightedAvg
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComputationAccess().getWeightedAvgParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WeightedAvg_2=ruleWeightedAvg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WeightedAvg_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSmc.g:2460:3: this_Median_3= ruleMedian
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComputationAccess().getMedianParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Median_3=ruleMedian();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Median_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSmc.g:2469:3: this_Multiplication_4= ruleMultiplication
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComputationAccess().getMultiplicationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Multiplication_4=ruleMultiplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Multiplication_4;
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
    // $ANTLR end "ruleComputation"


    // $ANTLR start "entryRuleMultiplication"
    // InternalSmc.g:2481:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalSmc.g:2481:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalSmc.g:2482:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalSmc.g:2488:1: ruleMultiplication returns [EObject current=null] : (otherlv_0= 'multiplication' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSmc.g:2494:2: ( (otherlv_0= 'multiplication' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalSmc.g:2495:2: (otherlv_0= 'multiplication' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalSmc.g:2495:2: (otherlv_0= 'multiplication' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalSmc.g:2496:3: otherlv_0= 'multiplication' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getMultiplicationKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2504:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:2505:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:2505:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:2506:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultiplicationRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getXVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMultiplicationAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:2521:3: ( (otherlv_4= RULE_ID ) )
            // InternalSmc.g:2522:4: (otherlv_4= RULE_ID )
            {
            // InternalSmc.g:2522:4: (otherlv_4= RULE_ID )
            // InternalSmc.g:2523:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultiplicationRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getYVariableDeclCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleMedian"
    // InternalSmc.g:2542:1: entryRuleMedian returns [EObject current=null] : iv_ruleMedian= ruleMedian EOF ;
    public final EObject entryRuleMedian() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedian = null;


        try {
            // InternalSmc.g:2542:47: (iv_ruleMedian= ruleMedian EOF )
            // InternalSmc.g:2543:2: iv_ruleMedian= ruleMedian EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMedianRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMedian=ruleMedian();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMedian; 
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
    // $ANTLR end "entryRuleMedian"


    // $ANTLR start "ruleMedian"
    // InternalSmc.g:2549:1: ruleMedian returns [EObject current=null] : (otherlv_0= 'median' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleMedian() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmc.g:2555:2: ( (otherlv_0= 'median' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSmc.g:2556:2: (otherlv_0= 'median' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSmc.g:2556:2: (otherlv_0= 'median' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSmc.g:2557:3: otherlv_0= 'median' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMedianAccess().getMedianKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMedianAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2565:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:2566:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:2566:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:2567:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMedianRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMedianAccess().getArrayVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMedianAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleMedian"


    // $ANTLR start "entryRuleWeightedAvg"
    // InternalSmc.g:2586:1: entryRuleWeightedAvg returns [EObject current=null] : iv_ruleWeightedAvg= ruleWeightedAvg EOF ;
    public final EObject entryRuleWeightedAvg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeightedAvg = null;


        try {
            // InternalSmc.g:2586:52: (iv_ruleWeightedAvg= ruleWeightedAvg EOF )
            // InternalSmc.g:2587:2: iv_ruleWeightedAvg= ruleWeightedAvg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWeightedAvgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWeightedAvg=ruleWeightedAvg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWeightedAvg; 
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
    // $ANTLR end "entryRuleWeightedAvg"


    // $ANTLR start "ruleWeightedAvg"
    // InternalSmc.g:2593:1: ruleWeightedAvg returns [EObject current=null] : (otherlv_0= 'w_avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleWeightedAvg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSmc.g:2599:2: ( (otherlv_0= 'w_avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalSmc.g:2600:2: (otherlv_0= 'w_avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalSmc.g:2600:2: (otherlv_0= 'w_avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalSmc.g:2601:3: otherlv_0= 'w_avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWeightedAvgAccess().getW_avgKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWeightedAvgAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2609:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:2610:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:2610:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:2611:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWeightedAvgRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getWeightedAvgAccess().getWeightsVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWeightedAvgAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:2626:3: ( (otherlv_4= RULE_ID ) )
            // InternalSmc.g:2627:4: (otherlv_4= RULE_ID )
            {
            // InternalSmc.g:2627:4: (otherlv_4= RULE_ID )
            // InternalSmc.g:2628:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWeightedAvgRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getWeightedAvgAccess().getElemsVariableDeclCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getWeightedAvgAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleWeightedAvg"


    // $ANTLR start "entryRuleAverage"
    // InternalSmc.g:2647:1: entryRuleAverage returns [EObject current=null] : iv_ruleAverage= ruleAverage EOF ;
    public final EObject entryRuleAverage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverage = null;


        try {
            // InternalSmc.g:2647:48: (iv_ruleAverage= ruleAverage EOF )
            // InternalSmc.g:2648:2: iv_ruleAverage= ruleAverage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAverage=ruleAverage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverage; 
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
    // $ANTLR end "entryRuleAverage"


    // $ANTLR start "ruleAverage"
    // InternalSmc.g:2654:1: ruleAverage returns [EObject current=null] : (otherlv_0= 'avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleAverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmc.g:2660:2: ( (otherlv_0= 'avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSmc.g:2661:2: (otherlv_0= 'avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSmc.g:2661:2: (otherlv_0= 'avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSmc.g:2662:3: otherlv_0= 'avg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAverageAccess().getAvgKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAverageAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2670:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:2671:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:2671:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:2672:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAverageRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getAverageAccess().getArrayVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAverageAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleAverage"


    // $ANTLR start "entryRuleCount"
    // InternalSmc.g:2691:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalSmc.g:2691:46: (iv_ruleCount= ruleCount EOF )
            // InternalSmc.g:2692:2: iv_ruleCount= ruleCount EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCount=ruleCount();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCount; 
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
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalSmc.g:2698:1: ruleCount returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmc.g:2704:2: ( (otherlv_0= 'count' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSmc.g:2705:2: (otherlv_0= 'count' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSmc.g:2705:2: (otherlv_0= 'count' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSmc.g:2706:3: otherlv_0= 'count' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCountAccess().getCountKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCountAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2714:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:2715:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:2715:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:2716:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCountRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getCountAccess().getArrayVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCountAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleAccessControl"
    // InternalSmc.g:2735:1: entryRuleAccessControl returns [EObject current=null] : iv_ruleAccessControl= ruleAccessControl EOF ;
    public final EObject entryRuleAccessControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessControl = null;


        try {
            // InternalSmc.g:2735:54: (iv_ruleAccessControl= ruleAccessControl EOF )
            // InternalSmc.g:2736:2: iv_ruleAccessControl= ruleAccessControl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessControlRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAccessControl=ruleAccessControl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessControl; 
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
    // $ANTLR end "entryRuleAccessControl"


    // $ANTLR start "ruleAccessControl"
    // InternalSmc.g:2742:1: ruleAccessControl returns [EObject current=null] : (this_Covered_0= ruleCovered | this_BellLapadula_1= ruleBellLapadula ) ;
    public final EObject ruleAccessControl() throws RecognitionException {
        EObject current = null;

        EObject this_Covered_0 = null;

        EObject this_BellLapadula_1 = null;



        	enterRule();

        try {
            // InternalSmc.g:2748:2: ( (this_Covered_0= ruleCovered | this_BellLapadula_1= ruleBellLapadula ) )
            // InternalSmc.g:2749:2: (this_Covered_0= ruleCovered | this_BellLapadula_1= ruleBellLapadula )
            {
            // InternalSmc.g:2749:2: (this_Covered_0= ruleCovered | this_BellLapadula_1= ruleBellLapadula )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==59) ) {
                alt27=1;
            }
            else if ( (LA27_0==58) ) {
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
                    // InternalSmc.g:2750:3: this_Covered_0= ruleCovered
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAccessControlAccess().getCoveredParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Covered_0=ruleCovered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Covered_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmc.g:2759:3: this_BellLapadula_1= ruleBellLapadula
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAccessControlAccess().getBellLapadulaParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BellLapadula_1=ruleBellLapadula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BellLapadula_1;
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
    // $ANTLR end "ruleAccessControl"


    // $ANTLR start "entryRuleBellLapadula"
    // InternalSmc.g:2771:1: entryRuleBellLapadula returns [EObject current=null] : iv_ruleBellLapadula= ruleBellLapadula EOF ;
    public final EObject entryRuleBellLapadula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBellLapadula = null;


        try {
            // InternalSmc.g:2771:53: (iv_ruleBellLapadula= ruleBellLapadula EOF )
            // InternalSmc.g:2772:2: iv_ruleBellLapadula= ruleBellLapadula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBellLapadulaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBellLapadula=ruleBellLapadula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBellLapadula; 
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
    // $ANTLR end "entryRuleBellLapadula"


    // $ANTLR start "ruleBellLapadula"
    // InternalSmc.g:2778:1: ruleBellLapadula returns [EObject current=null] : (otherlv_0= 'accessControlBLP' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )? ( (lv_mode_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
    public final EObject ruleBellLapadula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_mode_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSmc.g:2784:2: ( (otherlv_0= 'accessControlBLP' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )? ( (lv_mode_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalSmc.g:2785:2: (otherlv_0= 'accessControlBLP' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )? ( (lv_mode_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalSmc.g:2785:2: (otherlv_0= 'accessControlBLP' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )? ( (lv_mode_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalSmc.g:2786:3: otherlv_0= 'accessControlBLP' otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )? ( (lv_mode_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBellLapadulaAccess().getAccessControlBLPKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBellLapadulaAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2794:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSmc.g:2795:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= ','
                    {
                    // InternalSmc.g:2795:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSmc.g:2796:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSmc.g:2796:5: (otherlv_2= RULE_ID )
                    // InternalSmc.g:2797:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBellLapadulaRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getBellLapadulaAccess().getCurVariableDeclCrossReference_2_0_0());
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getBellLapadulaAccess().getCommaKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSmc.g:2813:3: ( (lv_mode_4_0= RULE_STRING ) )
            // InternalSmc.g:2814:4: (lv_mode_4_0= RULE_STRING )
            {
            // InternalSmc.g:2814:4: (lv_mode_4_0= RULE_STRING )
            // InternalSmc.g:2815:5: lv_mode_4_0= RULE_STRING
            {
            lv_mode_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_mode_4_0, grammarAccess.getBellLapadulaAccess().getModeSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBellLapadulaRule());
              					}
              					setWithLastConsumed(
              						current,
              						"mode",
              						lv_mode_4_0,
              						"soton.cyber.smcaas.smc.Smc.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBellLapadulaAccess().getCommaKeyword_4());
              		
            }
            // InternalSmc.g:2835:3: ( (otherlv_6= RULE_ID ) )
            // InternalSmc.g:2836:4: (otherlv_6= RULE_ID )
            {
            // InternalSmc.g:2836:4: (otherlv_6= RULE_ID )
            // InternalSmc.g:2837:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBellLapadulaRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getBellLapadulaAccess().getC_lvlsVariableDeclCrossReference_5_0());
              				
            }

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getBellLapadulaAccess().getCommaKeyword_6());
              		
            }
            // InternalSmc.g:2852:3: ( (otherlv_8= RULE_ID ) )
            // InternalSmc.g:2853:4: (otherlv_8= RULE_ID )
            {
            // InternalSmc.g:2853:4: (otherlv_8= RULE_ID )
            // InternalSmc.g:2854:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBellLapadulaRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getBellLapadulaAccess().getV_lvlVariableDeclCrossReference_7_0());
              				
            }

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getBellLapadulaAccess().getRightParenthesisKeyword_8());
              		
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
    // $ANTLR end "ruleBellLapadula"


    // $ANTLR start "entryRuleCovered"
    // InternalSmc.g:2873:1: entryRuleCovered returns [EObject current=null] : iv_ruleCovered= ruleCovered EOF ;
    public final EObject entryRuleCovered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCovered = null;


        try {
            // InternalSmc.g:2873:48: (iv_ruleCovered= ruleCovered EOF )
            // InternalSmc.g:2874:2: iv_ruleCovered= ruleCovered EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoveredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCovered=ruleCovered();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCovered; 
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
    // $ANTLR end "entryRuleCovered"


    // $ANTLR start "ruleCovered"
    // InternalSmc.g:2880:1: ruleCovered returns [EObject current=null] : (otherlv_0= 'accessControlCovered' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
    public final EObject ruleCovered() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSmc.g:2886:2: ( (otherlv_0= 'accessControlCovered' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalSmc.g:2887:2: (otherlv_0= 'accessControlCovered' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalSmc.g:2887:2: (otherlv_0= 'accessControlCovered' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalSmc.g:2888:3: otherlv_0= 'accessControlCovered' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCoveredAccess().getAccessControlCoveredKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCoveredAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2896:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:2897:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:2897:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:2898:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCoveredRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getCoveredAccess().getMatchVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCoveredAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:2913:3: ( (otherlv_4= RULE_ID ) )
            // InternalSmc.g:2914:4: (otherlv_4= RULE_ID )
            {
            // InternalSmc.g:2914:4: (otherlv_4= RULE_ID )
            // InternalSmc.g:2915:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCoveredRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getCoveredAccess().getCoveredVariableDeclCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCoveredAccess().getCommaKeyword_5());
              		
            }
            // InternalSmc.g:2930:3: ( (otherlv_6= RULE_ID ) )
            // InternalSmc.g:2931:4: (otherlv_6= RULE_ID )
            {
            // InternalSmc.g:2931:4: (otherlv_6= RULE_ID )
            // InternalSmc.g:2932:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCoveredRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getCoveredAccess().getC_lvlsVariableDeclCrossReference_6_0());
              				
            }

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCoveredAccess().getCommaKeyword_7());
              		
            }
            // InternalSmc.g:2947:3: ( (otherlv_8= RULE_ID ) )
            // InternalSmc.g:2948:4: (otherlv_8= RULE_ID )
            {
            // InternalSmc.g:2948:4: (otherlv_8= RULE_ID )
            // InternalSmc.g:2949:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCoveredRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getCoveredAccess().getV_lvlVariableDeclCrossReference_8_0());
              				
            }

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getCoveredAccess().getRightParenthesisKeyword_9());
              		
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
    // $ANTLR end "ruleCovered"


    // $ANTLR start "entryRuleSearch"
    // InternalSmc.g:2968:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // InternalSmc.g:2968:47: (iv_ruleSearch= ruleSearch EOF )
            // InternalSmc.g:2969:2: iv_ruleSearch= ruleSearch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSearchRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSearch=ruleSearch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSearch; 
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
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalSmc.g:2975:1: ruleSearch returns [EObject current=null] : (otherlv_0= 'search' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_column_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSmc.g:2981:2: ( (otherlv_0= 'search' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalSmc.g:2982:2: (otherlv_0= 'search' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalSmc.g:2982:2: (otherlv_0= 'search' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalSmc.g:2983:3: otherlv_0= 'search' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSearchAccess().getSearchKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSearchAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:2991:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:2992:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:2992:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:2993:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSearchRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getSearchAccess().getTblnameVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSearchAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:3008:3: ( (lv_column_4_0= RULE_STRING ) )
            // InternalSmc.g:3009:4: (lv_column_4_0= RULE_STRING )
            {
            // InternalSmc.g:3009:4: (lv_column_4_0= RULE_STRING )
            // InternalSmc.g:3010:5: lv_column_4_0= RULE_STRING
            {
            lv_column_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_column_4_0, grammarAccess.getSearchAccess().getColumnSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSearchRule());
              					}
              					setWithLastConsumed(
              						current,
              						"column",
              						lv_column_4_0,
              						"soton.cyber.smcaas.smc.Smc.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSearchAccess().getCommaKeyword_5());
              		
            }
            // InternalSmc.g:3030:3: ( (otherlv_6= RULE_ID ) )
            // InternalSmc.g:3031:4: (otherlv_6= RULE_ID )
            {
            // InternalSmc.g:3031:4: (otherlv_6= RULE_ID )
            // InternalSmc.g:3032:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSearchRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getSearchAccess().getKeywordVariableDeclCrossReference_6_0());
              				
            }

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getSearchAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleBloomFilter"
    // InternalSmc.g:3051:1: entryRuleBloomFilter returns [EObject current=null] : iv_ruleBloomFilter= ruleBloomFilter EOF ;
    public final EObject entryRuleBloomFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloomFilter = null;


        try {
            // InternalSmc.g:3051:52: (iv_ruleBloomFilter= ruleBloomFilter EOF )
            // InternalSmc.g:3052:2: iv_ruleBloomFilter= ruleBloomFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBloomFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBloomFilter=ruleBloomFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBloomFilter; 
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
    // $ANTLR end "entryRuleBloomFilter"


    // $ANTLR start "ruleBloomFilter"
    // InternalSmc.g:3058:1: ruleBloomFilter returns [EObject current=null] : (otherlv_0= 'bloomFilter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleBloomFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSmc.g:3064:2: ( (otherlv_0= 'bloomFilter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalSmc.g:3065:2: (otherlv_0= 'bloomFilter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalSmc.g:3065:2: (otherlv_0= 'bloomFilter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalSmc.g:3066:3: otherlv_0= 'bloomFilter' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBloomFilterAccess().getBloomFilterKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBloomFilterAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:3074:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:3075:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:3075:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:3076:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBloomFilterRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getBloomFilterAccess().getPreVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBloomFilterAccess().getCommaKeyword_3());
              		
            }
            // InternalSmc.g:3091:3: ( (otherlv_4= RULE_ID ) )
            // InternalSmc.g:3092:4: (otherlv_4= RULE_ID )
            {
            // InternalSmc.g:3092:4: (otherlv_4= RULE_ID )
            // InternalSmc.g:3093:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBloomFilterRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getBloomFilterAccess().getPostVariableDeclCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBloomFilterAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleBloomFilter"


    // $ANTLR start "entryRuleCheckTable"
    // InternalSmc.g:3112:1: entryRuleCheckTable returns [EObject current=null] : iv_ruleCheckTable= ruleCheckTable EOF ;
    public final EObject entryRuleCheckTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTable = null;


        try {
            // InternalSmc.g:3112:51: (iv_ruleCheckTable= ruleCheckTable EOF )
            // InternalSmc.g:3113:2: iv_ruleCheckTable= ruleCheckTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCheckTable=ruleCheckTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTable; 
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
    // $ANTLR end "entryRuleCheckTable"


    // $ANTLR start "ruleCheckTable"
    // InternalSmc.g:3119:1: ruleCheckTable returns [EObject current=null] : (otherlv_0= 'checkDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleCheckTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmc.g:3125:2: ( (otherlv_0= 'checkDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalSmc.g:3126:2: (otherlv_0= 'checkDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalSmc.g:3126:2: (otherlv_0= 'checkDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalSmc.g:3127:3: otherlv_0= 'checkDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCheckTableAccess().getCheckDatasetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCheckTableAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:3135:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:3136:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:3136:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:3137:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCheckTableRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getCheckTableAccess().getTblnameVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCheckTableAccess().getRightParenthesisKeyword_3());
              		
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
    // $ANTLR end "ruleCheckTable"


    // $ANTLR start "entryRuleAddValues"
    // InternalSmc.g:3156:1: entryRuleAddValues returns [EObject current=null] : iv_ruleAddValues= ruleAddValues EOF ;
    public final EObject entryRuleAddValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddValues = null;


        try {
            // InternalSmc.g:3156:50: (iv_ruleAddValues= ruleAddValues EOF )
            // InternalSmc.g:3157:2: iv_ruleAddValues= ruleAddValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddValuesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddValues=ruleAddValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddValues; 
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
    // $ANTLR end "entryRuleAddValues"


    // $ANTLR start "ruleAddValues"
    // InternalSmc.g:3163:1: ruleAddValues returns [EObject current=null] : (otherlv_0= 'addValues' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')' ) ;
    public final EObject ruleAddValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSmc.g:3169:2: ( (otherlv_0= 'addValues' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')' ) )
            // InternalSmc.g:3170:2: (otherlv_0= 'addValues' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')' )
            {
            // InternalSmc.g:3170:2: (otherlv_0= 'addValues' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')' )
            // InternalSmc.g:3171:3: otherlv_0= 'addValues' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddValuesAccess().getAddValuesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddValuesAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:3179:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:3180:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:3180:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:3181:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddValuesRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getAddValuesAccess().getTblnameVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            // InternalSmc.g:3192:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==36) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSmc.g:3193:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getAddValuesAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalSmc.g:3197:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSmc.g:3198:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSmc.g:3198:5: (otherlv_4= RULE_ID )
            	    // InternalSmc.g:3199:6: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAddValuesRule());
            	      						}
            	      					
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_4, grammarAccess.getAddValuesAccess().getArgsVariableDeclCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }

            	    // InternalSmc.g:3210:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==36) ) {
            	            int LA29_2 = input.LA(2);

            	            if ( (LA29_2==RULE_ID) ) {
            	                alt29=1;
            	            }


            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalSmc.g:3211:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_5, grammarAccess.getAddValuesAccess().getCommaKeyword_3_2_0());
            	    	      				
            	    	    }
            	    	    // InternalSmc.g:3215:5: ( (otherlv_6= RULE_ID ) )
            	    	    // InternalSmc.g:3216:6: (otherlv_6= RULE_ID )
            	    	    {
            	    	    // InternalSmc.g:3216:6: (otherlv_6= RULE_ID )
            	    	    // InternalSmc.g:3217:7: otherlv_6= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElement(grammarAccess.getAddValuesRule());
            	    	      							}
            	    	      						
            	    	    }
            	    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							newLeafNode(otherlv_6, grammarAccess.getAddValuesAccess().getArgsVariableDeclCrossReference_3_2_1_0());
            	    	      						
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAddValuesAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleAddValues"


    // $ANTLR start "entryRuleCreateTable"
    // InternalSmc.g:3238:1: entryRuleCreateTable returns [EObject current=null] : iv_ruleCreateTable= ruleCreateTable EOF ;
    public final EObject entryRuleCreateTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTable = null;


        try {
            // InternalSmc.g:3238:52: (iv_ruleCreateTable= ruleCreateTable EOF )
            // InternalSmc.g:3239:2: iv_ruleCreateTable= ruleCreateTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCreateTable=ruleCreateTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTable; 
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
    // $ANTLR end "entryRuleCreateTable"


    // $ANTLR start "ruleCreateTable"
    // InternalSmc.g:3245:1: ruleCreateTable returns [EObject current=null] : (otherlv_0= 'createDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')' ) ;
    public final EObject ruleCreateTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSmc.g:3251:2: ( (otherlv_0= 'createDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')' ) )
            // InternalSmc.g:3252:2: (otherlv_0= 'createDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')' )
            {
            // InternalSmc.g:3252:2: (otherlv_0= 'createDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')' )
            // InternalSmc.g:3253:3: otherlv_0= 'createDataset' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+ otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCreateTableAccess().getCreateDatasetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCreateTableAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmc.g:3261:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmc.g:3262:4: (otherlv_2= RULE_ID )
            {
            // InternalSmc.g:3262:4: (otherlv_2= RULE_ID )
            // InternalSmc.g:3263:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCreateTableRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getCreateTableAccess().getTblnameVariableDeclCrossReference_2_0());
              				
            }

            }


            }

            // InternalSmc.g:3274:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSmc.g:3275:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getCreateTableAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalSmc.g:3279:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSmc.g:3280:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSmc.g:3280:5: (otherlv_4= RULE_ID )
            	    // InternalSmc.g:3281:6: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getCreateTableRule());
            	      						}
            	      					
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_4, grammarAccess.getCreateTableAccess().getParamsParamDeclCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }

            	    // InternalSmc.g:3292:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==36) ) {
            	            int LA31_2 = input.LA(2);

            	            if ( (LA31_2==RULE_ID) ) {
            	                alt31=1;
            	            }


            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalSmc.g:3293:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_5, grammarAccess.getCreateTableAccess().getCommaKeyword_3_2_0());
            	    	      				
            	    	    }
            	    	    // InternalSmc.g:3297:5: ( (otherlv_6= RULE_ID ) )
            	    	    // InternalSmc.g:3298:6: (otherlv_6= RULE_ID )
            	    	    {
            	    	    // InternalSmc.g:3298:6: (otherlv_6= RULE_ID )
            	    	    // InternalSmc.g:3299:7: otherlv_6= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElement(grammarAccess.getCreateTableRule());
            	    	      							}
            	    	      						
            	    	    }
            	    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							newLeafNode(otherlv_6, grammarAccess.getCreateTableAccess().getParamsParamDeclCrossReference_3_2_1_0());
            	    	      						
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCreateTableAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleCreateTable"


    // $ANTLR start "ruleBlockType"
    // InternalSmc.g:3320:1: ruleBlockType returns [Enumerator current=null] : ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) ) ;
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
            // InternalSmc.g:3326:2: ( ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) ) )
            // InternalSmc.g:3327:2: ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) )
            {
            // InternalSmc.g:3327:2: ( (enumLiteral_0= 'insert_data' ) | (enumLiteral_1= 'math_computation' ) | (enumLiteral_2= 'search' ) | (enumLiteral_3= 'anonymization' ) | (enumLiteral_4= 'access_control' ) | (enumLiteral_5= 'permission_release' ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt33=1;
                }
                break;
            case 66:
                {
                alt33=2;
                }
                break;
            case 60:
                {
                alt33=3;
                }
                break;
            case 67:
                {
                alt33=4;
                }
                break;
            case 68:
                {
                alt33=5;
                }
                break;
            case 69:
                {
                alt33=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSmc.g:3328:3: (enumLiteral_0= 'insert_data' )
                    {
                    // InternalSmc.g:3328:3: (enumLiteral_0= 'insert_data' )
                    // InternalSmc.g:3329:4: enumLiteral_0= 'insert_data'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getINSERTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBlockTypeAccess().getINSERTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:3336:3: (enumLiteral_1= 'math_computation' )
                    {
                    // InternalSmc.g:3336:3: (enumLiteral_1= 'math_computation' )
                    // InternalSmc.g:3337:4: enumLiteral_1= 'math_computation'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getCOMPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBlockTypeAccess().getCOMPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:3344:3: (enumLiteral_2= 'search' )
                    {
                    // InternalSmc.g:3344:3: (enumLiteral_2= 'search' )
                    // InternalSmc.g:3345:4: enumLiteral_2= 'search'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getSEARCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBlockTypeAccess().getSEARCHEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:3352:3: (enumLiteral_3= 'anonymization' )
                    {
                    // InternalSmc.g:3352:3: (enumLiteral_3= 'anonymization' )
                    // InternalSmc.g:3353:4: enumLiteral_3= 'anonymization'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getANONYMIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBlockTypeAccess().getANONYMIZATIONEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmc.g:3360:3: (enumLiteral_4= 'access_control' )
                    {
                    // InternalSmc.g:3360:3: (enumLiteral_4= 'access_control' )
                    // InternalSmc.g:3361:4: enumLiteral_4= 'access_control'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBlockTypeAccess().getACCESSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBlockTypeAccess().getACCESSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmc.g:3368:3: (enumLiteral_5= 'permission_release' )
                    {
                    // InternalSmc.g:3368:3: (enumLiteral_5= 'permission_release' )
                    // InternalSmc.g:3369:4: enumLiteral_5= 'permission_release'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:3379:1: ruleSecType returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleSecType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmc.g:3385:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalSmc.g:3386:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalSmc.g:3386:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==70) ) {
                alt34=1;
            }
            else if ( (LA34_0==71) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSmc.g:3387:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSmc.g:3387:3: (enumLiteral_0= 'public' )
                    // InternalSmc.g:3388:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getSecTypeAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getSecTypeAccess().getPUBLICEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:3395:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSmc.g:3395:3: (enumLiteral_1= 'private' )
                    // InternalSmc.g:3396:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
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
    // InternalSmc.g:3406:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= 'ENCRYPTED' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSmc.g:3412:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= 'ENCRYPTED' ) ) )
            // InternalSmc.g:3413:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= 'ENCRYPTED' ) )
            {
            // InternalSmc.g:3413:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'BOOLEAN' ) | (enumLiteral_3= 'STRING' ) | (enumLiteral_4= 'ENCRYPTED' ) )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt35=1;
                }
                break;
            case 73:
                {
                alt35=2;
                }
                break;
            case 74:
                {
                alt35=3;
                }
                break;
            case 75:
                {
                alt35=4;
                }
                break;
            case 76:
                {
                alt35=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSmc.g:3414:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalSmc.g:3414:3: (enumLiteral_0= 'INT' )
                    // InternalSmc.g:3415:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSmc.g:3422:3: (enumLiteral_1= 'DOUBLE' )
                    {
                    // InternalSmc.g:3422:3: (enumLiteral_1= 'DOUBLE' )
                    // InternalSmc.g:3423:4: enumLiteral_1= 'DOUBLE'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSmc.g:3430:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalSmc.g:3430:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalSmc.g:3431:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmc.g:3438:3: (enumLiteral_3= 'STRING' )
                    {
                    // InternalSmc.g:3438:3: (enumLiteral_3= 'STRING' )
                    // InternalSmc.g:3439:4: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmc.g:3446:3: (enumLiteral_4= 'ENCRYPTED' )
                    {
                    // InternalSmc.g:3446:3: (enumLiteral_4= 'ENCRYPTED' )
                    // InternalSmc.g:3447:4: enumLiteral_4= 'ENCRYPTED'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSmc
    public final void synpred1_InternalSmc_fragment() throws RecognitionException {   
        // InternalSmc.g:820:5: ( 'else' )
        // InternalSmc.g:820:6: 'else'
        {
        match(input,31,FOLLOW_2); if (state.failed) return ;

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
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\20\7\uffff";
    static final String dfa_3s = "\1\40\2\uffff\1\64\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\10\1\11\1\7\1\3";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\21\uffff\1\1\1\uffff\1\10\1\7\2\uffff\1\6\1\5\1\4\1\uffff\1\2",
            "",
            "",
            "\1\12\43\uffff\1\11",
            "",
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
            return "303:2: (this_Block_0= ruleBlock | this_VariableDecl_1= ruleVariableDecl | this_VariableAssignment_2= ruleVariableAssignment | this_IfThenElse_3= ruleIfThenElse | this_While_4= ruleWhile | this_Print_5= rulePrint | this_InvocationVoid_6= ruleInvocationVoid | this_ParamDecl_7= ruleParamDecl | this_Return_8= ruleReturn )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\7\uffff\1\13\5\uffff";
    static final String dfa_9s = "\1\4\6\uffff\1\23\5\uffff";
    static final String dfa_10s = "\1\63\6\uffff\1\64\5\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\7\1\13";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\7\1\4\1\1\1\2\1\3\1\5\1\6\46\uffff\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\13\5\uffff\2\13\10\uffff\1\13\1\uffff\12\13\4\uffff\1\14",
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

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1834:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_DATE ) ) ) | ( () ( (lv_value_11_0= RULE_TIME ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_Tuple_14= ruleTuple | this_List_15= ruleList | this_Dict_16= ruleDict | this_Invocation_17= ruleInvocation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000173C00010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001F00L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000F0000000407F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000173400010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000F0028000407F0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000C000C000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xFFE0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000030L});

}
