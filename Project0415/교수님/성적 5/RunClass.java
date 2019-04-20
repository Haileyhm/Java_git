import java.util.Arrays;

public class RunClass {
	public static void main(String[] args) {
		Student[] student = new Student[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		
		Random2 rand = new Random2();
		String[] names = {"김동준", "고지인", "이형섭", "박성민", "김경현", "송진우", "정형석", "김예근", "공현", "최성욱"};
		for (int i = 0; i < student.length; i++) {
			student[i].name = names[i];
			rand.randomStudent(student[i]);
		}
		
		Arrays.sort(student);
		for (int i = 0; i < student.length; i++) {
			System.out.println("" + (i + 1) + "등 : " + student[i].print());
		}
	}
}
