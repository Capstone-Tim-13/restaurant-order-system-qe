Feature: View Menu By Category
  as a admin i want to view menu by category
  so that i can see menu by category

  Scenario: as a admin i can view menu by category
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click menu page
    And i click category
    Then menu by category is displayed