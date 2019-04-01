import java.util.Scanner;

public class RunLec {
	public static void main(String[] args) {
		
		Lec Lec = new Lec();
		Lec[]sArray = new Lec[10];  //배열 만드는 것
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < sArray.length; i++) {
			System.out.print(""+(i+1)+"번째 학생 데이터 입력");
			System.out.println("이름:  ");
			sArray[i].name = scan.nextLine();
			System.out.print("국어점수:  ");
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString);
			
			System.out.print("영어점수:  ");
			String engSring = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engSring);
			
			System.out.println("수학점수:  ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
		}
	}
}
