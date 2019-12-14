package com.ajay.java.TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.ajay.java.TestNG.ListnerTestNG.class)
public class ListnerTestClass {

	
	int sum =0;
	int a=5,b=8;
	@Test
	
	public void sum(){
		sum = a+b;
		Assert.assertEquals(sum, 13);
	}
	
	@Test
	public void fialToTest(){
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods="fialToTest")
	public void test(){
		System.out.println("depends on result of failToTest");
	}
	
	
}
