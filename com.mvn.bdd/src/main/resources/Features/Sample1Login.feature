@loginFunctionality
Feature: BDD Practice
  I want to use this template for my Cucumber Training

  Background: 
    And Click on Login

  Scenario: Verify Login Credentials
    Given I Entered Username and Password
    And Clicked on Submit
    Then I validate the User Credentials
    Then I Logout From the Application

  Scenario: Verify Login Credentials With Parameters
    Given I Entered "agusta@helipar.net" and "Aviall321"
    And Clicked on Submit
    Then I validate the User Credentials
    Then I Logout From the Application
