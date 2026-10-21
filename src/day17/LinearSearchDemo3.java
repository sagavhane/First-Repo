package day17;

public class LinearSearchDemo3 {

    public static void main(String[] args) {

        int income[] = {100, 200, 500, 1000, 200, 800};

        int target = 1500;
        
        int day = weeklytarget(income,target);
        
        if(day!=-1) {
        	System.out.println("Target is achived on  day "+(day+1));
        }
        else {
        	System.out.println("Target is not achived in this week .");
        }
        
        
        

    }
    
    public static int weeklytarget(int[] income,int target) {
    	
    	int sum = 0;
    	for(int i = 0;i<income.length;i++) {
    		 
    		sum = sum+income[i];
    		
    		if(sum>=target) {
    			
    	return i;
    		}
    	}
    	return -1;
    	
    }
    
}