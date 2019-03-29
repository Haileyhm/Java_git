import java.util.Scanner;

public class PiggyBank {

	public int totalCoin = 0;	
	public String name;   //투명한 저금통이냐 아니냐의 차이 , public이면 다 볼 수 있음
	Scanner s = new Scanner(System.in);
	
	
	public void setName1(String name) {
		this.name = name; 
	}

	public void setName(String inputName) {
		name = inputName;
	}

	
	public void deposit(int inputCoin) {
		
		totalCoin = totalCoin + inputCoin; 			
		System.out.println("딸그랑    " + totalCoin);
	}

	
	public void depositMssg(int inputCoin, String myMssg) { //메시지 안 넣었을 때의 표현은 빈칸으로 
		totalCoin = totalCoin + inputCoin;
		System.out.println(myMssg + totalCoin);
	}
	
	
	public void withdraw() {
		System.out.println(name + "출금액 : " + totalCoin);
		totalCoin = 0;		
	}
	
	public void endBank() {
		String userInput = s.next();
		if (userInput == "Crash") {
			System.out.println(totalCoin);
		}
	}
	
	}
