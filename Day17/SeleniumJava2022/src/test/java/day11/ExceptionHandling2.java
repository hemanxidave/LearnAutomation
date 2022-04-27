package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		try 
		{
			File src=new File("./DummyFiles/Sample.mukesh");
			FileInputStream fis=new FileInputStream(src);
			System.out.println("Exit");
		} catch (FileNotFoundException e) 
		{
			System.out.println("File can not be loaded "+e.getMessage());
		}
		
		
	}

}
