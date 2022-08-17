import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	private WebDriver driver;
	/**
	 * This class is used for initialize webDriver
	 * @param browserName
	 * @return
	 */
	public WebDriver launchBroswer(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}else {
			System.out.println("Please select the valid bowser : "+browserName );
		}return driver;
	}
	
	public void getUrl(String url) {
		if(url==null) {
			System.out.println("Url is null");
			return;
		}if(url.indexOf("http")==-1) {
			System.out.println("http is missing");
			return;
		}if(url.indexOf("https")==-1) {
			System.out.println("https is missing");
			return;
		}driver.get(url);
	}
	public String getTitle() {
		String title =driver.getTitle();
		//System.out.println("title of page is : "+ title);
		return title;
	}
	
	public void titleTest() {
		if(getTitle().equals("Google1")) {
			System.out.println("Titile is correct");
		}else {
			System.out.println("Title is in correct");
		}
	}
	
	public String getUrl() {
		String currentUrl=driver.getCurrentUrl();
		//System.out.println(currentUrl);
		return currentUrl;
	}
	
	public boolean isUrlFractionExits(String text) {
		if(getUrl().contains(text)) {
			System.out.println("url contains : "+ text);
			return true;
		}else {
			return false;
		}
	}
	
	public void maxSize() {
		driver.manage().window().maximize();
	}
	public void close() {
		driver.close();
	}
	public void quit() {
		driver.quit();
	}
	
	

}
