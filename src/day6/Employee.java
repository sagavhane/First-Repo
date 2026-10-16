package day6;

import java.util.Scanner;

public class Employee extends Person {
	
	protected int emno;                                        // total atttributes = 6;
	protected String designation;
	protected double salary;
	
	public Employee() {
		
	}
	public Employee(int emno, String designation, double salary) {
		
		this.emno = emno;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void acceptemployee() {
		
		 
    	Scanner sc = new Scanner(System.in); 
    	
    	System.out.println("Please enter employee id :");
    	emno = sc.nextInt();
    	
    	System.out.println("Please enter employee designation");                    // total methods = 6;
    	designation = sc.next();
    	
    	System.out.println("Please enter employee sallary  ");
    	salary = sc.nextDouble();
}
    	
   
                                                                           
    
    public void displayemplloyee(){
    	
    	System.out.println("employee id is : "+emno);
    	System.out.println("designations is  :" +designation);
    	System.out.println("salary of employee is: "+salary);

    	
    
}

	
	

}
