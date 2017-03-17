package e104;

/**
 * @author nurulatiqahali
 * min index in array
 */
public class IndexOfTheSmallest {
	public static void main(String[] args) {
		int[] values = {6, 5, 8, 7, 11};
		System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
	}
	
	public static int indexOfTheSmallest(int[] array) {
		int min = array[0];
		int max = array[0];
		int i;
		for(i =0; i<array.length;i++){ //check all
			if(array[i] < min){
				min = array[i];
				min = i;
			}else if(array[i]>max){
				max = array[i];
				max = i;
			}
				
		}
	
		return min;
	}
}
