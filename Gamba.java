

/*
 * Want to create a super basic gambling machine.
 * The way it works is it will put out 9 different numbers, 3 rows with 3 columns
 * if a row is greater than 20 you get one extra point / spin
 * you can keep spinning until you run out of credits/spins
 * if your total is greater than 70 you get 3 credits
 */
import java.util.Scanner;

public class Gamba {
	public static void main(String[] args) {
		RandomNum();
		int credits = 10; //machine credits
		int RowCount = 0; //help see if a row won or not
		int Total = 0; //total for that spin
		
		//values to help get the numbers and then use them for adding and printing to console. 
		int one;
		int two; 
		int three;
		
		//see if they want to keep spinning
		int YN = 1;
		Scanner in = new Scanner(System.in);
	
		
		
		while((credits != 0) && (YN == 1)) { 
			for(int i = 0; i < 3; i++) {
				//get the three numbers for this row
				one = RandomNum();
				two = RandomNum();
				three = RandomNum();
				
				//print the row to the screen
				System.out.println(one + " " + two + " " + three);
				RowCount = one + two + three;
				
				if(RowCount > 20) {
					credits++;
				}
				
				Total = RowCount;
				RowCount = 0;
			}
			if(Total > 70) {
				credits = credits + 3;
			}
			
			credits--;
			
			System.out.println("Credits left = " + credits);
			System.out.println("Spin again? Y/N ");
			YN = in.nextInt();
			
			System.out.println();
		}
		
		if(credits == 0) {
			System.out.println("Game over. See you next time");
		}
		else {
			System.out.println("Thanks for playing. See you next time. You have " + credits + " credits left ");
		}
		
	}
	
	static int RandomNum() { 
		int RanNum = (int)(Math.random()*10) + 1;

		return RanNum;
	}
}




