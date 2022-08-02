package patternmatching;

import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		Boolean b = Pattern.matches("/abc*", "/abc/");
		System.out.println(b);
	}

}
