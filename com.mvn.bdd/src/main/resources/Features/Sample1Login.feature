Feature: BDD Practice
  I want to use this template for my Cucumber Training

  Scenario: Verify Login Credentials
    Given User is on Home Page
    And Click on Login
    When I Entered Username and Password
    And Clicked on Submit
    Then I validate the User Credentials
    Then I Logout From the Application

  Scenario: Verify Login Credentials
    Given User is on Home Page
    And Click on Login
    When I Entered "agusta@helipar.net" and "Aviall321"
    And Clicked on Submit
    Then I validate the User Credentials
    Then I Logout From the Application
