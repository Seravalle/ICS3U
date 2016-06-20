
/**
 * Connect4.java
 *@author Adam Seravalle 
 * a modified game of connect 4 and tic tac toe
 * June 20 2016
 * 
 */

import java.awt.Color;

import java.io.IOException;

import hsa_new.Console;

public class Connect4 {
	// making console and variables
	public static Console c = new Console(50, 150);
	public static boolean win = false;
	public static boolean playAgain = false;

	/**
	 * display the rules and inputs from the user
	 * 
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		while (playAgain == false) {
			// array for board
			String[][] connectFour = new String[6][7];
			// make board blank
			for (int i = 0; i < 6; i++) {
				for (int x = 0; x < 7; x++) {
					connectFour[i][x] = "";
				}
			}
			// array to check if space has been used
			boolean[][] spaceCheck = new boolean[6][7];
			// display rules
			c.println(
					" Welcome to  modified connect four. to play enter coordinents( eg 0 0(row space colummn) which is bottom left corner )");
			c.println(" rules: ");
			c.println(
					" The Game is simple, its a mix of connect four and tic tac toe.You take turns entering coordinents and try to get four in a row ");
			c.println(
					" Be careful if you enter the same coordinent as the other player or don't enter a coordinent correctly, you loose your turn");

			Thread.sleep(8000);
			c.clear();
			String input = "";
			while (win == false) {

				c.setTextBackgroundColor(Color.BLUE);
				// variables
				int row = 0;
				int columnn = 0;

				// call methods
				winner(connectFour,input);

				board(connectFour);
				player1(row, columnn, connectFour, spaceCheck, input);
				board(connectFour);
				winner(connectFour,input);

				player2(row, columnn, connectFour, spaceCheck, input);

			}
			if (win = true)
				playAgain(connectFour, input);
		}
	}

	/**
	 * gets input from user and displays the Word where they inputed for player
	 * one
	 * 
	 * @param row
	 * @param columnn
	 * @param connectFour
	 * @param spaceCheck
	 * @param input
	 * @throws InterruptedException
	 */
	public static void player1(int row, int columnn, String[][] connectFour, boolean[][] spaceCheck, String input)
			throws InterruptedException {
		try {
		boolean spotError = false;
		
		
			c.println("player 1 enter your coordinents");
			// get input
			input = c.readLine();
			
			String [] splitInput = input.split(" ");

			row = Integer.parseInt(splitInput[0]);

			columnn = Integer.parseInt(splitInput[1]);
			
		
			
			// check is a space is taken
			if (!spaceCheck[row][columnn]) {

				connectFour[row][columnn] = "RED";

			}
			if (!(connectFour[row][columnn] == "")) {
				spaceCheck[row][columnn] = true;

			}

			else {
				spaceCheck[row][columnn] = false;

			}
			c.clear();
			// checks if improper input is given
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			c.println("Please enter the correct input");
			Thread.sleep(1000);
			c.clear();

		}
 }	
 

	/**
	 * gets input from user and displays the Word where they inputed for player
	 * two
	 * 
	 * @param row
	 * @param columnn
	 * @param connectFour
	 * @param spaceCheck
	 * @param input
	 * @throws InterruptedException
	 */
	public static void player2(int row, int columnn, String[][] connectFour, boolean[][] spaceCheck, String input)
			throws InterruptedException {

		try {
			// get input
			c.println(" pleayer 2 enter your coordinents");

			input = c.readLine();

			String[] splitInput = input.split(" ");

			row = Integer.parseInt(splitInput[0]);

			columnn = Integer.parseInt(splitInput[1]);
		
			
			// checks if space is taken
			if (!spaceCheck[row][columnn]) {

				connectFour[row][columnn] = "BLACK";

			}
			spaceCheck[row][columnn] = true;
			if (!(connectFour[row][columnn] == "")) {
				spaceCheck[row][columnn] = true;

			}

			else {
				spaceCheck[row][columnn] = false;
			}
			c.clear();
			// checks if improper input is given
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			c.println("Please enter the correct input ");
			Thread.sleep(1000);
			c.clear();
		}

	}

