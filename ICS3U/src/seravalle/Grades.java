package seravalle;
/* Grades.java
 * get the number of marks form the user and display their grade
 * Adam Seravalle  
 * March 30 2016
 */

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);

		// variable and get the number of marks from the user
		int numMarks;
		System.out.println(" How many marks are you entering? ");
		numMarks = Integer.parseInt(myInput.nextLine());

		// loop
		for (int i = 0; i < numMarks; i++) {

			// variable and get the marks from the user
			int mark;
			System.out.println("Please enter the marks ");
			mark = Integer.parseInt(myInput.nextLine());

			// give the grade to the mark entered
			if (mark >= 80 && mark <= 100) {

				System.out.println(" You got an A! ");

			} else if (mark >= 70 && mark <= 79) {
				System.out.println(" You got a B ");

			} else if (mark >= 60 && mark <= 69) {
				System.out.println(" You got a C ");

			} else if (mark >= 50 && mark <= 59) {
				System.out.println(" You got a D");
			} else if (mark >= 0 && mark <= 49) {
				System.out.println(" You got a F");

			} else {
				System.out.println(" X ");
			}
		}

	}

}
