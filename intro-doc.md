# Calendar DSL Introduction

<br/>

## Project Description

<br/>

Our DSL (Domain Specific Language) is for people who want a calendar that has conditional features and is able to sort out their schedule based on simple statements. It has the following features:

1. Create **Events** with a **Name**, **Duration** (and optionally **Location**, **Description**)
2. Schedule an Event on a **Date** and **Time**
3. Change *only* the Date, Time, Name, Duration, Location, or Description (individually) on a previously scheduled Event
4. Repeat an Event on certain days / dates with termination on a specific Date
5. Schedule an Event within another Event (subeventing). Must provide a child Event Time within the parent Event (keeps the Date of the parent Event)
6. Use conditional logic to schedule (#2), change (#3), repeat (#4), or subevent (#5)

<br/>
<br/>

## Feature 1/2: Create & Schedule Events
<br/>

**Input**
```
Events:
cpsc410: [ name: CPSC 410, duration: 1h 20m, location: DMP 110, description: compsci ],
party: [ name: Super Cool Party, duration: 2h 0m ].

Schedule:
SET cpsc410 on 21/09/2022 at 11:00.
```
**Output**
```
9/21/2022
-------------------
11:00  | CPSC 410 | 
11:05  | CPSC 410 | 
11:10  | CPSC 410 | 
11:15  | CPSC 410 | 
11:20  | CPSC 410 | 
11:25  | CPSC 410 | 
11:30  | CPSC 410 | 
11:35  | CPSC 410 | 
11:40  | CPSC 410 | 
11:45  | CPSC 410 | 
11:50  | CPSC 410 | 
11:55  | CPSC 410 | 
12:00  | CPSC 410 | 
12:05  | CPSC 410 | 
12:10  | CPSC 410 | 
12:15  | CPSC 410 | 
```

<br/>
<br/>

## Feature 3: Change Event Attributes
<br/>

**Possible attributes to change:**
- time: `CHANGE x time to xx:xx on xx/xx/xxxx.`
- date: `CHANGE x date to xx/xx/xxxx.` (not for repeating events)
- name: `CHANGE x name to x.`
- duration: `CHANGE x duration to xh xm.`
- location: `CHANGE x location to x.`
- description: `CHANGE x description to x.`

**Input**
```
Events:
cpsc410: [ name: CPSC 410, duration: 1h 20m, location: DMP 110, description: compsci ].

Schedule:
SET cpsc410 on 21/09/2022 at 11:00.
CHANGE cpsc410 time to 12:00 on 21/09/2022.
```
**Output**
```
9/21/2022
-------------------
12:00  | CPSC 410 | 
12:05  | CPSC 410 | 
12:10  | CPSC 410 | 
12:15  | CPSC 410 | 
12:20  | CPSC 410 | 
12:25  | CPSC 410 | 
12:30  | CPSC 410 | 
12:35  | CPSC 410 | 
12:40  | CPSC 410 | 
12:45  | CPSC 410 | 
12:50  | CPSC 410 | 
12:55  | CPSC 410 | 
13:00  | CPSC 410 | 
13:05  | CPSC 410 | 
13:10  | CPSC 410 | 
13:15  | CPSC 410 | 
```

<br/>
<br/>

## Feature 4: Repeat Events
<br/>

**Possible repeat timeframes:**
- Days of the week, e.g. `Monday, Wednesday, Friday`
- Days of the month, e.g. `12, 24`

**Input**
```
Events:
cpsc410: [ name: CPSC 410, duration: 0h 10m, location: DMP 110, description: compsci ].

Schedule:
SET cpsc410 on 05/10/2022 at 11:00.
REPEAT cpsc410 every Wednesday, Friday end on 20/10/2022.
```
**Output**
```
10/5/2022
-------------------
11:00  | CPSC 410 | 
11:05  | CPSC 410 | 

10/7/2022
-------------------
11:00  | CPSC 410 | 
11:05  | CPSC 410 | 

10/12/2022
-------------------
11:00  | CPSC 410 | 
11:05  | CPSC 410 | 

10/14/2022
-------------------
11:00  | CPSC 410 | 
11:05  | CPSC 410 | 

10/19/2022
-------------------
11:00  | CPSC 410 | 
11:05  | CPSC 410 | 
```

<br/>
<br/>

## Feature 5: Schedule Subevents
<br/>

**Input**
```
Events:
groceries: [ name: get groceries, duration: 1h 0m,  location: UBC],
bakery: [ name: go to bakery, duration: 0h 30m ],
bread: [ name: get bread, duration: 0h 5m ],
brownies: [ name: get brownies, duration: 0h 5m ].

Schedule:
SET groceries on 20/09/2022 at 15:00.
PUT [
	PLACE bakery at 15:30,
	PUT [
		PLACE bread at 15:30.,
		PLACE brownies at 15:45.
    ] in bakery on 20/09/2022.
] in groceries on 20/09/2022.
```
**Output**
```
9/20/2022
-------------------
15:00  | get groceries | 
15:05  | get groceries | 
15:10  | get groceries | 
15:15  | get groceries | 
15:20  | get groceries | 
15:25  | get groceries | 
15:30  | get groceries | go to bakery | get bread |
15:35  | get groceries | go to bakery |
15:40  | get groceries | go to bakery |
15:45  | get groceries | go to bakery | get brownies |
15:50  | get groceries | go to bakery |
15:55  | get groceries | go to bakery |
```

<br/>
<br/>

## Feature 6: Conditional Logic
<br/>

**Possible conditions to check:**
- If free/busy during a specified time frame
	- AT: `(free AT 14:00 on 17/10/2022)`
	- BEFORE: `(NOT free BEFORE 14:00 on 17/10/2022)`
	- AFTER: `(free AFTER 14:00 on 17/10/2022)`
	- BETWEEN: `(NOT free BETWEEN 14:00 AND 15:00 on 17/10/2022)`
- If an event attribute is/isn't a specified value
	- name: `(run name IS running)`
	- duration: `(run duration IS NOT 1h 0m)`
	- location: `(run location IS park)`
	- description: `(run description IS NOT I'm running!)`

**Input**
```
Events:
run: [ name: run, duration: 0h 30m, location: park ].

Schedule:
IF (free AT 11:00 on 20/09/2022) THEN [
    SET run on 20/09/2022 at 11:00.
]
ELSE [
    SET run on 20/09/2022 at 16:00.
]
```
**Output**
```
9/20/2022
-------------------
11:00  | run | 
11:05  | run | 
11:10  | run | 
11:15  | run | 
11:20  | run | 
11:25  | run | 
```
