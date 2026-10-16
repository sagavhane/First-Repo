package day10;

public class Beta2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		 for(int i = 1001;i<=2000;i++) {
				System.out.println("\t"+i);
			}
	}

}
