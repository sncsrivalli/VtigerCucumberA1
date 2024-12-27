@flipkart
Feature: Add To Cart

  Background: 
    Given I navigate to flipkart

  Scenario: Verify user can add an item to cart
    When I search for mobiles
    And I click on a mobile
    And I click on cart symbol
    Then Mobile should be added to cart
