import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class INterview {

	public static void main(String[] args) throws InterruptedException {
		//input string: str= "abcabccbccc";
//		//Max occuring char is c
//		String s= "abcabccbccc";
//		int totalCount=s.length();
//		int countafter=s.replace("c", "").length();
//		int finalcount=totalCount - countafter;
//		System.out.println(finalcount);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
//		String e=driver.findElement(By.linkText("Vendor Connect")).getText();
//		System.out.println(e);
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		String e1=driver.findElement(By.linkText("Vendor Connect")).getText();
//		System.out.println(e1);
		driver.navigate().to("https://www.bigbasket.com/");
	}
	

}
