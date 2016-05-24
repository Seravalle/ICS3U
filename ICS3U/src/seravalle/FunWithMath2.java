
/**
 * Gets 2 numbers from user and adds,subtracts, multiplies, and divides the numbers 
 * @author Adam Seravalle
 * @version May 24 2016
 * 
 * 
 */

package seravalle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunWithMath2 {

	// formats to 2 decimal places
	public static DecimalFormat decimal = new DecimalFormat("0.00");

	/**
	 * askes the user for 2 numbers, displays the results of the methods
	 * 
	 * @param args
	 *            - not used
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter 2 numbers");
		// variables
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		// output
		System.out.println(decimal.format(add(num1, num2)));
		System.out.println(decimal.format(subtract(num1, num2)));
		System.out.println(decimal.format(multiply(num1, num2)));
		System.out.println(decimal.format(divide(num1, num2)));

	}
/**
 * adds the numbers
 * @param num1
 * @param num2
 * @return
 */
	public static double add(double num1, double num2) {

		double total = num1 + num2;
		return total;

	}
/**
 * subtracts the numbers
 * @param num1
 * @param num2
 * @return
 */
	public static double subtract(double num1, double num2) {

		double total = num1 - num2;
		return total;

	}
/**
 * multiplies the numbers
 * @param num1
 * @param num2
 * @return
 */
	public static double multiply(double num1, double num2) {

		double total = num1 * num2;
		return total;

	}
/**
 * divides the numbers
 * @param num1
 * @param num2
 * @return
 */
	public static double divide(double num1, double num2) {

		double total = num1 / num2;
		return total;

	}
}
