Feature: Create an Account Page

  Scenario: TC_one Verify that Create an Account with valid details
    When Enter the First Name "Mohamed" and Last Name "Tawfeek"
    And Enter the Email id "tawfeek37988@gmail.com"
    And Enter the Password "mohamedTawf90#" and Confirm Password "mohamedTawf90#"
    And Click to create an Account
    Then Created an account Successfully with valid details

  Scenario: TC_Two Verify that Create an Account with Invalid details
    When Enter the First Name "ram" and Last Name "Kumar"
    And Enter the Email id "tawfeek37988gmail.com"
    And Enter the Password "mohamedawf" and Confirm Password "mohamedawf"
    And Click to create an Account
    Then Verified an Account was not created Successfully

  Scenario: TC_three Verify that if a user tries to register an existing username,it shows error
    When Enter the First Name "Mohamed" and Last Name "Tawfeek"
    And Enter the Email id "tawfeek37988@gmail.com"
    And Enter the Password "mohamedTawf90#" and Confirm Password "mohamedTawf90#"
    And Click to create an Account
    Then Verified an Account was not created Successfully

  Scenario: TC_four Verify that the required fields is empty and submit the btn,it shows error
    When Enter the First Name " " and Last Name " "
    And Enter the Email id " "
    And Enter the Password " " and Confirm Password " "
    And Click to create an Account
    Then Verified an Account was not created Successfully

  Scenario: TC_five Check validation on numeric fields by entering special characters
    When Enter the First Name "#$ " and Last Name " @#"
    And Enter the Email id " $@gmail.com"
    And Enter the Password "%^ " and Confirm Password " *"
    And Click to create an Account
    Then Verified an Account was not created Successfully

  #Scenario: TC_six Verify that email id should be Mail format otherwise throwing an error
    #When Enter the First Name "Raj" and Last Name "Kumar"
    #And Enter the Email id "tawfeek.com"
    #And Enter the Password "mohamedTawf90#" and Confirm Password "mohamedTawf90#"
    #And Click to create an Account
#
  #Scenario: TC_seven Verify that password  must be equal or greater than Eight and symbol
    #When Enter the First Name "jagan" and Last Name "suresh"
    #And Enter the Email id "tawfeek37988@gmail.com"
    #And Enter the Password "mohame" and Confirm Password "moham"
    #And Click to create an Account
