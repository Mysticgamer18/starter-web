package Flipkart.Test;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;




public class HomePage extends base{
	
	
	public static Logger log= LogManager.getLogger(base.class.getName()); 
	
	
	@BeforeMethod
	public void initializer() throws IOException {
	
		
	driver=initalizeDriver();
	
	driver.get(prop.getProperty("url"));
	}
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException{
		
		
		
		LandingPage lp=new LandingPage(driver);
		
		
		test.info("Entering username");
		lp.email().sendKeys(Username);
		test.info("Entering Password");
		lp.password().sendKeys(Password);
		lp.login().click();
		
		
		
		test.pass("logged in sucessfully");
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="9769460674";
		data[0][1]="Manish@18";
		
		data[1][0]="pawarmanish935@gmail.com";
		data[1][1]="Manish@18";
		
		return data;
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		
//		driver=null;
	}

}
