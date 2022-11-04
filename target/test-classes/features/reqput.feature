 Feature: User is able to update the data in the data base by put method
 Scenario: User wants to update the existing data
 Given User wants to provide the data
 When User put the data using the api is "https://reqres.in/api/users/2"
 Then User checks the status line will be "HTTP/1.1 200 OK"
 And User checks the status code is whether 200 
 
 

