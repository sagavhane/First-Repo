package day7;

import day13.Student;

public class StaticMethodDriverApp {
	public static void main(String[] args) {
		
		Student.display();
		Student.displayschoolYearOfEstablishment();
		
		Student s1 = new Student();
		s1.displayStudent();
		
	}

}
