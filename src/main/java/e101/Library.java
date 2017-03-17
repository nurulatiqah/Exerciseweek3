package e101;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;

	public Library(){
		books = new ArrayList<Book>();
	}
	
	public void addBook(Book newBook){
		books.add(newBook);
	}
	
	public void printBooks(){
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	/**
	 * iterate the list of books and add all the matching books to the list found
	 * @param title
	 * @return The methods return the list of books that match
	 */
	public ArrayList<Book> searchByTitle(String title) {
	     ArrayList<Book> found = new ArrayList<Book>();
//	     for (Book book : found) {
//			if(book.title().contains(title)){
//				found.add(book);//add this
//			}
//		} //not working!!!
	     
	     
	     for (int i = 0; i < this.books.size(); i++) {
	    	 if(StringUtils.included(books.get(i).title(), title)) {
	           // if (this.books.get(i).title().contains(title)) {
	                found.add(this.books.get(i));
	            }
	        }
	     return found;
	   }
	
	public ArrayList<Book> searchByYear(int year){
		 ArrayList<Book> found = new ArrayList<Book>();
		 //get books year from arraylist
		 for (int i = 0; i < this.books.size(); i++) {
	            if (this.books.get(i).year() == year) { //integer cannot use contains
	                found.add(this.books.get(i));
	            }
	        }
	     return found;
	}
	
	public ArrayList<Book> searchByPublisher(String publisher){
		 ArrayList<Book> found = new ArrayList<Book>();
//		 for (Book book : found) {
//				if(book.publisher().contains(publisher)){
//					found.add(book);//add this
//				}
//			} not working!!!
	     for (int i = 0; i < this.books.size(); i++) {
	    	 if(StringUtils.included(books.get(i).publisher(), publisher)) {
	            //if (this.books.get(i).publisher().contains(publisher)) {
	                found.add(this.books.get(i));
	            }
	        }
		 return found;
	}
	
}
