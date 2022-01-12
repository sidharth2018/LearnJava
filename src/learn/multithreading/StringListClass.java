package learn.multithreading;

import java.util.ArrayList;
import java.util.List;

public class StringListClass {
	
	List<String> list;
	
	public StringListClass(List<String> list) {
		this.list = list;
	}
	
	public String removeString() {
		synchronized (list) {
			return list.remove(0);	
		}
	}

}
