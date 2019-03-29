

//프린트에 나와있는 저금통 만들어보기 활동 _ 나중에는 돈만 넣을건지 메지지도 같이 넣을건지 물어보고 입금하는 프로그램도 만들 수 있음 
import java.util.Scanner;

public class RunPiggyBank2 { 
	public static void main(String[] args) {
		
//		PiggyBank2 box1 = new PiggyBank2();
//		
//		box1.deposit(100);
//		box1.deposit(1000);
//		
//	}
//	
	
		PiggyBank2 piggybank2 = new PiggyBank2();
		Scanner s = new Scanner(System.in);
		
	for (int i = 0; i < 999999; i++) {    // 엄밀히 말하면 이 부분도 매서드로 올리는 게 맞음
		System.out.println("입금할 금액:   ");
		int coin = s.nextInt();
		System.out.println("메시지:      ");
		s.nextLine();  // 위에서 엔터칠 때 작동해버리니깐 아무것도 없이 하나 넣어줘 
		String message = s.nextLine();
		
		piggybank2.deposit(coin, message);
		
		
		if(message.equals("crash")) {
			System.out.println("프로그램이 종료되었습니다");
			break;
		} 
	}
	
			
		piggybank2.deposit(100,"");
		piggybank2.deposit(100,"용돈" );
		
		
		
		
		
	}
}
