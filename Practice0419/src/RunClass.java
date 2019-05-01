import java.util.Arrays;
import java.util.Random;

public class RunClass {
	public static void main(String[] args) {
		Random rand = new Random();

		Student[] student = new Student[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}

		Random2 rand2 = new Random2();
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번 째 학생";
			student[i] = rand2.randomStudent(student[i]);
		}

//		for (int i = 0; i < student.length; i++) {
//			student[i].name = (i + 1) + "번 학생";
//			student[i].kor = rand.nextInt(101);
//			student[i].eng = rand.nextInt(101);
//			student[i].math = rand.nextInt(101);
//		}
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
			System.out.println(student[i].print());
		}
//		for (int i = 0; i < student.length; i++) {
//			for (int j = i; j < student.length; j++) {
//				if (student[i].total < student[j].total) { //swap
//					Student tmp = student[i];
//					student[i] = student[j];
//					student[j] = tmp;
//				}
//			}
//		}
//			for (int i = 0; i < student.length; i++) {
//				System.out.println(student[i].print());
//			}
		
	Arrays.sort(student);
	for(int i = 0; i < student.length; i++) {
		System.out.println(""+(i+1)+"등: " + student[i].print());
		
	}
	
	}
}
