package TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider123 {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@DataProvider
	public Object[][] negativeTesting() {
		return new Object[][]{{"testing", "test123"},{"tyagi","1234"},{"saurav","yuahi"},
		{"poiytu", "pouiuio"},{"tyauai", "987567"}};
	}
	
	@Test(dataProvider = "negativeTesting")
	public void loginTest(String email, String password) {
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Warning: No match for E-Mail Address and/or Password.");
	}
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
