import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��� �ּ���");
		int num1 = s.nextInt();
		
		System.out.println("�ι��� ���ڸ� �Է��� �ּ���");
		double num2 = s.nextDouble();
		
		double sumN = num1 + num2;
		System.out.printf("%d�� %d�� ���� %d�Դϴ�", num1,num2,sumN);
	}
	
}
