@Dessert
Feature: User can view Dessert menu
  I want to use this template for my feature file

  @Can-view-Dessert-manu
  Scenario: As a user I can view Dessert menu
    Given I am on the homepage
    When I click Dessert menu
    And I directed to Dessert menu page
    Then I can view Dessert menu
    
  @Create-order-Dessert-menu
  Scenario: As a user I can create order Dessert menu
    Given I am on the homepage
    When I click Dessert menu
    And I click add on the menu
    And I click cart menu
    Then I can see menu order
    
   
    
    