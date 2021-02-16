package conditional;
import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We are using BOOLEAN tests.  A boolean is a "true" or "false" condition.
		/*
		 *  > greater than 
		 *  ex. is x > y?
		 *  ex is 3 > 4? -> false.
		 *      4 > 3 --> True.
		 *      >= Greater than or equal...
		 *      < less than
		 *      <= less than or equal
		 *      
		 * 		== Equal to... Notice this is a DOUBLE equals.
		 * 				This is because a single equal sign, is used for variable.
		 * 				= is what we call an "assignment operator"
		 * 		!= means "Not Equal"
		 * 
		 */
		
		if (2 > 3) {
			// if 2 is greater than 3 then run this command.
			System.out.println("2 is bigger");
		} else {
			// This will run if something is NOT true.
			System.out.println("The number is smaller");
		}
		
		
		// Now I'm going to write a "guessing" game"
		final int GUESS_NUMBER = 42;
		Scanner sc = new Scanner (System.in);
		System.out.println("Guess a number.");
		int guess = sc.nextInt();
		if (guess == GUESS_NUMBER) {
			System.out.println("You guessed it!");
		} else if (guess > GUESS_NUMBER) {
			System.out.println("Too Big");
		} else {
			System.out.println("Too Small");
		}
		
		// Nested IF statements can get a little too much.
		
		// We have another decision statment for LARGE decisions.
		// it's called "switch/case"
		
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Monday");
			break;	
		default:
			System.out.println("No Days");
			break;
		}
		
		// other boolean operators..
		/*
		 * && means "logical and" which compares two true/false statemtns.
		 * ex. (3<4) && (5>3)
		 * 
		 * || means "OR"
		 *  ex. (4 < 1) || (9 > 6)
		 *  
		 *  
		 */
		
		
	}

}
