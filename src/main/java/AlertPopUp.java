import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {
	private static WebDriver driver;
	private static Alert alert;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		By jsPrompt=By.xpath("//button[text()='Click for JS Prompt']");
		doAlertPopUp(jsPrompt);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator)
;	}
	public static void doAlertPopUp(By locator) {
		getElement(locator).click();
		alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
	}

}
