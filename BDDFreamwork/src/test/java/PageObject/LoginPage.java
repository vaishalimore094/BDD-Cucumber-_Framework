package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	//webelement declaration
	
	@FindBy(id="Email") WebElement email;
	@FindBy(id="Password") WebElement  password;
	@FindBy(xpath="//button[text()='Log in']") WebElement  loginbtn;
	@FindBy(linkText="Logout") WebElement Logoutbtn;
	
	
	// webelement inititisation
	
   public LoginPage(WebDriver rDriver)
	{
		
		ldriver=rDriver;
		PageFactory.initElements(rDriver,this);
		
	}
	
	//Actions
	
	public void enterEmail(String emailAdd) throws InterruptedException
	{
		email.clear();	
		Thread.sleep(2000);
		email.sendKeys(emailAdd);
	}
	public void enterPassword(String PWD) throws InterruptedException
	{
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(PWD);
		
	}
	public void clicklogin()
	{
		
		loginbtn.click();
	}
	public void clicklogout()
	{
		
		Logoutbtn.click();
	}
	
	

}
