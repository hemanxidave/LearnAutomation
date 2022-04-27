package day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo4 {

	public static void main(String[] args) {
		
		Map<String, List<String>> allStudents=new HashMap<String, List<String>>();
		
		List<String> l1=Arrays.asList("Amit","Alisha","Aya","Debamita");
		
		List<String> l2=Arrays.asList("Dinakaran","Fathima");
		
		List<String> l3=Arrays.asList("Hemankshi","Krish");

		allStudents.put("Jan", l1);
		allStudents.put("Feb", l2);
		allStudents.put("March", l3);
		
		System.out.println(allStudents);
		
		System.out.println(allStudents.get("March").get(1));
		
		

	}

}
