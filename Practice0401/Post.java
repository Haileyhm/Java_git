import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Post {

	String title;   //객체 데이터 넣기
	String description;
	String createDate;
	
	public void insertPost() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제목");
		this.title = scan.nextLine();   // 다른 클래스에서 객체 부를 때는   => post.title 로 불렀는데 여기서는 이렇게 불러		
		System.out.println("내용");
		this.description = scan.nextLine();
		
		long time = System.currentTimeMillis();   // 현재시간 계산하는 매체 구글 검색해서 가져온 것 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  // 월표현 MM 대문자로 해야 제대로 표현 
	    this.createDate = dayTime.format(new Date(time));
	}
}
