Feature: Login Test for Homepage

  Scenario: Login with Incorrect Credentials
    Given I navigate to "https://demo.guru99.com/V4"
    When I login with "mngr650713" and "dutUsEr"
    Then I verify the title to be "Guru99 Bank Manager Accounts Page"