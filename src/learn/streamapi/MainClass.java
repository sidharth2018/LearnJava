package learn.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList(new String[] {"abc","bcd","cde","def"});
		List<String> stringsWithb = l1.stream().filter(s->s.contains("b")).collect(Collectors.toList());
		System.out.println(stringsWithb);
		
		List<Integer> l2 = Arrays.asList(new Integer[] {1,2,3,4,5,6,7});
		Integer result = l2.parallelStream().reduce(0, (partialResult,currElement)->partialResult+currElement);
		System.out.println(result);
		
		String concatStringSeq = l1.stream().reduce("", String::concat);
		System.out.println(concatStringSeq);
		String concatStringPar = l1.parallelStream().reduce("", String::concat);
		System.out.println(concatStringPar);
		List<Integer> ls1 = Arrays.asList(new Integer[] {1,2,3});
		List<Integer> ls2 = Arrays.asList(new Integer[] {4,5,6});
		List<Integer> ls3 = Arrays.asList(new Integer[] {7,8,9,10});
		List<List<Integer>> l4 = new ArrayList<>();
		l4.add(ls1);l4.add(ls2);l4.add(ls3);
		List<Integer> flatDouble = l4.stream().flatMap(l->l.stream().map(i->i*2)).collect(Collectors.toList());
		System.out.println(l4);
		System.out.println(flatDouble);
		String[] carr = new String[] {"a","b","c"};
		ArrayList<String> cal1 = new ArrayList<>(Arrays.asList(carr));
		ArrayList<String> cal2 = new ArrayList<>(Arrays.asList(new String[] {"a",new String("b"),"c"}));
		System.out.println(cal1.equals(cal2));
		System.out.println(ls3);
		List<Integer> con = new ArrayList<>(ls3);
//		con.forEach(s->{if(s==8)con.add(11);});//concurrent modification exception
 		Integer index=IntStream.range(0, l2.size()).reduce(-1,(r,i)->l2.get(i)%2==0?i:r);
		System.out.println("last even element is" + index);
		Double average = l2.stream().mapToInt(i->i).average().orElse(0.0);
		System.out.println("Average is "+average);
		Map<Integer, Integer> m = new HashMap<>();
		m.put(1, 1);
		m.put(2,4);
		m.entrySet().stream().forEach(e->System.out.println(e.getKey()));
		System.out.println(con);
		main(new Integer[] {1,2,3});
	}
	public static void main(Integer[] args) {
		System.out.println(args[0]);
	}

}
