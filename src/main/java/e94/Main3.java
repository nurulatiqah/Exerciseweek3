package e94;

/**
 * @author nurulatiqahali
 * search number from Phonebook class
 */
public class Main3 {
	public static void main(String[] args) {
	    Phonebook phonebook = new Phonebook();
	    phonebook.add("Pekka Mikkola", "040-123123");
	    phonebook.add("Edsger Dijkstra", "045-456123");
	    phonebook.add("Donald Knuth", "050-222333");

	    String number = phonebook.searchNumber("Pekka Mikkola");
	    System.out.println( number );//in the list,return phone number

	    number = phonebook.searchNumber("Martti Tienari");
	    System.out.println( number );//not in the list
	}
}
