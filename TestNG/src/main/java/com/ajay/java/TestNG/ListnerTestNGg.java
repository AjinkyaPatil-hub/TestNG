package com.ajay.java.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListnerTestNGg {
	
	int i=1;

	@Test(successPercentage=60, invocationCount=5)
	public void test(){
		i++;
		System.out.println(i);
		if(i==1 || i==2){
			System.out.println("test failed..");
			Assert.assertEquals(i, 8);
		}
	}

}
