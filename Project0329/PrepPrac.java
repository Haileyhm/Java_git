
import java.util.Scanner;

public class PrepPrac { 
	public void testGrade() {
			
		
		int[] kor = new int [10];
		int[] math = new int [10];
		int[] sci = new int [10];

		
		Scanner s = new Scanner(System.in);
		
		
		for(int i = 0; i < kor.length; i++ )	{
			System.out.println( i+1 + "번째 국어점수를 입력해주세요" );
			int korInput = s.nextInt();
			
			kor [i] = korInput;
			
			System.out.println(kor[i]);			
		}
		}
	    }
