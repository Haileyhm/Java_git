
public class LecAssignmnet2 {
	public static void main(String[] args) {
		
		LecAssignment lecassignment = new LecAssignment();
		
		lecassignment.Sum(1, 100);

		lecassignment.Prime();	
	
		lecassignment.hexSum();
		
		for (int i = 0; i < 100; i++) {
			int checkNumber = i + 1; 
			boolean result = lecassignment.check1(checkNumber);
			if(result) {
				System.out.println("    " + checkNumber);
			}
		}
	}
}

