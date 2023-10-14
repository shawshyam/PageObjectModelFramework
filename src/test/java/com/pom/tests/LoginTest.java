package com.pom.tests;

import org.testng.annotations.Test;

import com.pom.pages.LoginPage;
import com.pom.utils.Hooks;

public class LoginTest extends Hooks {

	
	@Test(testName = "Login with valid Carditional Test")
	public void validLoginTest() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginIntoApp("https://demo.guru99.com/v2", "mngr266311", "Admin123$");
		driver.manage().window().maximize();
		
		
	}
	

	
}
