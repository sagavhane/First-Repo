package day6;
import java.util.Scanner;

public class Student {

    private int rollnumber;       // instance scope 
	private String studentname;   // instance scope 
    private double percentage;    // instance scope 
    
    private static String principleName="robert gosling ";                        // static scope
    private static int schoolYearOfEstablishment=1886;          // static scope 
    
    
    
    public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

    
     Student(String n, int r, double pr) {                                         // This is a Constructor ,
    	this.rollnumber=r;                                       // It is a special type of method whose name is same as the class name ,
    	this.studentname= n;                                                    // It does not have any return type. 
    	this.percentage = pr;
    }
     Student(int a , String b,double c) {   //AllArgsConstructor
    	this.rollnumber=a;                                       // It is a special type of method whose name is same as the class name ,
    	this.studentname=b;                                                    // It does not have any return type. 
    	this.percentage =c;
    	
    	
    }
     
     Student(){
    	 
    	 
    	
    	 
     }

    public void acceptStudent() {
    	Scanner sc = new Scanner(System.in); 
    	
    	System.out.println("Please enter the roll number");
    	this.rollnumber = sc.nextInt();
    	
    	System.out.println("Please enter Students Name");
    	this.studentname = sc.next();
    	
    	System.out.println("Please enter the percentage ");
    	this.percentage = sc.nextDouble();
    	
   
    }
    
    public void displayStudent(){
    	
    	System.out.println("Roll Number is : "+rollnumber);
    	System.out.println("Student Name is :" +studentname);
    	System.out.println("Percentage is : "+percentage);

    	
    }
    
    public boolean searchByrollNumber(int rno) {
    	if(this.rollnumber==rno) {
    		return true;
    		
    	}
    	else {
    		return false;
    	}
  
    	
    }
    
    public boolean searchbyname(String ab) {
		if(this.studentname.equalsIgnoreCase(ab)) {
			return true;
		}
		return false;
    	
    }
    public static void display()                       // static method can access only static data 
    {                   
    	                                               // stafroom can be accessed only by the stafroom 
    	                                               // static methods can not access instance variables 
    	System.out.println(" Name of the principle us : "+Student.principleName);      // students does not have access to the stafroom
    	
    	displayschoolYearOfEstablishment();                                                // static data can be accessed using class name 
    } 
    
    
    public static void displayschoolYearOfEstablishment()                      
    {                   
    	                                                
    	                                               
    	System.out.println("Year of establishment of the school is : "+Student.schoolYearOfEstablishment);      
    	
    	
    	                                                 
    } 
    
	
    
}























































