Feature: Login
  as a admin i want to login
  so that i can access dahsboard page

  Background:
    Given admin on the login page


  Scenario: as a admin i can login with valid email credentials
    When i input email with valid credentials
    And i input correct password
    And i click remember me button switch
    And i click login button
    Then i directed to dashboard page

  Scenario: as a admin i cannot login with invalid email credentials
    When i input email with invalid email credentials
    And i input correct password
    And i click login button
    Then warning message "Email tidak valid" is shown

  Scenario: as a admin i cannot login with invalid password
    When i input email with valid credentials
    And i input invalid password
    And i click remember me button switch
    And i click login button
    Then error message "Login Failed" is shown