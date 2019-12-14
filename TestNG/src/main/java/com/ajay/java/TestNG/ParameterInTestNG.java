package com.ajay.java.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInTestNG {

	@Test
	@Parameters({"data","data2"})
	public void test(@Optional("default") String data,@Optional("If not passed take default") String data2){
		System.out.println(data.toUpperCase());
		System.out.println(data2);
	}
	
}
