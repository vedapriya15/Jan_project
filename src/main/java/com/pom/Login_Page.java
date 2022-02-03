package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	public Login_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);  // ------------> this represents @findby in this class
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement login_btn;
	

}
