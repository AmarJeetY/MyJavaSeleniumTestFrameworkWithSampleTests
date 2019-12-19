package cucumberStepDefinitions;
import org.openqa.selenium.WebDriver;
import com.selenium.tests.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps 
{
	WebDriver driver;	

	@Given("^user visits wordpress login page with credentials$")
		public void user_visits_wordpress_login_page_with_credentials() throws Throwable 
		{
			WordPressLogin login = new WordPressLogin();
			login.VerifyLogin();	
		}

	@Then("^he is successfully able to logon$")
		public void he_is_successfully_able_to_logon() throws Throwable
		{
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}	
}
