import java.util.Scanner;

public class Usertest {

	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해 주세요!");
		Scanner s= new Scanner (System.in);
		
		int ipNum = s.nextInt();
		System.out.println("입력한 숫자+10?");
		System.out.println("입력한 숫자+10은"+ipNum+10+"입니다.");
        
		System.out.println("화면에 숫자를 입력해주세요");
//        System.out.print("N1:");		
		int N1 = s.nextInt();
//		System.out.print("+");
//		System.out.print("N2:");	
		int N2 = s.nextInt();
		System.out.println("입력한 숫의 합");
//		int result= N1+N2;
//	    System.out.println(result);
//	}
}
