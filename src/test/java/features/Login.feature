Feature: Application login

Scenario: Home page is displayed after login
Given User is on the netbanking login page
When User enters username and password and clicks on login button
Then Home page is displayed
And All the card details are displayed

Scenario: Home page is displayed after login
Given User is on the netbanking login page
When User enters "john" and "234AQ" and clicks on login button
Then Home page is displayed
And All the card details are displayed is "true"