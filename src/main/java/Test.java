import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {
		
		BrowserUtil bw=new BrowserUtil();
		WebDriver driver=bw.launchBroswer("chrome");
		bw.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		bw.maxSize();
		System.out.println(bw.getTitle());
//		bw.titleTest();
//		System.out.println(bw.isUrlFractionExits("google"));
		
//		By email=By.id("input-email");
//		By password=By.id("input-password");
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By email=By.id("input-email");
		By telphone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPass=By.id("input-confirm");
		By ctnBtn=By.xpath("//input[@value='Continue']");
		By checkBox=By.xpath("//input[@type='checkbox']");
		By linkText=By.linkText("Site Map");
		By placeHolder=By.xpath("//input[@placeholder='First Name']");
	
		
		ElementUtil eu=new ElementUtil(driver);
		
		eu.doSendKeys(firstName, "saurav");
		System.out.println(eu.getAttribute(placeHolder, "placeholder"));
		eu.doSendKeys(lastName, "tyagi");
		eu.doSendKeys(email, "tyagi@gmail.com");
		eu.doSendKeys(telphone, "9897965790");
		eu.doSendKeys(password, "TYAGI@!@#");
		eu.doSendKeys(confirmPass, "TYAGI@!@#");
		System.out.println(eu.getText(linkText));
		eu.doClick(checkBox);
		eu.doClick(ctnBtn);
		

	}

}
