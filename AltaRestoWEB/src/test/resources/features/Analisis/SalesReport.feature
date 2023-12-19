Feature: Sales Report
  as a admin i want to view sales report by selected period time
  so that i can see sales report by period time

  Scenario: as a admin i can view sales report
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click analisis page
    And i click period time dropdown
    And i select period time
    Then sales report is changing by period time