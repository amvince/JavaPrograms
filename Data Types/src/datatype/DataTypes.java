package datatype;

public class DataTypes {

	public static void main(String[] args) {
		/* Naming Variables Examples and Data Types
		
		int  are numbers like 2, -26 or 1000
		a "double" is a decimal number... 2.56, 3.14
		a "boolean" is a TRUE or FALSE indicator (1 or 0)
		
		In java when we declare a variable, we have to give some other identifiers. 
		1. Is it public or private?  (not always needed) 
		2. What type of variable is it? (int, String, double...)
		3. give it a name. These can be almost anything, but not restricted names. (function names)
		     YOu can call it something simple, or descriptive.
		*/
		int x = 3;
		double y = 5;  // this is okay, it assumes the decimal is .000000000
		String myName = "Mr. Vince";
		
		// problems with math
		// if we divide two integers, it truncates (cuts off the decimal)
		// If java sees two integers, it treats the answer as an integer.
		System.out.println(1/4);
		
		// To get decimals, we must explicitly say these are "doubles"
		System.out.println(1.0/4.0);
		
		// Java is a little smart. If it sees one double, it will make the answer a double.
		System.out.println(1/4.0);
		
		// We can force a number to become something else....
		System.out.println((int)4.9);
		
		// What is a "final" variable?
		// It just means something is set, and can never be changed.
		// On our big robot, we have a file called "Constants" that includes where certain
		// motors are hooked up. These are FINAL variables.
		
		// public final int FRONT_DRIVE_MOTOR = 5;
		
		
		
		// Doubles vs. Integers and math.
		
		int a = 5;
		int b = 4;
		int c = a + b;
		System.out.println(c);
		
		
		
		// The Math library and some additional functions/information
		double PI = Math.PI;
		
		double z = Math.pow(5, 4);
		
		// Also, what's the square root of 529?
		double root = Math.sqrt(529);
		
		// We have a randomizer!
		// It only  makes numbers from 0 to .99999
		
		double rnd = Math.random();
		
		// So if we want bigger numbers, we multiply by what we want.
		double rnd100 = (int)(Math.random() * 100);
		System.out.println(rnd100);
		
		
	}

}
