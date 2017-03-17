package e104;

import java.util.Arrays;

/**
 * @author nurulatiqahali
 * sorting array
 */
public class Sorting {
	public static void main(String[] args) {
		int[] values = { 8, 3, 7, 9, 1, 2, 4 };
		sort(values);
	}

	public static void sort(int[] array) {
		int temp;
		for (int j = array.length - 1; j > 0; j--)
			for (int i = 0; i < j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
				for (int k = 0; k < array.length; k++) {
					System.out.println(Arrays.toString(array));
				}
				//System.out.println();
			}

	}

}

