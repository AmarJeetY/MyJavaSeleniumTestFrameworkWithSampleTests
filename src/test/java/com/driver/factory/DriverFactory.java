/**
 * 
 */
package com.driver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Amarjeet.Yelwande
 *
 */
public class DriverFactory 
{
	public WebDriver GetDriver(String browsername)
	{
		WebDriver driver = null;
		
		if(browsername.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		if(browsername.equals("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();				
		return driver;		
	}

}
