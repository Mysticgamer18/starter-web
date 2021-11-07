
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Appointment {
	
	public WebDriver driver;
	
	public Appointment(WebDriver driver) {
		this.driver=driver;
	}
	
	

	By homecare= By.xpath("//article[@id=\"post-219082\"]/button");
	By selectDate= By.xpath("//div[@id=\"et-main-area\"]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[5]/td[6]");
	By name=By.id("emsb_user_fullName");
	By email=By.id("emsb_user_email");
	By phone=By.id("emsb_user_telephone");
	By submit=By.id("submitForm");
	
	public WebElement homecare() {
		return driver.findElement(homecare);
	}
	public WebElement selectDate() {
		return driver.findElement(selectDate);
	}
	public WebElement name() {
		return driver.findElement(name);
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement phone() {
		return driver.findElement(phone);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	
}
