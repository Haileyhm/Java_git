import java.util.Scanner;

public class Gugudan {
	int dan;

	// 계산 원하는 단 입력하는 부분
	public void inputDan() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("22222출력할 단을 입력하세요.");
		String inputText = scan.nextLine();
		try {
// 코드 순서대로 처리하기 때문에 위에서 에러나면 아래는 실행 안돼
			this.dan = Integer.parseInt(inputText);
//			this.printResult(); _ 여기에 넣으면 숫자말고 다른 거 넣었을 때 
			// 아무 일도 안 일어나
		} catch (Exception e) { // nextLine의 기본값은 0 인건가?
			// TODO: handle exception
			//0단으로 출력하면서, 문제가 뭔지도 출력해주나봐
			e.printStackTrace(); //
		}if(this.dan == 0) {
			throw new Exception("not allow 0");	
		}
		
		this.printResult();
		
	}

	// 구구단 출력하는 부분
	// private 은 외부에서 접근 못함 => 외부 클래스에서 볼 수가 없음
	// private 왜 쓰나? 외부에서 봤을 때, 내가 원하는 부분만 노출함으로써
	// 불필요한 정보 노출 및 클래스 파악에 소요되는 시간 줄임
	private void printResult() {
		for (int i = 0; i < 9; i++) {
			int number = i + 1;
			System.out.println(this.dan + "x" + number + "=" + this.dan * number);

		}

	}

}
