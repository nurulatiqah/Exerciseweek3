package e100;

import java.util.Random;

public class NightSky {
	// width = 20 . height = 10 . density = 0.1

	private double density;
	private int width; // line length
	private int height;
	private Random random;
	private int starsInLastPrint;

	// 3 constructor
	public NightSky(double density) {
		this(density, 20, 10);
	}

	public NightSky(int width, int height) {
		this(0.1, width, height);
	}

	public NightSky(double density, int width, int height) {
		this.density = density;
		this.width = width;
		this.height = height;
		random = new Random();

	}

	/**
	 * prints one line of starts. The line length is determined by the value of
	 * the instance variable width and the instance variable density determines
	 * the star probability. For each printed character you should use a Random
	 * object to decide if it prints out as a white space or a star. The method
	 * nextDouble will probably be of use now.
	 */
	public void printLine() {
		// white space or a star
		String shape = "";

		// to print each separate line of the night sky.
		for (int i = 0; i < this.width; i++) {
			if (random.nextDouble() < this.density) {// star probability
				shape += "*";
				starsInLastPrint++;
			} else
				// whitespace
				shape += " ";
		}
		System.out.println(shape);
	}

	/**
	 * @return stars printed in the previous night sky counting number of star
	 */
	public int starsInLastPrint() {
		return starsInLastPrint;
	}

	/**
	 * Prints the night sky of the given size Use method printLine to print each
	 * separate line of the night sky
	 */
	public void print() {
		this.starsInLastPrint = 0;
		for (int i = 0; i < height; i++) {
			printLine();
		}
		System.out.println("");
	}
}
