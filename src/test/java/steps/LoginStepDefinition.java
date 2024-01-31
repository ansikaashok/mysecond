package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;
public class LoginStepDefinition extends TestBase{

//Given User is on the techfios login page
	//--> \"([^\"]*)\"
LoginPage loginPageObj;
		
@Given ("^User is on the Techfios login page$")

public void user_is_on_techfios_login_page() {
initDriver();	
driver.get("https://techfios.com/billing/?ng=login/");
	
}

//When user enters username as "demo@techfios.com"

@When ("^user enters username as \"([^\"]*)\"$")
 public void user_enters_username_as (String username)
 {
loginPageObj=PageFactory.initElements(driver, LoginPage.class);
loginPageObj.enteruserName(username);
	
	 }
//when user puts the password

@When("^USer enters the password as \"([^\"]*)\"$")
public void user_enters_the_password_as(String password)	{
loginPageObj.enterPassword(password);

}


@When ("^User Clicks signin Button$")
public void user_clicks_signin_Button()
{
loginPageObj=PageFactory.initElements(driver, LoginPage.class);
	
loginPageObj.clickSignINButton();

}

@Then("^USer should land on the dashboard page$")
public void user_should_land_on_the_dashboard_page() {
Assert.assertEquals("Dashboard- Ibilling",loginPageObj.getPageTitle());
} 
}


