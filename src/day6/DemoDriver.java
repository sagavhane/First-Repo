package day6;
import java.util.Scanner;

public class DemoDriver {
	
	public static void main(String[] args) {
		
		
		
		Student[] fsd = new Student[3];
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		for(int i =0;i<fsd.length;i++) {
			System.out.println("please enter the students name :");
			String n = sc.next();
			System.out.println("please enter roll number :");
			int r = sc.nextInt();
			System.out.println("please enter the percentage of the student :");
			double pr = sc.nextDouble();
			
			fsd[i] = new Student(n,r,pr);
			
		}
		for(int i =0;i<fsd.length;i++) {
			
			fsd[i].displayStudent();
		}
		
		 
		
		
		
		
	}

}
