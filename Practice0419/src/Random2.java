import java.util.Random;

public class Random2 extends Random {

	public Student randomStudent(Student target) {
		//여기서 nextInt 재정의를 안 해서 super.nextInt()랑 동일
		target.kor =this.nextInt(101);   
 		target.eng = this.nextInt(101);
		target.math = this.nextInt(101);
		
		//객체에 직접 접근하는 거라서 return 값은 없어도 되는데 형태를 보여주려고 지정했어
		return target;  
		
		
	}

	
}
