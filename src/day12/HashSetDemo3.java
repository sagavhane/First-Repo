package day12;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class HashSetDemo3 {
	public static void main(String[] args) {
		
		
		Set<String> names = new HashSet();
		
		System.out.println(names.add("Alice")); //true		["Alice"]
		System.out.println(names.add("Ben"));	//true      ["Alice","Ben"]
		System.out.println(names.add("Ben"));   //fals
		
		
		
		String name = "viratkohli";
		Set<Character> hashset = new HashSet<>();		
		for(char ch:name.toCharArray()) {
			if(hashset.contains(ch)) {
				System.out.println("First repeated character is "+ch);
				break;
			}
			else {
				hashset.add(ch);
			}
			
		}
		
		
		
	}

}
