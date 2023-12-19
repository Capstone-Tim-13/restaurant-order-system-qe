Feature: Update Menu
  as a admin i want to update menu
  so that menu is updated

  Background:
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click menu page
    And i click settings on the menu
    And i click edit
  
  Scenario: as a admin i can search order by id
    And i input new data
    And i click simpan button
    
  Scenario: as a admin i cannot update with empty field
    And i input new data with empty field
    And i click simpan button
    And i receive error message "Menu Gagal ditambahkan"