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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 *This class is for parameters through TestNG xml file
 */
public class Tutorial10 {

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
	@Parameters({"keyword"})
	@Test
	public void searchKeyword(@Optional("Selenium 3")String para)
	{
		driver.findElement(By.name("q")).sendKeys(para);
		try {
			Thread.sleep(5000);
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
}
