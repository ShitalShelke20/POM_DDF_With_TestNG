package POM_DDF_TestNG_BasicClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class 
{
  public static String getID(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
  {
	  FileInputStream file = new FileInputStream("E:\\Study material shital\\DDF\\Book1.xlsx");
	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	   String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	   return value;
	   
  }
}
