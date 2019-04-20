import java.util.Scanner;

public class Circle extends Figure {
	int halfWidth = 0;
	Circle() {
		this.name = "원 넓이 구하기";
	}
	@Override
	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요 (cm)");
		this.halfWidth = scanner.nextInt();
	}
	
	public void printResult() {
		super.printResult();
		System.out.println("넓이는 " + (this.halfWidth * this.halfWidth * Math.PI) + "입니다.");
	}

}
