package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swaglabproductPage {
	
	@FindBy (xpath = "//button[text()='Open Menu']")private WebElement Menu;
	@FindBy (xpath = "//a[text()='All Items']")private WebElement AllItems;
    @FindBy (xpath = "//a[text()='About']")private WebElement About;
    @FindBy (xpath = "//a[text()='Logout']")private WebElement LogOut;
    @FindBy (xpath = "//a[text()='Reset App State']")private WebElement ResetAppState;
    @FindBy (xpath = "//button[text()='Add to cart']")private WebElement AddToCart;
    @FindBy (xpath = "//button[text()='Remove']") private WebElement Remove;
    @FindBy (xpath = "//select[@class='product_sort_container']") private WebElement productfilter;
    @FindBy (xpath = "//a[@class=\"shopping_cart_link\"]") private WebElement Cart;
    @FindBy (xpath = "//a[text() = 'Twitter']") private WebElement SwagLabTwitterpage;
    @FindBy (xpath = "//a[text() = 'Facebook']") private WebElement SwagLabFacebookpage;
    @FindBy (xpath ="//a[text() = 'LinkedIn']") private WebElement SwagLabLinkedInpage;

    
    public swaglabproductPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }

    public void clickOnMenu() {
    	Menu.click();
    }
    
    public void clickOnAllItems() {
    	AllItems.click();
    }
    
    public void clickOnAbout() {
    	About.click();
    }
    
    public void clickOnLogOut() {
    	LogOut.click();
    }
    
    public void clickOnResetAppState() {
    	ResetAppState.click();
    }
    
    public void clickOnAddToCart() {
    	AddToCart.click();
    }
    
    public void clickOnRemoveItem() {
    	Remove.click();
    }
    
    public void clickOnproductfilter() {
    	productfilter.click();
    }
    
    public void clickOnCart() {
    	Cart.click();
    }
    
    public void moveToSwagLabTwitterPage() {
    	SwagLabTwitterpage.click();
    }
    
    public void moveToSwagLabFacebookpage() {
    	SwagLabFacebookpage.click();
    }
    
    public void moveToSwagLabLinkedInpage() {
    	SwagLabLinkedInpage.click();
    }
    
    
}
