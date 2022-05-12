package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
		public LoginPage enterUserName() {
			driver.findElement(By.id("l-username")).sendKeys("amudhini.r@invicara.com");
			return this;		
		}
	
		public LoginPage enterPassword() {
		driver.findElement(By.id("l-password")).sendKeys("Test@123");
		return this;		
	}
		public HomePage clickLogin() {
		driver.findElement(By.className("primary")).click();
		return new HomePage(driver);
		
	}
	}

	

