package POM_DDF_With_TestNG;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	
	public class UpstoxLoginTest 
	{
		//declare globally
		UpstoxLogin1Page login1;
		UpstoxLogin2Page login2;
		UpstoxWelcomePage welcome;
		UpstoxHomePage home;
	    Sheet sh;
	    WebDriver driver;
        @BeforeClass
		public void openBrowser() throws InterruptedException, EncryptedDocumentException, IOException
		{
		 FileInputStream file = new FileInputStream("E:\\Study material shital\\DDF\\Book1.xlsx");
		   sh = WorkbookFactory.create(file).getSheet("Sheet1");
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	   	driver.get("https://login-v2.upstox.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			login1=new UpstoxLogin1Page(driver); 
			login2=new UpstoxLogin2Page(driver);
			welcome=new UpstoxWelcomePage(driver);
			home=new UpstoxHomePage(driver);
		}
		  //initialize locally
			@BeforeMethod
			public void loginToApp()
			{
			login1.inpUpstoxLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
			login1.inpUpstoxLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
			login1.clickUpstoxLogin1PageLoginBtn();
			login2.inpUpstoxLogin2PageYearOfBirth(sh.getRow(0).getCell(2).getStringCellValue());
			welcome.clickUpstoxWelcomePageNoIAmGood();
			}
        @Test
        public void verifyUserID()
        {
        	String actPN = home.getUpstoxHomePageactPN();
			String expPN = sh.getRow(0).getCell(3).getStringCellValue();
			Assert.assertEquals(actPN, expPN, "Failed: both results are diff");
        }
        
        @AfterMethod
    	public void logoutFromApp() 
    	{
    		
    	}
    	@AfterClass
    	public void closeBrowser()
    	{
    		driver.quit();
		}
	}
	

