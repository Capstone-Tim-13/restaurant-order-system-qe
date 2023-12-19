Feature: Create Menu
  as a admin i want to create menu
  so that i can add new menu

  Background:
    Given admin on the login page
    When i input email with valid credentials
    And i input correct password
    And i click login button
    And i directed to dashboard page
    And i click menu page
    And i click tambahkan menu
    And i click tambahkan menu satuan
    And i directed to detail menu


  Scenario: as a admin i can add new menu
    And i click upload foto menu
    And i input nama menu
    And i click kategori
    And i select kategori
    And i input deskripsi menu
    And i input detail harga
    Then i click simpan button
    And i directed to menu page

  Scenario: as a admin i cannot create menu with empty field
    When i click upload foto menu
    And i input nama menu
    And i click kategori
    And i select kategori
    And i didnt input description
    And i input detail harga
    Then i click simpan button
    And i receive error message "Menu Gagal ditambahkan"