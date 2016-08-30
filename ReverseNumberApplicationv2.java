//import util scanner
import java.util.Scanner;

//declare class
public class ReverseNumberApplicationv2 {
	public static void main(String[] args) {
		
		//declare variables
		int num = 0;
		int revnum = 0;
		
		//create scanner object
		Scanner input = new Scanner (System.in);
		
		//output user prompts
		System.out.println("Welcome to my reverse number program");
		System.out.println("Please enter a number to reverse and press enter");
		
		//wait for user input
		int value = input.nextInt();

		//initiate for loop	
		 for( ;num != 0; )
	      {
			  //define equations used in program
	          revnum = revnum * 10;
	          revnum = revnum + num%10;
	          num = num/10;
	      }
		
		//confirm user entry
		System.out.println("You have entered:  " + value);
		//output results
		System.out.println("Your reverse number is: " + revnum);
	}
}//end program