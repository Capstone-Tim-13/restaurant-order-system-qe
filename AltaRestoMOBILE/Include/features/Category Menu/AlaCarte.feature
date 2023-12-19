
@AlaCarte
Feature: User can view Ala Carte menu
  I want to use this template for my feature file

  @Can-view-Ala-Carte-menu
  Scenario: As a user I can view Ala Carte menu
    Given I am on the homepage
    When I click Ala Carte menu
    And I directed to Ala Carte menu page
    Then I can view Ala Carte menu
    
  @Create-order-AlaCarte-menu
  Scenario: As a user I can create order Ala Carte menu  
    Given I am on the homepage
    When I click Ala Carte menu
    And I click add on the menu
    And I click cart menu
    Then I can see menu order