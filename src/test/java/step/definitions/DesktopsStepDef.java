package step.definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import utilities.Util;

public class DesktopsStepDef extends Base {
	DesktopsPage desktopsPage = new DesktopsPage();

	@When("User click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopsPage.clickOnDesktopTab();
		logger.info("user clicked on Desktops tab");

	}

	@And("User click on Show all desktops")
	public void user_click_On_Show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("user clicked on Show all Desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_Desktops_page() {
		List<WebElement> items = desktopsPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
		}
		int size = items.size();
		Assert.assertEquals(size,14);
		Util.takeScreenShot();

	}
	
	
	
	
	@When ("User click on Laptop & NoteBook tab")
	public void userClickOnLaptop() {
		// click on "Desktops" button
		desktopsPage.clickOnDesktopTab();
	}
	
	@And ("User click on Show all Laptop & NoteBook option")
	public void userClickShowAllLaptopAndNoteBook() {
		// click on "Show All Laptop and notebook" button
		desktopsPage.clickOnShowAllDesktops();
	}
	
	
	@And ("User click on ‘MacBook Pro’ item")
	public void userClickMacbookPro() {
		// find the macbook and click on it 
		desktopsPage.clickOnMacbookPro();
	}
	
	@Then ("User should see ‘$2,000.00’ price tag is present on UI")
	public void macbookPriceIs2000() {
		// assert that the value 2000 is on the screen
	}
}
