
public class LecPrac {  //step1 클래스를 만든다
						//step2.메소드 만든다

	public void makeSum(int startValue, int endValue) {   //결과값이 없이 바로 출력하니까 void int makeSum 이 아니라 void makeSum 
	
	
		int sum = 0;
		
		for (int i = startValue; i < endValue+1; i++) {  // step3. 기능을 만듦.   for문 , 시작값과 끝값을 바꿀 수 있음 
			sum = sum + i; 
		
		} //end for
		
	
		System.out.println("시작값:  "+ startValue + "종료값:  "+endValue);
		System.out.println("범위 합계:   "+sum );
		
	
	}
	
	
	
}
