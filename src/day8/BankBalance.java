package day8;
import java.util.Scanner;

public class BankBalance {
	
	
	public static void main(String[] args) {
		
		try {

			int balance = 75000;
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter an amount to withdraw :");
		int withdrawlamount = sc.nextInt();
		
		if(withdrawlamount>balance) {
			throw new InsufficientBalanceException("Insufficient Balance :"); // After exception is thrown no message is allowed to print 
		}
		else {
			balance = balance-withdrawlamount;
			System.out.println("Please collect your cash .");
			System.out.println("Thank You! Visit Again.");
			System.out.println(" bank balance :"+balance);
			}
		
		
		}catch(InsufficientBalanceException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}
