Feature: Free CRM app test

Scenario: Free CRM deal test
Given User is on deal page
When user fills the deal form
Then deal is created

Scenario: Free CRM contact test
Given User is on contact page
When user fills the contact form
Then contact is created