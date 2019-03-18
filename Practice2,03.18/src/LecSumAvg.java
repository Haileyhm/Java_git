import java.util.Random;
import java.util.Scanner;

public class LecSumAvg {
	public static void main(String[] args) {

//	3명의 국어점수를 입력받아서 총점과 평균을 출력하세요: 
//		내가 하다 만 거
		
		
		Scanner s = new Scanner(System.in);
		
		int totScore = 0;
		for (int j = 0; j < 3; j++) {
			
			System.out.println("국어점수를 입력해주세요:(3명)");
			int kor = s.nextInt();
			totScore = totScore + kor;
			} System.out.println("총점은"+totScore+"점 입니다.");
						
			double avgScore = 0;
			avgScore= avgScore /3;	
		
		
	Random rand = new Random();
	
	
	int totalScore = 0;	 //총점 저장할 공간은 반복문 바깥에
	
	for (int i = 0; i <4; i++) {
		int randNumber = rand.nextInt(101);
		System.out.println("입력된 점수 : " + randNumber);
		totalScore = totalScore + randNumber;
	} System.out.println("총점은" + totalScore + "입니다.");
	  double averageScore = 0;     //나누기 할 때는 double로 바꿔줘
	  averageScore = (double)totalScore / 4;
	  
	  System.out.println("평균은"+ averageScore + "입니다");
	
	}
}

// while문 확인하기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//int index = 0;
//while (index <8) {
//	int randNumber = rand.
