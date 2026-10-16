package day14;

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		
		Printing p1 =() ->{
			System.out.println("Printing is magazine");
			
		};
		p1.print();
		
		
		
		
		Greeting g1 = (name)->{
			System.out.println("Welcome to Fsd"+name);
			
		};
		g1.greet("Surya");
		
		
		
		Shape s2 = (r)->{
			Math.PI * r *r;
			
		};
		
	}

}
