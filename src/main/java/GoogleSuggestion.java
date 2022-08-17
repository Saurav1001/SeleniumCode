import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestion {
	private static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		By textEnter=By.name("q");
		By suggestions=By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']");
		
		paramSearch(textEnter, suggestions, "Naveen Automation Lab", "youtube");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
//	public static List<WebElement> getElements(By locator) {
//		List<WebElement> lists=driver.findElements(locator);
//		return lists;
//		
//	}
	
	public static void paramSearch(By textEnter,By suggestions, String searchKey, String clickText) throws InterruptedException {
		doSendKeys(textEnter, searchKey);
		Thread.sleep(3000);
//		getElements(suggestions);
//		System.out.println(lists.size());
		List<WebElement> lists=driver.findElements(suggestions);
		System.out.println(lists.size());
		for(WebElement e: lists) {
			String SuggText=e.getText();
			System.out.println(SuggText);
			if(SuggText.contains(clickText)) {
				e.click();
				break;
			}
		}
		
		
		
		
		
	}
	
	

}
