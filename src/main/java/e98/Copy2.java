package e98;

import java.util.Arrays;

/**
 * @author nurulatiqahali
 * reverse array
 */
public class Copy2 {
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4 };
		int[] reverse = reverseCopy(original);

		// print both
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("reversed: " + Arrays.toString(reverse));
	}

	public static int[] reverseCopy(int[] array) {
		int[] newArray = new int[array.length];
//		newArray[0] = 1;
//		newArray[1] = 2;
//		newArray[2] = 3;
//		newArray[3] = 4;

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[array.length - 1 - i];
		}
		return newArray;
	}
}
