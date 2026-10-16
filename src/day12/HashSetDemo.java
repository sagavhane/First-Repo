package day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
//		Set<Integer> set1 = new HashSet(Arrays.asList(1,2,3,5,4,4,5,6,8,0));
//		
//		System.out.println(set1);
//		
		
		Set<Integer> set1 = new HashSet(Arrays.asList(1,2,3,4,5,5,5));
		Set<Integer> set2 = new HashSet(Arrays.asList(4,5,6,7,8));
		System.out.println(set1);
		
		set1.addAll(set2);
		System.out.println(set1);
		System.out.println("set1 intersect set2 is");
		set1.retainAll(set2);
		
		
		System.out.println(set1.retainAll(set2));
		System.out.println(set1);


		
	}

}
