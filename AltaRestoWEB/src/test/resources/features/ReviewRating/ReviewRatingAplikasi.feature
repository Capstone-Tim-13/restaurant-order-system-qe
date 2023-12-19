Feature: Review Rating aplikasi
  as a admin i want to see review rating aplikasi
  so that i know review rating from aplikasi is worked

  Scenario: as a admin i can see review rating aplikasi version
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click review rating page
    Then review and rating from aplikasi customer is displayed