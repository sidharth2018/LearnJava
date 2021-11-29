package learn.innerclassandenum;

public class LearnInnerClass {
	
	private String mem1;
	
	class InnerClass1{
		public void setOurtMem1(String s) {
			mem1 = s;
		}
		
		public String getOuterMem1() {
			return mem1;
		}
	}
	private class InnerClass2{
		public void setOurtMem1(String s) {
			mem1 = s;
		}
		
		public String getOuterMem1() {
			return mem1;
		}
	}
	
	public class InnerClass3{
		public void setOurtMem1(String s) {
			mem1 = s;
		}
		public String getOuterMem1() {
			return mem1;
		}
	}

	public String getMem1() {
		return mem1;
	}

	public void setMem1(String mem1) {
		this.mem1 = mem1;
	}

}
