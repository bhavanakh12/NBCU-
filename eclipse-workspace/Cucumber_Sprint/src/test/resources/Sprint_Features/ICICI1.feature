 Feature: Login module with negative scenario
 
 Scenario: try to login with wrong password
 Given Open the browser
 When Enter the userid and wrong password
 And Click on login
 Then Account login denied