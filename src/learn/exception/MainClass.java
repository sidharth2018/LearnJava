package learn.exception;

public class MainClass {

	public static void main(String[] args) {
		m1();

	}
	
	static void m1() {
		
		try {
			m2();
		} catch(NullPointerException n) {
			System.out.println("inside m2");
		}
		
	}
	
	static void m2() throws NullPointerException {
		m3();
	}
	
	static void m3() {
		throw new NullPointerException();
	}
	

}
