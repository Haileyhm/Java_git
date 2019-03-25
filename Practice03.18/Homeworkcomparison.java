import java.util.Random;

public class Homeworkcomparison {
public static void main(String[] args) {
	Random r = new Random();
//	int diceori = r.nextInt(6); // 6 傈 鳖瘤具; 0~5 
//    int dice = diceori+1;
    
	int diceori = r.nextInt(100);
	int dicediv = diceori % 6;
    int dice = dicediv + 1;
    
    
    if (dice==1) {
    	System.out.println("港港");
    } else if (dice==2) {
    	System.out.println("具侩");
    } 
//    	else if (dice==3) {
//    	System.out.println("3");
//   }
//    	else if (dice==4) {
//    	System.out.println("4");
//    } else if (dice==5) {
//    	System.out.println("5");
//    } else if (dice==6) {
//    	System.out.println("6");
//    } 
    	else {
    		System.out.println(dice);
    	}
        	
 }
}
