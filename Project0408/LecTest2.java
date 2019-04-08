
public class LecTest2 extends LecTest { // LecTest 의 자식클래스가 됨. 내용이 아무것도 없는데도 main 매서드에서 제대로 작동

	public void printResult() {  // 주의할 점은 괄호사용하기! 나누기할 때는 double 로 캐스팅
		                         // 부모클래스인 LecTest 에 printResult() 매서드가 있지만, 자식클래스에 새로 만들면 자식클래스의 매서드로 실행
		super.printResult(); //원래 부모클래스가 가지고 있던 매서드 실행해 
		System.out.println("더하기 결과:  " + (this.number1 + this.number2));
		System.out.println("빼기 결과:  " + (this.number1 - this.number2));
		System.out.println("곱하기 결과:  " + (this.number1 * this.number2));
		System.out.println("나누기 결과:  " + ((double)this.number1 / this.number2));
		
		
	}
	
	public void newMethod() {
		
	}
	
}
