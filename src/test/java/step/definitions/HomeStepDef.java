package step.definitions;


import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.LoginPage;

public class HomeStepDef extends Base {
	
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();

	@Given("user is on Retail home Page")
	public void userIsOnRuser_is_on_retail_home_pageetailHomePage() {
	Assert.assertTrue(homePage.isLogoDisplayed()); 
	logger.info("user is on Home Page");
	}

	@When("user click on MyAccount")
	public void user_click_on_my_account() {
		homePage.clickOnMyAccount();
		logger.info("user clicked on MyAccount");

	}

	@When("user click on Login option")
	public void user_click_on_login_option() {
	homePage.clickOnLogin();
	logger.info("user clicked on login");

	}

	@When("user enter userName {string}  and password {string}")
	public void user_enter_user_name_and_password(String email, String pass) {
		loginPage.enterEmail(email);
		logger.info("user enter the userName " + email);
		loginPage.enterPassword(pass);
		logger.info("user enter the password  " +pass);

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLoginButton();
		logger.info("user clicked on login button");

	}

	@Then("user should be logged into myAccount Page")
	public void user_should_be_logged_into_my_account_page() {
	Assert.assertTrue(loginPage.myAccountTextIsPresent());
	logger.info("user should be in MyAccount Page");


	}
	
//	@Given("User is on Retail website")
//	public void user_is_on_retail_website() {
//		
//		Assert.assertTrue(homePage.isLogoDisplayed()); 
//		logger.info("user is on the website");
//
//		
//	}
//	
//	@When("User click on shopping cart")
//	public void user_click_on_shopping_cart() {
//		
//		homePage.clickOnShoppingCart();
//		logger.info("user clicks cart");
//		
//	}
//	
//	@Then("{string} message should display")
//	public void your_shopping_cart_is_empty(String message)
//	{
//		
//		Assert.assertTrue(homePage.isYourShoppingCartIsEmptyMenuDisplayed());
//		logger.info("We asserted stuff!");
//	}
	
//	@When("User change currency to Euro")
//	public void user_change_currency_to_euro() {
//		homePage.switchCurrencyToEuro();
//	}
//		
//    @Then("Current value is changed to Euro")
//    public void currency_is_euro() {
//    	String currentCurrency = homePage.getCurrentCurrency();
//    	Assert.assertEquals(currentCurrency, "EUR");
//    }
//    
//    @When("User change currency to USD")
//	public void user_change_currency_to_usd() {
//		homePage.switchCurrencyToUsDollar();
//	}
//		
//    @Then("Current value is changed to USD")
//    public void currency_is_usd() {
//    	String currentCurrency = homePage.getCurrentCurrency();
//    	Assert.assertEquals(currentCurrency, "USD");
//    }
    
    
    
	
	
    @When ("User change currency to Euro")
    public void userChangeCurrencyToEuro() {
    	homePage.clickOnChangeCurrencyForm();
    	homePage.clickOnChangeToEuro();
    }
    
    @Then ("Current value is changed to Euro")	
    public void currentValueIsChangedToEuro(){
    	Assert.assertEquals(homePage.getCurrency(), "EUR");
    }
    
    
    @Given("User is on Retail website")
	public void user_is_on_retail_website() {
		
    	Assert.assertTrue(homePage.isLogoDisplayed()); 
    	
	}
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		
		homePage.clickOnShoppingCart();
		
	}

	@Then("Your shopping cart is empty! message should display")
	public void your_shopping_cart_is_empty()
	{
		Assert.assertTrue(homePage.shoppingCartEmptyDisplayed());
	}
	
	  
	@When ("User change to EUR and then changes currency to USD")
	public void changeToEuroBackToDollar() {
		homePage.clickOnChangeCurrencyForm();
    	homePage.clickOnChangeToEuro();
    	
    	homePage.clickOnChangeCurrencyForm();
    	homePage.clickOnChangeToDollar();
	}
	  
	  @Then("Current value is changed to USD")
	  public void currencyIsSetToDollar() {
		  Assert.assertEquals(homePage.getCurrency(), "USD");
	  }
	
}
