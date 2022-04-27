package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel2 {
	
	@Test
	public void readData() throws IOException
	{

		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/Data.xlsx")));
		
		System.out.println(wb.getSheet("LoginData").getRow(0).getCell(0).getStringCellValue());
		
		System.out.println(wb.getSheet("Users").getRow(2).getCell(2).getStringCellValue());
		
		System.out.println(wb.getSheet("Users").getPhysicalNumberOfRows());
		
		System.out.println(wb.getSheet("Users").getRow(0).getPhysicalNumberOfCells());
	
		wb.close();
		
	}

}
