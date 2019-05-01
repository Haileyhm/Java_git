
public class CallbyValueString {

	
	public static void main(String[] args) {
		
		String a = "abc";
		String b = a;
		
		
		System.out.println(b.hashCode());
		
		b = "cdf";
		System.out.println(b.hashCode());
		System.out.println(a.hashCode());
		System.out.println(a);
		System.out.println(b);
		
		b = "efg";
		System.out.println(b.hashCode());
		System.out.println(b);
		
		
		int c = 12;
		//System.out.println(c.hashCode()); //int형은 주소가 없으니깐 hashcode 가 안 찍혀
		                                 //hash는 인스턴스에 대한 참조값을 주는 방식이라서
		
	}
}
