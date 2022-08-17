import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// no need to download chrome version, as this will download chrome file
												// locally and make your system compatiable
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\hp\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		String title = driver.getTitle();
//		
//		String url=driver.getCurrentUrl();
//		if (title.contains("Login")) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("FAIL");
//		}
//		if (url.contains("account")) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("FAIL");
//		}
		By email=By.id("input-email");
		By password=By.id("input-password");
		
		WebElement emailid=driver.findElement(email);
		WebElement passwordid=driver.findElement(password);
		emailid.sendKeys("sauravtyagi123@gmail.com");
		passwordid.sendKeys("1234");
		
		//driver.close();
//		//driver.quit();//session id will be null
//		driver.close();// session id will be invalid
//		String title1=driver.getTitle();
//		System.out.println(title1);

	}

}
