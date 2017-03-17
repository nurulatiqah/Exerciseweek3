package e101;
public class Book {
	private String title;
	private String publisher;
	private int year;
	
	public Book(String title, String publisher, int year){
		this.title = title;
		this.publisher = publisher;
		this.year = year;		
	}
	
	/**
	 * @return year
	 */
	public int year(){
		return this.year;
	}
	
	/**
	 * @return title bool
	 */
	public String title(){
		return this.title;
	}
	
	/**
	 * @return publisher
	 */
	public String publisher(){
		return this.publisher;
	}
	
	public String toString(){
		return this.title +", " +this.publisher +", " +this.year;
	}
}
