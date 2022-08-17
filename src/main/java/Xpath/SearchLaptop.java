package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchLaptop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@type='text' and @name='search']")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']/parent::span")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//select[@name='category_id']/option"));
		int i=list.size();
		System.out.println(i);
		Thread.sleep(3000);
		for(WebElement e : list) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("Desktops")) {
				e.click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("button-search"));
		
	}

}
