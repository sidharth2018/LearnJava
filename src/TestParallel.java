import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class sup{
	private void foo() {
		System.out.print("Hi");
	}
}

class sub extends sup{
	public void foo() {
		System.out.println("Hello");
	}
}

public class TestParallel {

	public static void main(String[] args) {
//		List<Integer> intList = new ArrayList<>(10000);
//		for(int i=0;i<10000;i++) {
//			intList.add(i);
//		}
//		
//		List<Integer> reList = intList.parallelStream().map(i->{return i+1;}).collect(Collectors.toList());
//
//		System.out.println(reList.size());
		sub sub1 =  new sub();
		sub1.foo();
		sup sup1 = new sub();
	}
	
	public static void main() {
		System.out.println("hi");
	}

}
