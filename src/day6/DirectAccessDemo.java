package day6;

public class DirectAccessDemo {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.displayStudent();
		s1.acceptStudent();
		s1.searchbyname("Alice");
		
		
		s1.setRollnumber(333);                                             // setter  is to write the private variables 
		System.out.println("roll number is "+s1.getRollnumber());          // getter is to read the private variabbles 
		
		
	}

}
