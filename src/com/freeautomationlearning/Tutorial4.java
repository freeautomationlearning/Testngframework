/**
 * 
 */
package com.freeautomationlearning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 */
public class Tutorial4 {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite is executed");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass is executed");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest is executed");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass is executed");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod is executed");
	}
	
	@Test
	public void testScript()
	{
		System.out.println("testScript is executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod is executed");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest is executed");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite is executed");
	}
}
