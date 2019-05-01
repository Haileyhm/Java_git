import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RunStudent {

	public static void main(String[] args) {

		String[] names = { "철수", "영희", "짱구", "영희", "길동", "둘리", "꺽정", "뽀로로", "보고", "유신" };

//List 로 바꾸기		
//1. 배열 대신 처음부터 리스트를 만들자
//		Student[] student = new Student[names.length]; // 배열의 길이 만큼
		ArrayList<Student> student = new ArrayList<Student>(); // 길이가 있는 친구가 아니고 자료구조로써 동작 => 검색, 넣어주기가 가능!!

//2. 전체 리스트에 데이터를 더해줌
		for (int i = 0; i < names.length; i++) {
//			student[i] = new Student(names[i]); // 특정한 인덱스에 값을 넣어줌,  생성자로 넣어줌
			student.add(new Student(names[i]));// 전체 리스트에 추가해 줌
		}

//리스트는 for문이 아니라 다음거, 그 다음거 라는 방식으로 접근해줘야 함	
//3-1.특정 순서에 있는 거 가져와 -> 이렇게 하나씩 접근해서 사용해도 문제 없음
//		System.out.println(student.get(0));

//3-2.forEach 여러 개 있을 때 하나씩 접근
		// Consumer 도 collection framework 에서 필수 사용해야 해
		student.forEach(new Consumer<Student>() { // 리스트의 각 데이터 하나씩에 접근해
			@Override
			public void accept(Student t) { // 접근한 애들 중에 t 한테 아래의 작업을 해
				// TODO Auto-generated method stub
				if (t.middleScore > t.finalScore) {
					System.out.println(t);
				}

//3-3. 배열로 만들어서 접근
				Student[] arr = (Student[]) student.toArray(); //=======================>>>>>여기 오류남!!! 
				for (int i = 0; i < arr.length; i++) { // length를 이용하는 것에 익숙해져야 나중에 길이를 바꿔도 바로 적용가능하므로 익숙해져라
					if (arr[i].middleScore < arr[i].finalScore) {
						System.out.println(arr[i]);
					}
				}

			}
		});

	}
}
