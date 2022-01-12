package learn.multithreading;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("abc");
		stringList.add("def");
		stringList.add("eruyer");
		stringList.add("ertuyrtyiruty");
		stringList.add("jkhkgyeuiriue");
		stringList.add("bvnbsdvbvsdf");
		
		StringListClass slc = new StringListClass(stringList);
		for(int i=0;i<6;i++) {
			ConcurrentStringProcessor csp = new ConcurrentStringProcessor(slc);
			Thread t = new Thread(csp);
			t.start();
		}

	}

}
