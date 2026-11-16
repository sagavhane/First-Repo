package day20;

public class StairClimbing {
	public static void main(String[] args) {
		int n =5;
		int max =  maxPossibleWays(n);
		System.out.println(max);
	}

	private static int maxPossibleWays(int n) {
		int dp[] = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3;i<=n;i++) {
			
			dp[i] = dp[i-1]+dp[i-2];
			
			
		}
		return dp[dp.length-1];

		
	}

}
