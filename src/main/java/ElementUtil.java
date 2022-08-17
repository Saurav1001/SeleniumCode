import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;
	private Actions act;
	private Alert alert;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public String getText(By locator) {
		return getElement(locator).getText();
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String getAttribute(By locator, String attributeValue) {
		return getElement(locator).getAttribute(attributeValue);
	}
	/**
	 * this method is used to validate element visibility on web page
	 */
	public List<WebElement> getElements(By locator) {
		  return driver.findElements(locator);
	  }
	public  int doIsDisplayed(By locator) {
		  return getElements(locator).size();
	  }
	  
	  public  void multipleDisplay(By locator) {
		  if(doIsDisplayed(locator)> 1) {
			  System.out.println("element is present multiple times");
		  }
	  }
	  
	  public  void singleDisplay(By locator) {
		  if(doIsDisplayed(locator)> 0) {
			  System.out.println("element is present single times");
		  }
	  }
	  
	  /**
	   * This utility is for Select dropdown
	   * By country=By.id("Form_submitForm_Country");
		By state=By.id("Form_submitForm_State");
		doSelectByVisibleText(country, "India");
		doSelectByVisibleText(state, "Uttarakhand");
	   */
	  public  void doSelectByIndex(By locator, int index) {
			Select select=new Select(getElement(locator));
			select.selectByIndex(index);
		}
		public  void doSelectByVisibleText(By locator, String visibleText) {
			Select select=new Select(getElement(locator));
			select.selectByVisibleText(visibleText);
		}
		public  void doSelectByValue(By locator, String value) {
			Select select=new Select(getElement(locator));
			select.selectByVisibleText(value);
		}
		
		public  int doSelectCount(By locator) {
			Select select=new Select(getElement(locator));
			return select.getOptions().size();
		}
		
		/**
		 * This method is for action class
		 */
		public  void doSubMenu(By parnetLocator, By childLocator) throws InterruptedException {
			 act=new Actions(driver);
			 act.moveToElement(getElement(parnetLocator)).build().perform();
			 Thread.sleep(3000);
			 getElement(childLocator).click();
		 }
		/** 
		 * this is used to handle Alertpopup
		 */
		public  void doAlertPopUp(By locator) {
			getElement(locator).click();
			alert=driver.switchTo().alert();
			String text=alert.getText();
			System.out.println(text);
			alert.accept();
		}


}











