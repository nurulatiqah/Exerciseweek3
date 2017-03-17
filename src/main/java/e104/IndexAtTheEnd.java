package e104;

/**
 * @author nurulatiqahali
 * print index of the smallest starting from index ___.
 */
public class IndexAtTheEnd {
	public static void main(String[] args) {
		// indexes:    0  1  2  3   4
		int[] values = {-1, 6, 9, 8, 12};
		System.out.println(indexOfTheSmallestStartingFrom(values, 1));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		System.out.println(indexOfTheSmallestStartingFrom(values, 4));
	}
	
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int min = index;
		for(int i = index;i<array.length;i++){
			if(array[i] < array[min]){	
				min = i;
			}
			
		}
		
		return min;	
}
	  
}
