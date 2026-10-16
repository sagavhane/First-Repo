package day10;

public class SingleThreadDemo {
	public static void main(String[] args) {
		
		// display 1 to 1000
		// display 1001 to 2000
		System.out.println(Thread.currentThread().getName());
		
		
		Alpha t1 = new Alpha();
		Beta t2  = new Beta();
		
		t1.start();
		t2.start();
		
	}
	

}
