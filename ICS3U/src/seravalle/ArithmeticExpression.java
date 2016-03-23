package seravalle;
/* ArithmeticExpression.java
 * take the users numbers and perform calcualtions 
 * Adam Seravalle
 * March 22 2016
 */

import java.util.Scanner;

public class ArithmeticExpression {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);
		// declare variables
		int numOne;
		int numTwo;
		int numThree;
		int numFour;
		int numFive;
		int sum;
		int difference;
		int product;
		int quotient;
		int remainder;
		int power;
		double squareRoot;
		// get numbers from user
		System.out.println("Please enter a number");
		numOne = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter a second number");
		numTwo = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter a third number");
		numThree = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter a fourth number");
		numFour = Integer.parseInt(myInput.nextLine());
		System.out.println("Please enter a fifth number");
		numFive = Integer.parseInt(myInput.nextLine());

		// make calcualtions and display the answers
		sum = numOne + numTwo + numThree + numFour + numFive;
		System.out.println(" The sum of the five numbers is " + sum);

		difference = numTwo - numThree;
		System.out.println(" The difference between the second and third number is " + difference);

		product = numOne * numFive;
		System.out.println(" The product of the first and fifth number is " + product);

		quotient = numFour / numTwo;
		System.out.println(" The quotient of the fourth and fifht number is " + quotient);

		remainder = numFour % numTwo;
		System.out.println(" The remainder of the foruth and second number is " + remainder);

		power = numOne ^ numThree;
		System.out.println(" The first number to the power of the third number is " + power);

		squareRoot = Math.sqrt(numFive);
		System.out.println(" The square root of the fifth number is " + squareRoot);

	}

}
