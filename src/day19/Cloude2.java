package day19;

public class Cloude2 {
	public static void main(String[] args) {
		
		
		
		            // 0  1 2 3 4 5 6 7
		int clouds[] = {0,0,1,0,0,1,0,0};
		
		
		
		 int ans = jumpcount(clouds);
		 
		 System.out.println("the minimum jump counts "+ans);
		
	
	}

	private static int jumpcount(int[] clouds) {
		int jumpcount =0 ;

		for(int i=0;i<clouds.length-1;) {
			
			if(i+2<clouds.length&&clouds[i+2]==0) {
				
				i = i+2;
				
				
			}
			else {
				i=i+1;
				
			}
			jumpcount++;
			
		}
		return jumpcount;
		
	}
	

}
