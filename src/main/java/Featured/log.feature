Feature: Login Action

#Without Examples Keyword

#Scenario: Successful Login with Valid Credentials
#	Given User is on SignUp Page
#	When User Enters "eclipse" and "eclipse"
#	Then User Clicks On Login button
#	Then User is on Home Page


#With Examples Keyword

Scenario Outline: Successful Login with Valid Credentials
	Given User is on SignUp Page
	When User Enters "<username>" and "<password>"
	Then User Clicks On Login button
	Then User is on Home Page
	
	Examples: 
	| username | | password |
	| eclipse  | | eclipse	|
	| tom			 | | tom			|