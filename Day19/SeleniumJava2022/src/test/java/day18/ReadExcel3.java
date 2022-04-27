package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel3 {
	
	@Test
	public void readData() throws IOException
	{

		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/Data.xlsx")));
		
		XSSFSheet sh1=wb.getSheet("Users");

		int row=sh1.getPhysicalNumberOfRows();
		
		int column=sh1.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
	
		wb.close();
		
	}

}
