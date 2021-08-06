package com.qa.LearnAutomationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver;
	}
	
	@FindBy(name = "username") WebElement uname;
	@FindBy(name = "password") WebElement pword;
	@FindBy(xpath = "//*[@type='submit']") WebElement LoginButton;
	
	
	
	public void logintoCRM(String usernameapplication , String passwordapplication) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		uname.sendKeys(usernameapplication);
		pword.sendKeys(passwordapplication);
		LoginButton.click();
	}
}
