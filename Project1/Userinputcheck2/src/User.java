import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num1 = s.nextInt();
		
		System.out.println("두번재 숫자를 입력해 주세요");
		double num2 = s.nextDouble();
		
		double sumN = num1 + num2;
		System.out.printf("%d와 %d의 합은 %d입니다", num1,num2,sumN);
	}
	
}
