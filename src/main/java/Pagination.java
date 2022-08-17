import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		By hongKong=By.xpath("//td[text()='Hong Kong']/preceding-sibling::td/input[@type='checkbox']");
		By india=By.xpath("//td[text()='India']/preceding-sibling::td/input[@type='checkbox']");
		while (true) {
			if (driver.findElements(By.xpath("//td[text()='Hong Kong']")).size() > 0) {
				//doPaginationmultiCity("India");
				doPaginationSingleCity(hongKong);
				// break;
			}
			WebElement next = driver.findElement(By.linkText("Next"));
			if (next.getAttribute("class").contains("disabled")) {
				System.out.println("WebElement not present");
				break;
			} else {
				next.click();
			}
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doPaginationmultiCity(By locator) {
		List<WebElement> list=getElements(locator);
		for(WebElement e: list) {
			e.click();
	}
	
}
	public static void doPaginationSingleCity(By locator) {
		getElement(locator).click();
	}
}
