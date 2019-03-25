import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {
	public static void main(String[] args) {

		
		
		Scanner s = new Scanner(System.in);
	
//		int[] grades = new int{0,0,0,0,0,0,0,0,0,0}; __ "나는 integer형 10칸을 만들거야"를 밝혀주는 의미 
		int[] grades = new int[10];
		
		
		for (int i = 0; i < grades.length; i++) {  //grades.length grades 배열의 길이만큼 반복할거야 
			System.out.print(i+1 + "번째 학생의 국어성적을 입력해주세요:  ");
			int Kor = s.nextInt();	
			
			grades [i] = Kor; 
	
		}
		
		 System.out.println("처리할 점수는 다음과 같습니다");
		 System.out.println(Arrays.toString(grades));
		 		
	
		 int total = 0;   //더하는 거 따로 만들고   -> 
		 double avr = 0;  //평균 따로 만들고 
		 
		 for (int i =0 ; i < grades.length; i++) {
			 total = total + grades[i];			 
		 }
		 
		 avr = (double)total / grades.length;
		 
		 System.out.println("총점은:  " + total);
		 System.out.println("평균은:  " + avr);
		 	 

// 추가미션
// 이름, 국어점수, 수학점수, 영어점수를 입력 받아서 가가각의 점수 출력, 각각의 총점/평균 출력
//전체 총점/평균 출력을 해보세요
// 나중에는 입력 값을 그대로 두고, 수정하는 방법도 할 거래  -> 얘는 DB의 힘을 빌려서 할 거야 





	
	
	
	
	
	
	
	}
}


