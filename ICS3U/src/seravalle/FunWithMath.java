
/**
 * Gets 2 numbers from user and adds,subtracts, multiplies, and divides the numbers 
 * @author Adam Seravalle
 * @version May 20 2016
 * 
 * 
 */

package seravalle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunWithMath {

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

		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		add(num1, num2);
		subtract(num1, num2);
		multiply(num1, num2);
		divide(num1, num2);

	}

	/**
	 * adds the numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void add(double num1, double num2) {

		System.out.println(decimal.format(num1 + num2));

	}

	/**
	 * subtracts the numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void subtract(double num1, double num2) {

		System.out.println(decimal.format(num1 - num2));

	}

	/**
	 * multiplies the numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void multiply(double num1, double num2) {

		System.out.println(decimal.format(num1 * num2));

	}

	/**
	 * divides the numbers
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void divide(double num1, double num2) {

		System.out.println(decimal.format(num1 / num2));

	}
}
