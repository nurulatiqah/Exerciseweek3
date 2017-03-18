package e94;

public class Person {
	
	private String name;
	private String number;
	
	/**
	 * @param name
	 * @param phoneNum
	 */
	public Person(String name, String phoneNum) {
		this.name = name;
		this.number = phoneNum;
	}

	public String toString(){
		return name +" number: " +number;
	}
	
	/**
	 * @return name of student
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * @return phone number if in the list
	 */
	public String getNumber(){
		return number;
	}
	
	public void changeNumber(String newNumber){
		if(this.number !=newNumber){
			this.number = newNumber;
		}
	}
}
