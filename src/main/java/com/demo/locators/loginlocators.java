package com.demo.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//
public class loginlocators {
	
	WebDriver driver;
	
	public loginlocators(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(name = "passowrd")
	public WebElement passowrd;
	
	@FindBy(xpath ="//button[@class='form-control btn btn-primary']")
	public WebElement submitbtn;
}
