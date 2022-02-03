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

public class Runner_Automation {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Jan_Proj_Batch\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://automationpractice.com/index.php");
			
			driver.manage().window().maximize();
			
			WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
			
			login.click();
			
			Thread.sleep(3000);
			
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			
			email.sendKeys("vedapriya15reddy@gmail.com");
			
			WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
			
			pass.sendKeys("tauras15");
			
			WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
			
			submit.click();
			
			WebElement shirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
			
			shirt.click();
			
			WebElement logo = driver.findElement(By.xpath("//h4[text()='Newsletter']"));

			JavascriptExecutor d = (JavascriptExecutor) driver;

			d.executeScript("arguments[0].scrollIntoView();", logo);

			Thread.sleep(3000);

			d.executeScript("window.scrollBy(0,-1500)");
			
		                driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
			
			WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
			
			cart.click();
			
			Thread.sleep(3000);
			
			WebElement chk = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			
			chk.click();
			
			WebElement sign = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
			
			sign.click();
			
			WebElement add = driver.findElement(By.xpath("//button[@name='processAddress']"));
			
			add.click();
			
			WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
			
			checkbox.click();
			
			WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			
			submit1.click();
			
			WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
			
			cheque.click();
			
			WebElement button = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
			
			button.click();
			
			WebElement last = driver.findElement(By.xpath("//h4[text()='Follow us']"));
			
			JavascriptExecutor ref = (JavascriptExecutor) driver;

			ref.executeScript("arguments[0].scrollIntoView();", last);

			Thread.sleep(3000);

			ref.executeScript("window.scrollBy(0,-2000)");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File start = ts.getScreenshotAs(OutputType.FILE);
			
			File end = new File("C:\\Users\\HP\\eclipse-workspace\\Jan_Proj_Batch\\Screenshots\\automation.png");
			
			FileUtils.copyFile(start, end);
			
			
	}

}
