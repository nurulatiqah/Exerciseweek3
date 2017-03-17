package e103;

public class ArBird {
	private String name;
	private String latinName;
	private int count;
	
	public ArBird(String name, String lName) {
		this.name = name;
		this.latinName = lName;
	}

	/**
	 * @return name
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * @return latinName
	 */
	public String getLatinName(){
		return this.latinName;
	}
	
	public String toString(){
		return this.name +"(" +this.latinName +") : " +count +" observations";
	}
	
	/**
	 * @return count of increasing birds from user observed
	 */
	public void howMany(){
		count++;
		//return this.count;
	}

}
