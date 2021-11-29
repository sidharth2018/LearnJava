package learn.string;

public class MainClass {
	
	public static void main(String[] args) {
		 StringBuffer buff = new StringBuffer();
		 buff.append("Sidharth");
		 System.out.println(buff);
		 char t = buff.charAt(0);
		 buff.setCharAt(0, buff.charAt(buff.length()-1));
		 buff.setCharAt(buff.length()-1, t);
		 System.out.println(buff);
		 
		 StringBuilder b = new StringBuilder("Sidharth");
		 System.out.println(b);
	}

}
