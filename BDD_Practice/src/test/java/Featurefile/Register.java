package Featurefile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	@Given("I navigate to register page")
	public void i_navigate_to_register_page() {
	    System.out.println(">>User got navigated");
	}

	@When("Enter firstname{string} into the First Name field")
	public void enter_firstname_vaishali_into_the_first_name_field(String firstname) {
	    System.out.println("enter first name "+firstname);
	}

	@When("Enter lastname {string} into the Last Name field")
	public void enter_lastname_into_the_last_name_field(String lastname) {
		System.out.println("enter last name in "+lastname);
	}

	@When("Enter EmailAdress {string} into the Email field")
	public void enter_email_adress_into_the_email_field(String emailtext) {
		System.out.println("enter email adress"+emailtext);
	}

	@When("Enter telephone number\"{int}\" into the telephone field")
	public void enter_telephone_number_into_the_telephone_field(Integer number) {
		System.out.println("enter telephone number "+number);
	}

	@When("Enter Password {string} into the Password field")
	public void enter_password_into_the_password_field(String pwd) {
		System.out.println("enter password "+pwd);
	}

	@When("Enter Password {string} into the  Password confirm field")
	public void enter_password_into_the_password_confirm_field(String pwd) {
		System.out.println("enter  confirmed password "+pwd);
	}

	@When("Selet privacy policy field")
	public void selet_privacy_policy_field() {
		System.out.println("select privacy policy");
	}

	@When("Click on continue button")
	public void click_on_continue_button() {
	    System.out.println("click on continue button");
	}

	@Then("Account sucessfully created")
	public void account_sucessfully_created() {
	    System.out.println("sucessfully logged in");
	}

	@When("Select Yes for newsletter")
	public void select_yes_for_newsletter() {
	    System.out.println("select newsletter");
	}

	@Given("I navigate to register Account  page")
	public void i_navigate_to_register_account_page() {
	    System.out.println("usser navigated");
	}

	@When("user dont enter any field")
	public void user_dont_enter_any_field() {
		System.out.println("user kept all field blank");
	    
	}

	@Then("Warning message should be displayed all the manadetory fields")
	public void warning_message_should_be_displayed_all_the_manadetory_fields() {
		System.out.println("Warning message should be displayed all the manadetory fields");
	    
	}

	@Then("Warning message informing the user about duplicate email should be displayed")
	public void warning_message_informing_the_user_about_duplicate_email_should_be_displayed() {
		System.out.println("Warning message informing the user about duplicate email got ");
	   
	}




}
