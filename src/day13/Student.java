package day13;
import java.util.Scanner;

public class Student  {

    private int rollnumber;       // instance scope 
	private String studentname;   // instance scope 
    private double percentage;    // instance scope 
   
    public Student(){
    	
    }

    Student(int a , String b,double c) {                      //AllArgsConstructor
   	this.rollnumber=a;                                       // It is a special type of method whose name is same as the class name ,
   	this.studentname=b;                                                    // It does not have any return type. 
   	this.percentage =c;
   	
   	
   }
    
    
    
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

    
 
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", studentname=" + studentname + ", percentage=" + percentage
				+ "]";
	}
//	@Override 
//	public int compareTo(Student s1) {                  // compare it on rollnumber attribute in ascending order
//		if(this.rollnumber>s1.rollnumber) {
//			return 1;
//			
//		}
//		else if(this.rollnumber<s1.rollnumber) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//		
//	} 
	
	
	public int compareTo(Student s1) {                  // compare it on rollnumber attribute in ascending order
		if(this.percentage>s1.percentage) {
			return -1;
			
		}
		else if(this.percentage<s1.percentage) {            // if you return -1 here it will return in ascending order and vice versa
			return 1;
		}
		else {
			return 0;
		}
		
	}

	public static void display() {
		// TODO Auto-generated method stub
		
	}

	public static void displayschoolYearOfEstablishment() {
		// TODO Auto-generated method stub
		
	}

	public void displayStudent() {
		// TODO Auto-generated method stub
		
	} 
    
	
    
}























