	/**
	 * displays board
	 * 
	 * @param connectFourBoard
	 */
	public static void board(String[][] connectFourBoard) {
		c.setTextColor(Color.YELLOW);
		c.println("                                                                                       ");
		c.println("         0           1          2            3           4           5           6     ");
		c.println("  _____________________________________________________________________________________");
		c.println("  |            |           |           |           |           |           |           |");

		c.println("  |	" + connectFourBoard[5][0] + "	  " + connectFourBoard[5][1] + "		"
				+ connectFourBoard[5][2] + "	" + connectFourBoard[5][3] + "		" + connectFourBoard[5][4]
				+ "	  " + connectFourBoard[5][5] + "		" + connectFourBoard[5][6]);
		c.println("5 |____________|___________|___________|___________|___________|___________|___________|");
		c.println("  |            |           |           |           |           |           |           |");
		c.println("  |	" + connectFourBoard[4][0] + "	  " + connectFourBoard[4][1] + "		"
				+ connectFourBoard[4][2] + "	" + connectFourBoard[4][3] + "		" + connectFourBoard[4][4]
				+ "	  " + connectFourBoard[4][5] + "		" + connectFourBoard[4][6]);
		c.println("4 |____________|___________|___________|___________|___________|___________|___________|");
		c.println("  |            |           |           |           |           |           |           |");
		c.println("  |	" + connectFourBoard[3][0] + "	  " + connectFourBoard[3][1] + "		"
				+ connectFourBoard[3][2] + "	" + connectFourBoard[3][3] + "		" + connectFourBoard[3][4]
				+ "	  " + connectFourBoard[3][5] + "		" + connectFourBoard[3][6]);
		c.println("3 |____________|___________|___________|___________|___________|___________|___________|");
		c.println("  |            |           |           |           |           |           |           |");
		c.println("  |	" + connectFourBoard[2][0] + "	  " + connectFourBoard[2][1] + "		"
				+ connectFourBoard[2][2] + "	" + connectFourBoard[2][3] + "		" + connectFourBoard[2][4]
				+ "	  " + connectFourBoard[2][5] + "		" + connectFourBoard[2][6]);
		c.println("2 |____________|___________|___________|___________|___________|___________|___________|");
		c.println("  |            |           |           |           |           |           |           |");
		c.println("  |	" + connectFourBoard[1][0] + "	  " + connectFourBoard[1][1] + "		"
				+ connectFourBoard[1][2] + "	" + connectFourBoard[1][3] + "		" + connectFourBoard[1][4]
				+ "	  " + connectFourBoard[1][5] + "		" + connectFourBoard[1][6]);
		c.println("1 |____________|___________|___________|___________|___________|___________|___________|");
		c.println("  |            |           |           |           |           |           |           |");
		c.println("  |	" + connectFourBoard[0][0] + "	  " + connectFourBoard[0][1] + "		"
				+ connectFourBoard[0][2] + "	 " + connectFourBoard[0][3] + "		" + connectFourBoard[0][4]
				+ "	  " + connectFourBoard[0][5] + "		" + connectFourBoard[0][6]);
		c.println("0 |____________|___________|___________|___________|___________|___________|___________|");

	}

	/**
	 * asks if user wants to play again
	 * 
	 * @param winGame
	 * @param connectFour
	 * @param input
	 */
	public static void playAgain(String[][] connectFour, String input) {
		String again;
		boolean error = false;
		while (error == false)
			
		{
			if (win == true) {
				c.println(" Do you want to play again?");
				again = c.readLine();
				if (again.equalsIgnoreCase("Yes")) {
					playAgain = false;

					win = false;
					reset(connectFour);
					input = "";
					error = true;
					c.clear();
				} else if (again.equalsIgnoreCase("no")) {
					error = true;
					playAgain = true;
					c.close();

				} else {
					c.println("please enter yes or no");
					error = false;
				}

			}

		}
	}

