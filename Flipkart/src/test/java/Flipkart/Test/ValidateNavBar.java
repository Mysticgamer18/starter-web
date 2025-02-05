package Flipkart.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;


public class ValidateNavBar extends base{
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initializer() throws IOException {
		driver=initalizeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Driver invoked the browser successfully");
	}
	@Test
	public void basePageNavigation() throws IOException{

		LandingPage lp=new LandingPage(driver);
		
		Assert.assertTrue(lp.getNavBar().isDisplayed());
		
		log.info("NavBar is successfully validated");
	}
	@AfterTest
	public void teardown() {
		driver.close();
//		driver=null;
	}


}
