import java.util.Arrays;

public class Eratos {
	// 3. 1과 2를 잇기 위한 전역변수
	int userInput = 0; // 사용자가 입력한 n값 전달할 전역변수 선언
	int[] arr = null; // 빈 배열 선언_전역에서 사용할 수 있도록

	// 1.인자값을 받아서 배열 만드는 매서드
	public void makeArrary(int n) {
		this.arr = new int[n];
		this.userInput = n;
		putNumber();
	}

	// 2.배열 내 값 입력
	private void putNumber() {
		// 0부터 this.userInput-1 까지 하니깐 this.userInput
		for (int i = 0; i < this.userInput; i++) {
			arr[i] = (2 + i);
		}
	}

	// 3.2,3,5,7의 배수면 빼기 ===> 배열 copy 로 할 수 있대
//	public void removeNumber() {
//		for (int i = 0; i < this.userInput; i++) {
//			if ((arr[i] != 2) && (arr[i] % 2 == 0)) { // 2의 배수 빼기
//				arr[i] = 0;
//			}
//			if ((arr[i] != 3) && (arr[i] % 3 == 0)) { // 3의 배수 빼기
//				arr[i] = 0;
//			}
//			if ((arr[i] != 5) && (arr[i] % 5 == 0)) { // 5의 배수 빼기
//				arr[i] = 0;
//			}
//			if ((arr[i] != 7) && (arr[i] % 7 == 0)) { // 7의 배수 빼기
//				arr[i] = 0;
//			}
//		}
//	}

	//이거는 이전 값하고 비교해 보는건데... 소수가 아닌 애 찾아서 다 빼는거야 
	public void removeNumber2() { 
		for (int j = 0; j < this.userInput; j++) {
			for (int p = j; p < this.userInput; p++) {
				if (j % p == 0) {
                  arr[j] = 0;
				}
			}
		}
	}
	
	//제곱값이 this.userInput보다 작거나 같은 애 찾아서 소수면 걔의 배수를 0 처리
//	public void removeNumber3() {
//		for (int j = 0; j < this.userInput; j++) { //전체 수 중 
//			for (int p = j*j ; p <= this.userInput; p++) {//제곱수가 this.userInput 보다 작거나 같은 애 중   
//				if (j %  != 0) {//소수가 있다면
//                  arr[j] = 0;
//				}
//			}
//		}
//	}


//4.출력하기
	public void printArray() {
		System.out.println(Arrays.toString(arr)); // 배열이름만 쓰면 주소값만 가져옵니다 toString
	}
}
