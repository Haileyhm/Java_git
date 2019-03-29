import java.util.Scanner;

public class BmiMeasure {

	public double inWeight; // 아까도 이렇게 하려고 했는데 public 을 안 씀 
	public double inHeight;
	
	
	public void process() {
		this.userInput();
		this.calIndex();		
	}
	
	
	
	
	
	public void userInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("체중(kg)을 입력해주세요:");  
		this.inWeight = s.nextDouble();      // int 형으로 받으면 double weightKg = (double)weight/100
		
		System.out.print("신장(m)을 입력해주세요:");
		this.inHeight = s.nextDouble(); 
		
		System.out.println("입력하신 체중은:" + inWeight +"kg" + "   입력하신 신장은:" + inHeight + "m" + "입니다");
	}
	
	
	public void calIndex() {
//		double inHeight = s.nextDouble(); 
//		double inWeight = s.nextDouble();
//		System.out.println("입력하신 체중은" + inHeight + "입력하신 신장은" + inWeight + "입니다");
		
		System.out.println("입력하신 체중은:" + inWeight +"kg" + "   입력하신 신장은:" + inHeight + "m" + "입니다");
		
		double Bmi = this.inWeight / (this.inHeight * this.inHeight);  // 괄호를 안 하면 앞에서부터 계산해버리잖아 
		
		if (Bmi >= 30) {    ///원래 범위인데 조건을 하나만 쓴 이유는 위가 안 맞으면 하위 조건에 드렁가기 때문 
			System.out.println("비만");
		}else if (Bmi >= 24) {
			System.out.println("정상");
		}else if (Bmi >= 20) {
			System.out.println("저체중");
		}else if (Bmi >= 15) {
			System.out.println("여윔");
		}else if (Bmi >= 13) {
			System.out.println("영양실조증");
		}else if (Bmi >= 10) {
			System.out.println("소모증");
	}
		System.out.println("BMI지수는: " + (double)Bmi + " 입니다");
		
}
}
