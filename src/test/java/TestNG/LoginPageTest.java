package TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test
	public void logoTest() {
		boolean flag=driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void passwordLinkTest() {
		boolean flag=driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	@Test
	public void loginTest() {
		driver.findElement(By.id("input-email")).sendKeys("Tyagi");
		driver.findElement(By.id("input-password")).sendKeys("Tyagi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String text=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(text);
		Assert.assertEquals
		(text, "Warning: No match for E-Mail Address and/or Password.");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
