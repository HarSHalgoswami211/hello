package swaglabtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.browser;
import POM.LoginPage;
import Utility.BaseClass;
import Utility.parametrization;


@Listeners(Utility.listeners.class)

public class loginpagetest extends BaseClass {
	
	@BeforeTest
	public void openbrowser() {
		driver = browser.openBrowser();
	}
	
	
	@Test
	public void loginwithvalidcredentials() throws EncryptedDocumentException, IOException {
		LoginPage test = new LoginPage(driver);
		String username = parametrization.ExcelSheet("credentials", 1, 1);
		String password = parametrization.ExcelSheet("credentials", 1, 2);
		test.enterusername(username);
		test.enterpassword(password);
		test.clickOnLogin();
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		Assert.assertNotEquals(actualURL, expectedURL);
		
	}

}
