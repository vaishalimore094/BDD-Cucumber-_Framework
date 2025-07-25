package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsDefination {
	 public WebDriver driver;
	 public LoginPage loginpage;
	@Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		loginpage=new LoginPage(driver);
	}
	
	
	@Given("User Launch Chromebrowser")
	public void user_launch_chromebrowser() {
		// Initialization is already done in the @Before hook
		
	    
	}
	@When("User Open URL\"https:\\/\\/admin-demo.nopcommerce.com\\/login\"")
	public void user_open_url_https_admin_demo_nopcommerce_com_login() {
	   
	    System.out.println("User Open URL\"https:\\/\\/admin-demo.nopcommerce.com\\/login\"");
	    
	}

	@When("User Email Adddress {string} and Password as {string}")
	public void user_email_adddress_and_password_as(String Email, String pass) throws InterruptedException {
	    loginpage.enterEmail(Email);
	    loginpage.enterPassword(pass);
	}

	@When("click on the Login")
	public void click_on_the_login() {
		loginpage.clicklogin();
	    
	}

	@Then("Page Title should be{string}")
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
