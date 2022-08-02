
public class ConsultantEmpl extends Employee{

	public ConsultantEmpl(String eName, String dpt, Double sal) {
		super(eName, dpt, sal);
	}
	
	
	public Double calculateTax() {
		
		return sal/2;
	}

}
