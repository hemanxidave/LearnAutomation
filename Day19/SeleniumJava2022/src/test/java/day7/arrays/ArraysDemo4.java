package day7.arrays;

public class ArraysDemo4 {

	public static void main(String[] args) {
		
		
		//https://testng.org/doc/documentation-main.html#parameters-dataproviders
	
		String[][] values=new String[3][2];
		
		values[0][0]="Vickey";
		values[0][1]="Sayali";
		
		values[1][0]="Pooja";
		values[1][1]="Niraj";
		
		values[2][0]="Shahu";
		values[2][1]="Himankshi";
		
		System.out.println(values[2][1]);
		
		Object[][] data=new Object[3][2];
		
		data[0][0]=10;
		data[0][1]=12.0;
		
		data[1][0]=true;
		data[1][1]="Niraj";
		
		data[2][0]="Shahu";
		data[2][1]="Himankshi";
		
		System.out.println(values[2][1]);
		
		
		
		
	}

}
