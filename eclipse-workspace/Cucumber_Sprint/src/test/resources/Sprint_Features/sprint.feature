Feature: Login Module

Scenario: User should able to login
Given Open the chrome and launch the application
When Enter the User ID and Password
And Clicks on login button
Then Login should be successful

Scenario Outline:Login to ICICI Net Banking account with userid and password
Given user is on Homepage
When user Navigate to Login Page
And user enters "<userid>" and "<password>"
Then user account is visible
     Examples:
     | userid         | password  |
     | 577187266      | Disha@123 |


Scenario: User should able to Login through Mobile Number
 Given Open the browser
 When Enter the Mobile Number, ATM Pin and OTP
 And Click on login button
 Then Login should be successful
 

 