package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxLoginTest1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
    {
        FileInputStream file = new FileInputStream("E:\\Study material shital\\DDF\\Book1.xlsx");
      Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		UpstoxLogin1Page login1=new UpstoxLogin1Page(driver);
		login1.inpUpstoxLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpUpstoxLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickUpstoxLogin1PageLoginBtn();
		
	    UpstoxLogin2Page login2=new UpstoxLogin2Page(driver);
	    login2.inpUpstoxLogin2PageYearOfBirth(sh.getRow(0).getCell(2).getStringCellValue());
        
    
	    UpstoxWelcomePage wp=new UpstoxWelcomePage(driver);
        wp.clickUpstoxWelcomePageNoIAmGood();
	         
        UpstoxHomePage hp=new UpstoxHomePage(driver);
        hp.verifyUpstoxHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		
		
    }	

}
