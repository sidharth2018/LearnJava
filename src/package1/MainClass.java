package package1;

import package2.B;
import package2.BChild;

public class MainClass extends B{

	public static void main(String[] args) {		
		A aClass = new A();
		B bClass = new B();
		AChild ac = new AChild();
		BChild bc = new BChild();
		
		aClass.defaultVarA = "a";
		aClass.protectedVarA = "b";
		aClass.publicVarA ="c";
		aClass.defaultVarA = "d";		
	}

}
