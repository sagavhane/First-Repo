package day17;

public class BinarySearcDemo {
	public static void main(String[] args) {
		
		int arr[] = {2,3,5,7,9,10};
		
		int start = 0;
		
		int end = arr.length-1;
		int target = 9;
		 int ans = binarysearchdemo(arr,start,end,target);
		 
		 if(ans!=-1) {
			 System.out.println("Target is at index "+ans);
			 
		 }
		 else {
			 System.out.println("element not found");
		 }
		
		
		
		
		
	}
	static int  binarysearchdemo(int[] arr,int start,int end,int target) {
		   while(start<=end) {
			
			int mid = ( start + end)/2;
			
			if(target==arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]) {
				start = mid+1;
				
			}
			else {
				end = mid-1;
			}
			
			
		}
		   return-1;
	}

}
