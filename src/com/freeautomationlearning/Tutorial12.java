/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 * This script contains Assertion  
 */
public class Tutorial12 {

	WebDriver driver;
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void verifyGmail()
	{
		boolean f = false;
		f = driver.findElement(By.xpath("//*[text()='Gmail']")).isDisplayed();
		Assert.assertTrue(f, "Gmail Link in not present");
	}
	
	@Test
	public void verifyGmailText()
	{
		String f = driver.findElement(By.xpath("//*[text()='Gmail']")).getText();
		Assert.assertEquals(f, "Gmail");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
