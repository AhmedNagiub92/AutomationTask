Feature: My Cart section
@smoke
  Scenario: User checks out the order after complete the payment details
    Given Magento website is opened
    When user clicks on shop new yoga
    And user choose Echo fit compression short
    And user choose the size
    And user Choose the color
    And user clicks on Add to cart
    And user clicks on the cart
    And user clicks on proceed to checkout
    And user enters  shipping email
    And user enters shipping firstName
    And user enters shipping lastName
    And user enters shipping street address
    And user enters city
    And user enter Postal code
    And user enter country
    And user enters phone number
    And user choose shipping method
    And user clicks on Next Btn
    And user clicks on place order
    Then user get succes purchase with tracking ID