import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSubMenu {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.bigbasket.com/?utm_source=google&gclid=EAIaIQobChMIosqe-Zvi-AIVkzUrCh3-vgL0EAAYASAAEgJWGfD_BwE&utm_campaign=Brand-NOI&utm_medium=cpc");
		driver.manage().window().maximize();
		
		By menu=By.xpath("//a[@qa='categoryDD'] ");
		By beverages=By.xpath("//a[text()='Beverages' and @qa='catL1'] ");
		By tea=By.linkText("Tea");
		By teaBag=By.linkText("Tea Bags");
		By tajMahal=By.linkText("Taj Mahal");
		multilevelSubMenu(menu, beverages, tea, teaBag, tajMahal);
		}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void multilevelSubMenu(By locator1, By locator2, By locator3, By locator4, By locator5) throws InterruptedException {
		Actions act =new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(getElement(locator1)).build().perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(locator2)).build().perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(locator3)).build().perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(locator4)).build().perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(locator5)).click().build().perform();
	}

}
