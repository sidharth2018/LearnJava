package learn.innerclassandenum;

import java.util.stream.Stream;

import learn.innerclassandenum.EnumClass.GENDER;

public class MainClass {

	public static void main(String[] args) {
		GENDER g1 = GENDER.MALE;
		LearnInnerClass l1 = new LearnInnerClass();
		LearnInnerClass.InnerClass1 l1i1 = l1.new InnerClass1();
		l1i1.setOurtMem1("From inner1");
		LearnInnerClass.InnerClass3 l1i3 = l1.new InnerClass3();
		System.out.println(l1.getMem1());
		l1i3.setOurtMem1("From inner3");
		System.out.println(l1.getMem1());
		LearnInnerClass.InnerClass1 l1i12 = l1.new InnerClass1();
		System.out.println(l1i12.getOuterMem1());
		EnumClass e1 = new EnumClass();
		e1.setGen(GENDER.MALE);
		for(Color col: Color.values()) {
			System.out.println(col);
		}
		
		System.out.println(Stream.of(Color.values()).anyMatch(col->col.toString().equals("RED")));
		System.out.println(Stream.of(Color.values()).anyMatch(col->col.toString().equals("WHITE")));
	}
	
	public enum Color{
		RED,BLUE,GREEN,YELLOW;
	}
	

}
