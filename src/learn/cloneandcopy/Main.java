package learn.cloneandcopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class C1{
	String name;
	List<Integer> l ;
	public C1() {
	}
	public C1(C1 c) {
		this.name = new String(c.name);
		this.l = new ArrayList<>(c.l);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getL() {
		return l;
	}
	public void setL(List<Integer> l) {
		this.l = l;
	}
	
}

class C2 implements Cloneable{
	
	String name;
	List<Integer> l;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getL() {
		return l;
	}
	public void setL(List<Integer> l) {
		this.l = l;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		C2 c = (C2)super.clone();
		return c;
	}
}

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		String s1 = "Hi";
		String s2  = "Hi";
		String s3 = new String("Hi");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		s1=s3;
		System.out.println(s1==s3);
		String s4 = new String(s3);
		System.out.println(s3==s4);
		
		C1 c1 = new C1();
		c1.l= Arrays.asList(new Integer[] {1,2,3,4,5});
		c1.name = "c1";
		C1 c2 = new C1(c1);
		System.out.println(c1.name + " "+c2.name);
		System.out.println(c1.l + " "+c2.l);
		c2.name = "c2";
		c2.l.add(6);	
		System.out.println(c1.name + " "+c2.name);
		System.out.println(c1.l + " "+c2.l);
		C2 c3 = new C2();
		c3.l = new ArrayList<>(c2.l);
		c3.name = "C2c3";
		C2 c4 = (C2)c3.clone();
		System.out.println(c4.name + " " + c4.l);
		c4.name = "C2c4";
		c4.l.add(7);
		System.out.println(c4.name + " " + c4.l);
		System.out.println(c3.name + " " + c3.l);
		
		}

}
