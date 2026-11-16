package day19;

public class PutItemsInBag {
	public static void main(String[] args) {
		
		int val[] = {60, 100, 120};
		int wt[] = {10, 20, 40};
		
		int capacity = 50;
		
		double totalvalue = 0;
		
		for(int i = 0;i<val.length;i++) {
			
			
			if(wt[i]<=capacity) {
				
				totalvalue = totalvalue+val[i];
				capacity = capacity-wt[i];
			}
			
			else {
				
				double v = (double) capacity/wt[i];
				
				double vr = val[i]*v;
				
				totalvalue = totalvalue+vr;
				
			}
		}
		System.out.println(totalvalue);
	}

}
