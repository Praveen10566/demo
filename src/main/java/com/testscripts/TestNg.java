package com.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg
{
	@Test(groups= {"Module1"})
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Suite");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeGroups(groups= {"Module1"})
	public void beforeGroups()
	{
		System.out.println("Before Group");
	}
	
	@AfterGroups(groups= {"Module1"})
	public void afterGroups()
	{
		System.out.println("After Group");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
}
