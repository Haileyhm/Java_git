import java.util.Scanner;

public class LecPracSumAvg {
	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		
		System.out.print("���� ���������� �Է����ּ���:");
		int kor1 = s.nextInt();
		
		System.out.print("���� ���������� �Է����ּ���:");
		int kor2 = s.nextInt();
		
		System.out.print("���� ���������� �Է����ּ���:");
		int kor3 = s.nextInt();
		
		int Sum = kor1 + kor2 + kor3;
		System.out.println("��,��, �� ���������� ����"+ Sum + "�� �Դϴ�");
		
		
		int Avg = Sum /3;
		System.out.println("��,��, �� ���������� �����"+ Avg + "�� �Դϴ�");	
	
	
}
}
