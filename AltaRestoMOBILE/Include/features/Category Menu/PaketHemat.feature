@PaketHemat
Feature: User can view Paket Hemat menu
  I want to use this template for my feature file

  @Can-view-Paket-Hemat-menu
  Scenario: As a user I canview Paket Hemat menu
    Given I am on the homepage
    When I click Paket Hemat menu
    And I directed to Paket Hemat menu page
    Then I can view Paket Hemat menu
    
  @Craete-order-PaketHemat-menu
  Scenario: As a user I can Create order Paket Hemat menu
    Given I am on the homepage
    When I click Paket Hemat menu
    And I click add on the menu
    And I click cart menu
    Then I can see menu order
      