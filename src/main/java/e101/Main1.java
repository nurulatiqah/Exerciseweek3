package e101;

public class Main1 {
	public static void main(String[] args) {
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		System.out.println(cheese.title());
		System.out.println(cheese.publisher());
		System.out.println(cheese.year());

		System.out.println(cheese);//toString
	}
}
