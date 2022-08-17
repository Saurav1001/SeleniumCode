package TestClasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GooleTest extends BaseTest {

	
	@Test
	public void titleTest() {
		//driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

	@Test
	public void serachTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@title='Search']")).isDisplayed());
	}

	
}
