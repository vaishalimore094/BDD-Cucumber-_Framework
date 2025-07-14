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
	
	public void enterEmail(String emailAdd)
	{
		
		email.sendKeys(emailAdd);
	}
	public void enterPassword(String PWD)
	{
		
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
