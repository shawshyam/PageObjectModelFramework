package com.pom.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * <h1>This method include all commonly used UI Intercation Function</h1>
 * @version 1.0
 * @author shyam
 *
 */

public class CommonUtils {
	
	WebDriver driver;
	WebDriverWait wait;
	
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
	
	public void waitForElementClickability(By elementIdentifier) {
		wait = new WebDriverWait(driver, Duration.ofSeconds
				(Integer.parseInt(Hooks.config.getProperty("script.timeout"))));
		wait.until(ExpectedConditions.elementToBeClickable(elementIdentifier));
	}
	
	public void waitForElementVisiblity(By elementIdentifier) {
		wait = new WebDriverWait(driver, Duration.ofSeconds
				(Integer.parseInt(Hooks.config.getProperty("script.timeout"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementIdentifier));
		
	}

}
