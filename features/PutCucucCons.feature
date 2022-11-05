   Feature: User is able to put the data in the database
 @PutbyCon
 Scenario: user able to put the data
 Given user is able to put the data in database
 When user put the data by using  api is "http://localhost:8080/consutants"
 Then user validates the put status code  201