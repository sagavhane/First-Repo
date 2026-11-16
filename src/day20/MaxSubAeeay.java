package day20;

public class MaxSubAeeay {
	public static void main(String[] args) {
		
		            // 0 1  2 3  4   
		int nums[] = {-2,1,-3,4,-1};
		
		int ans =  maxsubarray(nums);
		
		System.out.println(ans);
	}

	private static int maxsubarray(int[] nums) {
		
		
		int dp[] = new int[nums.length];
		                       // 0 1  2 3 4
		dp[0] = nums[0];      // [0,1,-2,2,1]
		
		int max = dp[0];
		
		for(int i=1;i<nums.length;i++) {
			
			int option1 = nums[i];        //1 -3  4 -1
			
			int option2 = nums[i]+dp[i-1];
			
			dp[i] = Math.max(option1, option2);
			
			max = Math.max(max, dp[i]);
		}
		
		return max;
		
	}

}
