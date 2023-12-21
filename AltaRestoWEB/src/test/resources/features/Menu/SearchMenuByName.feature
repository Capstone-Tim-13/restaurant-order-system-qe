Feature: Menu
  as a admin i want to search menu by name
  so that i can see menu what i want

  Scenario: as a admin i can search menu by name
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click menu page
    And i input name menu
    Then menu i've been searched is displayed

  Scenario: as a admin i cannot search delated menu
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click menu page
    And i input delated name menu
    Then menu is not displayed