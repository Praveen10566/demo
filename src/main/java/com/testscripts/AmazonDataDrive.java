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


public class AmazonDataDrive {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		//step1: open the Excel Workbook
		
		String xlpath = "C:\\Users\\praveen\\Desktop\\Build_Project.xls";
		FileInputStream fi = new FileInputStream(xlpath);
		Workbook wb = Workbook.getWorkbook(fi);
		
		//step 2: open the sheet
		
		Sheet sh = wb.getSheet("Sheet1");
		
		//step 3: get the cell data
		//System.out.println(sh.getCell(0,1).getContents());
		
		int colCount = sh.getColumns();
		int rowCount = sh.getRows();
		System.out.println("number of columns: "+colCount);
		System.out.println("number of rows: "+rowCount);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveen\\Desktop\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		for(int i = 0;i<=colCount;i++)
		{
			for(int j = 1;j<=rowCount;j++)
			{
				String cellValue = sh.getCell(i,j).getContents();
				driver.findElement(By.id("twotabsearchtextbox")).clear();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(cellValue);
		
				
				driver.findElement(By.cssSelector("input.nav-input")).click();
				System.out.println("Sheet1:"+cellValue);
				Thread.sleep(5000);
			}
		}
	driver.close();
	}

}
