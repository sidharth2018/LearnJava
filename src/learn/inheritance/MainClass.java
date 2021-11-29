package learn.inheritance;
/*
 * In case of overridden method, created object method is called.
 * In case of upcasting only overriden method will be available. Child method will not be available.
 * For accessing the child method the reference should be down casted.
 * Overriding has no meaning in static. Child cannot access parent static method using super keyword.
 * When child instance is created parent constructor is called first.(from top to bottom)
 * Even though we call Child parameterized constructor it will call parent default constructor.
 */
class ClassA{
	
	public ClassA() {
		System.out.println("Inside parent Constructor");
	}
	
	public ClassA(int b) {
		System.out.println(b+10+" Inside parent parameterized constructor");
	}
	
	public void printInfo() {
		System.out.println("Inside parent print info");
	}
	
	public static void staticprintInfo() {
		System.out.println("Inside parent static print info");
	}
}

class ClassAChild extends ClassA{
	
	public ClassAChild() {
		System.out.println("Inside child constructor");
	}
	
	public ClassAChild(int b) {
		System.out.println(b+20+" Inside Child parameterized constructor");
	}
	
	public void printInfo() {
		System.out.println("Inside Child printInfo");
		super.printInfo();
	}
	
	public static void staticprintInfo() {
		System.out.println("Inside Child static print info");
	}
	
	public void childSpecMethod() {
		System.out.println("This is child special method");
	}
}

class ClassAGChild extends ClassAChild{
	public ClassAGChild() {
		System.out.println("Inside GChild");
	}
	public ClassAGChild(int b) {
		System.out.println(b+30+" Inside parameterized GChild");
	}
}
public class MainClass {
	
	public static void main(String args[]) {
		System.out.println("====Constructor Calling=====");
		ClassA c1 =  new ClassA();
		ClassA c2 = new ClassAChild();
		ClassAChild c3 = new ClassAChild();
		
		System.out.println("=====Calling printinfo=====");
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
		
		System.out.println("=====Calling static printinfo=====");
		c1.staticprintInfo();
		c2.staticprintInfo();
		c3.staticprintInfo();
		
		System.out.println("=====Typecasting======");
		//c2.childSpecMethod()// c2 is parent reference. Method will not be available.
		ClassAChild c4 = (ClassAChild)c2; // Child specific method will accessible
		c4.childSpecMethod();
		
		ClassA aParam = new ClassA(1);
		ClassAChild acParam = new ClassAChild(1);
		ClassAGChild agc = new ClassAGChild();
		ClassAGChild agcParam = new ClassAGChild(1);
	}

}
