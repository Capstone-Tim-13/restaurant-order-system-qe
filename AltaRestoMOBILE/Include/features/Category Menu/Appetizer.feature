@Appetizer
Feature: User can view Appetizer menu
  I want to use this template for my feature file

  @Can-view-Appetizer-menu
  Scenario: as a user I can view Appetizer menu
    Given I am on the homepage
    When I click Appetizer menu
    And I directed to Appetizer menu page
    Then I can view Appetizer menu
    
  @Create-order-Appetizer-menu
  Scenario: As a user I can create order Appetizer menu
    Given I am on the homepage
    When I click Appetizer menu
    And I click add on the menu
    And I click cart menu
    Then I can see menu order