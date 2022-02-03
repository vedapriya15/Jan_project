package com.proj.Jan_Proj_Batch;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.Login_Page;
import com.pom.Search_Hotel;

public class Runner_Adactin extends BaseClass_hotel {
	
	public static WebDriver driver = BaseClass_hotel.browserlaunch("Chrome");
	
	public static Login_Page login = new Login_Page(driver);
	
	public static Search_Hotel hotel = new Search_Hotel(driver);

	
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		//      driver = browserlaunch("Chrome");
		      
		      geturl("https://adactinhotelapp.com/");
		      
		      driver.manage().window().maximize();
		
	//	Login_Page login = new Login_Page(driver);
		
		sendkeys(login.getUsername(), "vedapriya");
		
		sendkeys(login.getPassword(), "tauras15");
		
		click(login.getLogin_btn());
			
		//	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
			
		//	username.sendKeys("vedapriya");
			
		//	sendkeys(username, "vedapriya");     ------> base class
			
		//	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
			
		//	password.sendKeys("tauras15");
			
		//	sendkeys(password, "tauras15");         ------> base class
			
		//	WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
			
		//	login.click();
			
		//	click(login);       -------> base class
			
			WebElement location = driver.findElement(By.id("location"));
			Select l = new Select(location);
			l.selectByVisibleText("Sydney");
			
			WebElement hotels = driver.findElement(By.id("hotels"));
			Select h = new Select(hotels);
			h.selectByVisibleText("Hotel Sunshine");
			
			WebElement room = driver.findElement(By.id("room_type"));
			Select r = new Select(room);
			r.selectByVisibleText("Double");
			
			WebElement no = driver.findElement(By.id("room_nos"));
			Select n = new Select(no);
			n.selectByIndex(1);
			
			WebElement in = driver.findElement(By.id("datepick_in"));
			in.clear();
			in.sendKeys("18/02/2022");
			
			WebElement out = driver.findElement(By.id("datepick_out"));
			out.clear();
			out.sendKeys("20/02/2022");
			
			WebElement adult = driver.findElement(By.id("adult_room"));
			Select a = new Select(adult);
			a.selectByValue("2");
			
			WebElement child = driver.findElement(By.id("child_room"));
			Select c = new Select(child);
			c.selectByValue("0");
			
		//	WebElement search = driver.findElement(By.id("Submit"));
		//	search.click();
			
		//	

			click(hotel.getSubmit());
			
			WebElement radio = driver.findElement(By.id("radiobutton_0"));
			radio.click();
			
			WebElement con = driver.findElement(By.id("continue"));
			con.click();
			
			WebElement first = driver.findElement(By.id("first_name"));
			first.sendKeys("vedapriya");
			
			WebElement last = driver.findElement(By.id("last_name"));
			last.sendKeys("M");
			
			WebElement add = driver.findElement(By.id("address"));
			add.sendKeys("813 Howard Street Oswego NY 13126 USA");
			
			WebElement credit = driver.findElement(By.id("cc_num"));
			credit.sendKeys("9876543211234560");
			
			WebElement type = driver.findElement(By.id("cc_type"));
			Select t = new Select(type);
			t.selectByIndex(2);
			
			WebElement month = driver.findElement(By.id("cc_exp_month"));
			Select m = new Select(month);
			m.selectByValue("9");
			
			WebElement year = driver.findElement(By.id("cc_exp_year"));
			Select y = new Select(year);
			y.selectByVisibleText("2022");
			
			WebElement cvv = driver.findElement(By.id("cc_cvv"));
			cvv.sendKeys("369");
			
			WebElement book = driver.findElement(By.id("book_now"));
			book.click();
			Thread.sleep(3500);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1300)");
			Thread.sleep(3000);
			
			WebElement click = driver.findElement(By.id("my_itinerary"));
			click.click();
			
            TakesScreenshot ts = (TakesScreenshot) driver;
			
			File start = ts.getScreenshotAs(OutputType.FILE);
			
			File end = new File("C:\\Users\\HP\\eclipse-workspace\\Jan_Proj_Batch\\Screenshots\\hotelbook.png");
			
			FileUtils.copyFile(start, end);
			Thread.sleep(3000);
			
			WebElement logout = driver.findElement(By.id("logout"));
            logout.click();
            
            
	}
}



