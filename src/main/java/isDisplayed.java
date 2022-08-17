import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed {
	
	private static WebDriver driver;

public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		boolean b=driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
//		
//		System.out.println(b);
		//without using the id displayed method
//		WebElement dis=driver.findElement(By.linkText("Forgotten Password"));
//		if(dis) {
//			System.out.println("element is displayed");
//		}
		
		//when web element presents multiple time then use 
		
		By forpass=By.linkText("Forgotten Password");
		
		multipleDisplay(forpass);
		
//		int e=forPass.size();
//		
//		if(e >0) {
//			System.out.println("Element is present 1 time");
//			
//		}else if(e>1) {
//			System.out.println("Element is present 2 time");	
//		}
//		
		driver.quit();
	}

  public static List<WebElement> getElements(By locator) {
	  return driver.findElements(locator);
  }
  
  public static int doIsDisplayed(By locator) {
	  return getElements(locator).size();
  }
  
  public static void multipleDisplay(By locator) {
	  if(doIsDisplayed(locator)> 1) {
		  System.out.println("element is present multiple times");
	  }
  }
  
  public static void singleDisplay(By locator) {
	  if(doIsDisplayed(locator)> 0) {
		  System.out.println("element is present single times");
	  }
  }



}
