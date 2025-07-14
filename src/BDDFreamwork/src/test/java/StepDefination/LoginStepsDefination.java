package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsDefination {
	 public WebDriver driver;
	public LoginPage loginpage;
	
	@Given("User Launch Chromebrowser")
	public void user_launch_chromebrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		loginpage=new LoginPage(driver);
	    
	}

	@When("User Open URL{String}")
	public void user_open_url(String url) {
		
		driver.get(url);
	   
	}

	@When("User Email Adddress \"admin@yourstore.com\"and Password as {string}")
	public void user_email_adddress_admin_yourstore_com_and_password_as(String emailadd ,String password) 
	{
		loginpage.enterPassword(password);
	    loginpage.enterEmail(emailadd);
	}

	@When("click on the Login")
	public void click_on_the_login() {
		loginpage.clicklogin();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
		
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	    
	}

	@When("User click on Logout link")
	public void user_click_on_logout_link() {
		loginpage.clicklogout();
	    
	}

	@Then("Close Browser")
	public void close_browser() {
		driver.close();
	    
	}




}
