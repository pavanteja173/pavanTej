  Feature: User is able fetch email the data 

@Getbyal
Scenario: User wants to retrive the email data from database

When User is able to retrive the email by using an api is "http://localhost:8080/consutants/email/pavan2@gmail.com"
Then User validate the status code is 200

 