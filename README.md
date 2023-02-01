# Calendar DSL

Check out `intro-doc.md` for an intro to our DSL!
<br/>
<hr>

## Milestone 1

### Calendar DSL
*Use case: For people who want a calendar that has conditional features; one that’s able to 
sort out your schedule based on simple statements.*
- Loops can be used for having the same event on multiple days
- Conditionals can be used if there’s an event that you want only in your free time or if the 
  weather/day condition is good (i.e. if I have nothing going on 12-1 schedule a run for that day)
- Potentially saving a calendar file that can be loaded in the DSL and modified/added to
- Possibly creating different objects based on how much info the user wants to add (i.e. adding 
  a description, location is optional)
- Potential front end element to display calendar 

### TA Feedback
- We pitched two ideas to the TA: a coding game for kids & a calendar
- TA considered the calendar idea better as it could be more geared towards specific DSL
  requirements for the course project
- TA recommended nailing down a set of key features, and coming up with some example inputs
- Noted that an output of an .ics file would be a good feature to have

<hr>

## Milestone 2

### Project Update:
- A Calendar was created that tracks each week/milestone, and we have added a set of personal checkpoints to the roadmap that should allow us to complete the project on time.
- For next week the personal checkpoints are to have user studies completed over the weekend, to take the feedback and update the grammar, and finally to implement the grammar into an ANTLR lexer and parser.
- We decided to divide work on a week to week basis in order to make sure all members will be able to have a consistent amount of work to do, instead of potentially overloading their workload for a subset of weeks.
- The main complexities of the language have been locked in (mutable variables, conditionals, and recursion) and a basic outline of how all statements should look has been developed. A proper grammar set will be written on Friday and user study sheets will be developed on Saturday.

### TA Feedback:
- TA recommended everyone contributes evenly over the project week by week
- TA recommended features that depend on each other for more complexity

### Grammar Structure:
**Declare availability** based on day (if user doesn't declare availability we'll have a default)
e.g. Monday: 8am - 10pm
Saturday: 11am - 6pm

**Declare events** ; an event needs:
- alias
- name
- duration
- location?
- description?

**Schedule events** ; user needs to / can set:
- set a start date & time
- single or repeating event
- if (cond) then do something with the event
  - cond keywords for availability times: between, free, busy, before, after
  - conditions based on event attributes (name, location, duration)
  - (create buffers/time delays between events)
- create subevents (must stay within duration of parent event)

### Example Input:
```
Availability:
Monday: 09:00 to 18:00,
Sunday: 10:00 to 16:00.

Events:
cpsc410: [ name: CPSC 410, duration: 80 minutes, location: DMP 110 ],
run: [ name: run, duration: 30 minutes, location: park ],
run2: [ name: run, duration: 45 minutes, description: this is an event ],
groceries: [ name: get groceries, duration: 30 minutes, description: this is an event, location: UBC ],
bakery: [ name: bakery, duration: 15 minutes ],
bread: [ name: get bread, duration: 5 minutes ],
brownies: [ name: get brownies, duration: 5 minutes].

Schedule / Calendar / Agenda / Post Schedule:       // name to be finalized
SET cpsc410 on 9/20/22 at 11:00,
REPEAT cpsc410 every Tuesday and Thursday end on 10/25/22,
CHANGE cpsc410 time to 12:00.

SET run on 9/20/22 at 00:00,
IF (free at 11:00) THEN change run time to 11:00 ELSE change run time to 16:00.

SET groceries on 9/20/22 at 15:00,
PUT [
  PLACE bakery at 15:30,
  PUT [
    PLACE bread at 15:30.
    PLACE brownies at 15:35.
  ].
].
```
#### Statement Keywords:
- SET
- REPEAT
- CHANGE
- IF / THEN / ELSE 
  - FREE
  - NOT
    - BETWEEN
    - BEFORE
    - AFTER
    - AT
- PUT
  - PLACE

<hr>

## Milestone 3
### Draft Grammar
- https://docs.google.com/document/d/1dKHXhqXPEwUtaIEFDtcbJCmk6ybhVRtILAatlaRaJL0/edit?usp=sharing

### User Study Response
- The two novice users found the more advanced aspects of the language challenging, but were able to complete the basics.
- One novice user even expressed confidence in their ability to use the tool to input their current schedule.
- Advanced user was confused about why we have both SET and CHANGE as their intuition was to use SET to update an existing scheduled event. We're keeping both for the sake of novice users. 
- All users had some trouble with the Availability feature, which led to us removing it from the project.
- An optional 12 hour time format has been added to our ‘nice to have’ feature list.
### TA Feedback
- The TA liked our User Study form, and found the complexities of our language to be satisfying.

<hr>

## Milestone 4
### TA Feedback
- TA didn’t have much feedback to give, other than to make sure we implement as much as possible right away.
### Status of Implementation
- Lexer and Parser are fully finished
- AST diagram has been drawn.
- A consensus on the implementation of the evaluation of most tokens has been reached.  Remaining implementation details are being left to individuals responsible for those tokens
- Skeleton of the full project has been created and pushed

### Planned timeline of Remaining Days
- Plan is to have all code in by Monday, make it work before user studies at the end of that week/over the weekend.
- Video will be made by someone who is not conducting a user study.

### AST / evaluation breakup of work:
- if: Owen
- change: Amelia
- put/place: Coby
- Events: Mary
- repeat, set, higher level stuff (ie program, map of events, etc.): Matt

<hr>

## Milestone 5
### TA Feedback
 - TA noted that documentation is one component we didn’t plan to have for turn in, but would be helpful
 - Said everything else sounded good
### Status of Implementation
 - All features have been merged and lightly tested
### Remaining Work & Timeline
 - User studies are being conducted friday evening and saturday morning
 - Further testing will happen friday morning
 - Documentation will be written on friday after testing
 - Video will be done sunday morning
### User Studies
 - https://docs.google.com/document/d/1S_uRbQKLPfj6nEwS3OCXYi8AEe7DALTeovPUqco64LI/edit#
 - https://docs.google.com/document/d/1_uM_0C3bIrNZbgba-juNrHVmRbTGYM65lZQ-Xlga0eQ/edit?usp=sharing
