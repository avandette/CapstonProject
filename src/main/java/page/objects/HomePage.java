package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base {
	/**
	 * In this class we will store all UI Elements that belongs to Home page of this
	 * application.
	 */

	/**
	 * We will use PageFactory Class to initialize the UI elements we store in this
	 * class. PageFactory class provides a method called .initElements and this
	 * method job is to initialize all UI (User Interface) Elements.
	 */
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation is == driver.findElement()

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchbar;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
//	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
//	private WebElement shoppingCartButton;
//	
//	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
//	private WebElement yourShoppingCartIsEmptyMenu;
	
//	@FindBy(xpath = "//form[@id='form-currency']")
//	private WebElement currencyButton;
//	
//	@FindBy(xpath = "//button[@name='EUR']")
//	private WebElement euroSelection;
//	
//	@FindBy(xpath = "//button[@name='GBP']")
//	private WebElement poundSelection;
//	
//	@FindBy(xpath = "//button[@name='USD']")
//	private WebElement dollarSelection;
//	
	
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shoppingCartButton;
	
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement shoppingCartEmptyMenu;
	
	
	@FindBy(xpath = "//form[@id='form-currency']")
	private WebElement currencyChangeForm;
	
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement changeToEuroButton;
	
	@FindBy(xpath = "//button[@name='USD']")
	private WebElement changeToDollarButton;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotal;

	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnShoppingCart() {
		shoppingCartButton.click();
	}
	
	public boolean shoppingCartEmptyDisplayed() {
		if (shoppingCartEmptyMenu.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void searchInput(String value) {
		searchbar.sendKeys(value);
	}
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	public void clickOnRegister() {
		register.click();
	}
	
	public void clickOnLogin() {
		login.click();
	}

	public void clickOnChangeCurrencyForm() {
		currencyChangeForm.click();
	}

	public void clickOnChangeToEuro() {
		changeToEuroButton.click();
		
	}
	
	public String getCurrency() {
		
		String cartTotalText = cartTotal.getText();
		String currentCurrency = "";
		
		
		if(cartTotalText.contains("€")) {
			currentCurrency = "EUR";
		}
		else if(cartTotalText.contains("$")) {
			currentCurrency = "USD";
		}
		
		return currentCurrency;
	}

	public void clickOnChangeToDollar() {
		changeToDollarButton.click();
		
	}
	
//	public void clickOnShoppingCart() {
//		shoppingCartButton.click();
//	}
	
//	public void clickCurrencyButton() {
//		currencyButton.click();
//	}
//	
//	public void switchCurrencyToUsDollar() {
//		currencyButton.click();
//		dollarSelection.click();
//	}
//	
//	public void switchCurrencyToEuro() {
//		currencyButton.click();
//		euroSelection.click();
//	}
//	
//	public String getCurrentCurrency()  {
//		String text = shoppingCartButton.getText();
//		
//		if(text.contains("$")) { // todo replace with enum
//			return "USD";
//		}
//		else if (text.contains("€")) {
//			return "EUR";
//		}
//		else if (text.contains("£")) {
//			return "GBP";
//		}
//		else {
//			return "INVALID"; // todo throw here!
//		}
//	}
//	
//	public boolean isYourShoppingCartIsEmptyMenuDisplayed() {
//		
//		
//		if (yourShoppingCartIsEmptyMenu.isDisplayed()) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}

}
