
Feature: Login Page
 Scenario: Sucessful Login with valid creditials
    Given User Launch Chromebrowser 
    When  User Open URL"https://admin-demo.nopcommerce.com/login"
    And  User Email Adddress "admin@yourstore.com" and Password as "admin" 
    And click on the Login button
    Then Page Title should be "Dashboard /nopCommerce administration"
    When  User click on Logout button
    Then Page Title should be "your store. Login"
    And Close Browser
    
    Scenario:  Login with invalid creditials
    Given User Launch Chromebrowser 
    When  User Open URL"https://admin-demo.nopcommerce.com/login"
    And User Enter invalid Email Adddress "admin@yourstoredhhd.com" and  invalid Password as "admin1" 
    And click on the Login button 
    Then User should get proper warning message
    
     Scenario:  Login with valid email adress and invalid password 
    Given User Launch Chromebrowser 
    When  User Open URL"https://admin-demo.nopcommerce.com/login"
    And  User Enter valid Email Adddress "admin@yourstore.com" and invalid Password as "admin2" 
    And click on the Login button 
    Then User should get proper warning message
    
     Scenario:  Login with invalid email adress and valid password 
    Given User Launch Chromebrowser 
    When  User Open URL"https://admin-demo.nopcommerce.com/login"
    And  User Enter invalid  Email Adddress "admin@yourstore.com24" and  valid Password as "admin" 
    And click on the Login button 
    Then User should get proper warning message
    

  