Feature: Update Status Menu
  as a admin i want to update status menu
  so that i can update if menu out of stock

  Scenario: as a admin i can update status menu
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click menu page
    And i click switch button
    Then status successfully changed