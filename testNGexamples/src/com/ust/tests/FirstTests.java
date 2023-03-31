package com.ust.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTests {
  @Test(priority=1,description="this is executed first")
  public void f() {
	  System.out.println("From test method f()");
  }
  
  @Test(priority=2,description="tests description")
  public void a() {
	  System.out.println("From  test method a()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("From before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("From after test");
  }

}
