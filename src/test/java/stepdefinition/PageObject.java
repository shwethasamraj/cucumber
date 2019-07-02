package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	WebDriver driver;
	//PageObject(WebDriver driver)
	//{
	//	PageFactory.initElements(driver,this.driver);
	//}
	@FindBy(name="userName") public static WebElement un;
	@FindBy(name="password") public static WebElement pass;
	@FindBy(name="Login") public static WebElement login;
}
