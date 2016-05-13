/* Adam Seravalle
 * May 13 2016 
 *DiceArray.java
 * rolls 2 dice 10000 times and displays how many times each number came up 
 */

package seravalle;

public class DiceArray {

	public static void main(String[] args) {

		String[] rollValue = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }; // create
																										// array

		int[] timesRolled = new int[11]; // create array

		for (int i = 0; i < 10000; i++) {
			// randomly generate the rolls for both die
			int die = (int) (Math.random() * 6) + 1;
			int dieTwo = (int) (Math.random() * 6) + 1;
			// add the rollValue of the two die
			int dieTotal = die + dieTwo;

			// to see how many timesRolled a number appears and keep count of it
			if (dieTotal == 2) {
				timesRolled[0]++;
			} else if (dieTotal == 3) {
				timesRolled[1]++;
			} else if (dieTotal == 4) {
				timesRolled[2]++;
			} else if (dieTotal == 5) {
				timesRolled[3]++;
			} else if (dieTotal == 6) {
				timesRolled[4]++;
			} else if (dieTotal == 7) {
				timesRolled[5]++;
			} else if (dieTotal == 8) {
				timesRolled[6]++;
			} else if (dieTotal == 9) {
				timesRolled[7]++;
			} else if (dieTotal == 10) {
				timesRolled[8]++;
			} else if (dieTotal == 11) {
				timesRolled[9]++;
			} else if (dieTotal == 12) {
				timesRolled[10]++;
			}
		}
		// print the number of timesRolled the numbers appeared
		System.out.println("Roll Value        Number of Rolls");
		System.out.println("  2	  	      " + timesRolled[0]);
		System.out.println("  3		      " + timesRolled[1]);
		System.out.println("  4		      " + timesRolled[2]);
		System.out.println("  5		      " + timesRolled[3]);
		System.out.println("  6		      " + timesRolled[4]);
		System.out.println("  7		      " + timesRolled[5]);
		System.out.println("  8		      " + timesRolled[6]);
		System.out.println("  9		      " + timesRolled[7]);
		System.out.println(" 10		      " + timesRolled[8]);
		System.out.println(" 11		      " + timesRolled[9]);
		System.out.println(" 12		      " + timesRolled[10]);
	}

}
