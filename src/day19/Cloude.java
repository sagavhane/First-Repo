package day19;

public class Cloude {
	public static void main(String[] args) {
		
		
		int clouds[] = {0,0,1,0,0,1,0,0};
		
		int jumpcount = 0;
		
		 int ans = findjumpcounts(clouds,jumpcount);
		 System.out.println("Maximum Jumps on the clouds :- "+ans);
		
	}

	private static int findjumpcounts(int[] clouds,int jumpcounts) {
                 
		for(int i  =0; i<clouds.length-1;) {
			
			     if(i+2<clouds.length&&clouds[i+2]==0) {
				
				     i=i+2;
			   }
			       else {
				   i=i+1;
			    }
			
			          jumpcounts++;
		}
		return jumpcounts;
	
	}

}
