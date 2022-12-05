package POM_DDF_TestNG_PropertyFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	WebDriver driver;
    public void initializeBrowser() throws IOException
    {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium Project For Practice\\Browser\\chromedriver.exe");
	  driver=new ChromeDriver();
 	  driver.get(Utility_Class.getPFData("URL"));
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
