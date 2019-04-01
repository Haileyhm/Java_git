
public class RunLecPrac2 {

	public static void main(String[] args) {
		
		LecPrac2 [] stuArray = new LecPrac2[5];
		
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println((i+1) + "번째 학생");
			stuArray[i] = new LecPrac2 ((i+1) + "번 학생");  // 생성자 만들어준거야 
			stuArray[i].teaCher();		
		}	
	
	
		for (int i = 0; i < stuArray.length; i++) {  // 출력을 할 때 이렇게 할 수 있다
			System.out.println("stuArray[i]");
//			System.out.println(stuArray[i].toString());
			  
			
			
		}
	
	
	}	
}
