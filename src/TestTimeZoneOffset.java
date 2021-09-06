import java.util.TimeZone;

public class TestTimeZoneOffset {

	public static void main(String[] args) {
		
		String t="UTC";
		TimeZone zon=TimeZone.getTimeZone(t);
		System.out.println(zon.getRawOffset()/1000);
		System.out.println((zon.getRawOffset()/(1000*60*60)));
		System.out.println(zon.getDisplayName());
		

	}

}
