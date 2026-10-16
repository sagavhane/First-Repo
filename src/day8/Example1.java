package day8;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name :");
		
		String name = sc.nextLine();
		try {
			if(name.contains(" ")){
				throw new InvalidNameException("please enter the valid name without space ");
				
			}
			
			System.out.println("Valid name: " + name);	
			System.out.println();
			
			
		}
		catch(InvalidNameException ex) {
			System.out.println(ex.getMessage());
		}
		}
		
	}
	

}
