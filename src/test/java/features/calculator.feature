Feature: Calculator

# addition of two numbers
Scenario: users can give two digits to add
Given User enter first digit 10
And User enter second digit 20
When Add both digits
Then verify addition of two digits are 30

