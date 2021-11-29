package learn.generics;

import java.util.ArrayList;

public class GenericClass1 <T> {

	private ArrayList<T> list;
	
	public GenericClass1() {
		this.list = new ArrayList<T>();
	}
	
	public T getElement(int index) {
		return list.get(index);
	}
	
	public void addElement(T element) {
		list.add(element);
	}
	
	public <U> String testGenericMethod(U element) {
		
		if(element.getClass().equals(list.get(0).getClass())) return element.getClass().toString();
		else return "Not equal";
	}
	
}