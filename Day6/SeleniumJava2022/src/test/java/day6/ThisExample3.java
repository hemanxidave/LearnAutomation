package day6;

public class ThisExample3 {

	/*
	 * 
	 * refer current class variables
	 * 
	 * 
	 */

	int num;
	String name;

	public ThisExample3(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public static void main(String[] args) 
	{
		ThisExample3 obj1=new ThisExample3(10,"Pooja");
		obj1.show();
	}

	public void show()
	{
		System.out.println(num + " "+name);
	}
	
}
