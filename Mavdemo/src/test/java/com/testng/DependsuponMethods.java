package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsuponMethods {
	
	@Test()
	  public void login() {
		  System.out.println("login");
	  }
	  @Test(dependsOnMethods="login")
	  public void search() {
		  System.out.println("testcase2");
		  Assert.assertEquals("abc","xyz");
	  }
	  @Test(dependsOnMethods="search",alwaysRun="true")
	  public void logout() {
		  System.out.println("logout");
	  }

}
