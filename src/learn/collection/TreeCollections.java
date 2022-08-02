package learn.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Employee{
	
	String Name;
	int age;
	int salary;
	
	
	

	public Employee(String name, int age, int salary) {
		super();
		Name = name;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Name, age, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Name, other.Name) && age == other.age && salary == other.salary;
	}


//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.Name.compareTo(o.Name);
//	}
	
	
	
}
public class TreeCollections {
	
	public static void main(String[] args) {
		
		Comparator<Employee> cName = (e1,e2)->e1.Name.compareTo(e2.Name);
		Employee e1 = new Employee("abc",23,10002);
		Employee e2 = new Employee("bcd",34,10404);
		Employee e3 = new Employee("dfg",12,10550);
		Employee e4 = new Employee("fgh",45,10066);
		Map<Employee, Integer> m = new TreeMap<>(cName);
		m.put(e1, e1.age);
		m.put(e2, e2.age);
		m.put(e3, e3.age);
		m.put(e4, e4.age);
		System.out.println(m);
		
	}

}
