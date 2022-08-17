package Xpath;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToValidateLastElement {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-in-ireland-2022-1303299/ireland-vs-india-2nd-t20i-1303308/full-scorecard");
//		String text=driver.findElement
//		(By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div)[last()])//li[last()]")).getText();
//		System.out.println(text);
//		
//		
//		String header=driver.findElement
//		(By.xpath("//a[text()='Help']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div")).getText();
//		System.out.println(header);
		
		
		//List<WebElement> list =driver.findElements(By.xpath("//span[text()='Sanju Samson']/ancestor::tr/td"));
		List<WebElement> list=
				driver.findElements(By.xpath("//span[text()='Sanju Samson']/ancestor::td/following-sibling::td"));
		
		for(WebElement e : list) {
			String score=e.getText();
			System.out.println(score);
		}
	}
	

}
