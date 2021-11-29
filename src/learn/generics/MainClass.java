package learn.generics;

public class MainClass {

	public static void main(String[] args) {
		
		GenericClass1<Integer> g1 = new GenericClass1<>();
		Integer i1 = 5;
		String s1="s";
		g1.addElement(1);
		g1.addElement(2);
		System.out.println(g1.getElement(1));
		System.out.println(g1.testGenericMethod(s1));

	}

}
