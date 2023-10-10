Feature: user registration
@tag1
Scenario: successful registration
Given i am on the registration
When i fill in the following information
And i click the "registration"button
Then i should see sucess message
 