Feature: Email Subscription

  Background: 
    Given Open the Browser "chrome"
    And Load the Ecommerce url "https://magento.softwaretestingboard.com/"

  Scenario: TC_One Verify that User able to Subscribe with valid email Id
    When Enter the E-mail id "tawfeek37988@gmail.com"
    And User able to Click the Subscribe btn
    Then Subscribed successfully

  Scenario: TC_two Verify that User able to Subscribe with Invalid email Id
    When Enter the E-mail id "#@gmail.com"
    And User able to Click the Subscribe btn
    Then Subscribed unsuccessfully

  Scenario: TC_three Verify that User able to get a mail after subscribed
    When Enter the E-mail id "tawfeek37988@gmail.com"
    And User able to Click the Subscribe btn
    Then Subscribed and got a email successfully

  Scenario: TC_four Click the subscribe btn without email id
    When Enter the E-mail id " "
    And User able to Click the Subscribe btn
    Then Enable to click a button but throw a error
