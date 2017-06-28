/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 */
public class Tutorial7 {
	WebDriver driver;
	
	@BeforeMethod
	public void setUP()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test(dataProvider="readData")
	public void searchKeywords(	String searchKeyword)
	{
		driver.findElement(By.name("q")).sendKeys(searchKeyword);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@DataProvider
	public Object[][] readData()
	{
		Object[][] data = new Object[3][1];
		data[0][0] = "Selenium";
		data[1][0] = "Appium";
		data[2][0] = "Free Automation Learning";
		return data;

	}
}
