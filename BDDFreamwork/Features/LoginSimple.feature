
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
  
