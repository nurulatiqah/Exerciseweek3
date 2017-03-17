package e104;

/**
 * @author nurulatiqahali
 * smallest value in array
 */
public class Smallest {
	public static void main(String[] args) {
		int[] values = {6, 5, 8, 7, 11};
		System.out.println("smallest: " + smallest(values));
	}
	
	public static int smallest(int[] array) {
		int min = array[0];
		int max = array[0];

		for(int i =0; i<array.length;i++){
			if(array[i] < min){
				min = array[i];
			}else if(array[i]>max){
				max = array[i];
			}
				
		}
	
		return min;
	}
}
