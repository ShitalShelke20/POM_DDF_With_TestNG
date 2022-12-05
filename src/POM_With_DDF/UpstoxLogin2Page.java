package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2Page 
{
    @FindBy(xpath="//input[@id='yob']") private WebElement YOB;
    
    public UpstoxLogin2Page(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void inpUpstoxLogin2PageYearOfBirth(String YearOfBirth)
    {
    	YOB.sendKeys(YearOfBirth);
    }
}
