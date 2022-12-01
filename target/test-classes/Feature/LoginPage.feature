Feature: LoginPage

    
#passing data via datatable
  Scenario: TC_one Verify that user can be able to login by entering a valid credentials
    When Enter the UserName 
    |md.tawfi98@gamil.com|
    |tawfeek37988@gmail.com|
    And Enter the Password  "Halijarahman98#"
    And Click the login button
    Then Verified the username and password
    
    
  Scenario: TC_two Verify that user cannot be able to login by entering a invalid credentials
    When Enter the UserName "tawfeek@gamil.com"
    And Enter the Password "feeksha"
    And Click the login button
    Then User should not be able to click on login Successfully 
    
    
  Scenario: TC_three Verify the validation message  get dispalyed, if user leave  the username or password  as blank
    When Enter the UserName " "
    And Enter the Password " "
    And Click the login button
    Then Validation message  get dispalyed Successfully
    
    
  Scenario: TC_four verify the validation message gets displayed, if the user  exceeds the character limit
    When Enter the UserName "tawfwwwwaewsl "
    And Enter the Password "sahtgeedbshwssswwws "
    And Click the login button
    Then Validation message  get dispalyed Successfully
    
    
  Scenario: TC_five Verify the Forgot Password able to clickable or not     
    When Click the Login in btn
    And Click the forgot password button
    Then User able to click the Forgot Btn Successfully
    
    
    #Scenario Outline: TC_six Verify the login page in different browsers using cross browser
    #Given Open the Browser '<browser>'
    #And Load the Ecommerce url '<url>'
    #When Enter the UserName '<username>'
    #And Enter the Password  '<password>'
    #And Click the login button
    #Then Verify the login page in different browsers Successfully
    #
   #
#
#
    #Examples: 
      #| browser | url                       | username          | password       |     
      #| chrome  | https://magento.softwaretestingboard.com/ | md.tawfi98@gmail.com | Halijarahman98# |
      #| edge    | https://magento.softwaretestingboard.com/ | md.tawfi98@gmail.com | Halijarahman98# |
#
    #
    
    
    
    
    
    
    
    
    
    
