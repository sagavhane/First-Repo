package day8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {
	public static void main(String[] args) {
		
		int arr[] = new int[2];
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter for 0 index");
	    arr[0] = sc.nextInt();
	    
		System.out.println("Please enter for 1 index");

	    arr[1] = sc.nextInt();
	    
	                                        try
	                                        {
	                                        System.out.println("please enter the index of number that you want to be a numerator ");
	                                         int n = sc.nextInt();
	                                         
	                                         
	                                         System.out.println("please enter the index of number that you want to be a denomirator ");
	                                         int d = sc.nextInt();
	                                         
	                                         double result = arr[n]/arr[d];
	                                         System.out.println(result);
	                                         
	                                        }
	                                        catch(ArithmeticException ex) {
	                                        	System.out.println("please enter the non zero denominator.");
	                                        	
	                                        }
	                                        catch(ArrayIndexOutOfBoundsException ex) {
	                                        	System.out.println("please enter the valid index.");
	                                        	
	                                        }
	                                         
	                                         
	                                         
	    
		}
		catch(InputMismatchException ex) {
			System.out.println("invalid input ");
		}
		System.out.println("Hi");

		
		
	}

}
