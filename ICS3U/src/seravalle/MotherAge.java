package seravalle;

import java.util.Scanner;

/*MotherAge.java
 *Calculates how old your mother was when you were born 
 * Adam Seravalle
 * March 8 2016
 */
public class MotherAge {

	public static void main(String[] args) {

		Scanner myInput = new Scanner (System.in);
		// Declaring variables
		int mothersAge;
		int kidsAge;
		String mothersName;
		String kidsName;
		// Getting kids name and age from user
		System.out.println("What is your name?");
		kidsName = myInput.nextLine();
		System.out.println("What is your age?");
		kidsAge = Integer.parseInt(myInput.nextLine());
		// Getting mothers name and age from user
		System.out.println("What is your mother's name?");
		mothersName = myInput.nextLine();
		System.out.println("What is your mothers age?");
		mothersAge =Integer.parseInt(myInput.nextLine());
		// Calculate the age
		mothersAge = mothersAge - kidsAge;
		
        // Display age to the user
		System.out.println(" Your mother " + mothersName + " was " + mothersAge + " when you " + kidsName + " were born ");


	}

}
