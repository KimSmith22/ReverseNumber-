//import util scanner
import java.util.Scanner;

//declare class
public class ReverseNumberApplicationv3 {
	
	public static void main(String args[]) {
		
		  // declare variables
	      int num = 0;
	      int revnum =0;
	     
	      //System greeting and prompt for user input
	      System.out.println("Welcome to the reverse number program!");
	      System.out.println("Enter a number and press enter: ");
	     
	      //Capture user input
	      Scanner in = new Scanner(System.in);
	     
	      //User input would be stored in variable num
	      num = in.nextInt();
	     
	      /* no number initialization in for loop as number is 
	       * initialized upon input.  no increase/decrease of number 
	       * in for loop as line 27 of code decreases the value of 'num'
	       */
	      for(int i = 0 ;num != 0; ) {
	          revnum = revnum * 10;
	          revnum = revnum + num % 10;
	          num = num/10;
	      }
	      
	      //output results
	      System.out.println("Your reverse number is: "+ revnum);
	   }
	}
