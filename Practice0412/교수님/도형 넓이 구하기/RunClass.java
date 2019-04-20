import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 삼각형 넓이 구하기, 2. 사각형 넓이 구하기, 3. 원 넓이 구하기");
		int selectMenu = scanner.nextInt();
		
		Figure figure = null;
		if (selectMenu == 1) {
			figure = new Triangle();
		} else if (selectMenu == 2) {
			figure = new Squre();
		} else if (selectMenu == 3) {
			figure = new Circle();
		}
		
		figure.inputValue();
		figure.printResult();
	}
}
