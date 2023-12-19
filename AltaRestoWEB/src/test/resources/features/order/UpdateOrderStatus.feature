Feature: Update Order Status
  as a admin i can update order status
  so that i can change status order

  Scenario: as a admin i can update order status
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click order page
    And i click status order
    Then i change status order