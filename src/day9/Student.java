package day9;
import java.util.Scanner;

public class Student {

    private int rollnumber;
    private String studentname;
    private double percentage;
    
    public Student() {                                         // This is a Constructor ,
    	this.rollnumber=101;                                       // It is a special type of method whose name is same as the class name ,
    	this.studentname= "Rohit";                                                    // It does not have any return type. 
    	this.percentage = 50.0;
    }
    public Student(int rollnumber , String studentname,double percentage) {                      //AllArgsConstructor
    	                                                                     // It is a special type of method whose name is same as the class name ,
    	try
    	{
    		this.rollnumber = rollnumber; 
    		if(studentname==null) {
    			
    			throw new NullPointerException();
    			
    		}
    	this.studentname = studentname;                                                                         // It does not have any return type. 
    	this.percentage =  percentage;
    	}
    	catch(NullPointerException ex) {
    		System.out.println("Invalid details to create object: ");
    		
    	}
    	
    	
    }

    public void acceptStudent() {
    	Scanner sc = new Scanner(System.in); 
    	
    	System.out.println("Please enter the roll number");
    	rollnumber = sc.nextInt();
    	
    	System.out.println("Please enter Students Name");
    	studentname = sc.next();
    	
    	System.out.println("Please enter the percentage ");
    	percentage = sc.nextDouble();
    	
   
    }
    
    public void displayStudent(){
    	
    	System.out.println("Roll Number is : "+rollnumber);
    	System.out.println("Student Name is :" +studentname);
    	System.out.println("Percentage is : "+percentage);

    	
    }
}