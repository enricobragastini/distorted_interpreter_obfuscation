// Generated from /home/stini/univr/4anno/analisi_software/progetto/simpleLang/test.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(testParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(testParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(testParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSkip(testParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSkip(testParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(testParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(testParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NondeterministicChoice}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void enterNondeterministicChoice(testParser.NondeterministicChoiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NondeterministicChoice}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void exitNondeterministicChoice(testParser.NondeterministicChoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KleeneStar}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void enterKleeneStar(testParser.KleeneStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KleeneStar}
	 * labeled alternative in {@link testParser#com}.
	 * @param ctx the parse tree
	 */
	void exitKleeneStar(testParser.KleeneStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(testParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(testParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterInteger(testParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitInteger(testParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterAddition(testParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitAddition(testParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(testParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(testParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(testParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(testParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticVariable}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticVariable(testParser.ArithmeticVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticVariable}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticVariable(testParser.ArithmeticVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AParenthesis}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterAParenthesis(testParser.AParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AParenthesis}
	 * labeled alternative in {@link testParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitAParenthesis(testParser.AParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterNot(testParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitNot(testParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(testParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(testParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(testParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(testParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(testParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(testParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arithmetic}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(testParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arithmetic}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(testParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BParenthesis}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterBParenthesis(testParser.BParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BParenthesis}
	 * labeled alternative in {@link testParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitBParenthesis(testParser.BParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void enterEqual(testParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void exitEqual(testParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(testParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(testParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(testParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(testParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void enterAnd(testParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void exitAnd(testParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(testParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link testParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(testParser.EmptyContext ctx);
}