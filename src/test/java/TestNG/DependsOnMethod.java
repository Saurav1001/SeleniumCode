package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void loginTest() {
		System.out.println("in Login Test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("in Home page test");
	}

}
