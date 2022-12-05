package POM_DDF_TestNG_BasicClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	WebDriver driver;
    public void initializeBrowser()
    {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
 	  driver.get("https://login-v2.upstox.com/");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
