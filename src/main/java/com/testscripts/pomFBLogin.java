package com.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.FB_Login;

public class pomFBLogin
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveen\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		FB_Login login = PageFactory.initElements(driver, FB_Login.class);
		login.isLoginPageDisplayed();
		login.fbLogin("ypk.reddy566@gmail.com", "Praveen");

	}

}
