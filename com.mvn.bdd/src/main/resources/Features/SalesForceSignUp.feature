#Author: skurry189@gmail.com
@SalesForce
Feature: Sales Force Try For Free
  I want to use this template for my feature file

  Scenario: Start Your Trail Now
    Given I Was In Sales Force Home Page
    And Click on Try For Free
    When I Navigate to Registration Page
    Then Fill All Mandatory Details
      | FirstName | LastName | Email                    | PhoneNum   | Company         |
      | Test      | Sample   | suresh.kurry@company.com | 9966890198 | SeleniumCompany |
