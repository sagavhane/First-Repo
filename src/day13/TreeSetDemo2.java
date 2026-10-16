package day13;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		
		
		System.out.println("**** Fsd Attendance order  *****");

		
		Set<Student> fsdStudentAttendance = new TreeSet(new RnoComparatorAscOrder());
		fsdStudentAttendance.add(new Student(18,"Virat",65.5));
		fsdStudentAttendance.add(new Student(45,"Shubham",58.5));
		fsdStudentAttendance.add(new Student(13,"Rahul",78.5));
		fsdStudentAttendance.add(new Student(25,"Kshitij",72.5));
		fsdStudentAttendance.add(new Student(56,"Sajid",80.5));
		
		
		System.out.println(fsdStudentAttendance);

		for(Student s:fsdStudentAttendance) {
			System.out.println(s);
		
		}
		
		System.out.println("**** Fsd Exam Results *****");
		
		Set<Student> fsdStudentExamResults = new TreeSet(new PercentageComparatorDecOrder2());
		fsdStudentExamResults.add(new Student(18,"Virat",65.5));
		fsdStudentExamResults.add(new Student(45,"Shubham",58.5));
		fsdStudentExamResults.add(new Student(13,"Rahul",78.5));
		fsdStudentExamResults.add(new Student(25,"Kshitij",72.5));
		fsdStudentExamResults.add(new Student(56,"Sajid",80.5));
		
		
		System.out.println(fsdStudentExamResults);

		for(Student s:fsdStudentExamResults) {
			System.out.println(s);
		
		}
		
		
		
		

		
		
		
		
	}

}
