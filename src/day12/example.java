package day12;

import java.util.Stack;

public class example {
	public static void main(String[] args) {
		
		
		String name = "sangram";
		boolean isPalindrome = true;

		
		
		Stack<Character> stack  = new Stack<>();
		for(char ch:name.toCharArray()) {
			stack.push(ch);
		}
		for(char ch:name.toCharArray()) {
			if(ch!=stack.pop()) {
				
				isPalindrome = false;
				break;
				
			}
			
			
		}
		if(isPalindrome) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
