
public class Sum {
public static void main(String[] args) {
	
	
	int a = 10;
	a++;
	System.out.println(a);

	++a;
	System.out.println(a);
	
    int b = 12 + ++a;
    System.out.println(b);

     
    int c = 12 + a++;
    System.out.println(c);

}
}
