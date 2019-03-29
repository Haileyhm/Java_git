
public class RunPiggyBanck {
	public static void main(String[] args) {
		PiggyBank piggybank = new PiggyBank();
//		PiggyBank piggybank2 = new PiggyBank();
					
		
		piggybank.deposit(1000);
		piggybank.deposit(2000);
//		piggybank2.deposit(2000);
		
		
		piggybank.setName("돼지저금통");
//		piggybank.name = "프라이빗 저금통";  //왜 에러나는 거야??? 읠멀이ㅏㅓㄴ
//		piggybank2.setName("서랍형");
		
				
		piggybank.withdraw();
//		piggybank2.withdraw();
		piggybank.deposit(10);
		System.out.println(piggybank.totalCoin);  //property 접근할 때는 . 찍어 ,,, 매서드만 괄호안에 넣어줘
//		System.out.println(piggybank2.totalCoin);
	
		
		piggybank.deposit(200);
		piggybank.depositMssg(100, "여행자금");
		
		

	
	}
}

