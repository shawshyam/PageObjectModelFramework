package com.pom.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * <h1>This method include all commonly used UI Intercation Function</h1>
 * @version 1.0
 * @author shyam
 *
 */

public class CommonUtils {
	
	WebDriver driver;
	
	public CommonUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToUrl(String url) {
		driver.get(url);
		
	}
	public void type(By elementIdentifier, String keys) {
		driver.findElement(elementIdentifier).sendKeys(keys);
	}
	
	public void clickElements(By elementIdentifier) {
		driver.findElement(elementIdentifier).click();
		
	}

}
