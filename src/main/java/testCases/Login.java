package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Login extends BaseClass{
	@Test
	public void runLogin() {
		
		new LoginPage(driver).enterUserName().enterPassword().clickLogin();
		
}
}
