Feature: Logging into Flipkart

Scenario Outline: Test validating login

Given Browser is initialized
Then Navigate to "http://flipkart.com/" Site
When User enters the <username> and <pass> and click on login
Then User will be logged in
And Home Page will be displayed and verified succesfully

Examples:
|username				 |pass	   |
|pawarmanish935@gmail.com|Manish@18|
|9769460674				 |Manish@18|