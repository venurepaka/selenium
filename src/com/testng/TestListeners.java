package com.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestListeners {

	@Test
	public void t1() {
	System.out.println("t1");
	assertTrue(false);
	
	}
	
	
	@Test
	public void t2() {
	System.out.println("Initializing the data for processing!");
	}
	
	@Test
	public void t3() {
		System.out.println("t3");
		assertTrue(false);
		
	}
	
	
}
	

