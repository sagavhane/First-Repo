package day13;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo3 {
	public static void main(String[] args) {
		
		
		String str = "aaabbccdd";
		
		Map<Character,Integer> hashmap = new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			if(hashmap.containsKey(ch)) {
				hashmap.put(ch, hashmap.get(ch)+1);
				
			}
			else {
				hashmap.put(ch,1);
			}
			
			
		}
		System.out.println(hashmap);
		
		
		for(Map.Entry<Character,Integer> entry:hashmap.entrySet()) {
			if(entry.getKey()!='d') {
				System.out.println(entry.getKey()+""+entry.getValue());
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
