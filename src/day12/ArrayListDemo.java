package day12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Alice","Ben", "Bob", "Tom", "JERRY","Frank")); 
		
		list2.add("raj");
		System.out.println(list2.size());
		String search = "Tom";
		
		if(list2.contains(search)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
		
		int index = list2.indexOf(search);
		
		if(index==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("Found");
		}
		
		
		
		

		
		
	}
	
	

}
