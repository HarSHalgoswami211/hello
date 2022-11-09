package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutoverviewpage {

	@FindBy (xpath = "//button[@name='cancel']")private WebElement cencaltab;
	@FindBy (xpath = "//button[@id='finish']")private WebElement finishtab;
	
	
	public checkoutoverviewpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOncencaltab() {
		cencaltab.click();
	}
	
	public void clickOnfinishtab() {
		finishtab.click();
	}
	
}
