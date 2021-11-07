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



public class ValidateTitle extends base {
	
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initializer() throws IOException {
		driver=initalizeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void basePageNavigation() throws IOException{
		

		LandingPage lp=new LandingPage(driver);
		log.info("Object Created");
		
		Assert.assertTrue(lp.getImage().isDisplayed());
		log.info("Successfully validated");
		

	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}	
