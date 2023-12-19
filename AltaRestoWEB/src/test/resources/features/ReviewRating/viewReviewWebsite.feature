Feature: Review Rating
  as a admin i want to see review and rating customer from website
  so that i can verify that review ratings feature is worked

  Scenario: as a admin i can see review and rating from website customers
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click review rating page
    And i click website version
    Then review and rating from website customer is displayed