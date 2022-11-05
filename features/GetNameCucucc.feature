    Feature: User is able fetch name data in database

 @Getbyalll
Scenario: User wants to retrive the name of the data from database

When User is able to retrive  name by using an api is "http://localhost:8080/consutants/name/rahult"
Then User validate the status code of getby name data  200

 