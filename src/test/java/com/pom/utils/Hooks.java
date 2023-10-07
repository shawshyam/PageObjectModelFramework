package com.pom.utils;

//import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * <h1> Implment  Lifecycle Method using TestNG Annotation</h1>
 * @author shyam
 * @verson 1.0
 *
 */

public class Hooks {
	
	public Properties config;
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeAll() {
		 config = new Properties();
		 try {
			config.load(new FileInputStream("./src/test/resources/config-qa.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test ");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		if(config.getProperty("browser").equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",this.config.getProperty("browser.binary.path"));
			driver = new ChromeDriver();
		}
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		
	}
	
	@AfterSuite
	public void afterAll() {
		System.out.println("After Suite");
		
	}

}
