Feature: Amazon Order page

Background:
Given a registered user exists
    Given user as an amazon login page
    When user enters UserName
    And user enters password
    And user click on login button 
    Then user navigate to order page
  
Scenario: Check previous order details
    When user click on order page
    Then user checks the previous order details
   
Scenario: Check open order Details
    When user click on open order page
    Then user checks the open order details
    
    
   Scenario: Check cancelled order Details
    When user click on cancelled order page
    Then user checks the cancelled order details
