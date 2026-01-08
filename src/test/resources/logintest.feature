Feature: Login Test for Homepage

  Scenario: Login with Incorrect Credentials
    Given I am a branch manager with my credentials
    When I login with userId and password
    And I click on login button
    Then I should land into dashboard page