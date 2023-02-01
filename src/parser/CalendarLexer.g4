lexer grammar CalendarLexer;
//Small things
DELIMITER: WS* ',';
NEWLINE_EVT: [\r\n]+ -> mode(ALIAS_MODE);
PERIOD : WS* '.' WS*;
OPEN_BRACKET: '[' WS*;
CLOSE_BRACKET: ']' WS*;
CONDITION_START: '(' WS*;
CONDITION_END: ')' WS*;

EVENT_ATTRIBUTE: 'name' | 'duration' | 'location'| 'description' ;

//Availability (Legacy)
AVAILABILITY_START: 'Availability:';
DAY_OF_WEEK: 'Monday' | 'Tuesday' | 'Wednesday' | 'Thursday' | 'Friday' | 'Saturday' | 'Sunday';

//Events
EVENTS: 'Events:' WS* -> mode(ALIAS_MODE);
EVENT_DEC_SEP: ':';
EVENT_NAME: 'name: ' WS* -> mode(TEXT_MODE);
//EVENT_ALIAS: WS* -> mode(ALIAS_MODE);
EVENT_LOCATION: 'location: ' WS* -> mode(TEXT_MODE);
EVENT_DESCRIPTION: 'description: ' WS* -> mode(TEXT_MODE);
EVENT_DURATION_START : 'duration: ' WS* -> mode(DURATION_MODE);

//Schedule Basics
SCHEDULE_START: 'Schedule:' WS*;
SLASH: '/';
DATE: DAY SLASH MONTH SLASH YEAR;
TIME: [0-2][0-9]':'[0-5][0-9];
YEAR: [1-9][0-9][0-9][0-9];
MONTH: [0][1-9] | [1][0-2];
DAY: [0][1-9] | [1-2][0-9] | [3][0-1];
NAME_TO: 'name to' WS* -> mode(TEXT_MODE);
DURATION_TO: 'duration to' WS* -> mode(DURATION_MODE);
DATE_TO: 'date to' WS*;
TIME_TO: 'time to' WS*;
LOCATION_TO: 'location to' WS*;
DESCRIPTION_TO: 'description to' WS*;

//Repeat
REPEAT_START:'REPEAT' WS* -> mode(ALIAS_MODE);
REPEAT_EVERY: 'every' WS*;
REPEAT_END: 'end on' WS*;

//Put/Place
PLACE_START: 'PLACE' WS* -> mode(ALIAS_MODE);
LOWER_AT: 'at' WS*;
PUT_START: 'PUT';
PUT_END_IN: 'in' WS* -> mode(ALIAS_MODE);
ON: 'on' WS*; // Change name to ON?

//Change
CHANGE_START: 'CHANGE' WS* -> mode(ALIAS_MODE);

//Conditionals
IF_STATEMENT: 'IF' WS*;
THEN_STATEMENT: 'THEN' WS*;
ELSE_STATEMENT: 'ELSE' WS*;
AT : 'AT' WS*;
BETWEEN: 'BETWEEN' WS*;
IS : 'IS' WS* -> mode(TEXT_MODE);
IS_NOT : 'IS NOT' WS* -> mode(TEXT_MODE);
AND : 'AND' WS*;
OR : 'OR' WS*;
NOT: 'NOT' WS*;
FREE: 'free';

//Set
SET_START: 'SET' WS* -> mode(ALIAS_MODE);
//SET_TIME: 'at' WS*;

//Whitespace is filtered
WS: [\r\n\t ]+ -> channel(HIDDEN);

//For variable names
mode ALIAS_MODE;
ALIAS: ~[[|\]\r\n\t: ]+ -> mode(DEFAULT_MODE);

//For all other text
mode TEXT_MODE;
TEXT: ~[\r\n\t,\].]+ -> mode(DEFAULT_MODE);

mode DURATION_MODE;
DURATION_VAL: [0-9]*'h '[0-9]*'m' -> mode(DEFAULT_MODE);
