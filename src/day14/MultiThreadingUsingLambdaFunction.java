package day14;

public class MultiThreadingUsingLambdaFunction {
	
	public static void main(String[] args) {
		Thread tx = null;
		
		Runnable r1 = ()-> {
			System.out.println(Thread.currentThread().getName());
			 for(int i = 1001;i<=2000;i++) 
					System.out.println("\t"+i);
		};
		
		tx = new Thread(r1);
		tx.start();
		
		
		
		
		Runnable r2 = ()-> {
			System.out.println(Thread.currentThread().getName());
			 for(int i = 1;i<=1000;i++) 
					System.out.println("\t"+i);
		};
		
		tx = new Thread(r2);
		tx.start();
		
		
	}

}
