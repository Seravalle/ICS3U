package seravalle;

import java.util.Scanner;

/* RandomDice.java
 * Randomly rolls dice for the user and the computer and says who wins
 * Adam Seravalle 
 * March 23 2016
 */
public class RandomDice {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);

		String answer;
		boolean reroll = true;
		// start the loop
		while (reroll) {

			// create random numbers for computer and user dice
			int die1 = (int) (Math.random() * 6) + 1;
			int die2 = (int) (Math.random() * 6) + 1;
			int die3 = (int) (Math.random() * 6) + 1;
			int die4 = (int) (Math.random() * 6) + 1;
			// add the value of the user dice. Adds the value of the computer
			// dice

			int userRoll = die1 + die2;
			int computerRoll = die3 + die4;

			// figure out who won and display the answer
			if (userRoll > computerRoll) {

				System.out.println("You won! The computer rolled " + computerRoll + " and you rolled " + userRoll);
			} else if (userRoll < computerRoll) {
				System.out.println("You lost. The computer rolled " + computerRoll + " and you rolled " + userRoll);
			} else {
				System.out.println("Its a tie. The computer rolled " + computerRoll + " and you rolled " + userRoll);
			}
			// get answer from the user if they want to play again
			System.out.println(" Do you want to roll again? yes or no");
			answer = myInput.nextLine();
			// continue or end the loop
			if (answer.equalsIgnoreCase("yes")) {
				reroll = true;
			}

			else if (answer.equalsIgnoreCase("no")) {
				reroll = false;
				System.out.println(" Goodbye ");
			}
		}

	}
}
