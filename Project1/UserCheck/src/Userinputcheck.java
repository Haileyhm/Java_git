import java.util.Scanner;

public class Userinputcheck {
	public static void main(String[] args) {
	
		System.out.println("화면에 숫자를 입력해 주세요!");
		Scanner s= new Scanner (System.in);
		
		int ipNum = s.nextInt();
		int SumipNum = ipNum +10;
		System.out.printf("입력받은 숫자 +10은 %d입니다.", SumipNum);
		
}
}
