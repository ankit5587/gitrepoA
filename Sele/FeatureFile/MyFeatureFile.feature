Feature: Test facebook smole scenario

  Scenario: Test login with valid credentials
    Given open chrome and start application
    When i enter valid user name and password
    Then User should be able to login
