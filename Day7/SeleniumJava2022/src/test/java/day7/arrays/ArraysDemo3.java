package day7.arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		//Size 
		//Type
		
		int[] marks=new int[5];
		marks[0]=10;
		marks[1]=100;
		marks[2]=50;
		marks[3]=78;
		marks[4]=49;
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		Object[] values=new Object[5];
		values[0]=10;
		values[1]=10.2;
		values[2]=true;
		values[3]="Selenium";
		values[4]='a';
		
		System.out.println(values);
		
		
		
		
		
	}

}
