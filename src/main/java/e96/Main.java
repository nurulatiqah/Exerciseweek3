package e96;

/**
 * @author nurulatiqahali
 * sum
 */
public class Main {
	public static void main(String[] args){
		int[] array={5,1,3,4,2};
		System.out.println(sum(array));
	}

	/**
	 * @param array
	 * @return sum of the contents in array
	 */
	private static int sum(int[] array) {
		int sum = 0;
		for (int i=0;i<array.length;i++) {	
			sum = sum +array[i];
		}
		return sum;
	}
}
