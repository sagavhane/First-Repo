package day10;

public class Display extends Thread {
	
	@Override
	public void run() {
		
		for(int i =1 ;i<=10;i++) {
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
