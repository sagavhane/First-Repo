package day21;

public class BankRober {
	public static void main(String[] args) {
		
		              //1 2 3 4 5 6 7 8
		int shifts[] = {0,2,2,6,6,8,9,12};
		
		
		int time =3;
		
		int totalBankHrs = 15;
		
		int guarded = 0;
		
		for(int i=0;i<shifts.length;i+=2) {
			
			int start = shifts[i];
			
			int end = shifts[i+1];
			
			int hours = end-start;
			
			
			guarded = guarded+hours;
			
			
			//guarded = guarded+shifts[i+1]-shifts[i];
			
		}
		int ungarded= totalBankHrs-guarded;
		
		
		if(time<ungarded) {
			
			System.out.println("Mission Succcessfull");
			
			
		}
		else {
			System.out.println("Mission is not completed");
		}
	}

}
