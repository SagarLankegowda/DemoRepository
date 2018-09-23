Feature: Free CRM Deal creation

Scenario: Free CRM create a new Deal creation scenario

	

Given User is already in login page
When User Enters username and password
| eclipse | eclipse |
| tom			| hook		|
Then User Clicks On Login button
Then User is on Home Page
Then User moves to deal page
Then User enters deal details
| test deal |  1000 | 50 | 100 |

