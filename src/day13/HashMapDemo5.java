package day13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo5 {
	
	public static void main(String[] args) {
		
		String sentence = "one two one three one four five five one six six seven seven seven eight nine ten ten ";
		String words[] =sentence.split(" ");
		Map<String,Integer> hashmap = new LinkedHashMap<>();   //linked hashmap stores the elements in sorted manner 
		
		for(String word:words) {
			
				hashmap.put(word,hashmap.getOrDefault(word,0)+1);
				
		}
		System.out.println(hashmap);
	}

}
