import java.util.Random;
import java.util.Scanner;

public class LecCheckingHomework {
	public static void main(String[] args) {
		int total = 0;
		
		for (int i = 0; i < 100; i++) {
			int number = i +1;
			total = total  + number;
		}

System.out.println("총합은   " +total);
	
	
	
	
	
//	 홀짝


	int evenTotal = 0;
	int oddTotal = 0;
for (int i = 0; i < 100; i++) {
	int number = i +1;
	
	if (number %2 == 0) {
		evenTotal= evenTotal + number;
		}else {
			oddTotal = oddTotal + number;
		}
}
	
		System.out.println("홀수 총합은  " + oddTotal);
		System.out.println("짝수 총합은  " + evenTotal);
	
	
//	if 안 쓰기
	for (int i = 0; i < 100; i++) {
		int number = i +1;
		total = total +number;
		
		int evenNumber = 0;
		int oddNumber =number;
		
		if (number % 2 ==0) {
			evenNumber = number;
			oddNumber = 0;
		}
		
		evenTotal = evenTotal + evenNumber;
		oddTotal = oddTotal + oddNumber;	
	}
	
	
	for(int i = 0; i < 3; i++) {   //게속 반복되게 하는 거 


		System.out.println("화면에 주사위를 굴릴까요?(종료하려면 q를 눌러주세요)");
		System.out.println("(Enter)를 눌러주세요!");

		Scanner s = new Scanner(System.in);
		String UserInput = s.nextLine();    //무슨 기능일까??? -> 어떤 입력이 있을 때, 다음 줄 실행!!!

		if (UserInput.equalsIgnoreCase("q")) {     //원래는 문자열 아닌 애들은 무시하라는 말
			System.out.println("게임이 종료되었습니다.");
			break;
		}

		Random r = new Random();
		int UserNum = r.nextInt(6);   // int UserNum = r.nextInt(6)+1 도 동일!
		System.out.println(UserNum+1);


		System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
		System.out.println("(Enter)를 눌러주세요!");

		String ComInput = s.nextLine();
		int ComNum = r.nextInt(6);
		System.out.println(ComNum+1);

		if (ComNum == UserNum) {
			System.out.println("Draw");
		} else if (ComNum > UserNum) {
			System.out.println("You Lose!");
		} else {
			System.out.println("You Win!");
		}	
	
	}}}
	
	
	
	
	
	




