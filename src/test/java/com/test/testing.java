package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testing {
	 @Test
	  public void Test1() {
	      System.out.println("Test1");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	      System.out.println("Before T1");
	  }

	  @AfterMethod
	  public void afterMethod() {
	      System.out.println("After T1");
}
}