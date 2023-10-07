package com.pom.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.pom.utils.CommonUtils;



public class LoginPage extends CommonUtils {
	
	
	WebDriver driver;
	
	By userIdInput = By.name("uid");
	By passwordInput = By.name("password");
	By loginButton = By.name("btnLogin");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	
	public void loginIntoApp(String url, String userId, String password) {
		this.navigateToUrl(url);
		this.type(userIdInput, userId);
		this.type(passwordInput, password);
		this.clickElements(loginButton);
		
	}

}
