package learn.streamapi;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ParallelStream {
	
	public static void main(String[] args) {
//		List<Integer> ints = Arrays.asList(new Integer[] {7,8,4,5,12,46,23,55,1});
//		Integer minimum = ints.parallelStream().reduce(ints.get(0),(a,b)-> a>b?a:b,(a,b)->a>b?a:b);
//		
//		OptionalDouble average = ints.stream().mapToInt(Integer::intValue).average();
//		System.out.println(minimum);
//		System.out.println(average);
		ParallelStream p = new ParallelStream();
		p.dividenum3(3);
	}
	
	static Integer maxnum(Integer a, Integer b) {
		return a>b?a:b;
	}
	static Integer sumof(Integer a, Integer b) {
		return a+b;
	}
	
	public int dividenum(int i) throws FileNotFoundException{
		if(i==3) throw new FileNotFoundException();
		 return i/0;
		
	}
	
	public int dividenum2(int i) throws FileNotFoundException{
		return dividenum(i);
	}

	public void dividenum3(int i){
		try {
			dividenum2(2);
		} catch(ArithmeticException | NullPointerException | FileNotFoundException n) {
			System.out.println("exception caught");
		}
		
		
	}
}
