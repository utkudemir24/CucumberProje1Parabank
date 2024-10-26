Feature: US02 Functionality

  Scenario: positive login
    Given Navigate to Para Bank
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: negative login
    Given Navigate to Para Bank
    When Enter false username and false password and click login button
    Then User should login successfully