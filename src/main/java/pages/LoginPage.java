package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

WebDriver driver;
public LoginPage(WebDriver driver) 
{
this.driver=driver;
}

//WebElement Library

@FindBy(how=How.XPATH, using="//input[@id='username']")
WebElement userName;

@FindBy(how=How.XPATH, using="//input[@id='password']")
WebElement Password;

@FindBy(how=How.XPATH, using="//input[@name='login']")
WebElement SigninButton;

//Methods to interact with the WebElements
public void enteruserName( String username)  
{	
	userName.sendKeys(username);
	
	try {
		Thread.sleep(3000);
			}
	
	catch(InterruptedException e) {
		e.printStackTrace();
	}
		
	}
public void enterPassword( String password)  {
Password.sendKeys(password);
	
	
	try {
		
		Thread.sleep(3000);
	}
	
	catch(InterruptedException e) {
		e.printStackTrace();
	}
		
	}

public void clickSignINButton()  {
	SigninButton.click();

	try {
		
		Thread.sleep(3000);
	}

	catch(InterruptedException e) {
		e.printStackTrace();
	}
}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}



