Feature: Free CRM create contacts

Scenario Outline: Free CRM create a new contact scenario

	
	

Given User is already in login page
When User Enters "<username>" and "<password>"
Then User Clicks On Login button
Then User is on Home Page
Then User moves to new contact page
Then User enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
| username | | password |	| firstname | | lastname | | position |
| eclipse  | | eclipse	|	| TOM				|	| PETER		 | |  MANAGER |
| eclipse  | | eclipse	|	| DAVID			|	| JOHN		 | |  DIRECTOR |
		