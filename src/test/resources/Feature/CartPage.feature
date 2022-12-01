Feature: Add to CartPage

  Scenario: TC_One Verify that when user clicks add-to-cart button is clickable or not
    When Click on any product displayed on home page
    And Click on add to cart for the product
    Then The product should be added to cart btn is clickable successfully

  Scenario: TC_two Verify that when user clicks on add to cart the product should be added to cart
    When Click on any product displayed on home page
    And Click on add to cart for the product
    Then The product should be added to cart

  Scenario: TC_three Check on adding the new products into the cart and whether the count is increasing or not
    When Click on any product displayed on home page
    And Click on add to cart for the product
    And Again Click on add to cart for the product
    Then The product should be added to cart

  Scenario: TC_four Check after Adding one item to the cart and verify
    When Click on any product displayed on home page
    And Click on add to cart for the product
    And Again Click on add to cart for the product
    Then The product should be added to cart
