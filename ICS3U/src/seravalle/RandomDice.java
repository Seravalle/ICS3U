package seravalle;

/* RandomDice.java
 * Randomly rolls dice for the user and the computer and says who wins
 * Adam Seravalle 
 * March 23 2016
 */
public class RandomDice {

	public static void main(String[] args) {

		// create random numbers for computer and user dice
		int die1 = (int) (Math.random() * 6) + 1;
		int die2 = (int) (Math.random() * 6) + 1;
		int die3 = (int) (Math.random() * 6) + 1;
		int die4 = (int) (Math.random() * 6) + 1;
		// add the value of the user dice. Adds the value of the computer dice
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

	}
}
