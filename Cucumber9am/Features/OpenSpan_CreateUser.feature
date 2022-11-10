Feature: Create User

Scenario: Verify User creation
Given User should be in home page
When User perform mouseover on sections icon
And User click on users
And User enter first name "Krishna"
And User enter last name "E"
And User enter email "abcd@gmail.com"
And User click add user button
Then User details should appear in table