package day13;

import java.util.HashSet;
import java.util.Set;

public class HashMapDemo4 {
	public static void main(String[] args) {
		
		String name = "virat kohli";
		
		Set<Character> hashset = new HashSet<>();
		for(char ch :name.toCharArray()) {
			if(hashset.contains(ch)) {
				System.out.println("The first repeated character is "+ch);
				break;
			}
			else {
				hashset.add(ch);
			}
			
			
		}
		
		
		
		
		
		
	}

}
