package POM_DDF_TestNG_BasicClass_UtilityClass_PropertyFile_FailedTCScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility_Class 
{
  public static String getID(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
  {
	  FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium Project For Practice\\TestData\\Book1.xlsx");
	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	   String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	   return value;
	   
  }
  public static void captureScreenshot (WebDriver driver,int TCID) throws IOException
  {
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium Project For Practice\\FailedScreenshots\\TestCaseID"+TCID+".jpg");
	   org.openqa.selenium.io.FileHandler.copy(src, dest);   
  }
}
