package day8.looparray;

public class LoopArray {

	public static void main(String[] args) {
		
		
		String []names= {"Preeti","Anshu","Damodar","Fathima","krish","Divya"};
		
		
		for (String myname : names) 
		{
			System.out.println(myname);
		}
		
		for(int i=0;i<names.length;i=i+2)
		{
			System.out.println(names[i]);
		}

	}

}
