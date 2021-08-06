package com.qa.learnautomationtestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.LearnAutomationPages.Baseclass;
import com.qa.LearnAutomationPages.LoginPage;

public class LoginTestCRM extends Baseclass {
	
	@Test

	public void Login() {


		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		loginpage.logintoCRM("groupautomation", "test12345");

	}
	
}
