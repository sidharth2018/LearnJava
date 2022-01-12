package learn.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	String name;
	public Employee(String name) {
		this.name=name;
	}
}
class Department{
	List<Employee> employees;
}

class obj{
	private int a;
	private int b;
	public obj(int a, int b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		Integer sum = a+b;
		return sum.toString() ;
	}
	
	
}
public class MainFlatMapClass {
	
	public static void main(String[] args) {
		
//		List<Employee> e1 = Arrays.asList(new Employee[] {new Employee("a"),new Employee("b"),new Employee("c")});
//		List<Employee> e2 = Arrays.asList(new Employee[] {new Employee("d"),new Employee("e")});
//		List<Employee> e3 = Arrays.asList(new Employee[] {new Employee("f"),new Employee("g"),new Employee("h"),new Employee("i")});
//		Department d1 = new Department();
//		Department d2 = new Department();
//		Department d3 = new Department();
//		
//		d1.employees = e1;
//		d2.employees=e2;
//		d3.employees=e3;
//		List<Department> dList = Arrays.asList(new Department[] {d1,d2,d3});
//		List<Employee> allEmployees = dList.stream().flatMap((d)->d.employees.stream()).collect(Collectors.toList());
//		allEmployees.stream().forEach((e)->System.out.println(e.name));
//		
//		List<Integer> numList = new ArrayList<>();
//		numList.add(1);
////		List unmodi = Collections.unmodifiableList(numList);
//		List unmodi = numList;
//		unmodi.add(2);
		
		System.out.println(new obj(3,5));
		
		
		
		
		
		
	}

}
