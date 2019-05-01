
public interface InterfaceRule {
/*******interface
*추상클래스처럼 규칙을 잡아주는 친구
*abstract class와 차이: abstract는 규칙(특정 매서드껍데기) + 매서드에 내용 추가 가능한 반면
*-사용형식: 다른 클래스에 implements interface클래스명
*-의존성 주입방식: 객체자체를 넘겨주고 니가 컨트롤해라
*부모클래스가 interface 가지고 있으면, 자식클래스도 그 매서드 다 가져가. 새로 추가할 수도 있음
**********/

	
	public void methodA(); 

	public void methodB(int number);
}
