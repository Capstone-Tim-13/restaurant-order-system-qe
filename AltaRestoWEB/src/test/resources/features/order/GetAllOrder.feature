Feature: Get All Order
  As a admin i want to get all order
  so that i can see all incoming order

  Scenario: as a admin i can get all order
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click order page
    Then i can see all order