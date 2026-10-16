package day10;

public class Alpha extends Thread {
@Override
public void run() {
	
	// TODO Auto-generated method stub
	for(int i = 0;i<=1000;i++) {
		System.out.println(i);
	}
	
	
}
@Override
	public void start() {
		
	System.out.println("hi");
	
	}
}
