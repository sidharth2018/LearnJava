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
		 String s1 = "Hello";
		 String s2 = "Hello";
		 String s3 = s1;
		 if(s1==s2) System.out.println("s1==s2");
		 if(s2==s3) System.out.println("s2==s3");
		 s1="Hi";
		 System.out.println(s1+" "+s3);
	}

}
