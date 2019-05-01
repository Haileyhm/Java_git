import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int row = 9;
		int column = 9;
		int[][] arr = new int[row][column];

		for (int i = 0; i < row - 1; i++) {
			for (int j = 0; j < column - 1; j++) {
				System.out.printf("%d행 %d열 숫자를 입력해주세요\n", i + 1, j + 1);
				arr[i][j] = s.nextInt();

				arr[i][column - 1] += arr[i][j];
				arr[row - 1][j] += arr[i][j];
				arr[row - 1][column - 1] += arr[i][j];
			}
		}

//		System.out.println(Arrays.deepToString(arr));

		// for (int i = 0; i < row; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
