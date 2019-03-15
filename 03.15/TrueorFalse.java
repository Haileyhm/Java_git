
public class TrueorFalse {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
        boolean c;
        
//비교연산자
        c = a == b;
        System.out.println(c);
        
//논리연산자
        c = (a != b) || (a > b);
        System.out.println(c);
               
        
//if문 - a=1 일 때 가장 첫 조건이 실행되는 것 유의
        if (a > b) {
        	System.out.println("case1");
        
        }   else if (a == 1) {
        	System.out.println("s case");
        		
     	}   else {
     		System.out.println("other");
     	}
     	}


}
