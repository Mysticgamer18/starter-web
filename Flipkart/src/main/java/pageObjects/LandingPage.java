
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	

	By email= By.xpath("//form[@autocomplete='on']/div[1]/input");
	By pass= By.xpath("//input[@type='password']");
	By forgot= By.xpath("//*[@class='IiD88i _351hSN']/a/span");
	By login= By.xpath("//div[@class='_1D1L_j']/button");
	By img=By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div/a/div/img");
	By navbar=By.xpath("//div[@class='_37M3Pb']");
	
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(pass);
	}
	public WebElement forgot() {
		return driver.findElement(forgot);
	}
	public WebElement login() {
		return driver.findElement(login);
	}

	public WebElement getImage() {
		return driver.findElement(img);
	}
	public WebElement getNavBar() {
		return driver.findElement(navbar);
	}
}