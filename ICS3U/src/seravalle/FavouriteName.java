package seravalle;

import java.util.Scanner;

/*FavouriteName.java
 * tells the user if they like or hate their name
 * Adam Seravalle
 * March 23 2016
 */
public class FavouriteName {

	public static void main(String[] args) {

		// declare variables
		String name;
		// get user input
		Scanner myInput = new Scanner(System.in);
		System.out.println(" What is your name? ");
		name = myInput.nextLine();
		// create random number
		int randomNumber = (int) (Math.random() * 10) + 1;
		// see if the number is less then or equal to 3 and tell the user if it
		// likes or hates their name
		if (randomNumber <= 3) {

			System.out.println(" I hate your name " + name);
		} else {
			System.out.println(name + " your name is my favourite!");
		}
		String Bot = FindA(name);
		System.out.println(Bot);

	}

	static public String FindA(String Bob) {
		return Bob;

	}
}