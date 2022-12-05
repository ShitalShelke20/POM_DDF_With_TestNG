package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1Page 
{
          @FindBy(xpath="//input[@id='userCode']") private WebElement UN;
          @FindBy(xpath="//input[@id='password']") private WebElement PWD;
          @FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement LoginBtn;
          
          public UpstoxLogin1Page (WebDriver driver)
          {
        	  PageFactory.initElements(driver, this);
          }
          
          public void inpUpstoxLogin1PageUsername(String Username)
          {
        	  UN.sendKeys("Username");
          }
          
          public void inpUpstoxLogin1PagePassword(String Password)
          {
        	  PWD.sendKeys("Password");
          }
          
          public void clickUpstoxLogin1PageLoginBtn()
          {
        	  LoginBtn.click();
          }
}
