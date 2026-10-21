package day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo4 {
	public static void main(String[] args) {
		
		
		String str = "virat kohli";
		
		Map<Character , Integer> hashmap = new LinkedHashMap<>();
		
		for(char ch:str.toCharArray()) {
			hashmap.put(ch,hashmap.getOrDefault(ch, 0)+1);
		}
		System.out.println(hashmap);
		
		
		
		
		
		
	}

}
