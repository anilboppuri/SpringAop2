package in.javaport.ioc;

public class B {
	
	A a;
	
	
	public B(A a) {
		
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public void run(){
		// pull method // spring IOC - P U S H approach
		// new is the "Nuisance"
		//A a = new A();  //? Replacing A with X 10  ? B cannot be tested if A is not ready
		a.method();
		
	}

}
