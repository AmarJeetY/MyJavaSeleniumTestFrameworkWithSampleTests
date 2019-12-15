/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Amarjeet.Yelwande
 *
 */
public class LoginPage 

{
	WebDriver driver;
	By username = By.id("user_login");
	By password = By.xpath("//input[(@id ='user_pass')]");
	By loginButton  = By.name("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;		
	}
	
	public void LoginToWordPress(String uid, String pass)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}

}
