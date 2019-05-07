package com.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Test2 {

	@Test
	public void testMethod3() {
		System.out.println("test method3");
	}
	
	@Test
	public void testMethod4() {
		System.out.println("test method4");
	}
	
	
	@BeforeMethod
	public void testBM() {
		System.out.println("test before method");
	}
	
}

