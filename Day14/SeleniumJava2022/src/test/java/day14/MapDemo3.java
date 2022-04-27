package day14;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {
		
		Map<String, String> m1=new TreeMap<String, String>();
		
		m1.put("Automation", "Selenium");
		
		m1.put("UnitTestFramework", "TestNg");
		
		m1.put("Build", "Maven");
		
		m1.put("Old Build Tool", "Ant");
		
		m1.put("CI", "Jenkins");
	
		System.out.println(m1);
		
		
	}

}
