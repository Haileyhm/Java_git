import java.util.Scanner;

public class ReviewOf0329 {
	Scanner s = new Scanner(System.in);
	int total;
	

	public void proCess(){
		for (int i = 0; i<10000; i++) {
			System.out.print("원하시는 작업을 선택해주세요. 1.입금  2.출금  3.종료");
			int userInMenu = s.nextInt();
			
			if (userInMenu == 1) {  //입금 매서드 불러오기 
				deposit();
			}else if (userInMenu == 2) { //출금 매서드 불러오기 
				withdraw();
			}else if (userInMenu == 3) { //종료 매서드 불러오기 			
			} terminate();
}
}

	public void deposit() {
		System.out.println("입금하실 액수를 입력해주세요");
		int userIndeposit = s.nextInt();
		
		System.out.println("입금하신 금액은" + userIndeposit + "원 입니다. 맞으면 1번, 틀리면 2번을 눌러주세요");
		
		int userIndepoProcess = s.nextInt();
		if (userIndepoProcess == 1) {
			System.out.println("거래가 완료되었습니다. 거래 후 총잔액은" + (total + userIndeposit) + "원 입니다.");
		}else if (userIndepoProcess == 2) {
			System.out.println("다시 입력해주세요: " + userIndeposit );
		}
								}
							
	
	public void withdraw() {
		System.out.println("출금하실 액수를 입력해주세요");
		int userInwithdraw = s.nextInt();
		
		System.out.println("출금하신 금액은" + userInwithdraw + "원 입니다. 맞으면 1번, 틀리면 2번을 눌러주세요");
		
		int userIndepoProcess = s.nextInt();
		if (userIndepoProcess == 1) {
			System.out.println("거래가 완료되었습니다. 거래 후 총잔액은" + (this.total - userInwithdraw) + "원 입니다.");
		}else {
			System.out.println("다시 입력해주세요: " + userInwithdraw );
								}
							}
	
	
	public void terminate() {
		System.out.println("이용해주셔서 감사합니다.");
		}	
								}
							