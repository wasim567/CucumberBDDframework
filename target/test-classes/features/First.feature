

Feature: Search Feature validation in both home and landing pages

  @ValidateResult
  Scenario Outline: Validate the search result consistency in both homepage and landing pages
    Given User is on Greenkart homepage
    When user searched with shortname <Name> and extracted the actual item name
    Then user searched for the same short name <Name> in offerspage
    And validate the product name in offers page matches with actual item name inLanding page
    
    Examples:
    |Name|
    |Tom|
    |Beet|
  
