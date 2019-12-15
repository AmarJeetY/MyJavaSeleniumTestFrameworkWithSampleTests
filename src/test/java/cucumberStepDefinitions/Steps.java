package cucumberStepDefinitions;
import org.openqa.selenium.WebDriver;
import com.selenium.tests.*;
import cucumber.api.java.en.Given;

public class Steps 
{
	WebDriver driver;
	
	@Given("^user visits wordpress login page$")
	public void user_is_on_Home_Page() throws Throwable 
	{
		WordPressLogin login = new WordPressLogin();
		login.VerifyLogin();		
	}
	
}


