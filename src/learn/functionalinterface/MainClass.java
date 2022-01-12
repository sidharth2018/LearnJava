package learn.functionalinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		int b=9;
		Powerable squareOld = new Powerable() {
			
			@Override
			public int calculate(int s) {
				ints.add(2);
				int a =5;
				ints.add(a);
				return s*s;
			}
		};
		
		Powerable cubeOld = new Powerable() {
			@Override
			public int calculate(int s) {
				
				return s*s*s;
			}
		};
		Powerable square = (n)->n*n;
		Powerable cube = (n)-> n*n*n;
		
		System.out.println(square.calculate(2));
		System.out.println(cube.calculate(2));
		System.out.println("old " + squareOld.calculate(2));
		System.out.println("Old " + cubeOld.calculate(2));
	}

}
