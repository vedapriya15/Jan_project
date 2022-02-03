package com.proj.Jan_Proj_Batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass_Automation {
	
	public static WebDriver driver;
	
	
	public static WebDriver getbrowser(String type) {
		
		if(type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		
		else if(type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//firefoxdriver.exe");
		
			 driver = new FirefoxDriver();
		}
 
		return driver;
		
	}
	
	public static void ClickOnElement(WebElement element) {
		
		element.click();

	}
	
	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);
	}

}
