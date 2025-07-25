Feature: Amazon Order page
  
Scenario: Check privious order details
    Given a registered user exists
    Given user as an amazon login page
    When user enters UserName
    And user enters password
    And user click on login button 
    Then user navigate to order page
    Then user checks the previous order details
   
Scenario: Check open order Details
    Given a registered user exists
    Given user as an amazon login page
    When user enters UserName
    And user enters password
    And user click on login button 
    Then user navigate to order page
    Then user checks the open order details
    
Scenario: Check cancelled order Details
    Given a registered user exists
    Given user as an amazon login page
    When user enters UserName
    And user enters password
    And user click on login button 
    Then user navigate to order page
    Then user checks the cancelled order details
    
   
