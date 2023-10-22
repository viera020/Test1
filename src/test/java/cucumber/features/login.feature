Feature: Login saucedemo

  Scenario: Success Login
    Given On Login Page
    When User Enter Registered Username
    And User Enter Registered Password
    And Click Login Button
    Then User in Dashboard Page


  Scenario: Failed Login
    Given On Login Page
    When User Enter Registered Username
    And User Enter Unregistered Password
    And Click Login Button
    Then User in Dashboard Page