import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesAllTogether {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		String parentWindow=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='facebookBtn smGlobalBtn']")).click();
		driver.findElement(By.xpath("//a[@class='instagramBtn smGlobalBtn']")).click();
		driver.findElement(By.xpath("//a[@class='pinterestBtn smGlobalBtn']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		while(it.hasNext()) {
			String windows=it.next();
			driver.switchTo().window(windows);
			System.out.println(driver.getTitle());
			if(!windows.equals(parentWindow)) {
				driver.close();
			}Thread.sleep(2000);
		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
