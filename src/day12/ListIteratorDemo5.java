package day12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo5 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 21, 31, 50, 40));
		ListIterator<Integer> itr = numbers.listIterator();
		
		
		while(itr.hasNext()) {
			Integer value = itr.next();
			
			if(value%2==1) {
				itr.set(100);
			}
		}
		System.out.println(numbers);
		
		
	}

}
