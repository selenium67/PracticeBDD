@dataDriven
Feature: Title of your feature
  I want to use this template for my feature file


  Scenario Outline: Verify Login Credentials
    And Click on Login
    Given I Entered "<UserName>" and "<Password>"
    And Clicked on Submit
    Then I validate the User Credentials
    Then I Logout From the Application

    Examples: 
      | UserName                   | Password  |
      | agusta@helipar.net         | Aviall321 |
      | jbeard@dallasairmotive.com | Aviall321 |
