package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class NewWorkspace extends BaseClass{
	
	@Test
	public void createWorkspace() {
		
		new LoginPage(driver).enterUserName().enterPassword().clickLogin().clickWorkspaceAdmin().createNew().enterdata().enterName().enterDesc().clickWS();
		
}

}
