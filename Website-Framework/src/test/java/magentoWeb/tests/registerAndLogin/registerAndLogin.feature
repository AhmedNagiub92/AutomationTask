Feature: Register and Login

  Scenario: User sign up on magento website
    Given Magento website is opened
    When user clicks on create an account tab
    And user enters firstName
    And user enters lastName
    And user enters email
    And user enters password
    And user enters confirmPassword
    And user clicks on create an account button
    Then user account created successfully
