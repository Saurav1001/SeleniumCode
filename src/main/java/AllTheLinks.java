import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllTheLinks {
	
	private static WebDriver driver;
	
	public static List<WebElement> getElements(By locator) {
		
		List<WebElement> links= driver.findElements(locator);
		return links;
	}
	
	public static void allFooterLinks(By locator) {
		List<WebElement> footerLinks=getElements(locator);

		
		System.out.println(footerLinks.size());
		for(WebElement e : footerLinks) {
			String suggestion=e.getText();
			System.out.println(suggestion);
		}
	}
	

	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By linkLocator=By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//li");

		/**
		 * For Footer or Specific links
		 */
		allFooterLinks(linkLocator);
		}
	
	
}
	
	

