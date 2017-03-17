package e105;

import java.util.Scanner;

public class GuessingGame {

	private Scanner reader;

	public GuessingGame() {
		this.reader = new Scanner(System.in);
	}

	public void play(int lowerLimit, int upperLimit) {
		instructions(upperLimit, lowerLimit);
		// yes - num+1 untill upperLimit

		while (true) {
			int avrge = average(lowerLimit,upperLimit);
			if (isGreaterThan(avrge)) {
				lowerLimit = avrge +1;//set new lowerLimit
			} else if (!isGreaterThan(avrge)) {
				upperLimit = avrge;
			}
			if (lowerLimit == upperLimit) {// if same
				System.out.println("The number you are thinking of is: " + upperLimit);
				break;
			}
		}
	}

	/**
	 * @param firstNumber
	 * @param secondNumber
	 * @return average /dichotomy
	 */
	public int average(int firstNumber, int secondNumber) {//dichotomy. narrowed the range
		int average = (firstNumber + secondNumber) / 2;
		return average;
	}

	
	/**
	 * @param value
	 * @return true if answer == y
	 * implement here the methods isGreaterThan and average
	 */
	public boolean isGreaterThan(int value) {
		System.out.println("Is your number greater than " + value + " ?(y/n)");
		String reply = reader.nextLine();
		if (reply.equals("y")) {
			return true;
		}
		return false;
	}

	public void instructions(int lowerLimit, int upperLimit) {
		int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

		System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

		//System.out.println(
				//"I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
		System.out.println("");
		System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
		System.out.println("");
	}

	/**
	 * @param number
	 * @return calculation from Math.log
	 * a helper method:
	 */
	public static int howManyTimesHalvable(int number) {
		// we create a base two logarithm of the given value
		// Below we swap the base number to base two logarithms!
		return (int) (Math.log(number) / Math.log(2)) + 1;
	}
}
