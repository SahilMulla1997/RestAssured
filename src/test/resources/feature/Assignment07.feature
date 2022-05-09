Feature: Post with future date and validate




@tag7
Scenario: Foreign Exchange Page future date
Given API for foreign exchange two
When posted with future date information
Then validate positive response code received from futuredate