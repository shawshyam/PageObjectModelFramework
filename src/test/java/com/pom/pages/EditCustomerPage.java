package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.utils.CommonUtils;

public class EditCustomerPage extends CommonUtils {
	
	WebDriver driver;
	
	By editCustomerLink = By.xpath("//a[text() = 'Edit Customer']");
	By customerIdInput = By.name("cusid");
	By submit = By.name("AccSubmit");
	
	public EditCustomerPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public void searchCustomerForEditing(String url,String userId, String password, String customerId) {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginIntoApp(url, userId, password);
		this.waitForElementVisiblity(editCustomerLink);
		this.clickElements(editCustomerLink);
		this.waitForElementVisiblity(customerIdInput);
		this.type(customerIdInput, customerId);
		this.clickElements(submit);
		
	}

}
