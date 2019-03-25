//이 파일은 클래스만 만드는 공간이야 


import java.util.Scanner;

public class LecAssignment {
	
// #1. 1~100 까지 합 구하는 클래스
	public void Sum(int firstNum, int lastNum) {
		
		int wrapNum = 0; 
		
		for (int i= firstNum; i < lastNum+1; i++) {
			wrapNum = wrapNum + i;		
		}
		System.out.println(wrapNum);
	}

// #2. 입력된 숫자가 소수(prime number)인지 구하기
//public void Prime() {
//	
//	System.out.println("소수인지 확인할 숫자를 입력해주세요");
//	Scanner scanner = new Scanner(System.in); //입력된 숫자니까 scanner 만들고 
//	int inputNum = scanner.nextInt();
//	if (inputNum < 1) {
//	System.out.println("양수만 입력해 주세요");
//		return; // 인스턴스를 강제로 끝낸다는 의미
//	
//	}
//	
		int divNum = 0;
////	for (int i = 2; i <inputNum/2; i++ ) {  //2~(숫자-1) 까지 돌려서 나눠지면 소수
////		divNum = divNum + i; 
////		double proCess = inputNum % divNum;
////		if (proCess < 1)                    
//			   System.out.println( inputNum + "는 소수입니다."); =----- 내가 한 거 ,, 안됐어
		
	
//		boolean isinputNum = true;  // 
//		for (int i = 2; i < inputNum/2; i++) {
//		if (inputNum % i == 0) {
//			isinputNum = false;
//			break; // 쓸데없는 연산을 막을 수 있음, 한 번이라도 나눠졌으면 연산을 멈춤
//		}
//		}
//		if (isinputNum) {
//			System.out.println("소수입니다");
//			}else {
//				System.out.println("소수가 아닙니다");
//			}
//		}
//}

// #3. 1~100 까지 숫자 중에서 소수 출력하기  >>>>>>>>>>>>>>>> 올려주신 거 확인

public void Prime() {
	
	System.out.println("소수인지 확인할 숫자를 입력해주세요");
	Scanner scanner = new Scanner(System.in); //입력된 숫자니까 scanner 만들고 
	int inputNum = scanner.nextInt();
	if (inputNum < 1) {
	System.out.println("양수만 입력해 주세요");
		return; // 인스턴스를 강제로 끝낸다는 의미
	
	}	boolean isinputNum = true;  // 
	for (int i = 2; i < inputNum/2; i++) {
	if (inputNum % i == 0) {
		isinputNum = false;
		break; // 쓸데없는 연산을 막을 수 있음, 한 번이라도 나눠졌으면 연산을 멈춤
	}
	}
	if (isinputNum) 
		System.out.println(""+ inputNum + "눈 소수입니다");	
}

// #4. 1~100까지 숫자 중에서 6의 배수를 출력하세요

public void hexSum() {
	int ori = 0;
	for (int i = 1; i < 101; i++) {
	
		if (i%2 == 0 && i%3==0) {
			System.out.println(i + "은 6의 배수입니다.");
	}else {System.out.println("6의 배수가 아닙니다");
}
}
}


	public boolean check1(int number1){
	if (number1 % 6 == 0) {
//		System.out.println("" + number1 + "은 6의 배수입니다.");
		return true;
		
	} else {
//		System.out.println("" + number1 + "은 6의 배수가 아닙니다.");
		return false;
	}
}
}



























