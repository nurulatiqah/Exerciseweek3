package e102;

import java.util.Scanner;

/**
 * @author nurulatiqahali
 * print star based on score range
 * determine the percentage of acceptance
 */
public class Main {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GradeDistribution grade = new GradeDistribution();
		grade.doSomething(scanner);
		grade.printStar();
		grade.percentage();
	}
}

