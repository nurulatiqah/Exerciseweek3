package e102;

import java.util.Scanner;

public class GradeDistribution {

	String score = "";
	String score1 = "";
	String score2 = "";
	String score3 = "";
	String score4 = "";
	String score5 = "";
	String score6 = "";

	/**
	 * @param scanner
	 * range of input
	 */
	public void doSomething(Scanner scanner) {

		System.out.println("Type exam scores, -1 completes: ");
		while (true) {
			int i = scanner.nextInt();
			if (i == -1) {
				break;
			} else if (50 <= i && i <= 60) {
				score5 += "*";
			}

			else if (45 <= i && i <= 49) {
				score4 += "*";
			}

			else if (40 <= i && i <= 44) {
				score3 += "*";
			}

			else if (35 <= i && i <= 39) {
				score2 += "*";
			}

			else if (30 <= i && i <= 34) {
				score1 += "*";
			}

			else if (i >= 0 && i <= 29) {
				score += "*";
			}

		}
	}

	/**
	 * print how many star based on score range 
	 */
	public void printStar() {
		System.out.println("5: " + score5);
		System.out.println("4: " + score4);
		System.out.println("3: " + score3);
		System.out.println("2: " + score2);
		System.out.println("1: " + score1);
		System.out.println("0: " + score);

	}

	/**
	 * to ask the string how many characters
	 * calling its length() method.
	 * percentage of acceptance
	 */
	public void percentage() {
		int a = (score5.length());
		int b = (score4.length());
		int c = (score3.length());
		int d = (score2.length());
		int e = (score1.length());
		int f = (score.length());

		double accepted = (a+b+c+d+e); //except 0
		double allScores = a+b+c+d+e+f;
		double prcntge =(double)((100 * accepted) / allScores);
		// 100*accepted/allScores
		System.out.println("Acceptance percentage: " + prcntge);
	}
}
