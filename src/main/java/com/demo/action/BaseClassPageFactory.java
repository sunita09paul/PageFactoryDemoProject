package com.demo.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassPageFactory {
	
	public static WebDriver driver = null;
	
	@BeforeMethod
public void initilize() {
	System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir")+"/driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
	
	@AfterMethod(enabled = false)
	public void cleanup() {
		driver.quit();
	}
}
