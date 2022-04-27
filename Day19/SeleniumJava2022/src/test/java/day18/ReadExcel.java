package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readData() throws IOException
	{
	
		File src=new File(System.getProperty("user.dir")+"/TestData/Data.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		/*
		 * 	XSSFWorkbook
		 * 	XSSFSheet
		 *  XSSFRow
		 *  XSSFCell
		 * 
		 */
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh1=wb.getSheet("LoginData");
		
		XSSFRow r1=sh1.getRow(0);
	
		XSSFCell c1=r1.getCell(0);
		
		System.out.println(c1.getStringCellValue());
		
		wb.close();
		
	}

}
