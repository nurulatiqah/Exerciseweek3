package e106;

public class BinarySearch {
	/**
	 * @param array
	 * @param searchedValue
	 * @return value given as a parameter is in the sorted array that is also
	 *         given as parameter.
	 */
	public static boolean search(int[] array, int searchedValue) {
		for (int number : array) {
			if (number == searchedValue) {
				return true;
			}
		}
		return false;
	}
}
