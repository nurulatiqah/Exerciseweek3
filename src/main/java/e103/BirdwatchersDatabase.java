package e103;

import java.util.ArrayList;

public class BirdwatchersDatabase {
	
	private ArrayList<ArBird> birdList;
	//private ArBird birds; //(second way)
	
	/**
	 * class constructor
	 */
	public BirdwatchersDatabase(){
		birdList = new ArrayList<ArBird>();
	}
	
	/**
	 * print all birds in the bird List
	 */
	public void ststcs() {
		for (ArBird birds : birdList) {
			System.out.println(birds);
		}
		
	}
	
	/**
	 * @param name
	 * @param lName
	 * add bird to the Bird List
	 */
	public void addBird(String name, String lName) {
		// birds = new ArBird(name,lName);
		// this.birdList.add(birds);
		this.birdList.add(new ArBird(name,lName));
	}

	/**
	 * @return birds
	 * get birds form arraylist
	 */
	public ArrayList<ArBird> getBirds() {
		
		return this.birdList;
	}
	
	
}
