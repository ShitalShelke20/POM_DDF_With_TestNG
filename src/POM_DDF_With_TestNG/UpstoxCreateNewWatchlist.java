package POM_DDF_With_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxCreateNewWatchlist 
{
//		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			WebDriver driver=new ChromeDriver();
//			driver.get("https://login-v2.upstox.com/");
//		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		    @FindBy(xpath="//div[@id='watchlistSelect_dropdown']") private WebElement WD;
	          @FindBy(xpath="//div[@id='new-watchlist_suffix']") private WebElement NW;
	          @FindBy(xpath="//div[@class='_2qSoU5m9p_WTwxgb5exwsU _2MBORvY3t6NJsLnmzvwK2m']/input[@type='text']") private WebElement WN;
	          @FindBy(xpath="//div[@class='_2Zj7zuh0aYIa3JQ9dKvLkB']//button[@type='submit']") private WebElement SaveBtn;
	          @FindBy(xpath="//div[@id='Mock_title']") private WebElement WT;
	          @FindBy(xpath="//div[text()='Add a scrip']") private WebElement AAS;
//	          @FindBy(xpath="//div[@class='_2qSoU5m9p_WTwxgb5exwsU _2MBORvY3t6NJsLnmzvwK2m']/input[1]") private WebElement WD;
//	          @FindBy(xpath="//div[@class='_3m7-JJ1fOc5hbNSPofJatj']/button[@id='NSE_EQ|1660']") private WebElement WD;
	          
	          public UpstoxCreateNewWatchlist (WebDriver driver)
	          {
	        	  PageFactory.initElements(driver, this);
	          }
	          
	          public void clickUpstoxCreateNewWatchlistDropdown()
	          {
	        	  WD.click();
	          }
	          
	          public void clickUpstoxCreateNewWatchlistNew()
	          {
	        	  NW.click();
	          }
	          
	          public void inpUpstoxCreateNewWatchlistWatchlistName(String WatchlistName)
	          {
	        	  WN.sendKeys(WatchlistName);
	          }
	          public void clickUpstoxCreateNewWatchlistSaveWatchlictTitle()
	          {
	        	  WT.click();
	          }
	          public void clickUpstoxCreateNewWatchlistAddAScrip()
	          {
	        	AAS.click();
	          }
//	          public void clickUpstoxCreateNewWatchlistSaveButton()
//	          {
//	        	  SaveBtn.click();
//	          }
//	          public void clickUpstoxCreateNewWatchlistSaveButton()
//	          {
//	        	  SaveBtn.click();
//	          }
//	          public void clickUpstoxCreateNewWatchlistSaveButton()
//	          {
//	        	  SaveBtn.click();
//	          }
//		    
		    
	
//	driver.findElement(By.xpath("//div[@id='watchlistSelect_dropdown']")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//div[@id='new-watchlist_suffix']")).click();
//	driver.findElement(By.xpath("//div[@class='_2qSoU5m9p_WTwxgb5exwsU _2MBORvY3t6NJsLnmzvwK2m']/input[@type='text']")).sendKeys("moc");
//	driver.findElement(By.xpath("//div[@class='_2Zj7zuh0aYIa3JQ9dKvLkB']//button[@type='submit']")).click();
//	driver.findElement(By.xpath("//div[@id='Mock_title']")).click();
//	driver.findElement(By.xpath("//div[text()='Add a scrip']")).click();
//	driver.findElement(By.xpath("//div[@class='_2qSoU5m9p_WTwxgb5exwsU _2MBORvY3t6NJsLnmzvwK2m']/input[1]")).sendKeys("ITC");
//	driver.findElement(By.xpath("//div[@class='_3m7-JJ1fOc5hbNSPofJatj']/button[@id='NSE_EQ|1660']")).click();
     
}