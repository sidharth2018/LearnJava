import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> e = new ArrayList<>();
		Employee e1 = new Employee("a","IT",1.0);
		Employee e2 = new Employee("b","BANK",2.0);
		Employee e3 = new Employee("c","BANK",3.0);
		
		e.add(e3);e.add(e2);e.add(e1);
		Optional<Employee> maxE = e.stream().max((em1,em2)->e1.getSal().compareTo(e2.getSal()));
		Map<String, List<Employee>> gEmp = e.stream().collect(Collectors.groupingBy(emp->emp.getDpt()));

	}

}
