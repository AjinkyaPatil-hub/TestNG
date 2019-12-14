package com.ajay.java.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {

	//pass
	@Test
	public void test() {
		Assert.assertTrue(true);
	}
	//fails
	@Test
	public void test1() {
		Assert.assertTrue(false);
	}
	//fails
	@Test
	public void test2() {
		Assert.assertEquals("Test", "Test1");
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("Test2", "Test2");
	}

	//fails
	@Test
	public void test4() {
		Assert.assertTrue(false, "not matching the expectd output..");
	}

	//pass
	@Test
	public void test5() {
		Assert.assertFalse(false, "this is expected..");
	}
	//pass
	@Test
	public void test6() {
		Assert.assertNotEquals("Test", "Test1");
	}
}
