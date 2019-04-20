import java.util.Scanner;

public class Squre extends Figure {
	double width = 0;
	double height = 0;
	public Squre() {
		this.name = "사각형 넓이 구하기";
	}
	@Override
	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("넓이를 입력하세요");
		this.width = scanner.nextDouble();
		System.out.println("높이를 입력하세요");
		this.height = scanner.nextDouble();
	}
	public void printResult() {
		super.printResult();
		System.out.println("넓이는 " + (this.width * this.height) + "입니다.");
	}
	
}
