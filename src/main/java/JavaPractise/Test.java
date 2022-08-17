package JavaPractise;

public class Test {
	//static int i;

	public static void main(String[] args) {
		System.out.println("A");
		ChildClass e= new ChildClass();
		
		try {
			int i=9/0;
			System.out.println("in try method");
			e=null;
			e.m();
			System.out.println("in try method");
			
		}catch(NullPointerException p) {
			System.out.println("null pointer exce[tion");
		}catch(ArithmeticException e1) {
			System.out.println("Arthmatic exception");
		}
		
	}

}
