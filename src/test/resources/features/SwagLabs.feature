Feature: Swag Labs Login and Purchase

  @Smoke
  Scenario: Login flow with valid credentials
    Given User opens URL
    When  User enters Username as "standard_user"
    And   User enters Password as "secret_sauce"
    And   User clicks on Login button
    Then  User can see the home page

  @Smoke
  Scenario: Login flow with invalid credentials
    Given User opens URL
    When  User enters Username as "1234"
    And   User enters Password as "12345"
    And   User clicks on Login button
    Then  User can see an error message

  @Sanity
  Scenario: Purchase flow
    Given User opens URL
    When  User enters Username as "standard_user"
    And   User enters Password as "secret_sauce"
    And   User clicks on Login button
    Then  User can see the home page
    When User clicks the add to cart button on a product
    Then User can see a badge with the number of the added products appear on the cart icon on home page
    When User clicks on the cart icon on the home page screen
    Then User should see list of the products added to the cart
    When User clicks on checkout button
    Then User should be redirected to the checkout page
    When User enters first name as "Petya"
    And  User enters last name as "Todorova"
    And  User enters Zip code as "1000"
    And  User clicks on continue button
    Then User can view all the information needed for the order
    When User clicks on finish button
    Then User can see Thank you message
    When User clicks on Back home button
    Then User can see the home page
    And  Close browser