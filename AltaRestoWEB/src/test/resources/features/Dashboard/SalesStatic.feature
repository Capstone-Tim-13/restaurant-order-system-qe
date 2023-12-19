Feature: Sales Static
  as a admin i want to view monthly sales static
  so that i can view monthly income

  Scenario: as a admin i can view monthly sales static
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click period time
    And i choose the month
    Then sales static from that month is displayed