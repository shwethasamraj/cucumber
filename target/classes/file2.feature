Feature: Test Login

Scenario: Login with valid user
Given open newtours app
When user enters uname as "mercury" and pass as "mercury"
And submit login form
Then verify pass

Scenario: Login with invalid user
Given open newtours app
When user enters uname as "shwetha" and pass as "shwe123"
And submit login form
Then verify fail
