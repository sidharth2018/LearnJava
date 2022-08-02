
public class Employee {
	
	private  String empName;
	private  String dpt;
	protected  Double sal;
	
	public Employee(String eName,String dpt,Double sal) {
		if(dpt==null) throw new NullPointerException();
		this.empName = eName;
		this.dpt = dpt;
		this.sal = sal;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDpt() {
		return dpt;
	}
	public Double getSal() {
		return sal;
	}
	
	public Double calculateTax() {
		return 0.0;
	}
	
//	public boolean equals(Object o) {
//		if(! (o instanceof Employee) ) {
//			return false;
//		}
//		
//		else if(o==null) return false;
////		else {
////			if(this)
////		}
//	}
	
	
}
