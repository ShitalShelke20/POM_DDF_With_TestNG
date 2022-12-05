package POM_DDF_TestNG_PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Module2_Watchlist.UpstoxCreateNewWatchlist;
import POM_DDF_With_TestNG.UpstoxHomePage;
import POM_DDF_With_TestNG.UpstoxLogin1Page;
import POM_DDF_With_TestNG.UpstoxLogin2Page;
import POM_DDF_With_TestNG.UpstoxWelcomePage;

public class UpstoxLoginTest extends Base_Class
{
	private static final String WatchlistName = null;
	//declare globally
	UpstoxLogin1Page login1;
	UpstoxLogin2Page login2;
	UpstoxWelcomePage welcome;
	UpstoxHomePage home;
	int TCID;
	UpstoxCreateNewWatchlist w;
    
    @BeforeClass
	public void openBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
   	    initializeBrowser();
		login1=new UpstoxLogin1Page(driver); 
		login2=new UpstoxLogin2Page(driver);
		welcome=new UpstoxWelcomePage(driver);
		home=new UpstoxHomePage(driver);
	   // w = new UpstoxCreateNewWatchlist(driver);
	}
	  //initialize locally
		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException
		{
		login1.inpUpstoxLogin1PageUsername(Utility_Class.getPFData("UN"));
		login1.inpUpstoxLogin1PagePassword(Utility_Class.getPFData("PWD"));
		login1.clickUpstoxLogin1PageLoginBtn();
		login2.inpUpstoxLogin2PageYearOfBirth(Utility_Class.getPFData("YOB"));
		welcome.clickUpstoxWelcomePageNoIAmGood();
		//w.inpUpstoxCreateNewWatchlistWatchlistName(Utility_Class.getPFData("WatchlistName"));
		}
    @Test
    public void verifyUserID () throws EncryptedDocumentException, IOException
    {
    	String actPN = home.getUpstoxHomePageactPN();
		String expPN = Utility_Class.getID(0, 3);
		Assert.assertEquals(actPN, expPN, "Failed: both results are diff");
    }
//    @Test
//    public void verifywatchlist()
//    {
//    	w.clickUpstoxCreateNewWatchlistDropdown();
//    	w.clickUpstoxCreateNewWatchlistNew();
//    	w.inpUpstoxCreateNewWatchlistWatchlistName(null);
//    	w.clickUpstoxCreateNewWatchlistSaveWatchlictTitle();
//    	w.clickUpstoxCreateNewWatchlistAddAScrip();
//    }
    @AfterMethod
	public void logoutFromApp(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			Utility_Class.captureScreenshot(driver, TCID);
		}
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}


