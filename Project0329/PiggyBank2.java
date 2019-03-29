
public class PiggyBank2 {
	
//	private int totalCoin = 0;
//	private String name;
//	
//	public void deposit (int inputCoin) {
//				if (inputCoin < 1000) {
//			this.totalCoin = this.totalCoin + inputCoin;
//		}
//		
//	}
//
//}
	
	private int coin;
	public void deposit(int coin, String message){
		this.coin = this.coin + coin; // 앞 coin 은 위에 private 코인  뒤는 deposit int coin 
		if (message.equals("")) {
			System.out.println("땡그랑");
		}else {
			System.out.println(message);
		}
	}
	
}