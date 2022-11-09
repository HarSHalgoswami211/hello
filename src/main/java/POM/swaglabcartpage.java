package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swaglabcartpage {
	
	@FindBy (xpath = "//button[@id='remove-sauce-labs-backpack']")private WebElement removeitem;
	@FindBy (xpath = "//button[text()='Checkout']")private WebElement checkout;
	@FindBy (xpath = "//button[@id=\"continue-shopping\"]")private WebElement continueshopping;
	
	public swaglabcartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnremoveitem() {
		removeitem.click();
	}
	
	public void clickOncheckout() {
		checkout.click();
	}

	public void clickOncontinueshopping() {
		continueshopping.click();
	}
}
