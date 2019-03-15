
//ctrl+shift+O

import java.util.Random;

public class RanPractice {
	public static void main(String[] args) {
		
		Random r = new Random();
		int randomValue = r.nextInt(100);
		
		
		int met = randomValue % 2;
		
//방법1	System.out.print("임의의 값은:");
		System.out.println(randomValue);
//  	System.out.print("나머지 값은:");
//		System.out.println(met);
		
		
//방법2	
		System.out.println("랜덥숫자 : " + randomValue);
    	System.out.println("나머지 :" + (randomValue % 2));	

//방법3
//		System.out.printf("임의의 값은: %d", randomValue);
//		System.out.println('\t');
//		System.out.printf("나머지 값은: %d", met);

//방법4
		if (randomValue % 2 ==1) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("작수 입니다.");
		}
		
	}

}
