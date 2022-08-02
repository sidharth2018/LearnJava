
public class FullTimeEmpl extends Employee{

	public FullTimeEmpl(String eName, String dpt, Double sal) {
		super(eName, dpt, sal);
		// TODO Auto-generated constructor stub
	}
	
 public Double calculateTax() {
		
		return sal*10/100;
	}
 

}
