/************
 * Arrays.sort(); 를 사용하기 위한 규칙서로써 interface 인 Comparable 을 implements 한 거  
 * 이를 구현하는 매서드는 compareTo();
 * 그런데 implements 함에 있어서 
 * Comparable<Student>의 형식으로 제네릭을 넣어주면 compareTo(Student o) -> 제네릭의 변수를 인자로 받고
 * Comparable 의 형식으로 넣어주면 compareTo(Object o) -> Object 의 변수를 인자로 받아 
 */


public class Student implements Comparable { // <Student> 는 제네릭이야
	String name;
	int kor;
	int eng;
	int math;
	int total;

	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}

	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total);
		return tmp;
	}

	// 위에 Comparable<Student> 쓰니까 Override 됐어
//	@Override
//	public int compareTo(Student o) { // Student o 변수명 내가 정하는 거야
//		if (this.total > o.total) {
//			return -1;
//		} else if (this.total < o.total) {
//			return 1;
//		}
//		return 0;
//	}

	//위에 제네릭인 <Student>를 안 써주면 Object 의 변수를 인자로 받게 돼 
	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		if (this.total > s.total) {
			return -1;
		} else if (this.total < s.total) {
			return 1;
		}
		return 0;
	}
}
