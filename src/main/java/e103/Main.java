package e103;

import java.util.Scanner;

/**
 * @author nurulatiqahali design and implement an observation database for a
 *         bird watcher
 */
public class Main {
	public static void main(String[] args) {
		BirdwatchersDatabase bD = new BirdwatchersDatabase();

		Scanner scanner = new Scanner(System.in);

		// asking for user input
		while (true) {

			System.out.print("? ");
			String word = scanner.nextLine();

			if (word.equalsIgnoreCase("Add")) {
				addBird(scanner, bD);
			} else if (word.equalsIgnoreCase("Observation")) {
				System.out.print("What was observerd? ");
				String observedBName = scanner.nextLine();
				howMany(observedBName, bD);
			} else if (word.equalsIgnoreCase("Statistics")) {
				bD.ststcs();
			} else if (word.equalsIgnoreCase("Show")) {
				System.out.print("What? ");
				String showBName = scanner.nextLine();
				show(showBName, bD);
			} else if (word.equalsIgnoreCase("Quit")) {
				break;
			} else
				System.out.print("WRONG INPUT");
		}
	}

	/**
	 * @param observedBName
	 * @param bD
	 *            adding the value every time user observed
	 */
	public static void howMany(String observedBName, BirdwatchersDatabase bD) {
		for (ArBird birds : bD.getBirds()) {
			if ((birds.getLatinName().equalsIgnoreCase(observedBName))
					|| (birds.getName().equalsIgnoreCase(observedBName))) {
				birds.howMany();
				return;
			}
		}
		System.out.println("Is not a bird!");

	}

	/**
	 * @param showBName
	 * @param bD
	 *            show birds that user searched
	 */
	public static void show(String showBName, BirdwatchersDatabase bD) {
		for (ArBird birds : bD.getBirds()) {
			if ((birds.getLatinName().equalsIgnoreCase(showBName)) || (birds.getName().equalsIgnoreCase(showBName))) {
				System.out.println(birds);
			}
			// System.out.println("Is not a bird!"); //(this line for testing)
		}
	}

	/**
	 * @param scanner
	 * @param bD
	 *            add bird name + latinName calling method addBird
	 */
	public static void addBird(Scanner scanner, BirdwatchersDatabase bD) {
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Latin Name: ");
		String lName = scanner.nextLine();
		bD.addBird(name, lName);
	}
}
