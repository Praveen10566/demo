package com.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FBLoginWithExcel 
{

	public static void main(String[] args) throws BiffException, IOException, InterruptedException 
	{
		String xlpath = "C:\\Users\\praveen\\Desktop\\Build_Project.xls";
		FileInputStream fi = new FileInputStream(xlpath);
		Workbook wb = Workbook.getWorkbook(fi);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int colCount = sh.getColumns();
		int rowCount = sh.getRows();
		System.out.println("number of columns: "+colCount);
		System.out.println("number of rows: "+rowCount);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveen\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		for(int i = 0;i<=colCount;i++)
		{
			for(int j = 1;j<=rowCount;j++)
			{

				String cellValue = sh.getCell(i,j).getContents();
				String cellValue1 = sh.getCell(j,i).getContents();
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("pass")).clear();
				driver.findElement(By.id("email")).sendKeys(cellValue);
				driver.findElement(By.id("pass")).sendKeys(cellValue1);
				
				driver.findElement(By.cssSelector("#u_0_2")).click();
				System.out.println("Sheet1:"+cellValue);
				Thread.sleep(5000);
			}
		}
	driver.close();

	}

}
