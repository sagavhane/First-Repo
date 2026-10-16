package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetDemo {
	public static void main(String[] args) {
		
		Set<String> name  = new LinkedHashSet<>();
		
		
		name.add("Alice");
		name.add("Rajesh");
		name.add("Tom");
		name.add("Jerry");
		name.add("Ben");
		name.add("Ben");
		
		System.out.println(name);  // preservers order like list and no duplicates are allowed
		


		
	}

}
