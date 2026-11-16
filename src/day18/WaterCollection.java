package day18;

public class WaterCollection {
	
	public static void main(String[] args) {
		
		int hights[] = {1,8,6,2,5,4,8,3,7};
		
		int max = maxwater(hights);
		System.out.println(max);
		
		
	}

	private static int maxwater(int[] hights) {
		int start = 0;
		int end = hights.length-1;
		
		int maxArea = 0;
		
		
		
		while(start<end) {
			
			
			int hight = Math.min(hights[start], hights[end]);
			
			int width = end-start;
			
			int area = hight*width;
			maxArea = Math.max(area, maxArea);
			
			
			if(hights[start]<=hights[end]) {
				
				start++;
				
			}
			else {
				end--;
			}
					
			
		}
		return maxArea;
		
	}

}
