Feature: Login

  Scenario: Verify User able to login with valid credentials
    Given User should be in login page
    When User enter username "Admin"
    And User enter password "admin123"
    And User click login button
    Then User should navigate to home page
	
	Scenario: Verify User login with invalid redentials
	  Given User should be in login page
    When User enter username "Admin"
    And User enter password "admin1234"
    And User click login button
    Then User should be in login page
		