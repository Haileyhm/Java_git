import java.io.IOException;
import java.util.Scanner;

public class Rungugudan {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("출력하기 원하는 단의 숫자를 입력하고 Enter 를 눌러주세요");
		String userInput = s.nextLine();
		int refineduserInput = Integer.parseInt(userInput);

		for (int i = 0; i < 10; i++) {
			System.out.println(refineduserInput + "*" + i + "=" + refineduserInput * i);
		}

		Gugudan gugudan = new Gugudan();

		// throw Exception; try-catch를 main에서 사용
		try {
			gugudan.inputDan();
		} catch (IOException e) { //import 해줘야 해_ 네트워크 처리할 때 해줌
			// TODO: handle exception
			e.printStackTrace(); //어디서 오류가 났는지 처리
		} catch (Exception e) {
			System.out.println(e.getMessage()); //어디서 Exception을 발생시키는지 처리할 수 있게 해
//			System.out.println("default");
		}
//System.out.println("inputDan에서 오류발생");	    

		java.io.File file = new java.io.File("c:\\file.txt");
		try {
			//얘만 쓰면 빨간 줄 쳐지면서 try-catch 로 surround 하냐고 물어봐
			file.getCanonicalFile(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
