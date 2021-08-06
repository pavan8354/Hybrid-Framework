package com.qa.LearnAutomationPages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.learnautomationtestutilitity.Browserfactory;

public class Baseclass {
	public WebDriver driver;
	
	
	@BeforeClass
	public void setup() {

		driver = Browserfactory.startapplication(driver, "Chrome", "https://classic.freecrm.com/index.html");
	}

	@AfterClass
	public void teardown() {
		Browserfactory.quitbrowser(driver);

	}

	

}
