import java.util.Scanner;

public class LecMarTwentyTwo {
	public static void main(String[] args) {
		
	
	
	int[] arr = {1,2,3,4,5}; //값을 바로 넣었기 때문에 사이즈 지정은 안했어
	
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
	}
	
	System.out.println(" ");
	
	int[] arr2 = arr; // 배열의 값을 배열에 넣어주는 것
	int [] arr3 = arr2; 
	arr3[0] = 10;
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
		System.out.print(" ");
		
	}	
System.out.println(arr[0]);	
System.out.println(arr2[0]);
System.out.println(arr3[0]);


// 배열은 복사, 문자열은 비교

String a = "hello";
String b = "hello";
Scanner scan = new Scanner (System.in);
String c = scan.nextLine();

System.out.println(c == b);   // 될 때도 있고 안될 때도 있으니깐 아래에 있는걸로 해 
System.out.println(a.equals(c));  ///equals 는 내용이 같은지 물어보는 거

System.out.println(a.hashCode());
System.out.println(c.hashCode());


//클래스, 메서드, 인스턴스

String bbb = new String ("hello"); //원래는 이렇게 메서드 정의해주고 사용해야하는데
String bbb = "hello"; // 많이 쓰는 애는 편하게 사용할 수 있도록 이렇게 해줬어







}
}
