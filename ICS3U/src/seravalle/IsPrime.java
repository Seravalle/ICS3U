/**
 * Gets number from user and checks if it prime or not
 * @author Adam Seravalle
 * @version May 30 2016
 * 
 */

package seravalle;

import java.util.Scanner;

public class IsPrime {

	/**
	 * Main method the displays the information
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		// gets number from user
		System.out.println(" Please enter a number ");
		num = scan.nextInt();
		// displays if number is prime or not
		if (isPrime(num) == true) {
			System.out.println(" The number is not prime");
		}

		else {
			System.out.println(" The number is prime");
		}

	}

	/**
	 * division method
	 * 
	 * @param num
	 * @param y
	 * @return
	 */
	public static boolean isDivisible(int num, int y) {
		if (num % y == 0) {
			return true;
		}
		return false;
	}

	/**
	 * sees if the number is prime
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {

			if (isDivisible(num, i)) {
				return true;
			}
		}
		return false;

	}
}
