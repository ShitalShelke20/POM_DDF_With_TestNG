package POM_DDF_TestNG_BasicClass_UtilityClass_PropertyFile_FailedTCScreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	WebDriver driver;
    public void initializeBrowser()
    {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium Project For Practice\\Browser\\chromedriver.exe");
	  driver=new ChromeDriver();
 	  driver.get("https://login-v2.upstox.com/");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
