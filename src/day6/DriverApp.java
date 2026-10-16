package day6;

public class DriverApp {
	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		//s1.acceptStudent();
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		s4.displayStudent();
		
		
		Student s5 = new Student(18,"Virat",89);
		s5.displayStudent();
		
	}

}
