package day10;

public class Alpha2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0;i<=1000;i++) {
			System.out.println(i);
		}
		
	}

}
