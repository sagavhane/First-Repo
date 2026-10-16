package day6;

import java.util.Scanner;

public class Person {
	
	
	protected String name;
	protected int age;
	protected String address;
	
	
	public Person() {
		
	}
	
	public Person(String name, int age, String address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void acceptperson() {
		
		 
		    	Scanner sc = new Scanner(System.in); 
		    	
		    	System.out.println("Please enter person name :");
		    	name = sc.next();
		    	
		    	System.out.println("Please enter person age");
		    	age = sc.nextInt();
		    	
		    	System.out.println("Please enter persons address  ");
		        address = sc.next();
	}
		    
	public void displayperson(){
		    	
		    	System.out.println("person name is : "+name);
		    	System.out.println("person age is  :" +age);
		    	System.out.println("persons address is : "+address);

		    
	}


	

}
