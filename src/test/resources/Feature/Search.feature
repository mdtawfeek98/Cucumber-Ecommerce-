Feature: Search Page Functionality

  Scenario: TC_one Verify that the search results should be as per the search query
    When Enter search text in search field and click on search icon "short"
    Then Search should be performed according to search text provided by user

  Scenario: TC_two Verify that Verify that search field accepts numbers
    When Enter search text in search field and click on search icon "212"
    Then Search should be not performed according to search text provided by user

  Scenario: TC_three Verify that Verify that search field accepts symbol
    When Enter search text in search field and click on search icon "#$!"
    Then Search should be not performed according to search text provided by user

  Scenario: TC_four Verify that user should be able to search based on product brand name 
    When Enter search text in search field and click on search icon "luma"
    Then Search should be performed according to search text provided by user

  Scenario: TC_five Verify that the History of search results displayed
    When Enter search text in search field ""
    Then Click the search field

  Scenario: TC_six Verify that the Auto suggestions should be there
    When Enter search text in search field "pants"
    Then AutoSuggestion should be be displayed
    
  Scenario: TC_six Verify that without text and click the search btn
    When Launch a cursor in search field 
    Then  No action happened successfully
