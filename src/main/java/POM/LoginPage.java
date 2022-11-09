package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id='user-name']")private WebElement username;
	@FindBy (xpath = "//input[@id='password']")private WebElement password;
	@FindBy (xpath = "//input[@id='login-button']")private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	
	public void enterusername(String User) {
		username.sendKeys(User);
	}
	
	public void enterpassword(String Pass) {
		password.sendKeys(Pass);
	}

	public void clickOnLogin() {
		login.click();
	}
}
