package day8.collectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
	
		List<String> obj1=new ArrayList<String>();
		obj1.add("Niraj");
		obj1.add("Nitesh");
		obj1.add("Phani");
		
		List<String> obj2=new LinkedList<String>();
		
		WebElement input=null;
		WebElement cb=null;
		WebElement rb=null;
		WebElement submit=null;
		
		List<WebElement> allElements=new ArrayList<WebElement>();
		allElements.add(input);
		allElements.add(cb);
		allElements.add(rb);
		allElements.add(submit);
		
		
		
		
	}

}
