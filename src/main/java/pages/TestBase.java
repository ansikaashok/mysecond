package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public static WebDriver driver;

//driver is a  is a reference object that came from interface.
//Opens the Browser

public static void initDriver() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\sweda\\eclipse-workspace\\crm\\driv\\chromedriver.exe");
   // Initialize browser
  driver=new ChromeDriver();//object variable// no static  because it is already in top
     // Open Google
  //driver.get("https://www.techfios.com/billing/?ng=admin/");
     
   // Maximize browser
  driver.manage().deleteAllCookies();;
  driver.manage().window().maximize();
  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
     
     }
	
	
	
	

}

