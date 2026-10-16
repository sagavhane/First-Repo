package day10;

public class Show extends Thread{
	@Override
	public void run() {
		
		for(int i =11 ;i<=20;i++) {
			System.out.println("\t"+i);
			
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	

}
