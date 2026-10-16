package day6;

import java.util.Scanner;

public class DriverAppForArrayObject {
	public static void main(String[] args) {
		
		Student fsdBatch[] = new Student[3];         // create an array of length 3
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<fsdBatch.length;i++) {
			
			System.out.println("please enter the roll number :");
			int a = sc.nextInt();
			System.out.println("please enter the students name :");
			String b = sc.next();
			
			System.out.println("please enter the percentage :");
			double c = sc.nextDouble();
			
			
			fsdBatch[i] = new Student(a,b,c);      // AllArgs Constructor 
		}
		for(int i = 0;i<fsdBatch.length;i++) 
			fsdBatch[i].displayStudent();
		
		
		System.out.println("please enter the rollnumber to search : ");
		int searchedRno = sc.nextInt();
		int flag = 0;
		for(int i =0;i<fsdBatch.length;i++) {
		 boolean result = fsdBatch[i].searchByrollNumber(searchedRno);
		 
		 if(result==true) {
			 System.out.println("user found :");
			 flag=1;
			 break;
		 }
		 if(flag==0) {
			 System.out.println("Student not found :");
		 }
		}
		
		System.out.println("please enter the name to search :");
		String searchname = sc.next();
		int flag1 = 0;
		for(int i = 0;i<fsdBatch.length;i++) {
			boolean result_1 = fsdBatch[i].searchbyname(searchname);
			
			if(result_1==true) {
			  System.out.println("user found :");
			  flag1=1;
			  break;	
		}
			if(flag1==0) {
				System.out.println("user not found :");
			}
		
			
		}
		
		

	}
	
	
	

}
