
Feature:Buying items
  Background:
    Given the user navigates to main page

  Scenario Outline: User should be able to start shopping process from home page to checkout
    When User clicks T-Shirt tab
    And User hovers over Faded Short Sleeve T-Shirts
    When User clicks MORE button
    And selects "<quantity>","<size>" and "<color>"
    When User clicks the add to cart button
    When User clicks Continue Shopping button
Examples:
  |  quantity|size|color|
  |  1       |M   |Blue |
  @wip
  Scenario Outline:
    When User hovers over Dress Tab
    When User clicks "Evening Dress"
    When User hovers Printed  Dress
    When User clicks MORE button
    And selects "<quantity>","<size>" and "<color>"
    When User clicks the add to cart button
    When User clicks Continue Shopping button
    Examples:
      | quantity|size|color|
      |  1      | S  |Beige|


  Scenario Outline:
    When User clicks Dress Tab
    When User clicks "Evening Dress"
    When User hovers Printed Summer Dress
    And selects "<quantity>","<size>" and "<color>"
    When User clicks the add to cart button
    When User clicks Continue Shopping button
    When User clicks proceed to checkout button
    When User removes Printed Dress
    When User add the a Faded Short Sleeve T-Shirts
    Then User sees the total price  of Printed Dress
    Then User sees the total price  of Fladed Short Sleeves TShirt
    Then User sees the card total is "$65.53"
    Examples:
      |  quantity|size|color|
      | 1      |M   | Orange|


