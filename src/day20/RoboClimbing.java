package day20;

public class RoboClimbing {
	public static void main(String[] args) {
		
		int rows = 3;
		int columns =4;
		
		int ans =  playgame(rows,columns);
		System.out.println(ans);
	}

	private static int playgame(int rows, int columns) {
		
		int dp[][] = new int[rows][columns];
		
		// fill the first row with 1s
		
		for(int i =0;i<columns;i++) {
			dp[0][i] =1;
			
		}
		
		// fill the first col with 1s
		
		for(int j =0;j<rows;j++) {
			dp[j][0] = 1;
			
			
		}
		
		for(int i =1;i<rows;i++) {
			
			for(int j =1;j<columns;j++) {
				
				dp[i][j] = dp[i][j-1]+dp[i-1][j];
			}
		}
		return dp[rows-1][columns-1];

		
		
		
	}

}
