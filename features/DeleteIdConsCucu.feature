   Feature: User is able delete id of the data 

 @DeleteById
Scenario: User wants to delete the id data from database

When User is able to delete the id by using an api is "http://localhost:8080/consutants/id/75"
Then User validate the delete status code of id is 200

 