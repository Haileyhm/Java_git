import java.util.Random;

/*****
 * List 인터페이스 예제 실습 전 배열 실습 학생데이터 10명 중간고사총점, 기말고사총점 입력 (랜덤한 값 0 ~ 1000점)
 ***/

public class Practice1 {
	int midTotal;
	int finalTotal;
	String name;

	//1.점수 설정하는 매서드
	public void setScore() {
		Random r = new Random();
		this.midTotal = r.nextInt(1001);
		this.finalTotal =r.nextInt(1001);
	}
	
	// 2.이름 설정하는 매서드
	public void setName(String name) {
		this.name = name;
	}
	
	//3.출력하는 매서드 
	public void printResult() {
		System.out.println();
		
	}
	
	}

	