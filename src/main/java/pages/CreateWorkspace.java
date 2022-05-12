package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class CreateWorkspace extends BaseClass{

	public CreateWorkspace(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateWorkspace createNew() {
	driver.findElement(By.xpath("//button[text()='Create New Workspace']")).click();
	return this;
	}

	public WorkspaceInput enterdata() {
		
	return new WorkspaceInput(driver);
	}
}
