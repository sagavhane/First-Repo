package day5;

public class ArrayMaxValue {

    public static void main(String[] args) {

        int arr[][] = {{10,50,20},
        		       {15,65,48},
        		       {87,99,45}};

        int max = arr[0][0];

        for (int i = 1; i < arr.length; i++) {
        	for(int j = 1;j<arr.length;j++) {
        		if (arr[i][j] > max) {
                    max = arr[i][j];
                }
        		
        	}

            
        }

        System.out.println("Maximum number is: " + max);
    }
}