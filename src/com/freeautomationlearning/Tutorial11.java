/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 * This script for Cross Browser Testing
 */
public class Tutorial11 {

	WebDriver driver;
	
	@Parameters({"browsername"})
	@BeforeMethod
	public void setUp(@Optional ("firefox") String browser)
	{
		String path = System.getProperty("user.dir")+"//drivers//";
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", path+"MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}else
		{
			System.out.println("Please check browser type");
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void serachKeyWord()
	{
		driver.findElement(By.name("q")).sendKeys("Cross Browser Testing");
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
}
