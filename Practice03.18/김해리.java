import java.util.Scanner;

public class 김해리 {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.print("국어점수1을 입력해주세요:");
    int kor1 = s.nextInt();
    System.out.print("국어점수2를 입력해주세요:");
    int kor2 = s.nextInt();
    System.out.print("국어점수3을 입력해주세요:");
    int kor3 = s.nextInt();
    
    
    if (kor1>=kor2 && kor1>=kor3 && kor2>=kor3) {
    System.out.println(kor1);
    System.out.println(kor2);
    System.out.println(kor3);
} else if (kor1>=kor2 && kor1>=kor3 && kor3>=kor2) {
    System.out.println(kor1);
    System.out.println(kor3);
    System.out.println(kor2);	
 }else if (kor2>=kor1 && kor2>=kor3 && kor1>=kor3) {
    System.out.println(kor2);
    System.out.println(kor1);
    System.out.println(kor3);	
}else if (kor2>=kor1 && kor2>=kor3 && kor3>=kor1) {
    System.out.println(kor2);
    System.out.println(kor3);
    System.out.println(kor1);	
}else if (kor3>=kor1 && kor3>=kor2 && kor1>=kor2) {
    System.out.println(kor3);
    System.out.println(kor1);
    System.out.println(kor2);	
}else if (kor3>=kor1 && kor3>=kor2 && kor2>=kor1) {
    System.out.println(kor3);
    System.out.println(kor2);
    System.out.println(kor1);
}
}
}