package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class HomePage extends BaseClass{
	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
		public CreateWorkspace clickWorkspaceAdmin() {
			
			driver.findElement(By.xpath("//ul[@class='menu-list']/li[3]")).click();
			//return new MyLeadPage(driver);
			return new CreateWorkspace(driver);
		}
	}

