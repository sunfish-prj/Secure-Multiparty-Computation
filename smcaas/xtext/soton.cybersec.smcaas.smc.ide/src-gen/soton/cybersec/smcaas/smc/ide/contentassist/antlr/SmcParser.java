/*
 * generated by Xtext 2.12.0
 */
package soton.cybersec.smcaas.smc.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import soton.cybersec.smcaas.smc.ide.contentassist.antlr.internal.InternalSmcParser;
import soton.cybersec.smcaas.smc.services.SmcGrammarAccess;

public class SmcParser extends AbstractContentAssistParser {

	@Inject
	private SmcGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSmcParser createParser() {
		InternalSmcParser result = new InternalSmcParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
					put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
					put(grammarAccess.getPlusOrMinusAccess().getOpAlternatives_1_1_0(), "rule__PlusOrMinus__OpAlternatives_1_1_0");
					put(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0(), "rule__MulOrDiv__OpAlternatives_1_1_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getBlockTypeAccess().getAlternatives(), "rule__BlockType__Alternatives");
					put(grammarAccess.getSecTypeAccess().getAlternatives(), "rule__SecType__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
					put(grammarAccess.getBlockSMCAccess().getGroup(), "rule__BlockSMC__Group__0");
					put(grammarAccess.getBlockSMCAccess().getGroup_6(), "rule__BlockSMC__Group_6__0");
					put(grammarAccess.getBlockSMCAccess().getGroup_6_1(), "rule__BlockSMC__Group_6_1__0");
					put(grammarAccess.getMainSMCAccess().getGroup(), "rule__MainSMC__Group__0");
					put(grammarAccess.getInvocationVoidAccess().getGroup(), "rule__InvocationVoid__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getIfThenElseAccess().getGroup(), "rule__IfThenElse__Group__0");
					put(grammarAccess.getIfThenElseAccess().getGroup_5(), "rule__IfThenElse__Group_5__0");
					put(grammarAccess.getVariableDeclAccess().getGroup(), "rule__VariableDecl__Group__0");
					put(grammarAccess.getVariableDeclAccess().getGroup_5(), "rule__VariableDecl__Group_5__0");
					put(grammarAccess.getVariableAssignmentAccess().getGroup(), "rule__VariableAssignment__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
					put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
					put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
					put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
					put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
					put(grammarAccess.getAtomicAccess().getGroup_5(), "rule__Atomic__Group_5__0");
					put(grammarAccess.getAtomicAccess().getGroup_6(), "rule__Atomic__Group_6__0");
					put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
					put(grammarAccess.getListAccess().getGroup_1(), "rule__List__Group_1__0");
					put(grammarAccess.getListAccess().getGroup_1_1(), "rule__List__Group_1_1__0");
					put(grammarAccess.getInvocationAccess().getGroup(), "rule__Invocation__Group__0");
					put(grammarAccess.getInvocationAccess().getGroup_4(), "rule__Invocation__Group_4__0");
					put(grammarAccess.getInvocationAccess().getGroup_4_1(), "rule__Invocation__Group_4_1__0");
					put(grammarAccess.getSmcAccess().getBlocksAssignment_0(), "rule__Smc__BlocksAssignment_0");
					put(grammarAccess.getSmcAccess().getMainAssignment_1(), "rule__Smc__MainAssignment_1");
					put(grammarAccess.getBlockSMCAccess().getTypeAssignment_1(), "rule__BlockSMC__TypeAssignment_1");
					put(grammarAccess.getBlockSMCAccess().getNameAssignment_2(), "rule__BlockSMC__NameAssignment_2");
					put(grammarAccess.getBlockSMCAccess().getParametersAssignment_6_0(), "rule__BlockSMC__ParametersAssignment_6_0");
					put(grammarAccess.getBlockSMCAccess().getParametersAssignment_6_1_1(), "rule__BlockSMC__ParametersAssignment_6_1_1");
					put(grammarAccess.getMainSMCAccess().getCommandsAssignment_3(), "rule__MainSMC__CommandsAssignment_3");
					put(grammarAccess.getInvocationVoidAccess().getCallAssignment_0(), "rule__InvocationVoid__CallAssignment_0");
					put(grammarAccess.getBlockAccess().getCommandsAssignment_2(), "rule__Block__CommandsAssignment_2");
					put(grammarAccess.getPrintAccess().getValueAssignment_2(), "rule__Print__ValueAssignment_2");
					put(grammarAccess.getWhileAccess().getConditionAssignment_2(), "rule__While__ConditionAssignment_2");
					put(grammarAccess.getWhileAccess().getBodyAssignment_4(), "rule__While__BodyAssignment_4");
					put(grammarAccess.getIfThenElseAccess().getConditionAssignment_2(), "rule__IfThenElse__ConditionAssignment_2");
					put(grammarAccess.getIfThenElseAccess().getThenBrachAssignment_4(), "rule__IfThenElse__ThenBrachAssignment_4");
					put(grammarAccess.getIfThenElseAccess().getElseBranchAssignment_5_1(), "rule__IfThenElse__ElseBranchAssignment_5_1");
					put(grammarAccess.getVariableDeclAccess().getVisibilityAssignment_1(), "rule__VariableDecl__VisibilityAssignment_1");
					put(grammarAccess.getVariableDeclAccess().getTypeAssignment_2(), "rule__VariableDecl__TypeAssignment_2");
					put(grammarAccess.getVariableDeclAccess().getArrayAssignment_3(), "rule__VariableDecl__ArrayAssignment_3");
					put(grammarAccess.getVariableDeclAccess().getNameAssignment_4(), "rule__VariableDecl__NameAssignment_4");
					put(grammarAccess.getVariableDeclAccess().getExpAssignment_5_1(), "rule__VariableDecl__ExpAssignment_5_1");
					put(grammarAccess.getVariableAssignmentAccess().getVarAssignment_0(), "rule__VariableAssignment__VarAssignment_0");
					put(grammarAccess.getVariableAssignmentAccess().getExpAssignment_2(), "rule__VariableAssignment__ExpAssignment_2");
					put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
					put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
					put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
					put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
					put(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_1(), "rule__PlusOrMinus__OpAssignment_1_1");
					put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_2(), "rule__PlusOrMinus__RightAssignment_1_2");
					put(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1(), "rule__MulOrDiv__OpAssignment_1_1");
					put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2(), "rule__MulOrDiv__RightAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
					put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_4_1(), "rule__Atomic__ValueAssignment_4_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_5_1(), "rule__Atomic__ValueAssignment_5_1");
					put(grammarAccess.getAtomicAccess().getVariableAssignment_6_1(), "rule__Atomic__VariableAssignment_6_1");
					put(grammarAccess.getListAccess().getArgsAssignment_1_0(), "rule__List__ArgsAssignment_1_0");
					put(grammarAccess.getListAccess().getArgsAssignment_1_1_1(), "rule__List__ArgsAssignment_1_1_1");
					put(grammarAccess.getInvocationAccess().getBlockNameAssignment_0(), "rule__Invocation__BlockNameAssignment_0");
					put(grammarAccess.getInvocationAccess().getFunctionAssignment_2(), "rule__Invocation__FunctionAssignment_2");
					put(grammarAccess.getInvocationAccess().getArgsAssignment_4_0(), "rule__Invocation__ArgsAssignment_4_0");
					put(grammarAccess.getInvocationAccess().getArgsAssignment_4_1_1(), "rule__Invocation__ArgsAssignment_4_1_1");
					put(grammarAccess.getSmcAccess().getUnorderedGroup(), "rule__Smc__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmcGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmcGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
