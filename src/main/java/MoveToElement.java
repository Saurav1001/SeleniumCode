import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("http://mrbool.com/");
		By content= By.xpath("//a[@class='menulink']");
		By submenu=By.linkText("COURSES");
//		Thread.sleep(3000);
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(content)).build().perform();
//		
		doSubMenu(content, submenu);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	 public static void doSubMenu(By parnetLocator, By childLocator) throws InterruptedException {
		 Actions act=new Actions(driver);
		 act.moveToElement(getElement(parnetLocator)).build().perform();
		 Thread.sleep(3000);
		 getElement(childLocator).click();
	 }

}
