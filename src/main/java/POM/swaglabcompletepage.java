package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swaglabcompletepage {
	
	@FindBy (xpath = "//button[@name='back-to-products']")private WebElement backToProduct;
	
	public swaglabcompletepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnbackToProduct() {
		backToProduct.click();
	}

}
