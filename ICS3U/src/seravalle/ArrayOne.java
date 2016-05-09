package seravalle;

import java.util.Scanner;

public class ArrayOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Please enter the number of names ");
		int numberNames = scan.nextInt();
		scan.nextLine();

		String[] names = new String[numberNames];

		System.out.println("Please enter the names");
		for (int i = 0; i < numberNames; i++) {

			names[i] = scan.nextLine();
		}

		for (int i = 0; i < numberNames; i++) {

			System.out.println(names[i]);
				}
		for (int i = numberNames -1; i >= 0; i--) {

			System.out.println(names[i]);
				}
	}

}
