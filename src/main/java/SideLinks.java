import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SideLinks {

	private static WebDriver driver;
	public static void main(String args[])  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By sideLinkLocator =By.xpath("//aside[@id='column-right']//div[@class='list-group']//a");
		sideLinks(sideLinkLocator);
		
		 }

	
	
	public static List<WebElement> getElements(By locator) {
		List<WebElement> list=driver.findElements(locator);
		return list;
	}
	public static void sideLinks(By locator) {
		List<WebElement> lists=getElements(locator);
		int i=lists.size();
		System.out.println(i);
		 for(int j=0;j<i;j++) {
			 String text=lists.get(j).getText();
			 System.out.println(j+ " : "+ text);
	}
	

}
}
