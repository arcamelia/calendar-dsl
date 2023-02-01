parser grammar CalendarParser;
options { tokenVocab = CalendarLexer;}


program: events schedule EOF ;
events : EVENTS eventDec (DELIMITER NEWLINE_EVT eventDec)* PERIOD;

eventDec: ALIAS EVENT_DEC_SEP OPEN_BRACKET eventName eventDuration (eventLocationOrDescription)? CLOSE_BRACKET;
eventName: EVENT_NAME TEXT;
eventDuration: DELIMITER EVENT_DURATION_START DURATION_VAL;
eventLocationOrDescription: DELIMITER (eventLocation | eventDescription);
eventLocation: EVENT_LOCATION TEXT (DELIMITER eventDescription)?;
eventDescription: EVENT_DESCRIPTION TEXT;

statement: setStatement | repeatStatement | changeStatement | ifStatement | putStatement ;
repeatStatement : REPEAT_START ALIAS REPEAT_EVERY timeframe REPEAT_END DATE PERIOD;
schedule: SCHEDULE_START statement (statement)*;
setStatement: SET_START ALIAS ON DATE LOWER_AT TIME PERIOD; // Change SET_DATE to ON
putStatement: PUT_START OPEN_BRACKET placeStatement (DELIMITER placeStatement)* CLOSE_BRACKET PUT_END_IN ALIAS ON DATE PERIOD; // Change SET_DATE to ON
placeStatement: PLACE_START ALIAS LOWER_AT TIME (DELIMITER putStatement)? PERIOD;
timeframe: (DAY_OF_WEEK (DELIMITER DAY_OF_WEEK)*) | (DAY (DELIMITER DAY)*);

changeStatement: CHANGE_START ALIAS eventAttributePair PERIOD;
eventAttributePair: namePair | durationPair | locationPair | descriptionPair | datePair | timePair;
namePair: NAME_TO TEXT;
durationPair: DURATION_TO DURATION_VAL;
descriptionPair: DESCRIPTION_TO TEXT;
locationPair: LOCATION_TO TEXT;
datePair: DATE_TO DATE;
timePair: TIME_TO TIME (ON DATE)?; // Change SET_DATE to ON

ifStatement: IF_STATEMENT CONDITION_START condition (andor condition)* CONDITION_END THEN_STATEMENT OPEN_BRACKET (statement)* CLOSE_BRACKET (elseStatement)?;
andor: AND|OR;
elseStatement: ELSE_STATEMENT OPEN_BRACKET (statement)* CLOSE_BRACKET;
condition: isStatement | timeStatement;
timeStatement: (NOT)? FREE (betweenStatement | atTimeStatement);
betweenStatement: BETWEEN TIME AND TIME ON DATE; // Change SET_DATE to ON
atTimeStatement: AT TIME ON DATE;
isStatement: ALIAS EVENT_ATTRIBUTE (IS | IS_NOT) TEXT;
