
Feature: User Registration
  Scenario: Register with manadetory fields
    Given I navigate to register page
    When Enter firstname"Vaishali" into the First Name field
    And Enter lastname "More" into the Last Name field
    And Enter EmailAdress "vaishalimore@gmail.com" into the Email field
    And Enter telephone number"123567" into the telephone field
    And Enter Password "admin123" into the Password field
    And Enter Password "admin123" into the  Password confirm field
    And Selet privacy policy field
    And Click on continue button
    Then Account sucessfully created
    
    
    Scenario: Register with all fields
    Given I navigate to register page
    When  Enter firstname"Vaishali" into the First Name field
    And Enter lastname "More" into the Last Name field
    And Enter EmailAdress "vaishalimore@gmail.com" into the Email field
    And Enter telephone number"123567" into the telephone field
    And Enter Password "admin123" into the Password field
    And Enter Password "admin123" into the  Password confirm field
    And Select Yes for newsletter
    And Selet privacy policy field
    And Click on continue button
    Then Account sucessfully created
    
     Scenario: Register without providing any fields
    Given I navigate to register Account  page
    When user dont enter any field
    And Click on continue button
    Then Warning message should be displayed all the manadetory fields
    
    Scenario: Register with duplicate email fields
    Given I navigate to register page
    When Enter firstname"Vaishali" into the First Name field
    And Enter lastname "More" into the Last Name field
    And Enter EmailAdress "vaishalimore@gmail.com" into the Email field
    And Enter telephone number"123567" into the telephone field
    And Enter Password "admin123" into the Password field
    And Enter Password "admin123" into the  Password confirm field
    And Selet privacy policy field
    And Selet privacy policy field
    And Click on continue button
    Then Warning message informing the user about duplicate email should be displayed
    
    
    
    
    