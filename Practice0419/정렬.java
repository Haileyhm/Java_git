/************4월 22일 수업내용 포함
 *인터페이스, 추상클래스 차이
 *정의의 쓰임
 * 1) fianl: _ 를 붙여서 final 붙은 애라고 알려줘
 * Static 은 설계도 형에 위치하기 때문에 . 붙여서 바로 사용할 수 있음
 ***********************/


public class 정렬 implements Comparable<Student> {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	static final int MOVE_FORWARD = -1; //final 을 붙이면 아래에서는 못 바꾼다
	final int MOVE_BACKWARD = 1;
	

	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total);
		return tmp;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.total < o.total) {
			return Student.MOVE_FORWARD;
			
		}else if(this.total < o.total){
		return MOVE_BACKWARD;
		
		}
		
	}
	
}
