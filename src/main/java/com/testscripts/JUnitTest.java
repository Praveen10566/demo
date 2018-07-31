package com.testscripts;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class JUnitTest
{
	public static WebDriver driver;
	@Test
	public void test1()
	{
		System.out.println("JUnit Testing");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@After
	public void after()
	{
		System.out.println("After");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 :");
	}
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("After Class");
	}

}
