// Generated from /Users/amelia.arciszewski/git/CPSC-410/Project1Group23/src/parser/CalendarParser.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalendarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalendarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalendarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalendarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#events}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvents(CalendarParser.EventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#eventDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDec(CalendarParser.EventDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(CalendarParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#eventDuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDuration(CalendarParser.EventDurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#eventLocationOrDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventLocationOrDescription(CalendarParser.EventLocationOrDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#eventLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventLocation(CalendarParser.EventLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#eventDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDescription(CalendarParser.EventDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CalendarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(CalendarParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule(CalendarParser.ScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(CalendarParser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#putStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutStatement(CalendarParser.PutStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#placeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceStatement(CalendarParser.PlaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#timeframe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeframe(CalendarParser.TimeframeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#changeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeStatement(CalendarParser.ChangeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#eventAttributePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttributePair(CalendarParser.EventAttributePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#namePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamePair(CalendarParser.NamePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#durationPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurationPair(CalendarParser.DurationPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#descriptionPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionPair(CalendarParser.DescriptionPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#locationPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationPair(CalendarParser.LocationPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#datePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatePair(CalendarParser.DatePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#timePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePair(CalendarParser.TimePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CalendarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#andor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndor(CalendarParser.AndorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(CalendarParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CalendarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#timeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeStatement(CalendarParser.TimeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#betweenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenStatement(CalendarParser.BetweenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#atTimeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTimeStatement(CalendarParser.AtTimeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalendarParser#isStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsStatement(CalendarParser.IsStatementContext ctx);
}