@Minum
Feature: User can view Minum menu
  I want to use this template for my feature file

  @Can-view-Minum-menu
  Scenario: As a user I can view Minum menu
    Given I am on the homepage
    When I click Minum menu
    And I directed to Minum menu page
    Then I can view Minum menu
    
  @Create-order-Minum-menu
  Scenario: As a user I can create order Minum menu
    Given I am on the homepage
    When I click Minum menu
    And I click add on the menu
    And I click cart menu
    Then I can see menu order
    
    