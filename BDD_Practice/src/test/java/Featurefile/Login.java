package Featurefile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("User Launch Chromebrowser")
	public void user_launch_chromebrowser() {
	    System.out.println("User Launch Chromebrowser");
	}

	@When("User Open URL\"https:\\/\\/admin-demo.nopcommerce.com\\/login\"")
	public void user_open_url_https_admin_demo_nopcommerce_com_login() {
	    System.out.println("User Open URL\"https:\\/\\/admin-demo.nopcommerce.com\\/login\"");
	}

	@When("User Email Adddress {string} and Password as {string}")
	public void user_email_adddress_and_password_as(String email, String password) {
		System.out.println("User Email Adddress and password"+email + password);
	    
	}

	@When("click on the Login button")
	public void click_on_the_login_button() {
		System.out.println("click on the Login button");
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String Dashboard ) {
		System.out.println("Page Title should be"+Dashboard );
	    
	}

	@When("User click on Logout button")
	public void user_click_on_logout_button() {
	    System.out.println("User click on Logout button");
	}

	@Then("Close Browser")
	public void close_browser() {
	    System.out.println("Close Browser");
	}

	@When("User Enter invalid Email Adddress {string} and  invalid Password as {string}")
	public void user_enter_invalid_email_adddress_and_invalid_password_as(String email1, String password1) {
	    System.out.println("User Enter invalid Email Adddress and  invalid Password"+email1 +password1);
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() {
	    System.out.println("User should get proper warning message");
	}

	@When("User Enter valid Email Adddress {string} and invalid Password as {string}")
	public void user_enter_valid_email_adddress_and_invalid_password_as(String email, String password1) {
	    System.out.println("User Enter invalid Email Adddress and  invalid Password"+email +password1);
	}

	@When("User Enter invalid  Email Adddress {string} and  valid Password as {string}")
	public void user_enter_invalid_email_adddress_and_valid_password_as(String email1, String password) {
		System.out.println("User Enter valid Email Adddress and  invalid Password"+email1 +password);
	}




}
