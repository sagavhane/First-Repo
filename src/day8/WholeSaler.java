package day8;
import java.util.Scanner;

public class WholeSaler {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the quantity ");
		
		int qn = sc.nextInt();
		try {
		if(qn>=50) {
			System.out.println("Order Accepted");
			
		}
		else
		{
			throw new LowQuantityException("Please contact retailer "); //explicitely throw the object of 
			                                                            // coustom exception class
			                                                            // we use throw word
		}
		
		
		
		}catch(LowQuantityException ex) {
			System.out.println(ex.getMessage());
		}
	}
	

}
