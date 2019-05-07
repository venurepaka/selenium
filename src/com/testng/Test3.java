package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

//	@Test
//	public void start() {
//	System.out.println("Starting the server");
//	}
//	@Test
//	public void init() {
//	System.out.println("Initializing the data for processing!");
//	}
//	@Test(dependsOnMethods = { "start", "init" })
//	public void process() {
//	System.out.println("Processing the data!");
//	}
	
	//you can either use dataprovider or testng xml file configuration (parameters).
//	@Parameters({"test3Param1"})
	@Test(dataProvider = "dp")
	public void start(String user, String pwd) {
	System.out.println("Starting the server");
	System.out.println(user+", "+pwd);
//	System.out.println(param+"===");
	}
	
	@DataProvider(name="dp")
	public Object[][] getData() {
		return new Object[][] {
			
			{"user1","pwd1"}
			
		};
		
	
	}
}
