/**
 * 
 */
package com.freeautomationlearning;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 */
public class Tutorial6 {

	
	@Test(priority=1,enabled=true,description="This is a test method for TESTNG")
	public void atest1()
	{
		//int i = 10/0;
		System.out.println("Test 1");
		 try {
			throw  new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=2,enabled=true,timeOut=200)
	public void ctest2()
	{
		System.out.println("Test 2");
	}
	
	@Test(priority=3)
	public void btest3()
	{
		System.out.println("Test 3");
	}
}
