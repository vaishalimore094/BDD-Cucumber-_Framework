package Featurefile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("user open the application")
	public void user_open_the_application() {
	    System.out.println("application got open");
	}

	@When("user Enter valid product into search field")
	public void user_enter_valid_product_into_search_field() {
	    System.out.println(" valid product got into search field");
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
	    System.out.println("user clicked on search button");
	}

	@Then("valid product should be get display in search result")
	public void valid_product_should_be_get_display_in_search_result() {
	    System.out.println("valid product got display in search");
	}

	@When("user Enter invalid product into search field")
	public void user_enter_invalid_product_into_search_field() {
	    System.out.println("user got invalid product");
	}

	@Then("proper text informing the user about no product matching should be display")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_display() {
	    System.out.println("no product matching displayed");
	}


	
}
