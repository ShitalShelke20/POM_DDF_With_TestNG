package POM_DDF_With_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage 
{
  @FindBy(xpath="//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement PN;
  
  public UpstoxHomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public String getUpstoxHomePageactPN()
  {
	  String text= PN.getText();
	  return text;
  }
  
 // public void verifyUpstoxHomePageUserID()
  //{
	//  String actPN = PN.getText();
	//if(actPN.contains(expPN))
	 // {
	//	  System.out.println("PASS");
	 // }
	 // else
	  //{
		//  System.out.println("FAIL");
	  //}
  }

