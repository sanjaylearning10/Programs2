package bench;

import java.util.Arrays;

public class MoveAllZeroToStart {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 0, 0, 6, 0, 1, 0, 7, 4, 0, 3, 0, 0, 0, 0, 5, 2, 0 };
		MoveZero(array);
		System.out.println("Sum of arrays of all elements :: " + Arrays.toString(array));
	}

	private static void MoveZero(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int temp;
			if (array[left] != 0 && array[right] == 0) {
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			} else if (array[left] == 0) {
				left++;
			} else if (array[right] != 0) {
				right--;
			}

		}
	}
}
