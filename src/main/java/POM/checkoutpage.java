package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {

	@FindBy (xpath = "//input[@data-test='firstName']")private WebElement firstname;
	@FindBy (xpath = "//input[@data-test='lastName']")private WebElement lastname;
	@FindBy (xpath = "//input[@data-test='postalCode']") private WebElement postalCode;
	@FindBy (xpath = "//input[@data-test='continue']") private WebElement continuetab;
	@FindBy (xpath = "//button[@data-test='cancel']")private WebElement canceltab;

	
	public checkoutpage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterfirstname(String name) {
		firstname.sendKeys(name);
	}
	
	public void enterlastname(String surname) {
		lastname.sendKeys(surname);
	}
	
	public void enterpostalCode(String code) {
		postalCode.sendKeys(code);
	}
	
	public void clickOncontinuetab() {
		continuetab.click();
	}
	
	
	public void clickOncanceltab() {
		canceltab.click();
	}
	
	
	
	
	
	
	
}
