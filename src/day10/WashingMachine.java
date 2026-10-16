package day10;

public class WashingMachine {
 public static void main(String[] args) throws InterruptedException {
	 
	 Soak thread1 = new Soak();
	 Wash thread2 = new Wash();
	 Rins thread3 = new Rins();
	 
	 thread1.start();
	 thread1.join(5000);
	 thread2.start();
	 thread2.join(5000);
	 thread3.start();
	 
	
}

}
