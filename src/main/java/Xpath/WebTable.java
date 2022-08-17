package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.cfm?CFID=1526304&CFTOKEN=1df1a97e58255787-B59586CF-C6BF-2327-99AA685E40B3DA87&jsessionid=a630e79435cec972f8e42c675c3d70304b24");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("srvtyagi");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bholenath@10");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
		Thread.sleep(3000);
		//Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//a[text()='CONTACTS']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Riya Tyagi']/parent::td/preceding-sibling::td")).click();
		
		////a[text()='Riya Tyagi']/parent::td/preceding-sibling::td

	}

}
