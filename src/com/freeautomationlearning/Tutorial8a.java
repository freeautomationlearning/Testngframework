/**
 * 
 */
package com.freeautomationlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 */
public class Tutorial8a {

	WebDriver driver;
	
	public Tutorial8a(WebDriver driver)
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		this.driver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void searchKeyword()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium 3");
		
	}
}
