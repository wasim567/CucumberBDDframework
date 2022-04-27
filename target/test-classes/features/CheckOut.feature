

Feature: Validate the order placement

   @PlaceOrder
  Scenario Outline: Validate the user is able to place the order
    Given User is on Greenkart homepage
    When user searched with shortname <Name> and extracted the actual item name
    And added "3"  items of the selected product to cart
    Then user proceeds to checkout page and validate the <Name> item in checkout page
    And verify user has ability to enter promocode and place the order
    
    Examples:
    |Name|
    |Tom|
    
    
    Scenario: Validate the user is able to login
    Given User is on Greenkart homepage
    When user enters username and password
    Then user is able to login
    
   
