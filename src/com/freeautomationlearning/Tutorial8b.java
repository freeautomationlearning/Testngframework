/**
 * 
 */
package com.freeautomationlearning;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Factory;

/**
 * @author CHIRAG
 *
 */
public class Tutorial8b {

	// In this Class we create object factory for class Tutorial 8a
	WebDriver driver;
		@Factory
	public Object[] createFactory()
	{
		Object[] obj = new Object[3];
		for(int i=0;i<=2;i++)
		{
			obj[i]= new Tutorial8a(driver);
		}
		return obj;
	}
}
