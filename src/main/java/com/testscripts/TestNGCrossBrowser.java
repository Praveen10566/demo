package com.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGCrossBrowser {
	public static WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public static void setup(String browserName) throws InterruptedException
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\praveen\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			
			//driver.navigate().to("https://www.facebook.com");
		} 
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\praveen\\Desktop\\Selenium jars\\geckodriver-v0.21.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.navigate().to("https://www.facebook.com");
			Thread.sleep(15000);
			
			
		}

	}

	

    @Test
	public void invokeApp() {
		driver.get("https://www.facebook.com");
	}
	

	@AfterClass
	public void temp() {
		driver.close();
	}

}
