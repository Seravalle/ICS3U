package seravalle;

import java.util.Scanner;

/*PosNegDiv7.java 
 * check if the number is positive or negative and if it is divisible by 7
 * Adam Seravalle
 * March 22 2016
 */
public class PosNegDiv7 {

	public static void main(String[] args) {
		// declare variable
		int integer;
		// get number from user
		Scanner myInput = new Scanner(System.in);

		System.out.println("Please enter a number");
		integer = Integer.parseInt(myInput.nextLine());
		// check if the number is positive or negative
		if (integer > 0) {

			System.out.println(" The integer is positive");

		} else if (integer < 0) {
			System.out.println(" The integer is negative");

		}
		// check if the number is divisible by 7
		if (integer % 7 == 0) {
			System.out.println("The integer is divisible by 7");
		}

		else {
			System.out.println(" The integer is not divisible by 7");
		}
	
	
	
	
	
	}
	
	

}
