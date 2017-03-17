package e94;

import java.util.ArrayList;


public class Phonebook {
	
	private ArrayList<Person> phoneB;
	
	public Phonebook(){
		phoneB = new ArrayList<Person>();
	}
	
	public void add(String name, String number){
		phoneB.add(new Person(name,number));
	}

	/**
	 * print every element in array phoneB
	 */
	public void printAll(){
		for (Person element :phoneB ) {
			System.out.println(element);
		}
	}
	
	/**
	 * @param name
	 * @return if number true or false.
	 * true will return a number
	 */
	public String searchNumber(String name){
		for (Person element : phoneB) {
			if (element.getName().equals(name)){ // if(d.getName() != null &&											// ____)
				return element.getNumber();
			}	
		}
		return ("number not known");
		}
}

