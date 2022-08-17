import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		Thread.sleep(3000);
		
		By country=By.id("Form_submitForm_Country");
		By state=By.id("Form_submitForm_State");
//		doSelectByVisibleText(country, "India");
//		doSelectByVisibleText(state, "Uttarakhand");
		
		int count=doSelectCount(country);
		System.out.println(count);
		

	}
	
	public static WebElement getElement(By locator)
	{	
		 return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectByVisibleText(By locator, String visibleText) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	public static void doSelectByValue(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static int doSelectCount(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions().size();
	}

}
