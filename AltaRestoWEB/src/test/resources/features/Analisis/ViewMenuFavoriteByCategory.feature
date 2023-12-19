Feature: view menu favorite by category
  as a admin i want to view menu favorite by category
  so that i know which menu that customers like

  Scenario: as a admin i can view menu favorite by category
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click analisis page
    And i click the category
    And i select the category
    Then menu favorite from the selected category is displayed