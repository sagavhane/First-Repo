package day15;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupingByDemo {
	
	public static void main(String[] args) {
		
		
		List<String> words = new ArrayList(Arrays.asList("silent","listen","note","tone","cab","abc","bca"));
		
		Map<String, List<String>> hashmap = words.stream()
			    .collect(Collectors.groupingBy(word -> {
			        char[] ch = word.toCharArray();
			        Arrays.sort(ch);
			        return new String(ch);
			    }));

			System.out.println(hashmap);
		
		
		
		
	}

}
