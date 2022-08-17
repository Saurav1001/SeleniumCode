import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DailyPractise {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement country=driver.findElement
				//(By.xpath("//td[text()='Hong Kong']/preceding-sibling::td/input[@type='checkbox']"));
//		List<WebElement> list=driver.findElements(By.xpath("//td[text()='Hong Kong']"));
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0) {
				driver.findElement
				(By.xpath("//td[text()='Hong Kong']/preceding-sibling::td/input[@type='checkbox']")).click();
				break;
			}
			WebElement next=driver.findElement(By.linkText("Next"));
			if(next.getAttribute("class").contains("disbaled")) {
				System.out.println("WebElement is not present");
			}else {
				next.click();
			}
		}

	}

}
