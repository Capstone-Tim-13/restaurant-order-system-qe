Feature: Logout
  as a admin i can logout
  so that the admin account can be logged out

  Background:
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click remember me button switch
    And i click login button
    Then i directed to dashboard page

  Scenario: as a admin i can logout
    When i click logout button
    Then i directed to login page