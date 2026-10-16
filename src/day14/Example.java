package day14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Example {

    public static void main(String[] args) {
         
    	
    	int evencount =0;
    	int oddcount = 0;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(numbers);
        
        for(int n:numbers) {
        	
        	if(n%2==0) {
        		evencount++;
        	}
        	else {
        		oddcount++;
        	}
        }
       System.out.println("Even number count is "+evencount);
       System.out.println("Odd number count is "+oddcount);
       
       
       
       
       
       // ****** Using Hashmap ********
       
       
       Map<String,Integer> hashmap = new HashMap<>();
       
       hashmap.put("Evencount", 0);
       hashmap.put("Oddcount", 0);
       
       
       for(int n:numbers) {
    	   
    	   if(n%2==0) {
    		  
    		   hashmap.put("Evencount",hashmap.get("Evencount")+1);
    	   }
    	   else {
    		   hashmap.put("Oddcount",hashmap.get("Oddcount")+1);

    	   }
    	   
    	  
       }
       System.out.println(hashmap);

       
       
       
       
    }
}