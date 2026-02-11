Feature: User Login

  Scenario: Successful Login
    Given the user is on the nopCommerce login page
    When the user enters valid credentials with username "karamag229@gmail.com" and password "Karam@Anna"
    And clicks on the Login button
    Then the user should be redirected to the My Account page
    And the user should see a welcome message
