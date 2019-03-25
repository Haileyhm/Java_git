import java.util.Scanner;

public class LecPracSumAvg {
	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		
		System.out.print("갑의 국어점수를 입력해주세요:");
		int kor1 = s.nextInt();
		
		System.out.print("을의 국어점수를 입력해주세요:");
		int kor2 = s.nextInt();
		
		System.out.print("병의 국어점수를 입력해주세요:");
		int kor3 = s.nextInt();
		
		int Sum = kor1 + kor2 + kor3;
		System.out.println("갑,을, 병 국어점수의 합은"+ Sum + "점 입니다");
		
		
		int Avg = Sum /3;
		System.out.println("갑,을, 병 국어점수의 평균은"+ Avg + "점 입니다");	
	
	
}
}
