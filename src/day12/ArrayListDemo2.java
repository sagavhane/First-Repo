package day12;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();        // heterogenous
		
		list1.add(10);
		list1.add(10.5);
		list1.add("Alice");
		list1.add(true);
		System.out.println(list1);
		
		
		
		
		
		
		
		ArrayList<String> list2 = new ArrayList<>();    //  homogenous
		
		list2.add("Alice");
		list2.add("Ben");
		list2.add("Bob");
		list2.add("Tom");
		list2.add("JERRY");
		list2.add("Frank");
		
		
		System.out.println(list2);
		System.out.println(list2.get(2));
		

		
		
	}
	
	

}
