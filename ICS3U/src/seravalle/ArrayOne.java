/* Adam Seravalle
 * May 11 2016
 * ArrayOne.java
 * gets a list of names from user and displays it forwards and backwards 
 */

package seravalle;

import java.util.Scanner;

public class ArrayOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// gets number of names from user
		System.out.println(" Please enter the number of names ");
		int numberNames = scan.nextInt();
		scan.nextLine();
		// creates the array
		String[] names = new String[numberNames];
		// puts the names in the array
		System.out.println("Please enter the names");
		for (int i = 0; i < numberNames; i++) {

			names[i] = scan.nextLine();
		}
		// displays the names forwards
		for (int i = 0; i < numberNames; i++) {

			System.out.println(names[i]);
		}
		// diplayes the names backwards order
		for (int i = numberNames - 1; i >= 0; i--) {

			System.out.println(names[i]);
		}
	}

}
