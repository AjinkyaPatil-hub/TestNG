package com.ajay.java.TestNG;

import org.testng.annotations.Test;

public class GropupingInTestNG {

	
	@Test(groups="sanity")
	public void test() {
		System.out.println("in sanity");
	}
	@Test(groups={"sanity","regression"})
	public void test2() {
		System.out.println("in sanity||regression");
	}
	@Test(groups= "regression")
	public void test3() {
	System.out.println("In regression");
	}

}
