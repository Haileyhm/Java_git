import java.util.Scanner;

public class PracGrade {

	String name; 
	int korGrade;
	int engGrade;
	int mathGrade;
	static int korTotal = 0;
	static int engTotal = 0;

	
	Scanner s = new Scanner(System.in);
		
	public void input(){
	System.out.println("학생의 이름: ");
	this.name = s.nextLine();
	
	System.out.println("학생의 국어점수: ");
	String korString = s.nextLine();
	this.korGrade= Integer.parseInt(korString);   //string으로만 받아서 숫자로 바꿔서 계산하는 방식 
	
	System.out.println("학생의 영어점수: ");
	String engString = s.nextLine();
	this.engGrade= Integer.parseInt(engString);
	
	System.out.println("학생의 수학점수: ");
	String mathString = s.nextLine();
	this.mathGrade= Integer.parseInt(mathString);
	}
	
	
	
	
}
