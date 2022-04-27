package day14;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<String, String> m1=new LinkedHashMap<String, String>();
		
		m1.put("Automation", "Selenium");
		
		m1.put("UnitTestFramework", "TestNg");
		
		m1.put("Build", "Maven");
		
		m1.put("Old Build Tool", "Ant");
		
		m1.put("CI", "Jenkins");
	
		System.out.println(m1);
		
		
	}

}
