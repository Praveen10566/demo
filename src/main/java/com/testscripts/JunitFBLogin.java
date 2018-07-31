package com.testscripts;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import pageObjects.FB_Login;
public class JunitFBLogin
{

		public static WebDriver driver;
		
		FB_Login login = PageFactory.initElements(driver, FB_Login.class);
		
		@BeforeClass
		public static void setup()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveen\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");

		}
		
		@Test
		public void verifyTheLoginpageDisplayed()
		{
			String actualTitle = driver.getTitle();
			String expTitle = "Facebook - Log In or Sign Up";
			Assert.assertEquals(expTitle, actualTitle);
		}
		
		@Test
		public void facebookLogin()
		{
			login.fbLogin("ypk.reddy566@gmail.com", "Praveen");
			WebElement text = driver.findElement(By.className("_50f6"));
			String expRes = "Log into Facebook";
			String actRes = text.getText();
			Assert.assertEquals(expRes, actRes);
		}
		@AfterClass
		public static void teardown()
		{
			driver.close();
		}
	}



