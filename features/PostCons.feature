   Feature: User is able to post the data in the database
 @PostbyCons
 Scenario: user wants to post the data
 Given user is able to post the data in json formate
 When user post the data by using an api is "http://localhost:8080/consutants"
 Then user validates the post status code is 201