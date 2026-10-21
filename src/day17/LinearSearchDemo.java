package day17;

public class LinearSearchDemo {

    public static void main(String[] args) {

        int arr[] = {8, 2, 7, 4, 3};

        int search = 7;
        int flag = 0;

        for (int n : arr) {

            if (n == search) {
            	
                System.out.println("Element Found");
                flag =1;
                break;
                
            }
         

        }
        if(flag==0) {
        	System.out.println("Element Not Found"); 
      
        }
    }
}