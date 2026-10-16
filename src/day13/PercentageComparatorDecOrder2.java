package day13;

import java.util.Comparator;

public class PercentageComparatorDecOrder2 implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getPercentage()>s2.getPercentage()) {
		return -1;
			
		}
		else if(s1.getPercentage()<s2.getPercentage()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	

}
