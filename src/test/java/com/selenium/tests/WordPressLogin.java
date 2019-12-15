/**
 * 
 */
package com.selenium.tests;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.driver.factory.DriverFactory;
import com.wordpress.pages.LoginPage;

import cucumber.api.java.Before;

/**
 * @author Amarjeet.Yelwande
 *
 */
public class WordPressLogin
{
	static WebDriver driver;
	
	@Before
	public void InitialiseDriver()
	{		
				
	}
	
	@Test
	public void VerifyLogin()
	{	
		DriverFactory factory = new DriverFactory();
		driver = factory.GetDriver("Chrome");
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");		
		LoginPage login = new LoginPage(driver);
		login.LoginToWordPress("opensourcecms", "opensourcecms");		
	}
	
	@After
	public void QuitDriver()
	{
		driver.quit();
	}
}
