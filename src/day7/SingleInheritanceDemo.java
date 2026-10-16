package day7;

public class SingleInheritanceDemo {
	
	public static void main(String[] args) {
		
		Abhishek a1 = new Abhishek();
		
		a1.home();
		
		Amitabh a2 = new Abhishek();
		
	//	a2.car();   this will not allow to inherit the method car from abhishek class
		
		
		
		
            Amitabh a6 = new Aradhya();
		
		       a6.home();
		
            Abhishek a5 = new Aradhya();
		
		     a5.home();
		     a5.car();
		
		     Aradhya a3 = new Aradhya();
		     a3.home();
		     a3.car();
		
		     a3.office();
		
		
		
		
		
		
		
	}

}