	/**
	 * resets the board to blank
	 * 
	 * @param connectFour
	 */
	public static void reset(String[][] connectFour) {
		for (int i = 0; i < 6; i++) {
			for (int x = 0; x < 7; x++) {
				connectFour[i][x] = "";

			}
		}
	}

	/**
	 * checks for a winner
	 * 
	 * @param connectFour
	 */
	public static void winner(String[][] connectFour, String input) {

		// Horizontal wins
		if (connectFour[0][0].equals(connectFour[0][1]) && connectFour[0][1].equals(connectFour[0][2])
				&& connectFour[0][2].equals(connectFour[0][3]) && !connectFour[0][3].equals("")) {
			win = true;

			c.println(connectFour[0][0] + " wins");

		} else if (connectFour[0][1].equals(connectFour[0][2]) && connectFour[0][2].equals(connectFour[0][3])
				&& connectFour[0][3].equals(connectFour[0][4]) && !connectFour[0][4].equals("")) {
			win = true;
			c.println(connectFour[0][1] + " wins");
		} else if (connectFour[0][2].equals(connectFour[0][3]) && connectFour[0][3].equals(connectFour[0][4])
				&& connectFour[0][4].equals(connectFour[0][5]) && !connectFour[0][5].equals("")) {
			win = true;
			c.println(connectFour[0][2] + " wins");
		} else if (connectFour[0][3].equals(connectFour[0][4]) && connectFour[0][4].equals(connectFour[0][5])
				&& connectFour[0][5].equals(connectFour[0][6]) && !connectFour[0][6].equals("")) {
			win = true;
			c.println(connectFour[0][3] + " wins");
		} else if (connectFour[1][0].equals(connectFour[1][1]) && connectFour[1][1].equals(connectFour[1][2])
				&& connectFour[1][2].equals(connectFour[1][3]) && !connectFour[1][3].equals("")) {
			win = true;
			c.println(connectFour[1][0] + " wins");
		} else if (connectFour[1][1].equals(connectFour[1][2]) && connectFour[1][2].equals(connectFour[1][3])
				&& connectFour[1][3].equals(connectFour[1][4]) && !connectFour[1][4].equals("")) {
			win = true;
			c.println(connectFour[1][1] + " wins");
		} else if (connectFour[1][2].equals(connectFour[1][3]) && connectFour[1][3].equals(connectFour[1][4])
				&& connectFour[1][4].equals(connectFour[1][5]) && !connectFour[1][5].equals("")) {
			win = true;
			c.println(connectFour[1][2] + " wins");
		} else if (connectFour[1][3].equals(connectFour[1][4]) && connectFour[1][4].equals(connectFour[1][5])
				&& connectFour[1][5].equals(connectFour[1][6]) && !connectFour[1][6].equals("")) {
			win = true;
			c.println(connectFour[1][3] + " wins");
		} else if (connectFour[2][0].equals(connectFour[2][1]) && connectFour[2][1].equals(connectFour[2][2])
				&& connectFour[2][2].equals(connectFour[2][3]) && !connectFour[2][3].equals("")) {
			win = true;
			c.println(connectFour[2][0] + " wins");
		} else if (connectFour[2][1].equals(connectFour[2][2]) && connectFour[2][2].equals(connectFour[2][3])
				&& connectFour[2][3].equals(connectFour[2][4]) && !connectFour[2][4].equals("")) {
			win = true;
			c.println(connectFour[2][1] + " wins");
		} else if (connectFour[2][2].equals(connectFour[2][3]) && connectFour[2][3].equals(connectFour[2][4])
				&& connectFour[2][4].equals(connectFour[2][5]) && !connectFour[2][5].equals("")) {
			win = true;
			c.println(connectFour[2][2] + " wins");
		} else if (connectFour[2][3].equals(connectFour[2][4]) && connectFour[2][4].equals(connectFour[2][5])
				&& connectFour[2][5].equals(connectFour[2][6]) && !connectFour[2][6].equals("")) {
			win = true;
			c.println(connectFour[2][3] + " wins");
		} else if (connectFour[3][0].equals(connectFour[3][1]) && connectFour[3][1].equals(connectFour[3][2])
				&& connectFour[3][2].equals(connectFour[3][3]) && !connectFour[3][3].equals("")) {
			win = true;
			c.println(connectFour[3][0] + " wins");
		} else if (connectFour[3][1].equals(connectFour[3][2]) && connectFour[3][2].equals(connectFour[3][3])
				&& connectFour[3][3].equals(connectFour[3][4]) && !connectFour[3][4].equals("")) {
			win = true;
			c.println(connectFour[3][1] + " wins");
		} else if (connectFour[3][2].equals(connectFour[3][3]) && connectFour[3][3].equals(connectFour[3][4])
				&& connectFour[3][4].equals(connectFour[3][5]) && !connectFour[3][5].equals("")) {
			win = true;
			c.println(connectFour[3][2] + " wins");
		} else if (connectFour[3][3].equals(connectFour[3][4]) && connectFour[3][4].equals(connectFour[3][5])
				&& connectFour[3][5].equals(connectFour[3][6]) && !connectFour[3][6].equals("")) {
			win = true;
			c.println(connectFour[3][3] + " wins");
		} else if (connectFour[4][0].equals(connectFour[4][1]) && connectFour[4][1].equals(connectFour[4][2])
				&& connectFour[4][2].equals(connectFour[4][3]) && !connectFour[4][3].equals("")) {
			win = true;
			c.println(connectFour[4][0] + " wins");
		} else if (connectFour[4][1].equals(connectFour[4][2]) && connectFour[4][2].equals(connectFour[4][3])
				&& connectFour[4][3].equals(connectFour[4][4]) && !connectFour[4][4].equals("")) {
			win = true;
			c.println(connectFour[4][1] + " wins");
		} else if (connectFour[4][2].equals(connectFour[4][3]) && connectFour[4][3].equals(connectFour[4][4])
				&& connectFour[4][4].equals(connectFour[4][5]) && !connectFour[4][5].equals("")) {
			win = true;
			c.println(connectFour[4][2] + " wins");
		} else if (connectFour[4][3].equals(connectFour[4][4]) && connectFour[4][4].equals(connectFour[4][5])
				&& connectFour[4][5].equals(connectFour[4][6]) && !connectFour[4][6].equals("")) {
			win = true;
			c.println(connectFour[4][3] + " wins");
		} else if (connectFour[5][0].equals(connectFour[5][1]) && connectFour[5][1].equals(connectFour[5][2])
				&& connectFour[5][2].equals(connectFour[5][3]) && !connectFour[5][3].equals("")) {
			win = true;
			c.println(connectFour[5][0] + " wins");
		} else if (connectFour[5][1].equals(connectFour[5][2]) && connectFour[5][2].equals(connectFour[5][3])
				&& connectFour[5][3].equals(connectFour[5][4]) && !connectFour[5][4].equals("")) {
			win = true;
			c.println(connectFour[5][1] + " wins");
		} else if (connectFour[5][2].equals(connectFour[5][3]) && connectFour[5][3].equals(connectFour[5][4])
				&& connectFour[5][4].equals(connectFour[5][5]) && !connectFour[5][5].equals("")) {
			win = true;
			c.println(connectFour[5][2] + " wins");
		} else if (connectFour[5][3].equals(connectFour[5][4]) && connectFour[5][4].equals(connectFour[5][5])
				&& connectFour[5][5].equals(connectFour[5][6]) && !connectFour[5][6].equals("")) {
			win = true;
			c.println(connectFour[5][3] + " wins");
		}
		// vertical wins
		if (connectFour[0][0].equals(connectFour[1][0]) && connectFour[1][0].equals(connectFour[2][0])
				&& connectFour[2][0].equals(connectFour[3][0]) && !connectFour[3][0].equals("")) {
			win = true;
			c.println(connectFour[0][0] + " wins");
		} else if (connectFour[0][1].equals(connectFour[1][1]) && connectFour[1][1].equals(connectFour[2][1])
				&& connectFour[2][1].equals(connectFour[3][1]) && !connectFour[3][1].equals("")) {
			win = true;
			c.println(connectFour[0][1] + " wins");
		} else if (connectFour[0][2].equals(connectFour[1][2]) && connectFour[1][2].equals(connectFour[2][2])
				&& connectFour[2][2].equals(connectFour[3][2]) && !connectFour[3][2].equals("")) {
			win = true;
			c.println(connectFour[0][2] + " wins");

		} else if (connectFour[0][3].equals(connectFour[1][3]) && connectFour[1][3].equals(connectFour[2][3])
				&& connectFour[2][3].equals(connectFour[3][3]) && !connectFour[3][3].equals("")) {
			win = true;
			c.println(connectFour[0][3] + " wins");

		} else if (connectFour[0][4].equals(connectFour[1][4]) && connectFour[1][4].equals(connectFour[2][4])
				&& connectFour[2][4].equals(connectFour[3][4]) && !connectFour[3][4].equals("")) {
			win = true;
			c.println(connectFour[0][4] + " wins");

		} else if (connectFour[0][5].equals(connectFour[1][5]) && connectFour[1][5].equals(connectFour[2][5])
				&& connectFour[2][5].equals(connectFour[3][5]) && !connectFour[3][5].equals("")) {
			win = true;
			c.println(connectFour[0][5] + " wins");
		} else if (connectFour[0][6].equals(connectFour[1][6]) && connectFour[1][6].equals(connectFour[2][6])
				&& connectFour[2][6].equals(connectFour[3][6]) && !connectFour[3][6].equals("")) {
			win = true;
			c.println(connectFour[0][6] + " wins");
		} else if (connectFour[1][0].equals(connectFour[2][0]) && connectFour[2][0].equals(connectFour[3][0])
				&& connectFour[3][0].equals(connectFour[4][0]) && !connectFour[4][0].equals("")) {
			win = true;
			c.println(connectFour[1][0] + " wins");
		} else if (connectFour[1][1].equals(connectFour[2][1]) && connectFour[2][1].equals(connectFour[3][1])
				&& connectFour[3][1].equals(connectFour[4][1]) && !connectFour[4][1].equals("")) {
			win = true;
			c.println(connectFour[1][1] + " wins");
		} else if (connectFour[1][2].equals(connectFour[2][2]) && connectFour[2][2].equals(connectFour[3][2])
				&& connectFour[3][2].equals(connectFour[4][2]) && !connectFour[4][2].equals("")) {
			win = true;
			c.println(connectFour[1][2] + " wins");
		} else if (connectFour[1][3].equals(connectFour[2][3]) && connectFour[2][3].equals(connectFour[3][3])
				&& connectFour[3][3].equals(connectFour[4][3]) && !connectFour[4][3].equals("")) {
			win = true;
			c.println(connectFour[1][3] + " wins");
		} else if (connectFour[1][4].equals(connectFour[2][4]) && connectFour[2][4].equals(connectFour[3][4])
				&& connectFour[3][4].equals(connectFour[4][4]) && !connectFour[4][4].equals("")) {
			win = true;
			c.println(connectFour[1][4] + " wins");
		} else if (connectFour[1][5].equals(connectFour[2][5]) && connectFour[2][5].equals(connectFour[3][5])
				&& connectFour[3][5].equals(connectFour[4][5]) && !connectFour[4][5].equals("")) {
			win = true;
			c.println(connectFour[1][5] + " wins");
		} else if (connectFour[1][6].equals(connectFour[2][6]) && connectFour[2][6].equals(connectFour[3][6])
				&& connectFour[3][6].equals(connectFour[4][6]) && !connectFour[4][6].equals("")) {
			win = true;
			c.println(connectFour[1][6] + " wins");
		} else if (connectFour[2][0].equals(connectFour[3][0]) && connectFour[3][0].equals(connectFour[4][0])
				&& connectFour[4][0].equals(connectFour[5][0]) && !connectFour[5][0].equals("")) {
			win = true;
			c.println(connectFour[2][0] + " wins");

		} else if (connectFour[2][1].equals(connectFour[3][1]) && connectFour[3][1].equals(connectFour[4][1])
				&& connectFour[4][1].equals(connectFour[5][1]) && !connectFour[5][1].equals("")) {
			win = true;
			c.println(connectFour[2][1] + " wins");
		} else if (connectFour[2][2].equals(connectFour[3][2]) && connectFour[3][2].equals(connectFour[4][2])
				&& connectFour[4][2].equals(connectFour[5][2]) && !connectFour[5][2].equals("")) {
			win = true;
			c.println(connectFour[2][2] + " wins");
		} else if (connectFour[2][3].equals(connectFour[3][3]) && connectFour[3][3].equals(connectFour[4][3])
				&& connectFour[4][3].equals(connectFour[5][3]) && !connectFour[5][3].equals("")) {
			win = true;
			c.println(connectFour[2][3] + " wins");
		} else if (connectFour[2][4].equals(connectFour[3][4]) && connectFour[3][4].equals(connectFour[4][4])
				&& connectFour[4][4].equals(connectFour[5][4]) && !connectFour[5][4].equals("")) {
			win = true;
			c.println(connectFour[2][4] + " wins");
		} else if (connectFour[2][5].equals(connectFour[3][5]) && connectFour[3][5].equals(connectFour[4][5])
				&& connectFour[4][5].equals(connectFour[5][5]) && !connectFour[5][5].equals("")) {
			win = true;
			c.println(connectFour[2][5] + " wins");
		} else if (connectFour[2][6].equals(connectFour[3][6]) && connectFour[3][6].equals(connectFour[4][6])
				&& connectFour[4][6].equals(connectFour[5][6]) && !connectFour[5][6].equals("")) {
			win = true;
			c.println(connectFour[2][6] + " wins");
		}
		// Diagonal left win
		if (connectFour[0][0].equals(connectFour[1][1]) && connectFour[1][1].equals(connectFour[2][2])
				&& connectFour[2][2].equals(connectFour[3][3]) && !connectFour[3][3].equals("")) {
			win = true;
			c.println(connectFour[0][0] + " wins");
		} else if (connectFour[0][1].equals(connectFour[1][2]) && connectFour[1][2].equals(connectFour[2][3])
				&& connectFour[2][3].equals(connectFour[3][4]) && !connectFour[3][4].equals("")) {
			win = true;
			c.println(connectFour[0][1] + " wins");
		} else if (connectFour[0][2].equals(connectFour[1][3]) && connectFour[1][3].equals(connectFour[2][2])
				&& connectFour[2][2].equals(connectFour[3][2]) && !connectFour[3][2].equals("")) {
			win = true;
			c.println(connectFour[0][2] + " wins");

		} else if (connectFour[0][3].equals(connectFour[1][4]) && connectFour[1][4].equals(connectFour[2][5])
				&& connectFour[2][5].equals(connectFour[3][6]) && !connectFour[3][6].equals("")) {
			win = true;
			c.println(connectFour[0][3] + " wins");

		} else if (connectFour[1][0].equals(connectFour[2][1]) && connectFour[2][1].equals(connectFour[3][2])
				&& connectFour[3][2].equals(connectFour[4][3]) && !connectFour[4][3].equals("")) {
			win = true;
			c.println(connectFour[1][0] + " wins");
		} else if (connectFour[1][1].equals(connectFour[2][2]) && connectFour[2][2].equals(connectFour[3][3])
				&& connectFour[3][3].equals(connectFour[4][4]) && !connectFour[4][4].equals("")) {
			win = true;
			c.println(connectFour[1][0] + " wins");
		} else if (connectFour[1][2].equals(connectFour[2][3]) && connectFour[2][3].equals(connectFour[3][4])
				&& connectFour[3][4].equals(connectFour[4][5]) && !connectFour[4][5].equals("")) {
			win = true;
			c.println(connectFour[1][2] + " wins");
		} else if (connectFour[1][3].equals(connectFour[2][4]) && connectFour[2][4].equals(connectFour[3][5])
				&& connectFour[3][5].equals(connectFour[4][6]) && !connectFour[4][6].equals("")) {
			win = true;
			c.println(connectFour[1][3] + " wins");
		} else if (connectFour[2][0].equals(connectFour[3][1]) && connectFour[3][1].equals(connectFour[4][2])
				&& connectFour[4][2].equals(connectFour[5][3]) && !connectFour[5][3].equals("")) {
			win = true;
			c.println(connectFour[2][0] + " wins");
		} else if (connectFour[2][1].equals(connectFour[3][2]) && connectFour[3][2].equals(connectFour[4][3])
				&& connectFour[4][3].equals(connectFour[5][4]) && !connectFour[5][4].equals("")) {
			win = true;
			c.println(connectFour[2][1] + " wins");
		} else if (connectFour[2][2].equals(connectFour[3][3]) && connectFour[3][3].equals(connectFour[4][4])
				&& connectFour[4][4].equals(connectFour[5][5]) && !connectFour[5][5].equals("")) {
			win = true;
			c.println(connectFour[2][2] + " wins");
		} else if (connectFour[2][3].equals(connectFour[3][4]) && connectFour[3][4].equals(connectFour[4][5])
				&& connectFour[4][5].equals(connectFour[5][6]) && !connectFour[5][6].equals("")) {
			win = true;
			c.println(connectFour[2][3] + " wins");
		}

		// diagonal right wins
		else if (connectFour[0][3].equals(connectFour[1][2]) && connectFour[1][2].equals(connectFour[2][1])
				&& connectFour[2][1].equals(connectFour[3][0]) && !connectFour[3][0].equals("")) {
			win = true;
			c.println(connectFour[0][3] + " wins");
		} else if (connectFour[0][4].equals(connectFour[1][3]) && connectFour[1][3].equals(connectFour[2][2])
				&& connectFour[2][2].equals(connectFour[3][1]) && !connectFour[3][1].equals("")) {
			win = true;
			c.println(connectFour[0][4] + " wins");
		} else if (connectFour[0][5].equals(connectFour[1][4]) && connectFour[1][4].equals(connectFour[2][3])
				&& connectFour[2][3].equals(connectFour[3][2]) && !connectFour[3][2].equals("")) {
			win = true;
			c.println(connectFour[0][5] + " wins");
		} else if (connectFour[0][6].equals(connectFour[1][5]) && connectFour[1][5].equals(connectFour[2][4])
				&& connectFour[2][4].equals(connectFour[3][3]) && !connectFour[3][3].equals("")) {
			win = true;
			c.println(connectFour[0][6] + " wins");
		} else if (connectFour[1][3].equals(connectFour[2][2]) && connectFour[2][2].equals(connectFour[3][1])
				&& connectFour[3][1].equals(connectFour[4][0]) && !connectFour[4][0].equals("")) {
			win = true;
			c.println(connectFour[1][3] + " wins");
		} else if (connectFour[1][4].equals(connectFour[2][3]) && connectFour[2][3].equals(connectFour[3][2])
				&& connectFour[3][2].equals(connectFour[4][1]) && !connectFour[4][1].equals("")) {
			win = true;
			c.println(connectFour[1][4] + " wins");

		} else if (connectFour[1][5].equals(connectFour[2][4]) && connectFour[2][4].equals(connectFour[3][3])
				&& connectFour[3][3].equals(connectFour[4][2]) && !connectFour[4][2].equals("")) {
			win = true;
			c.println(connectFour[1][5] + " wins");
		} else if (connectFour[1][6].equals(connectFour[2][5]) && connectFour[2][5].equals(connectFour[3][4])
				&& connectFour[3][4].equals(connectFour[4][3]) && !connectFour[4][3].equals("")) {
			win = true;
			c.println(connectFour[1][6] + " wins");
		} else if (connectFour[2][3].equals(connectFour[3][2]) && connectFour[3][2].equals(connectFour[4][1])
				&& connectFour[4][1].equals(connectFour[5][0]) && !connectFour[5][0].equals("")) {
			win = true;
			c.println(connectFour[2][3] + " wins");
		} else if (connectFour[2][4].equals(connectFour[3][3]) && connectFour[3][3].equals(connectFour[4][2])
				&& connectFour[4][2].equals(connectFour[5][1]) && !connectFour[5][1].equals("")) {
			win = true;
			c.println(connectFour[2][4] + " wins");
		} else if (connectFour[2][5].equals(connectFour[3][4]) && connectFour[3][4].equals(connectFour[4][3])
				&& connectFour[4][3].equals(connectFour[5][2]) && !connectFour[5][2].equals("")) {
			win = true;
			c.println(connectFour[2][5] + " wins");
		} else if (connectFour[2][6].equals(connectFour[3][5]) && connectFour[3][5].equals(connectFour[4][4])
				&& connectFour[4][4].equals(connectFour[5][3]) && !connectFour[5][3].equals("")) {
			win = true;
			c.println(connectFour[2][6] + " wins");
		}
// check for a tie
		if(!connectFour[0][0].equals("")&&!connectFour[0][1].equals("")&&!connectFour[0][2].equals("")&&!connectFour[0][3].equals("")&&!connectFour[0][4].equals("")&&!connectFour[0][5].equals("")&&!connectFour[0][6].equals("")&&!connectFour[1][0].equals("")&&!connectFour[1][1].equals("")&&!connectFour[1][2].equals("")&&!connectFour[1][3].equals("")&&!connectFour[1][4].equals("")&&!connectFour[1][5].equals("")&&!connectFour[1][6].equals("")&&!connectFour[2][0].equals("")&&!connectFour[2][1].equals("")&&!connectFour[2][2].equals("")&&!connectFour[2][3].equals("")&&!connectFour[2][4].equals("")&&!connectFour[2][5].equals("")&&!connectFour[2][6].equals("")&&!connectFour[3][0].equals("")&&!connectFour[3][1].equals("")&&!connectFour[3][2].equals("")&&!connectFour[3][3].equals("")&&!connectFour[3][4].equals("")&&!connectFour[3][5].equals("")&&!connectFour[3][6].equals("")&&!connectFour[4][0].equals("")&&!connectFour[4][1].equals("")&&!connectFour[4][2].equals("")&&!connectFour[4][3].equals("")&&!connectFour[4][4].equals("")&&!connectFour[4][5].equals("")&&!connectFour[4][6].equals("")&&!connectFour[5][0].equals("")&&!connectFour[5][1].equals("")&&!connectFour[5][2].equals("")&&!connectFour[5][3].equals("")&&!connectFour[5][4].equals("")&&!connectFour[5][5].equals("")&&!connectFour[5][6].equals("")){
	      c.println(" Its a tie game!");
	      win = true;
	     
         }
}
}