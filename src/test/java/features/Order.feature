@Regression
Feature: This feature will be used to automate PizzaHut Website

  Scenario Outline: This scenario will be used to Place the Order
    Given I have launched the application
    When I enter the location as "Pune"
    And I select the very first suggestion from the list
    Then I should land on the Deals page
    And I select the tab as "Pizzas"
    And I add "mazedar-makhni-paneer" to the basket
    And I note down the price displayed on the screen
    Then I should see the pizza "Personal Mazedar Makhni Paneer" is added to the cart
    And price is also displayed correctly
    And I click on the Checkout button
    And I should be landed on the secured checkout page
    And I enter the personal details "<Name>" and "<Mobile>" and "<Email>" and address details "<Address>" and "<Landmark>"
    Examples:
      | Name          | Mobile     | Email              | Address               | Landmark            |
      | Rajesh Sharma | 9122512512 | rajesh@myemail.com | No 231, SGS Mall Camp | Near Hirabaug Chowk |



