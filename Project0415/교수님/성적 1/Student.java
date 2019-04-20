
public class Student {
	String name
	int kor;
	int eng;
	int math;
	int total;

	
	
	@Override
	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	
	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total); 
		return tmp;
	}
	private void toStrig() {
		// TODO Auto-generated method stub

	}
	
	
	
	
}
