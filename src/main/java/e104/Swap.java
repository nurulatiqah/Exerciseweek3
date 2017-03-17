package e104;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int[] values = { 3, 2, 5, 4, 8 };

		System.out.println(Arrays.toString(values));

		swap(values, 1, 0);
		System.out.println(Arrays.toString(values));

		swap(values, 0, 3);
		System.out.println(Arrays.toString(values));
	}

	/**
	 * @param array
	 * @param index1
	 * @param index2
	 *            passed an array and two of its indexes. The method swaps the
	 *            values in the indexes around.
	 */
	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
