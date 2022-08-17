package TestNG;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void expectedExceptionTest() {
		System.out.println("In expcetd method");
		int i=9/0;
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		obj.name="Tom";
		System.out.println("bye");
	}

}
