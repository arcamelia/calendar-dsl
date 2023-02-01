// Generated from /Users/amelia.arciszewski/git/CPSC-410/Project1Group23/src/parser/CalendarParser.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalendarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DELIMITER=1, NEWLINE_EVT=2, PERIOD=3, OPEN_BRACKET=4, CLOSE_BRACKET=5, 
		CONDITION_START=6, CONDITION_END=7, EVENT_ATTRIBUTE=8, AVAILABILITY_START=9, 
		DAY_OF_WEEK=10, EVENTS=11, EVENT_DEC_SEP=12, EVENT_NAME=13, EVENT_LOCATION=14, 
		EVENT_DESCRIPTION=15, EVENT_DURATION_START=16, SCHEDULE_START=17, SLASH=18, 
		DATE=19, TIME=20, YEAR=21, MONTH=22, DAY=23, NAME_TO=24, DURATION_TO=25, 
		DATE_TO=26, TIME_TO=27, LOCATION_TO=28, DESCRIPTION_TO=29, REPEAT_START=30, 
		REPEAT_EVERY=31, REPEAT_END=32, PLACE_START=33, LOWER_AT=34, PUT_START=35, 
		PUT_END_IN=36, ON=37, CHANGE_START=38, IF_STATEMENT=39, THEN_STATEMENT=40, 
		ELSE_STATEMENT=41, AT=42, BETWEEN=43, IS=44, IS_NOT=45, AND=46, OR=47, 
		NOT=48, FREE=49, SET_START=50, WS=51, ALIAS=52, TEXT=53, DURATION_VAL=54;
	public static final int
		RULE_program = 0, RULE_events = 1, RULE_eventDec = 2, RULE_eventName = 3, 
		RULE_eventDuration = 4, RULE_eventLocationOrDescription = 5, RULE_eventLocation = 6, 
		RULE_eventDescription = 7, RULE_statement = 8, RULE_repeatStatement = 9, 
		RULE_schedule = 10, RULE_setStatement = 11, RULE_putStatement = 12, RULE_placeStatement = 13, 
		RULE_timeframe = 14, RULE_changeStatement = 15, RULE_eventAttributePair = 16, 
		RULE_namePair = 17, RULE_durationPair = 18, RULE_descriptionPair = 19, 
		RULE_locationPair = 20, RULE_datePair = 21, RULE_timePair = 22, RULE_ifStatement = 23, 
		RULE_andor = 24, RULE_elseStatement = 25, RULE_condition = 26, RULE_timeStatement = 27, 
		RULE_betweenStatement = 28, RULE_atTimeStatement = 29, RULE_isStatement = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "events", "eventDec", "eventName", "eventDuration", "eventLocationOrDescription", 
			"eventLocation", "eventDescription", "statement", "repeatStatement", 
			"schedule", "setStatement", "putStatement", "placeStatement", "timeframe", 
			"changeStatement", "eventAttributePair", "namePair", "durationPair", 
			"descriptionPair", "locationPair", "datePair", "timePair", "ifStatement", 
			"andor", "elseStatement", "condition", "timeStatement", "betweenStatement", 
			"atTimeStatement", "isStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'Availability:'", 
			null, null, "':'", null, null, null, null, null, "'/'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'PUT'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'free'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DELIMITER", "NEWLINE_EVT", "PERIOD", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"CONDITION_START", "CONDITION_END", "EVENT_ATTRIBUTE", "AVAILABILITY_START", 
			"DAY_OF_WEEK", "EVENTS", "EVENT_DEC_SEP", "EVENT_NAME", "EVENT_LOCATION", 
			"EVENT_DESCRIPTION", "EVENT_DURATION_START", "SCHEDULE_START", "SLASH", 
			"DATE", "TIME", "YEAR", "MONTH", "DAY", "NAME_TO", "DURATION_TO", "DATE_TO", 
			"TIME_TO", "LOCATION_TO", "DESCRIPTION_TO", "REPEAT_START", "REPEAT_EVERY", 
			"REPEAT_END", "PLACE_START", "LOWER_AT", "PUT_START", "PUT_END_IN", "ON", 
			"CHANGE_START", "IF_STATEMENT", "THEN_STATEMENT", "ELSE_STATEMENT", "AT", 
			"BETWEEN", "IS", "IS_NOT", "AND", "OR", "NOT", "FREE", "SET_START", "WS", 
			"ALIAS", "TEXT", "DURATION_VAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CalendarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalendarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public EventsContext events() {
			return getRuleContext(EventsContext.class,0);
		}
		public ScheduleContext schedule() {
			return getRuleContext(ScheduleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalendarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			events();
			setState(63);
			schedule();
			setState(64);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventsContext extends ParserRuleContext {
		public TerminalNode EVENTS() { return getToken(CalendarParser.EVENTS, 0); }
		public List<EventDecContext> eventDec() {
			return getRuleContexts(EventDecContext.class);
		}
		public EventDecContext eventDec(int i) {
			return getRuleContext(EventDecContext.class,i);
		}
		public TerminalNode PERIOD() { return getToken(CalendarParser.PERIOD, 0); }
		public List<TerminalNode> DELIMITER() { return getTokens(CalendarParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(CalendarParser.DELIMITER, i);
		}
		public List<TerminalNode> NEWLINE_EVT() { return getTokens(CalendarParser.NEWLINE_EVT); }
		public TerminalNode NEWLINE_EVT(int i) {
			return getToken(CalendarParser.NEWLINE_EVT, i);
		}
		public EventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_events; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitEvents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitEvents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventsContext events() throws RecognitionException {
		EventsContext _localctx = new EventsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_events);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(EVENTS);
			setState(67);
			eventDec();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITER) {
				{
				{
				setState(68);
				match(DELIMITER);
				setState(69);
				match(NEWLINE_EVT);
				setState(70);
				eventDec();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDecContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(CalendarParser.ALIAS, 0); }
		public TerminalNode EVENT_DEC_SEP() { return getToken(CalendarParser.EVENT_DEC_SEP, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(CalendarParser.OPEN_BRACKET, 0); }
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public EventDurationContext eventDuration() {
			return getRuleContext(EventDurationContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CalendarParser.CLOSE_BRACKET, 0); }
		public EventLocationOrDescriptionContext eventLocationOrDescription() {
			return getRuleContext(EventLocationOrDescriptionContext.class,0);
		}
		public EventDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterEventDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitEventDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitEventDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDecContext eventDec() throws RecognitionException {
		EventDecContext _localctx = new EventDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eventDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ALIAS);
			setState(79);
			match(EVENT_DEC_SEP);
			setState(80);
			match(OPEN_BRACKET);
			setState(81);
			eventName();
			setState(82);
			eventDuration();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELIMITER) {
				{
				setState(83);
				eventLocationOrDescription();
				}
			}

			setState(86);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventNameContext extends ParserRuleContext {
		public TerminalNode EVENT_NAME() { return getToken(CalendarParser.EVENT_NAME, 0); }
		public TerminalNode TEXT() { return getToken(CalendarParser.TEXT, 0); }
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterEventName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitEventName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitEventName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eventName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(EVENT_NAME);
			setState(89);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDurationContext extends ParserRuleContext {
		public TerminalNode DELIMITER() { return getToken(CalendarParser.DELIMITER, 0); }
		public TerminalNode EVENT_DURATION_START() { return getToken(CalendarParser.EVENT_DURATION_START, 0); }
		public TerminalNode DURATION_VAL() { return getToken(CalendarParser.DURATION_VAL, 0); }
		public EventDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterEventDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitEventDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitEventDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDurationContext eventDuration() throws RecognitionException {
		EventDurationContext _localctx = new EventDurationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eventDuration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(DELIMITER);
			setState(92);
			match(EVENT_DURATION_START);
			setState(93);
			match(DURATION_VAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventLocationOrDescriptionContext extends ParserRuleContext {
		public TerminalNode DELIMITER() { return getToken(CalendarParser.DELIMITER, 0); }
		public EventLocationContext eventLocation() {
			return getRuleContext(EventLocationContext.class,0);
		}
		public EventDescriptionContext eventDescription() {
			return getRuleContext(EventDescriptionContext.class,0);
		}
		public EventLocationOrDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventLocationOrDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterEventLocationOrDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitEventLocationOrDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitEventLocationOrDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventLocationOrDescriptionContext eventLocationOrDescription() throws RecognitionException {
		EventLocationOrDescriptionContext _localctx = new EventLocationOrDescriptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eventLocationOrDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(DELIMITER);
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_LOCATION:
				{
				setState(96);
				eventLocation();
				}
				break;
			case EVENT_DESCRIPTION:
				{
				setState(97);
				eventDescription();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventLocationContext extends ParserRuleContext {
		public TerminalNode EVENT_LOCATION() { return getToken(CalendarParser.EVENT_LOCATION, 0); }
		public TerminalNode TEXT() { return getToken(CalendarParser.TEXT, 0); }
		public TerminalNode DELIMITER() { return getToken(CalendarParser.DELIMITER, 0); }
		public EventDescriptionContext eventDescription() {
			return getRuleContext(EventDescriptionContext.class,0);
		}
		public EventLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterEventLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitEventLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitEventLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventLocationContext eventLocation() throws RecognitionException {
		EventLocationContext _localctx = new EventLocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eventLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(EVENT_LOCATION);
			setState(101);
			match(TEXT);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELIMITER) {
				{
				setState(102);
				match(DELIMITER);
				setState(103);
				eventDescription();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDescriptionContext extends ParserRuleContext {
		public TerminalNode EVENT_DESCRIPTION() { return getToken(CalendarParser.EVENT_DESCRIPTION, 0); }
		public TerminalNode TEXT() { return getToken(CalendarParser.TEXT, 0); }
		public EventDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterEventDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitEventDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitEventDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDescriptionContext eventDescription() throws RecognitionException {
		EventDescriptionContext _localctx = new EventDescriptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eventDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(EVENT_DESCRIPTION);
			setState(107);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ChangeStatementContext changeStatement() {
			return getRuleContext(ChangeStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PutStatementContext putStatement() {
			return getRuleContext(PutStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				setStatement();
				}
				break;
			case REPEAT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				repeatStatement();
				}
				break;
			case CHANGE_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				changeStatement();
				}
				break;
			case IF_STATEMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				ifStatement();
				}
				break;
			case PUT_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				putStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT_START() { return getToken(CalendarParser.REPEAT_START, 0); }
		public TerminalNode ALIAS() { return getToken(CalendarParser.ALIAS, 0); }
		public TerminalNode REPEAT_EVERY() { return getToken(CalendarParser.REPEAT_EVERY, 0); }
		public TimeframeContext timeframe() {
			return getRuleContext(TimeframeContext.class,0);
		}
		public TerminalNode REPEAT_END() { return getToken(CalendarParser.REPEAT_END, 0); }
		public TerminalNode DATE() { return getToken(CalendarParser.DATE, 0); }
		public TerminalNode PERIOD() { return getToken(CalendarParser.PERIOD, 0); }
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(REPEAT_START);
			setState(117);
			match(ALIAS);
			setState(118);
			match(REPEAT_EVERY);
			setState(119);
			timeframe();
			setState(120);
			match(REPEAT_END);
			setState(121);
			match(DATE);
			setState(122);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScheduleContext extends ParserRuleContext {
		public TerminalNode SCHEDULE_START() { return getToken(CalendarParser.SCHEDULE_START, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitSchedule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitSchedule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScheduleContext schedule() throws RecognitionException {
		ScheduleContext _localctx = new ScheduleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_schedule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(SCHEDULE_START);
			setState(125);
			statement();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << PUT_START) | (1L << CHANGE_START) | (1L << IF_STATEMENT) | (1L << SET_START))) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStatementContext extends ParserRuleContext {
		public TerminalNode SET_START() { return getToken(CalendarParser.SET_START, 0); }
		public TerminalNode ALIAS() { return getToken(CalendarParser.ALIAS, 0); }
		public TerminalNode ON() { return getToken(CalendarParser.ON, 0); }
		public TerminalNode DATE() { return getToken(CalendarParser.DATE, 0); }
		public TerminalNode LOWER_AT() { return getToken(CalendarParser.LOWER_AT, 0); }
		public TerminalNode TIME() { return getToken(CalendarParser.TIME, 0); }
		public TerminalNode PERIOD() { return getToken(CalendarParser.PERIOD, 0); }
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(SET_START);
			setState(133);
			match(ALIAS);
			setState(134);
			match(ON);
			setState(135);
			match(DATE);
			setState(136);
			match(LOWER_AT);
			setState(137);
			match(TIME);
			setState(138);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PutStatementContext extends ParserRuleContext {
		public TerminalNode PUT_START() { return getToken(CalendarParser.PUT_START, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(CalendarParser.OPEN_BRACKET, 0); }
		public List<PlaceStatementContext> placeStatement() {
			return getRuleContexts(PlaceStatementContext.class);
		}
		public PlaceStatementContext placeStatement(int i) {
			return getRuleContext(PlaceStatementContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CalendarParser.CLOSE_BRACKET, 0); }
		public TerminalNode PUT_END_IN() { return getToken(CalendarParser.PUT_END_IN, 0); }
		public TerminalNode ALIAS() { return getToken(CalendarParser.ALIAS, 0); }
		public TerminalNode ON() { return getToken(CalendarParser.ON, 0); }
		public TerminalNode DATE() { return getToken(CalendarParser.DATE, 0); }
		public TerminalNode PERIOD() { return getToken(CalendarParser.PERIOD, 0); }
		public List<TerminalNode> DELIMITER() { return getTokens(CalendarParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(CalendarParser.DELIMITER, i);
		}
		public PutStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterPutStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitPutStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitPutStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutStatementContext putStatement() throws RecognitionException {
		PutStatementContext _localctx = new PutStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_putStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PUT_START);
			setState(141);
			match(OPEN_BRACKET);
			setState(142);
			placeStatement();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITER) {
				{
				{
				setState(143);
				match(DELIMITER);
				setState(144);
				placeStatement();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(CLOSE_BRACKET);
			setState(151);
			match(PUT_END_IN);
			setState(152);
			match(ALIAS);
			setState(153);
			match(ON);
			setState(154);
			match(DATE);
			setState(155);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceStatementContext extends ParserRuleContext {
		public TerminalNode PLACE_START() { return getToken(CalendarParser.PLACE_START, 0); }
		public TerminalNode ALIAS() { return getToken(CalendarParser.ALIAS, 0); }
		public TerminalNode LOWER_AT() { return getToken(CalendarParser.LOWER_AT, 0); }
		public TerminalNode TIME() { return getToken(CalendarParser.TIME, 0); }
		public TerminalNode PERIOD() { return getToken(CalendarParser.PERIOD, 0); }
		public TerminalNode DELIMITER() { return getToken(CalendarParser.DELIMITER, 0); }
		public PutStatementContext putStatement() {
			return getRuleContext(PutStatementContext.class,0);
		}
		public PlaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterPlaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitPlaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitPlaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceStatementContext placeStatement() throws RecognitionException {
		PlaceStatementContext _localctx = new PlaceStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_placeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PLACE_START);
			setState(158);
			match(ALIAS);
			setState(159);
			match(LOWER_AT);
			setState(160);
			match(TIME);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELIMITER) {
				{
				setState(161);
				match(DELIMITER);
				setState(162);
				putStatement();
				}
			}

			setState(165);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeframeContext extends ParserRuleContext {
		public List<TerminalNode> DAY_OF_WEEK() { return getTokens(CalendarParser.DAY_OF_WEEK); }
		public TerminalNode DAY_OF_WEEK(int i) {
			return getToken(CalendarParser.DAY_OF_WEEK, i);
		}
		public List<TerminalNode> DELIMITER() { return getTokens(CalendarParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(CalendarParser.DELIMITER, i);
		}
		public List<TerminalNode> DAY() { return getTokens(CalendarParser.DAY); }
		public TerminalNode DAY(int i) {
			return getToken(CalendarParser.DAY, i);
		}
		public TimeframeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeframe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterTimeframe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitTimeframe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitTimeframe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeframeContext timeframe() throws RecognitionException {
		TimeframeContext _localctx = new TimeframeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_timeframe);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY_OF_WEEK:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(167);
				match(DAY_OF_WEEK);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DELIMITER) {
					{
					{
					setState(168);
					match(DELIMITER);
					setState(169);
					match(DAY_OF_WEEK);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(175);
				match(DAY);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DELIMITER) {
					{
					{
					setState(176);
					match(DELIMITER);
					setState(177);
					match(DAY);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeStatementContext extends ParserRuleContext {
		public TerminalNode CHANGE_START() { return getToken(CalendarParser.CHANGE_START, 0); }
		public TerminalNode ALIAS() { return getToken(CalendarParser.ALIAS, 0); }
		public EventAttributePairContext eventAttributePair() {
			return getRuleContext(EventAttributePairContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(CalendarParser.PERIOD, 0); }
		public ChangeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterChangeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitChangeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitChangeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeStatementContext changeStatement() throws RecognitionException {
		ChangeStatementContext _localctx = new ChangeStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_changeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(CHANGE_START);
			setState(186);
			match(ALIAS);
			setState(187);
			eventAttributePair();
			setState(188);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventAttributePairContext extends ParserRuleContext {
		public NamePairContext namePair() {
			return getRuleContext(NamePairContext.class,0);
		}
		public DurationPairContext durationPair() {
			return getRuleContext(DurationPairContext.class,0);
		}
		public LocationPairContext locationPair() {
			return getRuleContext(LocationPairContext.class,0);
		}
		public DescriptionPairContext descriptionPair() {
			return getRuleContext(DescriptionPairContext.class,0);
		}
		public DatePairContext datePair() {
			return getRuleContext(DatePairContext.class,0);
		}
		public TimePairContext timePair() {
			return getRuleContext(TimePairContext.class,0);
		}
		public EventAttributePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventAttributePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterEventAttributePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitEventAttributePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitEventAttributePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventAttributePairContext eventAttributePair() throws RecognitionException {
		EventAttributePairContext _localctx = new EventAttributePairContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eventAttributePair);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_TO:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				namePair();
				}
				break;
			case DURATION_TO:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				durationPair();
				}
				break;
			case LOCATION_TO:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				locationPair();
				}
				break;
			case DESCRIPTION_TO:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				descriptionPair();
				}
				break;
			case DATE_TO:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				datePair();
				}
				break;
			case TIME_TO:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				timePair();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamePairContext extends ParserRuleContext {
		public TerminalNode NAME_TO() { return getToken(CalendarParser.NAME_TO, 0); }
		public TerminalNode TEXT() { return getToken(CalendarParser.TEXT, 0); }
		public NamePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterNamePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitNamePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitNamePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamePairContext namePair() throws RecognitionException {
		NamePairContext _localctx = new NamePairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_namePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(NAME_TO);
			setState(199);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurationPairContext extends ParserRuleContext {
		public TerminalNode DURATION_TO() { return getToken(CalendarParser.DURATION_TO, 0); }
		public TerminalNode DURATION_VAL() { return getToken(CalendarParser.DURATION_VAL, 0); }
		public DurationPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterDurationPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitDurationPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitDurationPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationPairContext durationPair() throws RecognitionException {
		DurationPairContext _localctx = new DurationPairContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_durationPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(DURATION_TO);
			setState(202);
			match(DURATION_VAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionPairContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION_TO() { return getToken(CalendarParser.DESCRIPTION_TO, 0); }
		public TerminalNode TEXT() { return getToken(CalendarParser.TEXT, 0); }
		public DescriptionPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterDescriptionPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitDescriptionPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitDescriptionPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionPairContext descriptionPair() throws RecognitionException {
		DescriptionPairContext _localctx = new DescriptionPairContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_descriptionPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(DESCRIPTION_TO);
			setState(205);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationPairContext extends ParserRuleContext {
		public TerminalNode LOCATION_TO() { return getToken(CalendarParser.LOCATION_TO, 0); }
		public TerminalNode TEXT() { return getToken(CalendarParser.TEXT, 0); }
		public LocationPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterLocationPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitLocationPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitLocationPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationPairContext locationPair() throws RecognitionException {
		LocationPairContext _localctx = new LocationPairContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_locationPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(LOCATION_TO);
			setState(208);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatePairContext extends ParserRuleContext {
		public TerminalNode DATE_TO() { return getToken(CalendarParser.DATE_TO, 0); }
		public TerminalNode DATE() { return getToken(CalendarParser.DATE, 0); }
		public DatePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterDatePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitDatePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitDatePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatePairContext datePair() throws RecognitionException {
		DatePairContext _localctx = new DatePairContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_datePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DATE_TO);
			setState(211);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimePairContext extends ParserRuleContext {
		public TerminalNode TIME_TO() { return getToken(CalendarParser.TIME_TO, 0); }
		public TerminalNode TIME() { return getToken(CalendarParser.TIME, 0); }
		public TerminalNode ON() { return getToken(CalendarParser.ON, 0); }
		public TerminalNode DATE() { return getToken(CalendarParser.DATE, 0); }
		public TimePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterTimePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitTimePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitTimePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePairContext timePair() throws RecognitionException {
		TimePairContext _localctx = new TimePairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_timePair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(TIME_TO);
			setState(214);
			match(TIME);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(215);
				match(ON);
				setState(216);
				match(DATE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF_STATEMENT() { return getToken(CalendarParser.IF_STATEMENT, 0); }
		public TerminalNode CONDITION_START() { return getToken(CalendarParser.CONDITION_START, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CONDITION_END() { return getToken(CalendarParser.CONDITION_END, 0); }
		public TerminalNode THEN_STATEMENT() { return getToken(CalendarParser.THEN_STATEMENT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(CalendarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(CalendarParser.CLOSE_BRACKET, 0); }
		public List<AndorContext> andor() {
			return getRuleContexts(AndorContext.class);
		}
		public AndorContext andor(int i) {
			return getRuleContext(AndorContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IF_STATEMENT);
			setState(220);
			match(CONDITION_START);
			setState(221);
			condition();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(222);
				andor();
				setState(223);
				condition();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(CONDITION_END);
			setState(231);
			match(THEN_STATEMENT);
			setState(232);
			match(OPEN_BRACKET);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << PUT_START) | (1L << CHANGE_START) | (1L << IF_STATEMENT) | (1L << SET_START))) != 0)) {
				{
				{
				setState(233);
				statement();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(CLOSE_BRACKET);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_STATEMENT) {
				{
				setState(240);
				elseStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CalendarParser.AND, 0); }
		public TerminalNode OR() { return getToken(CalendarParser.OR, 0); }
		public AndorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterAndor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitAndor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitAndor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndorContext andor() throws RecognitionException {
		AndorContext _localctx = new AndorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_andor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE_STATEMENT() { return getToken(CalendarParser.ELSE_STATEMENT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(CalendarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(CalendarParser.CLOSE_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ELSE_STATEMENT);
			setState(246);
			match(OPEN_BRACKET);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << PUT_START) | (1L << CHANGE_START) | (1L << IF_STATEMENT) | (1L << SET_START))) != 0)) {
				{
				{
				setState(247);
				statement();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public IsStatementContext isStatement() {
			return getRuleContext(IsStatementContext.class,0);
		}
		public TimeStatementContext timeStatement() {
			return getRuleContext(TimeStatementContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				isStatement();
				}
				break;
			case NOT:
			case FREE:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				timeStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeStatementContext extends ParserRuleContext {
		public TerminalNode FREE() { return getToken(CalendarParser.FREE, 0); }
		public BetweenStatementContext betweenStatement() {
			return getRuleContext(BetweenStatementContext.class,0);
		}
		public AtTimeStatementContext atTimeStatement() {
			return getRuleContext(AtTimeStatementContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CalendarParser.NOT, 0); }
		public TimeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterTimeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitTimeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitTimeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeStatementContext timeStatement() throws RecognitionException {
		TimeStatementContext _localctx = new TimeStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_timeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(259);
				match(NOT);
				}
			}

			setState(262);
			match(FREE);
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BETWEEN:
				{
				setState(263);
				betweenStatement();
				}
				break;
			case AT:
				{
				setState(264);
				atTimeStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BetweenStatementContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(CalendarParser.BETWEEN, 0); }
		public List<TerminalNode> TIME() { return getTokens(CalendarParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(CalendarParser.TIME, i);
		}
		public TerminalNode AND() { return getToken(CalendarParser.AND, 0); }
		public TerminalNode ON() { return getToken(CalendarParser.ON, 0); }
		public TerminalNode DATE() { return getToken(CalendarParser.DATE, 0); }
		public BetweenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_betweenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterBetweenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitBetweenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitBetweenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenStatementContext betweenStatement() throws RecognitionException {
		BetweenStatementContext _localctx = new BetweenStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_betweenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(BETWEEN);
			setState(268);
			match(TIME);
			setState(269);
			match(AND);
			setState(270);
			match(TIME);
			setState(271);
			match(ON);
			setState(272);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtTimeStatementContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(CalendarParser.AT, 0); }
		public TerminalNode TIME() { return getToken(CalendarParser.TIME, 0); }
		public TerminalNode ON() { return getToken(CalendarParser.ON, 0); }
		public TerminalNode DATE() { return getToken(CalendarParser.DATE, 0); }
		public AtTimeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atTimeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterAtTimeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitAtTimeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitAtTimeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtTimeStatementContext atTimeStatement() throws RecognitionException {
		AtTimeStatementContext _localctx = new AtTimeStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atTimeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(AT);
			setState(275);
			match(TIME);
			setState(276);
			match(ON);
			setState(277);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsStatementContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(CalendarParser.ALIAS, 0); }
		public TerminalNode EVENT_ATTRIBUTE() { return getToken(CalendarParser.EVENT_ATTRIBUTE, 0); }
		public TerminalNode TEXT() { return getToken(CalendarParser.TEXT, 0); }
		public TerminalNode IS() { return getToken(CalendarParser.IS, 0); }
		public TerminalNode IS_NOT() { return getToken(CalendarParser.IS_NOT, 0); }
		public IsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).enterIsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalendarParserListener ) ((CalendarParserListener)listener).exitIsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalendarParserVisitor ) return ((CalendarParserVisitor<? extends T>)visitor).visitIsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsStatementContext isStatement() throws RecognitionException {
		IsStatementContext _localctx = new IsStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_isStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ALIAS);
			setState(280);
			match(EVENT_ATTRIBUTE);
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==IS_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00016\u011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001H\b\u0001\n\u0001\f\u0001"+
		"K\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"c\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"i\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\bs\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u0080\b\n\n\n"+
		"\f\n\u0083\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0092\b\f\n\f\f\f\u0095\t\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00a4\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00ab\b\u000e\n\u000e\f\u000e\u00ae\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00b3\b\u000e\n\u000e\f\u000e\u00b6\t\u000e"+
		"\u0003\u000e\u00b8\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00c5\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00da\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00e2\b\u0017\n\u0017\f\u0017\u00e5\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00eb\b\u0017\n\u0017\f\u0017"+
		"\u00ee\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f2\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00f9"+
		"\b\u0019\n\u0019\f\u0019\u00fc\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0102\b\u001a\u0001\u001b\u0003\u001b\u0105\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u010a\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0000"+
		"\u0000\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0002\u0001\u0000./\u0001"+
		"\u0000,-\u0118\u0000>\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000"+
		"\u0000\u0004N\u0001\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000\b"+
		"[\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000"+
		"\u0000\u000ej\u0001\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012"+
		"t\u0001\u0000\u0000\u0000\u0014|\u0001\u0000\u0000\u0000\u0016\u0084\u0001"+
		"\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u009d\u0001"+
		"\u0000\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000\u001e\u00b9\u0001"+
		"\u0000\u0000\u0000 \u00c4\u0001\u0000\u0000\u0000\"\u00c6\u0001\u0000"+
		"\u0000\u0000$\u00c9\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000\u0000\u0000"+
		"(\u00cf\u0001\u0000\u0000\u0000*\u00d2\u0001\u0000\u0000\u0000,\u00d5"+
		"\u0001\u0000\u0000\u0000.\u00db\u0001\u0000\u0000\u00000\u00f3\u0001\u0000"+
		"\u0000\u00002\u00f5\u0001\u0000\u0000\u00004\u0101\u0001\u0000\u0000\u0000"+
		"6\u0104\u0001\u0000\u0000\u00008\u010b\u0001\u0000\u0000\u0000:\u0112"+
		"\u0001\u0000\u0000\u0000<\u0117\u0001\u0000\u0000\u0000>?\u0003\u0002"+
		"\u0001\u0000?@\u0003\u0014\n\u0000@A\u0005\u0000\u0000\u0001A\u0001\u0001"+
		"\u0000\u0000\u0000BC\u0005\u000b\u0000\u0000CI\u0003\u0004\u0002\u0000"+
		"DE\u0005\u0001\u0000\u0000EF\u0005\u0002\u0000\u0000FH\u0003\u0004\u0002"+
		"\u0000GD\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0003\u0000\u0000M\u0003\u0001\u0000\u0000"+
		"\u0000NO\u00054\u0000\u0000OP\u0005\f\u0000\u0000PQ\u0005\u0004\u0000"+
		"\u0000QR\u0003\u0006\u0003\u0000RT\u0003\b\u0004\u0000SU\u0003\n\u0005"+
		"\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0005\u0000\u0000W\u0005\u0001\u0000\u0000\u0000"+
		"XY\u0005\r\u0000\u0000YZ\u00055\u0000\u0000Z\u0007\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0001\u0000\u0000\\]\u0005\u0010\u0000\u0000]^\u00056\u0000"+
		"\u0000^\t\u0001\u0000\u0000\u0000_b\u0005\u0001\u0000\u0000`c\u0003\f"+
		"\u0006\u0000ac\u0003\u000e\u0007\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000c\u000b\u0001\u0000\u0000\u0000de\u0005\u000e\u0000"+
		"\u0000eh\u00055\u0000\u0000fg\u0005\u0001\u0000\u0000gi\u0003\u000e\u0007"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\r\u0001\u0000"+
		"\u0000\u0000jk\u0005\u000f\u0000\u0000kl\u00055\u0000\u0000l\u000f\u0001"+
		"\u0000\u0000\u0000ms\u0003\u0016\u000b\u0000ns\u0003\u0012\t\u0000os\u0003"+
		"\u001e\u000f\u0000ps\u0003.\u0017\u0000qs\u0003\u0018\f\u0000rm\u0001"+
		"\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0011\u0001\u0000"+
		"\u0000\u0000tu\u0005\u001e\u0000\u0000uv\u00054\u0000\u0000vw\u0005\u001f"+
		"\u0000\u0000wx\u0003\u001c\u000e\u0000xy\u0005 \u0000\u0000yz\u0005\u0013"+
		"\u0000\u0000z{\u0005\u0003\u0000\u0000{\u0013\u0001\u0000\u0000\u0000"+
		"|}\u0005\u0011\u0000\u0000}\u0081\u0003\u0010\b\u0000~\u0080\u0003\u0010"+
		"\b\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u00052\u0000\u0000\u0085\u0086\u00054\u0000\u0000\u0086"+
		"\u0087\u0005%\u0000\u0000\u0087\u0088\u0005\u0013\u0000\u0000\u0088\u0089"+
		"\u0005\"\u0000\u0000\u0089\u008a\u0005\u0014\u0000\u0000\u008a\u008b\u0005"+
		"\u0003\u0000\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"#\u0000\u0000\u008d\u008e\u0005\u0004\u0000\u0000\u008e\u0093\u0003\u001a"+
		"\r\u0000\u008f\u0090\u0005\u0001\u0000\u0000\u0090\u0092\u0003\u001a\r"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u0098\u0005$\u0000\u0000"+
		"\u0098\u0099\u00054\u0000\u0000\u0099\u009a\u0005%\u0000\u0000\u009a\u009b"+
		"\u0005\u0013\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c\u0019"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005!\u0000\u0000\u009e\u009f\u0005"+
		"4\u0000\u0000\u009f\u00a0\u0005\"\u0000\u0000\u00a0\u00a3\u0005\u0014"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a4\u0003\u0018"+
		"\f\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0003\u0000"+
		"\u0000\u00a6\u001b\u0001\u0000\u0000\u0000\u00a7\u00ac\u0005\n\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0001\u0000\u0000\u00a9\u00ab\u0005\n\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00b4\u0005\u0017\u0000\u0000\u00b0\u00b1\u0005\u0001\u0000\u0000\u00b1"+
		"\u00b3\u0005\u0017\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00a7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00af\u0001\u0000\u0000\u0000\u00b8\u001d\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005&\u0000\u0000\u00ba\u00bb\u00054\u0000\u0000\u00bb\u00bc\u0003"+
		" \u0010\u0000\u00bc\u00bd\u0005\u0003\u0000\u0000\u00bd\u001f\u0001\u0000"+
		"\u0000\u0000\u00be\u00c5\u0003\"\u0011\u0000\u00bf\u00c5\u0003$\u0012"+
		"\u0000\u00c0\u00c5\u0003(\u0014\u0000\u00c1\u00c5\u0003&\u0013\u0000\u00c2"+
		"\u00c5\u0003*\u0015\u0000\u00c3\u00c5\u0003,\u0016\u0000\u00c4\u00be\u0001"+
		"\u0000\u0000\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5!\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000\u00c7\u00c8\u00055\u0000"+
		"\u0000\u00c8#\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0019\u0000\u0000"+
		"\u00ca\u00cb\u00056\u0000\u0000\u00cb%\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005\u001d\u0000\u0000\u00cd\u00ce\u00055\u0000\u0000\u00ce\'\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\u001c\u0000\u0000\u00d0\u00d1\u0005"+
		"5\u0000\u0000\u00d1)\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0013\u0000\u0000\u00d4+\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005\u001b\u0000\u0000\u00d6\u00d9\u0005\u0014\u0000\u0000"+
		"\u00d7\u00d8\u0005%\u0000\u0000\u00d8\u00da\u0005\u0013\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"-\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\'\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0006\u0000\u0000\u00dd\u00e3\u00034\u001a\u0000\u00de\u00df\u0003"+
		"0\u0018\u0000\u00df\u00e0\u00034\u001a\u0000\u00e0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\u0007\u0000\u0000\u00e7\u00e8\u0005(\u0000\u0000"+
		"\u00e8\u00ec\u0005\u0004\u0000\u0000\u00e9\u00eb\u0003\u0010\b\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0005\u0005\u0000\u0000\u00f0\u00f2\u00032\u0019\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2/\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0007\u0000\u0000\u0000\u00f41\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005)\u0000\u0000\u00f6\u00fa\u0005\u0004\u0000"+
		"\u0000\u00f7\u00f9\u0003\u0010\b\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0005\u0000\u0000"+
		"\u00fe3\u0001\u0000\u0000\u0000\u00ff\u0102\u0003<\u001e\u0000\u0100\u0102"+
		"\u00036\u001b\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001"+
		"\u0000\u0000\u0000\u01025\u0001\u0000\u0000\u0000\u0103\u0105\u00050\u0000"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0109\u00051\u0000\u0000"+
		"\u0107\u010a\u00038\u001c\u0000\u0108\u010a\u0003:\u001d\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a7\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005+\u0000\u0000\u010c\u010d\u0005\u0014"+
		"\u0000\u0000\u010d\u010e\u0005.\u0000\u0000\u010e\u010f\u0005\u0014\u0000"+
		"\u0000\u010f\u0110\u0005%\u0000\u0000\u0110\u0111\u0005\u0013\u0000\u0000"+
		"\u01119\u0001\u0000\u0000\u0000\u0112\u0113\u0005*\u0000\u0000\u0113\u0114"+
		"\u0005\u0014\u0000\u0000\u0114\u0115\u0005%\u0000\u0000\u0115\u0116\u0005"+
		"\u0013\u0000\u0000\u0116;\u0001\u0000\u0000\u0000\u0117\u0118\u00054\u0000"+
		"\u0000\u0118\u0119\u0005\b\u0000\u0000\u0119\u011a\u0007\u0001\u0000\u0000"+
		"\u011a\u011b\u00055\u0000\u0000\u011b=\u0001\u0000\u0000\u0000\u0014I"+
		"Tbhr\u0081\u0093\u00a3\u00ac\u00b4\u00b7\u00c4\u00d9\u00e3\u00ec\u00f1"+
		"\u00fa\u0101\u0104\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}