package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import resources.base;


public class stepDefinitions extends base {
	@Given("Browser is initialized")
	public void browser_is_initialized() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		driver=initalizeDriver();
	}

	@Then("Navigate to {string} Site")
	public void navigate_to_site(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.get(string);
	}




	@When("^User enters the (.+) and (.+) and click on login$")
	public void user_enters_the_and_and_click_on_login(String username, String pass) throws Throwable {
		LandingPage lp=new LandingPage(driver);
		lp.email().sendKeys(username);
		lp.password().sendKeys(pass);
		lp.login().click();
	}


	@Then("User will be logged in")
	public void user_will_be_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		System.out.print("Logged in successfully");
	}

	@And("Home Page will be displayed and verified succesfully")
	public void home_page_will_be_displayed_and_verified_succesfully() {
		// Write code here that turns the phrase above into concrete actions
		LandingPage lp=new LandingPage(driver);
		Assert.assertTrue(lp.getNavBar().isDisplayed());
		
	}	
}
