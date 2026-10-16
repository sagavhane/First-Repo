package day12;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack();
		String str = "madam";
		
		for(char ch:str.toCharArray()) {
			stack.push(ch);
		}
		
		
		boolean isPalindrome = true;
		for(char ch:str.toCharArray()) {
			if(ch!=stack.pop()) {
				isPalindrome = false;
				break;
				
			}
			
		}
		if(isPalindrome) {
			System.out.println("it is a palindrome ");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
