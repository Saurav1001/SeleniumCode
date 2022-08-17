import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesOnebyOne {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='facebookBtn smGlobalBtn']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
//		driver.quit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='instagramBtn smGlobalBtn']")).click();
		
		Set<String> handles1=driver.getWindowHandles();
		Iterator<String> it1=handles1.iterator();
		String parentWindow1=it1.next();
		String childWindow1=it1.next();
		
		driver.switchTo().window(childWindow1);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow1);
		System.out.println(driver.getTitle());
		driver.quit();
		
		//with List
//		List<String> list=new ArrayList<String>(handles);
//		String parentWindow=list.get(0);
//		String childWindow=list.get(1);
//		driver.switchTo().window(childWindow);
//		System.out.println(driver.getTitle());
		

	}

}
