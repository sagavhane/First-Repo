package day12;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;


public class ListIteratorDemo {
	public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList(Arrays.asList(10,20,31,41,50,60));
		ListIterator<Integer>  itr = numbers.listIterator();
		
		while(itr.hasNext()) {
			
			
			Integer value = itr.next();
			
			if(value%2==1) {
				itr.remove();
			}
		}
		
		System.out.println(numbers);
		
	
		
		
	}

}
