package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		 LinkedList<String> mh = new LinkedList(Arrays.asList("Solapur","mumbai","Pune"));
	       mh.addFirst("Nashik");
	       mh.addLast("Kolhapur");
	       
	       System.out.println(mh);
	       
	      
	       
	       System.out.println(mh.peekFirst());
	       System.out.println(mh.peekLast());
	       
	       mh.remove("Nashik");
	       System.out.println(mh);
		
	}

}
