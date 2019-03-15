import java.util.Random;
import java.util.Scanner;

public class Bawi {
	public static void main(String[] args) {
		int gawiBawiBo1;
		int gawiBawiBo2;
		
		Random rand = new Random();
		gawiBawiBo1 = rand.nextInt(3);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가위바위보를 입력해주세요.\n 가위는 0, 바위는 1, 보는 2 입니다 : ");
		gawiBawiBo2 = scan.nextInt();
		
		if (gawiBawiBo1 == gawiBawiBo2) {
			System.out.print("비겼습니다.");
		} else if (gawiBawiBo1 == 0 && gawiBawiBo2 == 1) {
			System.out.print("사용자가 이겼습니다.");
		} else if (gawiBawiBo1 == 0 && gawiBawiBo2 == 2) {
			System.out.print("컴퓨터가 이겼습니다.");
		} else if (gawiBawiBo1 == 1 && gawiBawiBo2 == 0) {
			System.out.print("컴퓨터가 이겼습니다.");
		} else if (gawiBawiBo1 == 1 && gawiBawiBo2 == 2) {
			System.out.print("사용자가 이겼습니다.");
		} else if (gawiBawiBo1 == 2 && gawiBawiBo2 == 0) {
			System.out.print("사용자가 이겼습니다.");
		} else if (gawiBawiBo1 == 2 && gawiBawiBo2 == 1) {
			System.out.print("컴퓨터가 이겼습니다.");
		}
	}
}
