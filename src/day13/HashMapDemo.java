package day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		
		Map<String,Double> hashmap = new HashMap<>();
		hashmap.put("Alice",2000.0);
		hashmap.put("Ben", 2200.0);
		hashmap.put("chris",2500.0);
		System.out.println(hashmap);
		hashmap.put("Allen",1800.0);
		System.out.println(hashmap);
		
		
		for(String name:hashmap.keySet()) {
			System.out.println(name);
			
		}
		for(Double salary:hashmap.values()) {
			System.out.println(salary);
		}
		
		for(Entry<String, Double> emp:hashmap.entrySet()) {
			System.out.println(emp.getKey()+","+emp.getValue());
			
		}
		double maxsalary = 0;
		
		for(Double salary:hashmap.values()) {
			if(salary>maxsalary)
				maxsalary=salary;
		}
		
		System.out.println("MaxSalary " +maxsalary);
		}
		
		
	
	
	

}
