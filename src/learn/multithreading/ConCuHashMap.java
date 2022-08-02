package learn.multithreading;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConCuHashMap {
	
	public static void main(String[] args) {
		Map<String,String> m = new ConcurrentHashMap<>();
		
		m.put("a", "abc");
		m.put("e", "efg");
		
		Iterator<Entry<String,String>> i = m.entrySet().iterator();
		while(i.hasNext()) {
			Entry<String, String> e = i.next();
			if(e.getKey().equals("a")) m.put("f", "fgh");
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
