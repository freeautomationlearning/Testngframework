/**
 * 
 */
package com.freeautomationlearning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author CHIRAG
 * 
 * This Test Script contains Soft Assertion
 */
public class Tutorial13 {

	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void verifyValidationMessage()
	{
		System.out.println("Messgae 1");
		softAssert.assertEquals("a", "a");
		
		System.out.println("Messgae 2");
		softAssert.assertEquals("a", "a");
		
		System.out.println("Messgae 3");
		//softAssert.assertEquals("a", "b");
		Assert.assertEquals("a", "b");
		
		System.out.println("Messgae 4");
		softAssert.assertEquals("a", "a");
		
		System.out.println("Messgae 5");
		softAssert.assertEquals("a", "c");
		
		softAssert.assertAll();
	}
}
