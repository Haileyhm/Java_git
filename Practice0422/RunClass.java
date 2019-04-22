import java.util.Calendar;

public class RunClass {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		s.append("world");
		System.out.println(s);

	System.out.println(System.currentTimeMillis()); //1000분의 1초 단위
	
	Calendar c = Calendar.getInstance();
	System.out.println(c);
	
	}
}
