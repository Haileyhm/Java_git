import java.util.Scanner;

public class Lecturesun {
	public static void main(String[] args) {

		int P1_score;
		int P2_score;
		int P3_score;

		Scanner scan = new Scanner(System.in);

		System.out.println("국어점수를 입력해주세요 (총3명)");
		System.out.println("홍길동의 국어 점수 : ");
		P1_score = scan.nextInt();
		System.out.println("임꺽정의 국어 점수 : ");
		P2_score = scan.nextInt();
		System.out.println("윤봉길의 국어 점수 : ");
		P3_score = scan.nextInt();

		if (P1_score > P2_score && P1_score > P3_score && P2_score > P3_score) {
			System.out.println("1등 : 홍길동 (" + P1_score + "점)");
			System.out.println(P2_score);
			System.out.println(P3_score);
		} else if (P1_score > P2_score && P1_score > P3_score && P3_score > P2_score) {
			System.out.println(P1_score);
			System.out.println(P3_score);
			System.out.println(P2_score);
		} else if (P2_score > P1_score && P2_score > P3_score && P1_score > P3_score) {
			System.out.println(P2_score);
			System.out.println(P1_score);
			System.out.println(P3_score);
		} else if (P2_score > P1_score && P2_score > P3_score && P3_score > P1_score) {
			System.out.println(P2_score);
			System.out.println(P3_score);
			System.out.println(P1_score);
		} else if (P3_score > P1_score && P3_score > P2_score && P1_score > P2_score) {
			System.out.println(P3_score);
			System.out.println(P1_score);
			System.out.println(P2_score);
		} else if (P3_score > P1_score && P3_score > P2_score && P2_score > P1_score) {
			System.out.println(P3_score);
			System.out.println(P2_score);
			System.out.println(P1_score);
		}
	}

	}
