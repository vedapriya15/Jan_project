package com.proj.Jan_Proj_Batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_hotel {
	
	public static WebDriver driver;
	
	// Browser Launch

	public static WebDriver browserlaunch(String name) {
		
		if (name.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user+dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			}
		else if (name.equalsIgnoreCase("FireFox")) {
			
			System.setProperty("webdriver.firefox.driver", System.getProperty("user+dir")+"\\Driver\\geckodriver.exe");
		//	driver = new GeckoDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
		
		// url
		public static void geturl(String url) {
		
			driver.get(url);
		}
		
		// send keys
		public static void sendkeys(WebElement element , String value) {
			element.sendKeys(value);
		}
		
		// click
		public static void click(WebElement button) {
			button.click();
		}
		
		public static void close() {
			driver.close();
		}
		
		public static void dropdown(String type , WebElement element , String data) {
			Select s = new Select(element);
			
			if (type.equalsIgnoreCase("byIndex")) {
				int value = Integer.parseInt(data);
				s.selectByIndex(value);
				}
			
			else if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(data);
				}
			
			else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(data);
			}
		}
		
		
}
	
