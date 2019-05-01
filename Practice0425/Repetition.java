
public class Repetition {
	// 1. 1~ 10까지를 곱해서 그 결과를 출력하는 프로그램작성(for문)

	public static void main(String[] args) {
		int a = 1;
		String b = "";

		for (int i = 0; i < 10; i++) {
			a = a * (i + 1);
			b += i + "x";
		}
		System.out.println(b);
		System.out.println(a);

		// 2.1~100 까지 출력하고 난 다음에 다시 거꾸로 100에서 부터 1까지 출력하는 프로그램 작성
		int c = 0;
		for (int i = 1; i < 101; i++) {
			c = i;
			System.out.print(c + " ");
//			System.out.print("\t");
			if (c == 100) {
				System.out.println("\n");
				for (int j = 1; j < 101; j++) {
					System.out.print((c--) + " ");
				}
			}

		}

	}
}
