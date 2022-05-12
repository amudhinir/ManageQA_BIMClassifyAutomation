package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class WorkspaceInput extends BaseClass{
	
	public WorkspaceInput(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public WorkspaceInput enterName() {
		WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"Add name here...\"]"));
		name.click();
		name.sendKeys("Test");
		return this;
	}
	
	public WorkspaceInput enterDesc() {
		WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"Add description here...\"]"));
		name.click();
		name.sendKeys("Test Workspace");
		return this;
	}
	
	public WorkspaceInput clickWS() {
		WebElement name = driver.findElement(By.xpath("//button[text()='Create Workspace']"));
		name.click();
		return this;
	}
	
}
