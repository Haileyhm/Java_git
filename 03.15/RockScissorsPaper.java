import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
		
//		int scissors = 0 ;
//		int rock = 1;
//		int paper = 2;
		
	
	    System.out.println("가위,바위,보 중 하나를 입력해주세요. (가위는 0, 바위는 1, 보는 2) : ");
		Scanner s = new Scanner(System.in);	
		int UserIn = s.nextInt();

//사용자의 문자입력 상황 가정		
//		String UserInString;
//	    UserInString = s.nextInt();	
//		
	    
	    
		Random r = new Random();
		int Com = r.nextInt(3);
		
		
//가위바위보니까, 단순히 크기비교하면 틀림	
		
//		if (UserIn > Com) {
//			System.out.print("사용자가 로 이겼습니다");
//		} else if (UserIn == Com) {
//			System.out.println("비겼습니다");
//		} else {
//		System.out.print("컴퓨터가 이겼습니다");		
//	}

//교수님 방법-> 이게 오류가 더 적어	
//	if (UserIn == Com) {
//		System.out.println("바꼈습니다");
//	} else if (UserIn == 0 && Com == 1) {
//		System.out.println("컴퓨터가 이겼습니다");
//	} else if (UserIn == 0 && Com == 2) {
//		System.out.println("사용자가 이겼습니다");
//	} else if (UserIn == 1 && Com == 0) {
//		System.out.println("사용자가 이겼습니다");
//	} else if (UserIn == 1 && Com == 2) {
//		System.out.println("컴퓨터가 이겼습니다");
//	} else if (UserIn == 2 && Com == 0) {
//		System.out.println("컴퓨터가 이겼습니다");
//	} else if (UserIn == 2 && Com == 1) {
//		System.out.println("사용자가 이겼습니다");
//	}	
		
		
//글자로 입력하기 -> 문자열은 이렇게 사용하는 게 아니라 함수사용해줘야
		
	
//		if (UserIn == Com) {
//		System.out.println("바꼈습니다");
//	} else if (UserIn == 0 && Com == 1) {
//		System.out.println("컴퓨터가 이겼습니다");
//	} else if (UserIn == 0 && Com == 2) {
//		System.out.println("사용자가 이겼습니다");
//	} else if (UserIn == 1 && Com == 0) {
//		System.out.println("사용자가 이겼습니다");
//	} else if (UserIn == 1 && Com == 2) {
//		System.out.println("컴퓨터가 이겼습니다");
//	} else if (UserIn == 2 && Com == 0) {
//		System.out.println("컴퓨터가 이겼습니다");
//	} else if (UserIn == 2 && Com == 1) {
//		System.out.println("사용자가 이겼습니다");
//	}	
		
	}
}




