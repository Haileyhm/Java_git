import java.util.Scanner;

public class LecPrac2 {

	String name; 
	int midScore;  //값 설정 안해도 int의 초기값은 0
	int fiScore;
	
	
	@Override
	public String toString() {  //객체 이름을 바로 사용할 때 어떤 값을 찍어주게 할거냐? 객체 이름 바로 써도 출력되게  
		return this.name + "(중간고사" + this.midScore + "기말고사" + this.fiScore + ")" ; 
	}
	
	
	LecPrac2(String name) {
		this.name = name; }
      
    
	public void teaCher() {
	Scanner s = new Scanner(System.in);
    
    System.out.print("중간고사 점수: ");
	String midScoreString = s.nextLine();
	this.midScore = Integer.parseInt(midScoreString);
	
	System.out.println("기말고사 점수: " );
	String fiScoreString = s.nextLine();
	this.fiScore = Integer.parseInt(fiScoreString);
	}
	
	
	
}
