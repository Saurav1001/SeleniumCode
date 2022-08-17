import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By email=By.id("input-email");
		By telphone=By.id("input-telephone");
		By password=By.id("input-telephone");
		By confirmPass=By.id("input-confirm");
		By ctnBtn=By.xpath("//input[@value='Continue']");
		By linkText=By.linkText("Site Map");
		
		
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public  static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String getText(By locator) {
		return getElement(locator).getText();
	}


}
