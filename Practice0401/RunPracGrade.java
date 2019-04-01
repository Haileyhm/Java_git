import java.util.Scanner;

public class RunPracGrade {
	public static void main(String[] args) {
		
		PracGrade pracgrade = new PracGrade();
		pracgrade.input();
		
		
		PracGrade[]sArr  = new PracGrade[5]; 
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = new PracGrade();
			sArr[i].input();
		}
		
		int korTotal = 0; //더해지는 부분 따로 만들어서 계산하면 편해
		int engTotal = 0; 
		int mathTotal = 0; 
		
		for (int i = 0; i < sArr.length; i++) {
			PracGrade.korTotal = korTotal + sArr[i].korGrade;
			PracGrade.engTotal = engTotal + sArr[i].engGrade;
			mathTotal = mathTotal + sArr[i].mathGrade;			
		}
		
		System.out.println("국어 총점은 :" + korTotal);
		System.out.println("영어 총점은 :" + engTotal);
		System.out.println("수학 총점은 :" + mathTotal);
		
		System.out.println("국어 평균은: " + ((double)korTotal / sArr.length));
		System.out.println("영어 평균은: " + ((double)engTotal / sArr.length));
		System.out.println("수학 평균은: " + ((double)mathTotal / sArr.length));
		
		
		
//	Scanner s = new Scanner(System.in);
//	PracGrade pracgrade = new PracGrade();
//	PracGrade[] gArray = new PracGrade[5];
//	
//	
//	for (int i = 0; i < gArray.length; i++) {
//		System.out.println((i+1) + "번째 학생의 이름: ");
//		gArray[i].name = s.nextLine();
//		
//		System.out.println((i+1) + "번째 학생의 국어점수: ");
//		String korString = s.nextLine();
//		gArray[i].korGrade= Integer.parseInt(korString);   //string으로만 받아서 숫자로 바꿔서 계산하는 방식 
//		
//		System.out.println((i+1) + "번째 학생의 영어점수: ");
//		String engString = s.nextLine();
//		gArray[i].engGrade= Integer.parseInt(engString);
//		
//		System.out.println((i+1) + "번째 학생의 수학점수: ");
//		String mathString = s.nextLine();
//		gArray[i].mathGrade= Integer.parseInt(mathString);
//	
//		System.out.println((i+1)+"번째 학생의 총점과 평균은: ");
//		int stuTotalScore = (gArray[i].korGrade + gArray[i].engGrade + gArray[i].mathGrade)	;
//		int stuAvg = (gArray[i].korGrade + gArray[i].engGrade + gArray[i].mathGrade) / 3 ; 
//	
//		System.out.println("국어성적의 총점은:");
////		int korTotalScore = (gArray[0].korGrade+gArray[1].korGrade+gArray[2].korGrade+gArray[3].korGrade+gArray[4].korGrade);
//		int sumKor = gArray[i].korGrade++;
//		System.out.println("국어성적의 평균은");
//		double avgKor = sumKor / gArray.length;
//				
//		System.out.println("영어성적의 총점은:");
//		int sumEng= gArray[i].engGrade++;
//		System.out.println("영어성적의 평균은");
//		double avgEng = sumKor / gArray.length;
//		
//
//		System.out.println("수학성적의 총점은:");
//		int sumMath= gArray[i].mathGrade++;
//		System.out.println("수학성적의 평균은");
//		double avgMath = sumMath / gArray.length;
//	
//	}
	
	
	
	
	
	
	}
	
	
	
}




