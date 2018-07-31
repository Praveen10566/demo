Feature: Verify Facebook Login Functionality

#feature allows 3 lines of description

Scenario: user enters a invalid user name and password
Given user is on facebook login page
When user enters username in the username textbox
And user enters password in the password textbox
And user clicks on login button
Then user navigates to other page
And User validates the other message