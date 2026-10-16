package day4;

public class PrimeNumberUsingFunction {

    public static void main(String[] args) {
    	
    	int arr[] = {23, 18, 25, 40, 29};
    	
    	
    	System.out.println("The prime numbers from the array are as follows :");
    	
    	
    	for(int i = 0;i<arr.length;i++) {
    		int flag = 0;
    		
    		
    		
    		for(int j =2;j<arr[i];j++) {
    			if(arr[i]%j==0) {
    				flag=1;
    				break;
    			}
    			
    			
    		}
    		
    		if(flag==0) {
    			System.out.println(arr[i]);
    		}
    		
    		
    	
    		
    		
    		
    		
    		
    	}
    	
    }
}