package com.qa.learnautomationtestutilitity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {

	

	public static WebDriver startapplication(WebDriver driver,String browsername , String appurl) {

		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}

		else if(browsername.equals("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
			driver = new ChromeDriver();
		}

		else if(browsername.equals("ie")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/IEDriverServer.exe");
			driver = new ChromeDriver();
		}

		else {

			System.out.println("Browser is not supported");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
		

	}

	public static void quitbrowser(WebDriver driver) {

		driver.close();
		driver.quit();


	}


}
