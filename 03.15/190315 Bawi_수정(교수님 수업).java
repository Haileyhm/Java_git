import java.util.Random;
import java.util.Scanner;

public class Bawi {
	public static void main(String[] args) {
		int gawiBawiBoComputer;
		int gawiBawiBoUser;

		Random rand = new Random();
		gawiBawiBoComputer = rand.nextInt(3);
		String gawiBawiBoComputerString = "";
		if (gawiBawiBoComputer == 0) {
			gawiBawiBoComputerString = "가위";
		} else if (gawiBawiBoComputer == 1) {
			gawiBawiBoComputerString = "바위";
		} else if (gawiBawiBoComputer == 2) {
			gawiBawiBoComputerString = "보";
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("가위바위보를 입력해주세요.\n");
		String gawiBawiBoUserString;
		gawiBawiBoUserString = scan.nextLine();

		if (gawiBawiBoComputerString.equalsIgnoreCase(gawiBawiBoUserString)) {
			System.out.print("비겼습니다.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("가위") && gawiBawiBoUserString.equalsIgnoreCase("바위")) {
			System.out.print("사용자가 이겼습니다.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("가위") && gawiBawiBoUserString.equalsIgnoreCase("보")) {
			System.out.print("컴퓨터가 이겼습니다.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("바위") && gawiBawiBoUserString.equalsIgnoreCase("가위")) {
			System.out.print("컴퓨터가 이겼습니다.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("바위") && gawiBawiBoUserString.equalsIgnoreCase("보")) {
			System.out.print("사용자가 이겼습니다.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("보") && gawiBawiBoUserString.equalsIgnoreCase("가위")) {
			System.out.print("사용자가 이겼습니다.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("보") && gawiBawiBoUserString.equalsIgnoreCase("바위")) {
			System.out.print("컴퓨터가 이겼습니다.");
		} else {
			System.out.println("잘못된 문자열을 입력했습니다.");
		}
	}
}
