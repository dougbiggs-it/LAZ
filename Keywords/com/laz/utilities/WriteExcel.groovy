package com.laz.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExcel {
  
  
  @Keyword
  public void updateUsername(String name) throws IOException{
    FileInputStream fis = new FileInputStream("C:\\DB\\Automation\\work\\data\\UserNames.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet("Sheet1");
	
    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	// This row will append to the bottom 
	//Row row = sheet.createRow(rowCount+1);
	
	// This line will overwrite (1,1)
	Row row = sheet.getRow(rowCount)
	Cell cell = row.createCell(0);
    cell.setCellValue(name);
    FileOutputStream fos = new FileOutputStream("C:\\DB\\Automation\\work\\data\\UserNames.xlsx");
    workbook.write(fos);
    fos.close();
    
  }
  
  
}