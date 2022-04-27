package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) 
	{
		Date currentDate=new Date();
		
		SimpleDateFormat myDateFormat=new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");

		System.out.println(myDateFormat.format(currentDate));
		
	}

}
