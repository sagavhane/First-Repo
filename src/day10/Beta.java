package day10;

public class Beta extends Thread {    // VVVV Imp class
  @Override
public void run() {
	// TODO Auto-generated method stub
	  for(int i = 1001;i<=2000;i++) {
			System.out.println("\t"+i);
		}
	super.run();
}
  @Override
	public void start() {
		
	  System.out.println("Hi");
		
	}

}
