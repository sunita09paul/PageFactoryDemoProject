package com.demo.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.locators.loginlocators;

public class loginAction extends BaseClassPageFactory{
	
	public void loginaction() {
	
		loginlocators locator = new loginlocators(driver);
		
		
		
		locator.email.sendKeys("akshata.tsol+101@gmail.com\"");
		WebDriverWait  wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.)
		locator.passowrd.sendKeys("654321");
		locator.submitbtn.click();
		
	}

}
