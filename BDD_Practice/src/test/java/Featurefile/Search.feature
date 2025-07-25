
Feature: Search functionality
  

  
  Scenario: Search for a valid product
    Given user open the application
    When user Enter valid product into search field
    And user click on search button 
    Then valid product should be get display in search result
   
Scenario: Search for a invalid product
    Given user open the application
    When user Enter invalid product into search field
    And user click on search button 
    Then proper text informing the user about no product matching should be display
    
   Scenario: Search for a without providing any  product
    Given user open the application
    When user Enter invalid product into search field
    And user click on search button 
    Then proper text informing the user about no product matching should be display
   

  
