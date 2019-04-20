import java.util.Random;

public class Random2 extends Random {
	public Student randomStudent(Student target) {
		target.kor = this.nextInt(101);
		target.eng = this.nextInt(101);
		target.math =  this.nextInt(101);
		return target;
	}
}
