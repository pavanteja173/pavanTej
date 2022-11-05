   Feature: User is able fetch id of the data 

 @Getbyalcu
Scenario: User wants to retrive the id data from database

When User is able to retrive the id by using an api is "http://localhost:8080/consutants/id/1"
Then User validate the status code of id is 200

 