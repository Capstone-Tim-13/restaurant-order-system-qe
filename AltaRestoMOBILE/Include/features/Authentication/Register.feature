@Register
Feature: User can register
 
  @Register-valid-credentials
  Scenario: as a user I can register with valid credentials
    Given user on the register page
    When i input Name
    And i input email
    And i input password
    And i confirm password
    And i click masuk button
    Then i directed to login page
    
    @Register-invalid-email-credentials
    Scenario: as a user I cannot register with invalid email credentials
    Given user on the register page
    When i input Name
    And i input invalid email credentials
    And i input password
    And i confirm password
    Then error message is displayed
    
    @Register-empty-field
    Scenario: as a user i cannot regist with empty field
    Given user on the register page
    When i didn't input field name
    And i input email
    And i input password
    And i confirm password
    Then error message is displayed
    
    
    
