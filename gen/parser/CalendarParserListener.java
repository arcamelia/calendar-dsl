// Generated from /Users/amelia.arciszewski/git/CPSC-410/Project1Group23/src/parser/CalendarParser.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalendarParser}.
 */
public interface CalendarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalendarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalendarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalendarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#events}.
	 * @param ctx the parse tree
	 */
	void enterEvents(CalendarParser.EventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#events}.
	 * @param ctx the parse tree
	 */
	void exitEvents(CalendarParser.EventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#eventDec}.
	 * @param ctx the parse tree
	 */
	void enterEventDec(CalendarParser.EventDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#eventDec}.
	 * @param ctx the parse tree
	 */
	void exitEventDec(CalendarParser.EventDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(CalendarParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(CalendarParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#eventDuration}.
	 * @param ctx the parse tree
	 */
	void enterEventDuration(CalendarParser.EventDurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#eventDuration}.
	 * @param ctx the parse tree
	 */
	void exitEventDuration(CalendarParser.EventDurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#eventLocationOrDescription}.
	 * @param ctx the parse tree
	 */
	void enterEventLocationOrDescription(CalendarParser.EventLocationOrDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#eventLocationOrDescription}.
	 * @param ctx the parse tree
	 */
	void exitEventLocationOrDescription(CalendarParser.EventLocationOrDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#eventLocation}.
	 * @param ctx the parse tree
	 */
	void enterEventLocation(CalendarParser.EventLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#eventLocation}.
	 * @param ctx the parse tree
	 */
	void exitEventLocation(CalendarParser.EventLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#eventDescription}.
	 * @param ctx the parse tree
	 */
	void enterEventDescription(CalendarParser.EventDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#eventDescription}.
	 * @param ctx the parse tree
	 */
	void exitEventDescription(CalendarParser.EventDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalendarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalendarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(CalendarParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(CalendarParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(CalendarParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(CalendarParser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(CalendarParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(CalendarParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void enterPutStatement(CalendarParser.PutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void exitPutStatement(CalendarParser.PutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#placeStatement}.
	 * @param ctx the parse tree
	 */
	void enterPlaceStatement(CalendarParser.PlaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#placeStatement}.
	 * @param ctx the parse tree
	 */
	void exitPlaceStatement(CalendarParser.PlaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#timeframe}.
	 * @param ctx the parse tree
	 */
	void enterTimeframe(CalendarParser.TimeframeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#timeframe}.
	 * @param ctx the parse tree
	 */
	void exitTimeframe(CalendarParser.TimeframeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#changeStatement}.
	 * @param ctx the parse tree
	 */
	void enterChangeStatement(CalendarParser.ChangeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#changeStatement}.
	 * @param ctx the parse tree
	 */
	void exitChangeStatement(CalendarParser.ChangeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#eventAttributePair}.
	 * @param ctx the parse tree
	 */
	void enterEventAttributePair(CalendarParser.EventAttributePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#eventAttributePair}.
	 * @param ctx the parse tree
	 */
	void exitEventAttributePair(CalendarParser.EventAttributePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#namePair}.
	 * @param ctx the parse tree
	 */
	void enterNamePair(CalendarParser.NamePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#namePair}.
	 * @param ctx the parse tree
	 */
	void exitNamePair(CalendarParser.NamePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#durationPair}.
	 * @param ctx the parse tree
	 */
	void enterDurationPair(CalendarParser.DurationPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#durationPair}.
	 * @param ctx the parse tree
	 */
	void exitDurationPair(CalendarParser.DurationPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#descriptionPair}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionPair(CalendarParser.DescriptionPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#descriptionPair}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionPair(CalendarParser.DescriptionPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#locationPair}.
	 * @param ctx the parse tree
	 */
	void enterLocationPair(CalendarParser.LocationPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#locationPair}.
	 * @param ctx the parse tree
	 */
	void exitLocationPair(CalendarParser.LocationPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#datePair}.
	 * @param ctx the parse tree
	 */
	void enterDatePair(CalendarParser.DatePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#datePair}.
	 * @param ctx the parse tree
	 */
	void exitDatePair(CalendarParser.DatePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#timePair}.
	 * @param ctx the parse tree
	 */
	void enterTimePair(CalendarParser.TimePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#timePair}.
	 * @param ctx the parse tree
	 */
	void exitTimePair(CalendarParser.TimePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CalendarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CalendarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#andor}.
	 * @param ctx the parse tree
	 */
	void enterAndor(CalendarParser.AndorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#andor}.
	 * @param ctx the parse tree
	 */
	void exitAndor(CalendarParser.AndorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(CalendarParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(CalendarParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CalendarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CalendarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#timeStatement}.
	 * @param ctx the parse tree
	 */
	void enterTimeStatement(CalendarParser.TimeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#timeStatement}.
	 * @param ctx the parse tree
	 */
	void exitTimeStatement(CalendarParser.TimeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#betweenStatement}.
	 * @param ctx the parse tree
	 */
	void enterBetweenStatement(CalendarParser.BetweenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#betweenStatement}.
	 * @param ctx the parse tree
	 */
	void exitBetweenStatement(CalendarParser.BetweenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#atTimeStatement}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeStatement(CalendarParser.AtTimeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#atTimeStatement}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeStatement(CalendarParser.AtTimeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalendarParser#isStatement}.
	 * @param ctx the parse tree
	 */
	void enterIsStatement(CalendarParser.IsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalendarParser#isStatement}.
	 * @param ctx the parse tree
	 */
	void exitIsStatement(CalendarParser.IsStatementContext ctx);
}