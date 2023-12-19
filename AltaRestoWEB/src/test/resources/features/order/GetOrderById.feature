Feature: Get order By ID
  as a admin i want to get order by id
  so that i can get selected order

  Scenario: as a admin i can get order by id
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click order page
    And i input order id
    Then the order by id is displayed

  Scenario: as a admin i cannot get order by unexist id
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click order page
    And i input unexist order id
    Then order is not displayed