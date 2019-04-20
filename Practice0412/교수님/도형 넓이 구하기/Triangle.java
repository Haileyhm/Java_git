import java.util.Scanner;

public class Triangle extends Figure {
	double bottomWidth = 0;
	double height = 0;
	Triangle() {
		this.name = "삼각형 넓이 구하기";
	}
	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("밑변 길이를 입력하세요 (cm)");
		this.bottomWidth = scanner.nextDouble();
		System.out.println("높이를 입력하세요 (cm)");
		this.height = scanner.nextDouble();
	}
	public void printResult() {
		super.printResult();
		System.out.println("넓이는 " + (this.bottomWidth * this.bottomWidth * 0.5) + "입니다.");
	}
}
