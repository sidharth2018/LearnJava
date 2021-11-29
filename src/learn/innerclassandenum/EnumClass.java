package learn.innerclassandenum;

public class EnumClass {
	
	private String name;
	private GENDER gen;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GENDER getGen() {
		return gen;
	}
	public void setGen(GENDER gen) {
		this.gen = gen;
	}
	public enum GENDER{
		MALE,FEMALE;
	}
	

}
