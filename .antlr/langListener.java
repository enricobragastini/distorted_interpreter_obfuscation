// Generated from /home/stini/univr/4anno/analisi_software/progetto/simpleLang/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langParser}.
 */
public interface langListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(langParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(langParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(langParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(langParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSkip(langParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSkip(langParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIf(langParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIf(langParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(langParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link langParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(langParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseTail}
	 * labeled alternative in {@link langParser#elseTail}.
	 * @param ctx the parse tree
	 */
	void enterIfElseTail(langParser.IfElseTailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseTail}
	 * labeled alternative in {@link langParser#elseTail}.
	 * @param ctx the parse tree
	 */
	void exitIfElseTail(langParser.IfElseTailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseIfTail}
	 * labeled alternative in {@link langParser#elseTail}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIfTail(langParser.IfElseIfTailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseIfTail}
	 * labeled alternative in {@link langParser#elseTail}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIfTail(langParser.IfElseIfTailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseTailEmpty}
	 * labeled alternative in {@link langParser#elseTail}.
	 * @param ctx the parse tree
	 */
	void enterIfElseTailEmpty(langParser.IfElseTailEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseTailEmpty}
	 * labeled alternative in {@link langParser#elseTail}.
	 * @param ctx the parse tree
	 */
	void exitIfElseTailEmpty(langParser.IfElseTailEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(langParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(langParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterInteger(langParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitInteger(langParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(langParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(langParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterAddition(langParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitAddition(langParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(langParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(langParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticVariable}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticVariable(langParser.ArithmeticVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticVariable}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticVariable(langParser.ArithmeticVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AParenthesis}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterAParenthesis(langParser.AParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AParenthesis}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitAParenthesis(langParser.AParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void enterDivision(langParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link langParser#aExp}.
	 * @param ctx the parse tree
	 */
	void exitDivision(langParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterBExp(langParser.BExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitBExp(langParser.BExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void enterBExp_tail(langParser.BExp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#bExp_tail}.
	 * @param ctx the parse tree
	 */
	void exitBExp_tail(langParser.BExp_tailContext ctx);
}