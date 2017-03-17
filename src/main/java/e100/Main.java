package e100;
/**
 * @author nurulatiqahali
 * Stars print out as *-characters
 */
public class Main {
	public static void main(String[] args) {
		
		NightSky NightSky = new NightSky(0.1, 40, 10); //NightSky-object with the given density, width and height
		NightSky.print();//print one line of stars
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("");

		NightSky = new NightSky(0.2, 15, 6);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
	}
}
