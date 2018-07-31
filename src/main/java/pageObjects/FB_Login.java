package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_Login
{
	WebDriver driver;

	//UserName Field
	@FindBy(id="email")
	WebElement usrname;
	
	//Password Field
	@FindBy(id="pass")
	WebElement password;
	
	//Login Button Field
	@FindBy(id="loginbutton")
	WebElement loginbtn;
	
	
	public FB_Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void isLoginPageDisplayed()
	{
		//String pageTitle = driver.getTitle();
		//System.out.println(pageTitle);
	}
	
	public void fbLogin(String username, String Password)
	{
		usrname.sendKeys(username);
		password.sendKeys(Password);
		loginbtn.click();
	}

}
