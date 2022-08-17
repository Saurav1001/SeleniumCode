package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	@BeforeTest
	public void setUP() {
		System.out.println("this is before test");
	}
//	@BeforeMethod
//	public void launchBowser() {
//		System.out.println("in before method");
//	}
	
	@Test(priority = 1)
	public void homePageTest() {
		System.out.println("Home Page");
	}
	@Test(priority = 0)
	public void searchTest() {
		System.out.println("In Serach Test");
	}
	@Test(priority = 0)
	public void cserPageTest() {
		System.out.println("In userPage test");
	}
//	@AfterMethod
//	public void closeBroswer() {
//		System.out.println("Close browser After Method");
//	}

}
